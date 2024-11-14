package com.thalesbensi.DSList.services;



import com.thalesbensi.DSList.dto.GameListDTO;
import com.thalesbensi.DSList.entities.GameList;
import com.thalesbensi.DSList.projections.GameMinProjection;
import com.thalesbensi.DSList.repositories.GameListRepository;
import com.thalesbensi.DSList.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class GameListService {

    @Autowired
    private GameRepository gameRepository;

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> dto = gameListRepository.findAll();
        return dto.stream().map(x -> new GameListDTO(x)).toList();//Converte o tipo Games
        // para DTO
    }

    @Transactional(readOnly = true)
    public GameListDTO findbyId(Long id) {
        GameList item = gameListRepository.findById(id).get();
        return new GameListDTO(item);
    }

    @Transactional
    public void move(Long listid, int sourceIndex, int destinationIndex) {
        List<GameMinProjection> list = gameRepository.searchByList(listid);

        GameMinProjection obj = list.remove(sourceIndex);
        list.add(destinationIndex, obj);

        int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
        int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;

        for (int i = min; i <= max; i++) {
            gameListRepository.updateBelongingPosition(listid, list.get(i).getID(), i);
        }
    }
}

package com.thalesbensi.DSList.dto;

import com.thalesbensi.DSList.entities.GameList;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
@NoArgsConstructor

public class GameListDTO {

    private Long id;
    private String Name;

    public GameListDTO(GameList entity){
        BeanUtils.copyProperties(entity, this);
    }
}

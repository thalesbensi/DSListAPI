package com.thalesbensi.DSList.dto;

import com.thalesbensi.DSList.entities.Game;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class GameMinDTO {
	
	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	
	public GameMinDTO(Game entity) {
		id = entity.getId() ;
		title = entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();	
	}

}

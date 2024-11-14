package com.thalesbensi.DSList.dto;

import com.thalesbensi.DSList.entities.Game;

import com.thalesbensi.DSList.projections.GameMinProjection;
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

	public GameMinDTO(GameMinProjection projection) {
		id = projection.getID();
		title = projection.getTitle();
		year = projection.getYear();
		imgUrl = projection.getImgUrl();
		shortDescription = projection.getShortDescription();
	}
}

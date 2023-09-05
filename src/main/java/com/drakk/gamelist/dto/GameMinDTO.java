package com.drakk.gamelist.dto;

import com.drakk.gamelist.entities.Game;
import com.drakk.gamelist.projections.GameMinProjection;

public class GameMinDTO {


    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;


    public GameMinDTO(){

    }

    public GameMinDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }
    public GameMinDTO(GameMinProjection projection) {
        id = projection.getId();
        title = projection.getTitle();
        year = projection.getYear();
        imgUrl = projection.getImgUrl();
        shortDescription = projection.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    @Override
    public String toString() {
        return "GameMinDTO{" +
                "id: " + id +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", imgUrl='" + imgUrl + '\'' +
                ", shortDescription='" + shortDescription + '\'' +
                '}';
    }
}

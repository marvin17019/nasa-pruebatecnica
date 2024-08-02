package com.nasa.prueba.aspirante.dominio.dto;

import java.util.List;

public class Data {
    private String center;
    private String title;
    private List<String> keywords;
    private String nasa_id;
    private String date_created;
    private String media_type;
    private String description;

    public String getCenter() {
        return center;
    }

    public void setCenter(String center) {
        this.center = center;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public String getNasa_id() {
        return nasa_id;
    }

    public void setNasa_id(String nasa_id) {
        this.nasa_id = nasa_id;
    }

    public String getDate_created() {
        return date_created;
    }

    public void setDate_created(String date_created) {
        this.date_created = date_created;
    }

    public String getMedia_type() {
        return media_type;
    }

    public void setMedia_type(String media_type) {
        this.media_type = media_type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

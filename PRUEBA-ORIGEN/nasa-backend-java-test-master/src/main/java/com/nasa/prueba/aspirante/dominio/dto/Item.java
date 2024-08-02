package com.nasa.prueba.aspirante.dominio.dto;

import java.util.List;
public class Item {
    private String href;
    private List<Data> data;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }
}

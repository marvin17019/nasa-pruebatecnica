package com.nasa.prueba.aspirante.dominio.dto;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class NasaApiResponse {
    private Collection collection;

    public static class Collection {
        private String version;
        private String href;
        private List<Item> items;

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

        public List<Item> getItems() {
            return items;
        }

        public void setItems(List<Item> items) {
            this.items = items;
        }

    }
}

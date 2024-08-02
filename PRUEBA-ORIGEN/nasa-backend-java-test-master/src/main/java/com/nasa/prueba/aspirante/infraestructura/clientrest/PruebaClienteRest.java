package com.nasa.prueba.aspirante.infraestructura.clientrest;

import com.nasa.prueba.aspirante.dominio.dto.Data;
import com.nasa.prueba.aspirante.dominio.dto.Item;
import com.nasa.prueba.aspirante.dominio.dto.NasaApiResponse;
import com.nasa.prueba.aspirante.dominio.entities.PruebaEntity;
import com.nasa.prueba.aspirante.infraestructura.repository.PruebaInterfaz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class PruebaClienteRest {

    @Autowired
    private RestTemplate restTemplate;
    private final PruebaInterfaz nasaDataRepository;


    private final String apiUrl = "https://images-api.nasa.gov/search?q=apollo 2011";

    public PruebaClienteRest(PruebaInterfaz nasaDataRepository) {
        this.nasaDataRepository = nasaDataRepository;
    }


    public List<PruebaEntity> findNasaAll() {
       return (ArrayList<PruebaEntity>) nasaDataRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
    }


    @Scheduled(fixedRate = 60000) // se ejecuta cada minuto
    public void findNasaAllAPI() {
        //mapeo de la api
        NasaApiResponse response = restTemplate.getForObject(apiUrl, NasaApiResponse.class);
        //Seteo a la lista de items
        List<Item> items = response.getCollection().getItems();
        //rrecorrido de la lista
            if (items != null && !items.isEmpty()) {
                for (Item item : items) {
                    // recopila informacion de cada elemento 'data'
                    PruebaEntity nasaData = new PruebaEntity();
                    nasaData.setHref(item.getHref());
                    Data data= item.getData().get(0);
                    nasaData.setCenter(data.getCenter());
                    nasaData.setTitle(data.getTitle());
                    nasaData.setNasa_id(data.getNasa_id());
                    // se guarda en el repositorio(DB)
                    nasaDataRepository.save(nasaData);
                }
            }
    }
}

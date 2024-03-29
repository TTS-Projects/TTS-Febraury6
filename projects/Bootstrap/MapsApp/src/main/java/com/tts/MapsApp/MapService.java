package com.tts.MapsApp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MapService {
    @Value("${api_key}")
    private String apiKey;

    public void addCoordinates(Location location) {
        String url = "https://maps.googleapis.com/maps/api/geocode/json?address=" + 
        location.getCity() + "," + location.getState() + "&key=" + apiKey;
        System.out.println(location.getCity());       
        System.out.println(location.getState());
        System.out.println(url);

        RestTemplate restTemplate = new RestTemplate();
        GeocodingResponse response = restTemplate.getForObject(url, GeocodingResponse.class);
        Location coordinates = response.getResults().get(0).getGeometry().getLocation();

        
        location.setLat(coordinates.getLat());
        location.setLng(coordinates.getLng());
    }
    
    }
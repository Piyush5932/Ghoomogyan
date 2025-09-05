package com.example.ghoomogyaan.model;

import java.io.Serializable;

public class TopPlacesData implements Serializable {
    String placeName;
    String locality;
    String price;
    Integer imageUrl;

    String description;
    Integer backg;

    public TopPlacesData(String placeName, String locality, String price, Integer imageUrl, String description, Integer backg) {
        this.placeName = placeName;
        this.locality = locality;
        this.price = price;
        this.imageUrl = imageUrl;
        this.backg = backg;
        this.description = description;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getBackg() {
        return backg;
    }

    public void setBackg(Integer backg) {
        this.backg = backg;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}


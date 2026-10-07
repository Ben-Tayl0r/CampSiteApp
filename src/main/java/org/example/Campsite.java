package org.example;

public class Campsite {
    String name;

    public Campsite(String name, String address, int starRating, String contactInformation) {
        this.name = name;
        this.address = address;
        this.starRating = starRating;
        this.contactInformation = contactInformation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getStarRating() {
        return starRating;
    }

    public void setStarRating(int starRating) {
        this.starRating = starRating;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    String address;
    int starRating;
    String contactInformation;
}

package com.vaxai.vaxbackend.model;

public class VaccineRequest {
    private int age;
    private String gender;
    private String location;
    private boolean isTravellingAbroad;
    private String destinationCountry;
    private boolean isAnimalBite;

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public boolean isTravellingAbroad() { return isTravellingAbroad; }
    public void setTravellingAbroad(boolean travellingAbroad) { isTravellingAbroad = travellingAbroad; }

    public String getDestinationCountry() { return destinationCountry; }
    public void setDestinationCountry(String destinationCountry) { this.destinationCountry = destinationCountry; }

    public boolean isAnimalBite() { return isAnimalBite; }
    public void setAnimalBite(boolean animalBite) { isAnimalBite = animalBite; }
}

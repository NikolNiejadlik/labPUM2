package com.example.nicol.aplikacjapogodowa2;

/**
 * Created by Nicol on 2018-01-15.
 */

public class Place {
    private String Name;

    private int Temperature;
    private String Information;

    Place(String name, int temperature, String information) {
        this.Name = name;
        this.Temperature=temperature;
        this.Information = information;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    int getTemperature() {
        return Temperature;
    }

    public void setTemperature(int temperature) {
        this.Temperature = temperature;
    }

    String getInformation() {
        return Information;
    }

    public void setInformation(String information) {
        this.Information = information;
    }
}

package com.odde.example;

/**
 * @author cenguohao
 * @date 2022/3/16
 */
public class Planet {

    public Planet(String name) {
        this.name = name;
    }

    private String name;
    private String countryWeather;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryWeather() {
        return countryWeather;
    }

    public void setCountryWeather(String countryWeather) {
        this.countryWeather = countryWeather;
    }
}

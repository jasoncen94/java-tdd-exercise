package com.odde.example;

/**
 * @author cenguohao
 * @date 2022/3/16
 */
public class PlanetExtractions {

    Planet myPlanet = new Planet("earth");

    // I'm using planetextractions to get the facts for my country
    private void printPlanetFacts(final String country) {
        System.out.println("Planet name is " + myPlanet.getName());
        System.out.println("Current season is " + myPlanet.getCountryWeather());
        System.out.println("Number of times the planet rotates around the sun is " + 365);
        System.out.println("Number of characters in planet name = " + myPlanet.getName().length());

        switch (myPlanet.getCountryWeather()) {
            case "Spring" : System.out.println("The weather is warm in the China");break;
            case "Summer" : System.out.println("The weather is hot in the China");break;
            case "Autumn" : System.out.println("The weather is cool in the China");break;
            default : System.out.println("The weather is cold in the China");break;
        }
    }

}

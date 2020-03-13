
package com.sapient.weatherApi.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "coord",
    "country",
    "population",
    "timezone",
    "sunrise",
    "sunset"
})
public class City {

    @JsonProperty("id")
    private long id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("coord")
    private Coord coord;
    @JsonProperty("country")
    private String country;
    @JsonProperty("population")
    private long population;
    @JsonProperty("timezone")
    private long timezone;
    @JsonProperty("sunrise")
    private long sunrise;
    @JsonProperty("sunset")
    private long sunset;

    /**
     * No args constructor for use in serialization
     * 
     */
    public City() {
    }

    /**
     * 
     * @param country
     * @param coord
     * @param sunrise
     * @param timezone
     * @param sunset
     * @param name
     * @param id
     * @param population
     */
    public City(long id, String name, Coord coord, String country, long population, long timezone, long sunrise, long sunset) {
        super();
        this.id = id;
        this.name = name;
        this.coord = coord;
        this.country = country;
        this.population = population;
        this.timezone = timezone;
        this.sunrise = sunrise;
        this.sunset = sunset;
    }

    @JsonProperty("id")
    public long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(long id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("coord")
    public Coord getCoord() {
        return coord;
    }

    @JsonProperty("coord")
    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("population")
    public long getPopulation() {
        return population;
    }

    @JsonProperty("population")
    public void setPopulation(long population) {
        this.population = population;
    }

    @JsonProperty("timezone")
    public long getTimezone() {
        return timezone;
    }

    @JsonProperty("timezone")
    public void setTimezone(long timezone) {
        this.timezone = timezone;
    }

    @JsonProperty("sunrise")
    public long getSunrise() {
        return sunrise;
    }

    @JsonProperty("sunrise")
    public void setSunrise(long sunrise) {
        this.sunrise = sunrise;
    }

    @JsonProperty("sunset")
    public long getSunset() {
        return sunset;
    }

    @JsonProperty("sunset")
    public void setSunset(long sunset) {
        this.sunset = sunset;
    }

}

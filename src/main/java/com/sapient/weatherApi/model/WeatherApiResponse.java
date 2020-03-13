
package com.sapient.weatherApi.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cod",
    "message",
    "cnt",
    "list",
    "city"
})
public class WeatherApiResponse {

    @JsonProperty("cod")
    private String cod;
    @JsonProperty("message")
    private long message;
    @JsonProperty("cnt")
    private long cnt;
    @JsonProperty("list")
    private java.util.List<com.sapient.weatherApi.model.Report> list = null;
    @JsonProperty("city")
    private City city;

    /**
     * No args constructor for use in serialization
     * 
     */
    public WeatherApiResponse() {
    }

    /**
     * 
     * @param city
     * @param cnt
     * @param cod
     * @param message
     * @param list
     */
    public WeatherApiResponse(String cod, long message, long cnt, java.util.List<com.sapient.weatherApi.model.Report> list, City city) {
        super();
        this.cod = cod;
        this.message = message;
        this.cnt = cnt;
        this.list = list;
        this.city = city;
    }

    @JsonProperty("cod")
    public String getCod() {
        return cod;
    }

    @JsonProperty("cod")
    public void setCod(String cod) {
        this.cod = cod;
    }

    @JsonProperty("message")
    public long getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(long message) {
        this.message = message;
    }

    @JsonProperty("cnt")
    public long getCnt() {
        return cnt;
    }

    @JsonProperty("cnt")
    public void setCnt(long cnt) {
        this.cnt = cnt;
    }

    @JsonProperty("list")
    public java.util.List<com.sapient.weatherApi.model.Report> getList() {
        return list;
    }

    @JsonProperty("list")
    public void setList(java.util.List<com.sapient.weatherApi.model.Report> list) {
        this.list = list;
    }

    @JsonProperty("city")
    public City getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(City city) {
        this.city = city;
    }

}


package com.sapient.weatherApi.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "speed",
    "deg"
})
public class Wind {

    @JsonProperty("speed")
    private double speed;
    @JsonProperty("deg")
    private long deg;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Wind() {
    }

    /**
     * 
     * @param deg
     * @param speed
     */
    public Wind(double speed, long deg) {
        super();
        this.speed = speed;
        this.deg = deg;
    }

    @JsonProperty("speed")
    public double getSpeed() {
        return speed;
    }

    @JsonProperty("speed")
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @JsonProperty("deg")
    public long getDeg() {
        return deg;
    }

    @JsonProperty("deg")
    public void setDeg(long deg) {
        this.deg = deg;
    }

}


package com.sapient.weatherApi.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "3h"
})
public class Rain {

    @JsonProperty("3h")
    private double _3h;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Rain() {
    }

    /**
     * 
     * @param _3h
     */
    public Rain(double _3h) {
        super();
        this._3h = _3h;
    }

    @JsonProperty("3h")
    public double get3h() {
        return _3h;
    }

    @JsonProperty("3h")
    public void set3h(double _3h) {
        this._3h = _3h;
    }

}


package com.sapient.weatherApi.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "all"
})
public class Clouds {

    @JsonProperty("all")
    private long all;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Clouds() {
    }

    /**
     * 
     * @param all
     */
    public Clouds(long all) {
        super();
        this.all = all;
    }

    @JsonProperty("all")
    public long getAll() {
        return all;
    }

    @JsonProperty("all")
    public void setAll(long all) {
        this.all = all;
    }

}

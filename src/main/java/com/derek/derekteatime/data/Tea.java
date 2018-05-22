package com.derek.derekteatime.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.UUID;

import org.hibernate.annotations.Type;


/**
 * Created by nelsoder on 5/12/2018.
 */

@Entity
public class Tea {

    public enum Type {
        GREEN,
        BLACK,
        HERBAL,
        OOLONG,
        WHITE
    }



    @org.hibernate.annotations.Type(type = "uuid-char")
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @JsonProperty("Id")
    private UUID resourceId;

    private String name;
    private Type type;
    private int rating;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public UUID getResourceId() {
        return resourceId;
    }

}

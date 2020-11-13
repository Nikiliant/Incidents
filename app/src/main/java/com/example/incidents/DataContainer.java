package com.example.incidents;

import java.util.Date;
import java.util.jar.Attributes;

public class DataContainer {
    private String name;
    private Date date;
    private String text;
    private String mappos;

    public DataContainer (String name, Date date, String text, String mappos) {
        this.name = name;
        this.date = date;
        this.text = text;
        this.mappos = mappos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getMappos() {
        return mappos;
    }

    public void setMappos(String mappos) {
        this.mappos = mappos;
    }
}

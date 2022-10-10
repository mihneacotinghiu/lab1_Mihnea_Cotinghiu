package com.company;

public class Auto {
    private String AutoName;
    private String AutoId;
    private String AutoModel;

    public String getId() {
        return AutoId;
    }

    public void setId(String id) {
        this.AutoId = id;
    }

    public String getName() {
        return AutoName;
    }

    public void setName(String name) {
        this.AutoName = name;
    }

    public String getModel() {
        return AutoModel;
    }

    public void setModel(String model) {
        this.AutoModel = model;
    }

}
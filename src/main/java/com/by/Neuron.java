package com.by;
import java.util.UUID;

public class Neuron {


    private String id;
    private String name;

    public Neuron(int id, String name) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

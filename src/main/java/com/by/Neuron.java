package com.by;
import java.util.UUID;

public class Neuron implements NeuronFuncInterface{


    private String id;
    private String name;

    public Neuron(String name) {
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

    @Override
    public void takeInfo(String info) {

    }

    @Override
    public TotalInfo giveInfo() {
        return null;
    }
}

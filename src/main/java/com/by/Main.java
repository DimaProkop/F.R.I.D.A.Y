package com.by;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Greetings Mr. Nobody\n");

        SettingLayers setting = new SettingLayers(2);
        List<Layer> layers = setting.buildNetwork();

        layers.forEach(layer -> System.out.println(layer.getName()));


        Neuron neuron = new Neuron("neuron_1");
        layers.get(0).setNeuron(neuron);

        neuron = new Neuron("neuron_2");
        layers.get(1).setNeuron(neuron);
        System.out.println("\n");


        for (Layer layer : layers) {
            System.out.println(layer.getNeuron().getId());
            System.out.println(layer.getNeuron().getName());
        }
    }
}

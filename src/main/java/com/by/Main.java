package com.by;

import java.util.List;

public class Main {

    private static SettingLayers setting;

    public static void main(String[] args) {
        System.out.println("Greetings Mr. Nobody");

        setting = new SettingLayers(2);
        List<Layer> layers = setting.buildNetwork();

        layers.forEach(layer -> System.out.println(layer.getName()));
    }
}

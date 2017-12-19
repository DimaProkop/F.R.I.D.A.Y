package com.by;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Random;

public class SettingLayers {


    private final Random rand;
    private int countLayers;
    private final Set<String> identifiers;

    //set count layers for network
    public SettingLayers(int countLayers) {
        this.countLayers = countLayers;
        this.rand = new Random();
        this.identifiers = new HashSet<>();
    }

    //generate name for layer
    private String randomIdentifier() {
        StringBuilder builder = new StringBuilder();
        while (builder.toString().length() == 0) {
            int length = rand.nextInt(5) + 5;
            for (int i = 0; i < length; i++) {
                String lexicon = "ABCDEFGHIJKLMNOPQRSTUVWXYZ12345674890";
                builder.append(lexicon.charAt(rand.nextInt(lexicon.length())));
            }
            if (identifiers.contains(builder.toString())) {
                builder = new StringBuilder();
            }
        }
        return builder.toString();
    }

    public List<Layer> buildNetwork() {
        List<Layer> layers = new ArrayList<>();
        for (int i = 1; i <= this.countLayers; i++) {
            layers.add(new Layer(i, randomIdentifier()));
        }
        return layers;
    }
}



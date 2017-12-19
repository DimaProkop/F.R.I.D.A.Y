package com.by;

import java.util.HashSet;
import java.util.Set;
import java.util.Random;

public class SettingLayers {


    private final Random rand;
    private int countLayers;
    private final Set<String> identifiers;

    //set count layers for network
    public SettingLayers(int count) {
        this.countLayers = count;
        this.rand = new Random();
        this.identifiers = new HashSet<>();
        buildNetwork();
    }

    //generate name for layer
    public String randomIdentifier() {
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

    private void buildNetwork() {

    }
}



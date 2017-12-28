package com.by.vk_bot;

import com.petersamokhin.bots.sdk.clients.Group;
import com.petersamokhin.bots.sdk.objects.Message;

import java.time.Instant;

public class Main {

    private static final String access_token = "2e2f116a92350ac86ac9ce40b594569fc44d7b49b47671303527c7df10518573ee65b4dcc42d6b625fb50";

    public static void main(String[] args) {
        Group group = new Group(159224320, access_token);


        group.onSimpleTextMessage(message ->
                new Message()
                        .from(group)
                        .to(message.authorId())
                        .text("Greetings. I am interactive assistant F.R.I.D.A.Y.")
                        .send()
        );

        group.onCommand("time", message ->
                new Message()
                        .from(group)
                        .to(message.authorId())
                        .text(Instant.now().toString())
                        .send()
        );


        group.onVoiceMessage(message ->
                new Message()
                        .from(group)
                        .to(message.authorId())
                        .text("I can't hear voice messages")
                        .send()
        );
    }
}

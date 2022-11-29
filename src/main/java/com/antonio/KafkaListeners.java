package com.antonio;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    //Create the listener to read from the topic
    //group id in case of having more listeners in order to be unique
    @KafkaListener(topics="exampleTopic",groupId = "groupId")
    void listener(String data){
        System.out.println("Listener recieved: "+data+" ;)");
    }
}

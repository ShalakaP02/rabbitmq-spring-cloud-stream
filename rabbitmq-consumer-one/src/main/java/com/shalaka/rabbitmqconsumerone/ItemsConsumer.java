package com.shalaka.rabbitmqconsumerone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
public class ItemsConsumer {
    Logger log = LoggerFactory.getLogger(ItemsConsumer.class);

    @Bean
    public Consumer<String> onReceive() {
        return (items) -> {
            log.info("Received the items {} in Consumer one", items);
        };
    }
}

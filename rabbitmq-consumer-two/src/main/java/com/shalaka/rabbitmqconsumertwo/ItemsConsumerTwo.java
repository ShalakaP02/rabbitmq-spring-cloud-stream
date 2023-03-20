package com.shalaka.rabbitmqconsumertwo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
public class ItemsConsumerTwo {
    Logger log = LoggerFactory.getLogger(ItemsConsumerTwo.class);

    @Bean
    public Consumer<String> onGettingItems() {
        return (items) -> {
            log.info("Received the items {} in Consumer two", items);
        };
    }
}

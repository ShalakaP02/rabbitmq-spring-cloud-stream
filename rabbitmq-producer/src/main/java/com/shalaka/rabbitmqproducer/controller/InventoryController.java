package com.shalaka.rabbitmqproducer.controller;


import com.shalaka.rabbitmqproducer.model.ItemDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.function.Function;

@RestController
public class InventoryController {

    @Autowired
    private StreamBridge streamBridge;



    @PostMapping("/item")
    public ResponseEntity<ItemDetail> addItemDetails(@RequestBody ItemDetail itemDetail){
        streamBridge.send("items", itemDetail);
        return new ResponseEntity<>(itemDetail, HttpStatus.OK);
    }

    @Bean
    public Function<ItemDetail, ItemDetail> shareItemDetails() {
        return (itemDetail) -> itemDetail;
    }
}

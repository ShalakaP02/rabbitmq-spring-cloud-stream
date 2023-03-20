package com.shalaka.rabbitmqproducer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemDetail {
    private String itemName;
    private Integer itemQuantity;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(Integer itemQuantity) {
        this.itemQuantity = itemQuantity;
    }
}

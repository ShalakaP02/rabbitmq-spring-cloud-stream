# rabbitmq-spring-cloud-stream
Example of rabbit mq with spring-cloud-stream using topic exchange.

This application demonstrates producer producing item details and multiple consumers consuming these item details using rabbitmq message broker.

# Prerequisites :
- Java 17  
- Spring Boot 3.0.0  
- Rabbit Mq  

# Below is the high level architecture diagram for this example.

![image](https://user-images.githubusercontent.com/89374228/226287017-8008e62c-f89e-421b-9790-fb7cb3ba5dbf.png)



# Run

- Run rabbitmq using docker    
 docker run -d --hostname my-rabbit --name some-rabbit -p 15672:15672 -p 5672:5672 rabbitmq:3-management  
 
   Check rabbitmq running on:  http://localhost:15672   
   username - guest , password - guest   
  
-  Run all three spring boot projects (producer, consumer-one, consumer-two)    
   mvn spring-boot:run


  POST API for producing items :
  http://localhost:8080/item
  {
    "itemName" : "Pepsi",
      "itemQuantity" : 30
  }


  Check Logs for Consumer-One and Consumer-two :    
  Received the items {"itemName":"Pepsi","itemQuantity":30} in Consumer one    
  Received the items {"itemName":"Pepsi","itemQuantity":30} in Consumer two    



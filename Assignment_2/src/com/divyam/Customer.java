package com.divyam;

public class Customer {
    String name;
    String password;
    float wallet;
    boolean normal;
    boolean prime;
    boolean elite;

    Customer(String name,String password, float wallet, boolean normal, boolean prime, boolean elite) {
        this.name = name;
        this.password = password;
        this.wallet = wallet;
        this.normal = normal;
        this.prime = prime;
        this.elite = elite;
    }
}

class Order {
    String na;         // product name
    float productID;
    int quantity;
    float amount;
    String person;      // name of the person who made the order

    Order(String na,float productID, int quantity,float amount,String person) {
        this.na = na;
        this.productID = productID;
        this.quantity = quantity;
        this.amount = amount;
        this.person = person;
    }
}

class giveawayOrder {
    String person_name;
    float pid1;
    float pid2;
    float amount;
    int status;

    giveawayOrder(String person_name, float pid1, float pid2,float amount,int status) {
        this.person_name = person_name;
        this.pid1 = pid1;
        this.pid2 = pid2;
        this.amount = amount;
        this.status = status;    // 1 --> NORMAl, 2 --> PRIME, 3 --> ELITE
    }
}
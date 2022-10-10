package com.divyam;

public class Giveaway {
    float product1;
    float product2;
    int id;              // This is giveaway ID
    float normal;
    float prime;
    float elite;

    Giveaway(float product1, float product2,int id,float normal,float prime,float elite) {
        this.product1 = product1;
        this.product2 = product2;
        this.id = id;
        this.normal = normal;
        this.prime = prime;
        this.elite = elite;
    }
}

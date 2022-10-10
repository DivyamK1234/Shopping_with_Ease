package com.divyam;

public class Discount {
    float norm;          // amount after discount will be stored here
    float prim;
    float elit;
    float prodid;        // product id on which discount is applied
    int id;             // this is discount id

    Discount(float norm, float prim, float elit , float prodid, int id) {
        this.norm = norm;
        this.prim = prim;
        this.elit = elit;
        this.prodid = prodid;
        this.id = id;
    }
}

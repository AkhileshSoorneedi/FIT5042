/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fit5042.tutex.repository.entities;

/**
 *
 * @author Jian
 * 
 */
public class Property {
   //TODO Exercise 1.3 Step 1 Please refer tutorial exercise. 
    private int id;
    private String address;
    private int  numberOfBedrooms;
    private int size;
    private double price;
    
    public Property()
    {
        
    }

    public Property(int id, String address, int numberOfBedrooms, int size, double price) {
        this.id = id;
        this.address = address;
        this.size = size;
        this.numberOfBedrooms = numberOfBedrooms;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public int getSize() {
        return size;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }
    

    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }
    

    public void setSize(int size) {
        this.size = size;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
}

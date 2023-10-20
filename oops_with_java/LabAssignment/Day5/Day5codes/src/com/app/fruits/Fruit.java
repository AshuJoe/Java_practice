package com.app.fruits;

public class Fruit {
    private String color;
    private double weight;
    private boolean fresh;
    private String name;

   Fruit(String color, double weight, boolean fresh, String name){
        this.color = color;
        this.weight= weight;
        this.fresh=fresh;
        this.name = name;
    }
    public String getColor(){
        return color;
    }
    public double getWeight(){
        return weight;
    }
    public boolean getFresh(){
        return fresh;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return "Name : "+name+ " Color : "+color+ " Weight : "+weight;
    }
    public String taste(){
        return "No specific Taste";
    }
    public boolean setfresh(boolean value) {
    	this.fresh=value;
    	return fresh;
    }
   

}

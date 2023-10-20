package com.app.fruits;

public class Apple extends Fruit {
   public Apple(String c, double w, boolean f, String n){
        super(c,w,f,n);
     }
    public String taste(){
        return "sweet n sour";
    }
    public void juice(){
        System.out.println("Name : "+getName()+" : making jam!");
     }
}
    
package com.app.fruits;

public class Mango extends Fruit {
    public Mango(String c, double w, boolean f, String n){
        super(c,w,f,n);
     }
     public String taste(){
         return "Sweet";
     } 
     
     public void pulp(){
        System.out.println("Name : "+getName()+" Color : "+getColor()+" : creating pulp");
     }
}
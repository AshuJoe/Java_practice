package com.app.fruits;

public class Orange  extends Fruit{
    public Orange(String c, double w, boolean f, String n){
        super(c,w,f,n);
     }
     public String taste(){
         return "Sour";
     }
     public void jam(){
        System.out.println("Name : "+getName()+" Weight : "+getWeight()+": extracting juice");
     }
}

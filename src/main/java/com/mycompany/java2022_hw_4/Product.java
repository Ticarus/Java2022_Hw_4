//From java lesson 31 to 34

package com.mycompany.java2022_hw_4;

public class Product {
    //Constructer (No difference if you use it or not use it)
    
    //Using both with parameters and without parameters is possible and is called overloading
    
    //This is a parameterless constructor
    public Product(){
        System.out.println("Constructer block worked");
    }
    
    /*This is a constructer with parameters, with this kind of constructer Product class will only be
    functional if the parameters are given to the constructer otherwise Product class won't be usable*/
  
    public Product(int id, String name, String description, double price, int stockAmount, String color){
        System.out.println("Constructer block worked");
        
        _id = id;
        _name = name;
        _description = description;
        _price = price;
        _stockAmount = stockAmount;
        _color = color;
    }

    //attribute | field
    private int _id;
    private String _name;
    private String _description;
    private double _price;   
    private int _stockAmount;
    private String _color;
    private String _code;
    String name;
    
    //getter
    public int getId()
    {
        return _id;
    }
    
    //setter
    public void setId(int id){
        //this. means the class it is in 
        _id = id;
    }
    
    public String getName(){
        return _name;
    }
    
    public void setName(String name){
        _name = name;
    }
    
    public String getDescription(){
        return _description;
    }
    
    public void setDescription(String description){
        _description = description;
    }
    
    public double getPrice(){
        return _price;
    }
    
    public void setPrice(double price){
        _price = price;
    }
    
    public int getStockAmount(){
        return _stockAmount;
    }
    
    public void setStockAmount(int stockAmount){
        _stockAmount = stockAmount;
    }
    
    public String getColor(){
        return _color;
    }
    
    public void setColor(String color){
        _color = color;
    }
    
    public String getCode(){
        return _name.substring(0, 1) + _id;
    }
}

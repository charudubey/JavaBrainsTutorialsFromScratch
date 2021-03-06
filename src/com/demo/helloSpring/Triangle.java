package com.demo.helloSpring;

public class Triangle {

    private String type;

    private int height;

    public Triangle(String type) {
        this.type = type;
        this.height = 20;
    }

    public Triangle(String type, int height) {
        this.type = type;
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void draw(){
        System.out.println(this.getType() +
                " Triangle Drawn with Height: " + this.getHeight());
    }
}
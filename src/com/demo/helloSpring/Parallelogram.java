package com.demo.helloSpring;

import java.util.List;

public class Parallelogram {

    private List<Point> points;

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public void draw(){

        for(Point point: getPoints())
            System.out.print("Point: " + point);
    }
}
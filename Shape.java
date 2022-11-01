package com.dermot.ca1.boundingboxex1;

import java.awt.*;

public abstract class Shape {
    protected int xCenter;
    protected int yCenter;

    public Shape(int xCenter, int yCenter) {
        this.xCenter = xCenter;
        this.yCenter = yCenter;
    }

    public abstract void drawShape(Graphics g);

    @Override
    public String toString() {
        return " Shape{" +
                "xCenter=" + xCenter +
                ", yCenter=" + yCenter +
                '}';
    }
}

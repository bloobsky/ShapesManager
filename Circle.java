package com.dermot.ca1.boundingboxex1;

import java.awt.*;

public class Circle extends Shape{
    private int radius;

    //I've put the bounding box here for the purposes of the exercise
    private BoundingBox boundingBox;

    //Illustrative constructor
    public Circle(int xCenter, int yCenter, int radius)
    {
        super(xCenter, yCenter);
        this.radius = radius;
        setupBoundingBox();
    }

    /**
     * NB: This version uses hard-coded values for the point coordinates.
     * Of course, the actual code should compute these coordinates (based on
     * the center coordinates and the radius). Refer to the document on the Bounding Box
     * exercises.
     */
    public void setupBoundingBox() {
        boundingBox = new BoundingBox(new Point(100, 100), new Point(60, 80));
    }

    public BoundingBox getBoundingBox() {
        return boundingBox;
    }


    @Override
    public void drawShape(Graphics g) {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius + super.toString() +
                '}';
    }
}

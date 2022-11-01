package com.dermot.ca1.boundingboxex1;

import java.awt.*;

/*
    Note: the constructors are not complete (but are sufficient for the purposes of the exercise.
    Note 2: You should complete/amend the setupBoundingBox() method.
 */
public class Rectangle extends Shape {
    private int width;
    private int height;

    BoundingBox boundingBox;

    public Rectangle(int xCenter, int yCenter, int width, int height) {
        super(xCenter, yCenter);
        this.width = width;
        this.height = height;
        setupBoundingBox();
    }

    /**
     * NB: This version uses hard-coded values for the point coordinates.
     * Of course, the actual code should compute these coordinates (based on
     * the center coordinates, width and height). Refer to the document on the Bounding Box
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
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}' + super.toString();
    }
}


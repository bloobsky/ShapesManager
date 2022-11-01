package com.dermot.ca1.boundingboxex1;

import java.util.ArrayList;

public class ShapesManager {

    private ArrayList<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shapeToAdd)
    {
        shapes.add(shapeToAdd);
    }

    public void drawShapes()
    {
        for(Shape currShape:shapes)
        {
            currShape.drawShape(null);
        }
    }
}

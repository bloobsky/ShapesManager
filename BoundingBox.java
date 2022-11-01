package com.dermot.ca1.boundingboxex1;

public class BoundingBox {
    private Point bottomLeft;
    private Point topRight;

    public BoundingBox(Point bottomLeft, Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    @Override
    public String toString() {
        return "BoundingBox{" +
                "bottomLeft=" + bottomLeft +
                ", topRight=" + topRight +
                '}';
    }
}

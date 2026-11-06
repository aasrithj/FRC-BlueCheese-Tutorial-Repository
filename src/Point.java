/*
 * Copyright 2026 FRCSoftware
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

public class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public static final Point ORIGIN = new Point(0, 0);
}


void main() {

    Point pointOne = new Point(2, 5);
    Point pointTwo = new Point(3, 0);

    System.out.println(pointOne.getX());
    System.out.println(pointTwo.getY());

    if (pointOne.getX() > pointTwo.getX()) {
        System.out.println("Point one is farther right!");
    } else if (pointOne.getX() < pointTwo.getX()) {
        System.out.println("Point two is farther right!");
    } else {
        System.out.println("Both points are at the same x-coordinate.");
    }

    pointOne = new Point(-4, 5);
    pointTwo = new Point(-5, 0);

    if (pointOne.getY() == 0) {
        System.out.println("p1 x-axis");
    } else if (pointOne.getX() == 0) {
        System.out.println("p1 y-axis");
    } else if (pointOne.getX() == 0 && pointOne.getY() == 0) {
        System.out.println("p1 origin");
    } else if (pointTwo.getY() == 0) {
        System.out.println("p2 x-axis");
    } else if (pointTwo.getX() == 0) {
        System.out.println("p2 y-axis");
    } else if (pointTwo.getX() == 0 && pointTwo.getY() == 0) {
        System.out.println("p2 origin");
    }

    pointOne = new Point(0, 0);
    pointTwo = new Point(0, 3);

    if (pointOne.getX() == pointTwo.getX() && pointOne.getY() == pointTwo.getY()) {
        System.out.println("p1 equals p2!");
    } else {
        System.out.println("p1 does not equal p2");
    }

    pointOne = new Point(5, 8);
    pointTwo = new Point(5, 8);

}

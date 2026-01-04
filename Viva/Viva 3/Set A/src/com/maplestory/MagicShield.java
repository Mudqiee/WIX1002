package com.maplestory;

public class MagicShield {
  
    // Instance variable
    private double radius;
    private double thickness;
    private String elementType;

    // Static variable
    private static final double DEFAULT_RADIUS = 1.0;
    private static final double DEFAULT_THICKNESS = 5.0;
    private static int shieldCount = 0;

    // Constructor (No - argument constructor)
    public MagicShield() {

        this.radius = DEFAULT_RADIUS;
        this.thickness = DEFAULT_THICKNESS;
        this.elementType = "Neutral";
        shieldCount++;
    }

    // Constructor (Parameterized constructor)
    public MagicShield(double radius, double thickness, String elementType) {

        setRadius(radius);
        setThickness(thickness);
        setElementType(elementType);
        shieldCount++;
    }

    public double getRadius() {
        return radius;
    }

    public double getThickness() {
        return thickness;
    }

    public String getElementType() {
        return elementType;
    }

    public void setRadius(double radius) {
        if (radius < 0)
            throw new IllegalArgumentException("Invalid radius");
        this.radius = radius;
    }

    public void setThickness(double thickness) {
        if (thickness < 0)
            throw new IllegalArgumentException("Invalid thickness");
        this.thickness = thickness;
    }

    public void setElementType(String type) {
        if (type == null || type.isEmpty())
            this.elementType = "Neutral";
        else
            this.elementType = type;
    }

    // Instance method
    public double calculateDefensePower() {
        return calculateDefensePower(radius, thickness, elementType);
    }

     public double calculateManaCost() {
        return radius * 10 + thickness * 2;
    }

    // Class Method
    public static int getShieldCount() {
        return shieldCount;
    }

    public static boolean isValidSize(double size) {
        return size >= 0;
    }

    public static double calculateDefensePower(double radius, double thickness, String elementType) {

        double coefficient;

        switch (elementType) {
            case "Fire": coefficient = 1.1; break;
            case "Ice": coefficient = 1.2; break;
            case "Light": coefficient = 1.3; break;
            case "Dark": coefficient = 1.4; break;
            default: coefficient = 1.0;
        }

        return radius * thickness * coefficient;
    }

    public static double calculateManaCost(double radius, double thickness) {
        return radius * 10 + thickness * 2;
    }

    @Override
    public String toString(){

        return "MagicShield [radius=" + radius +
                ", thickness=" + thickness +
                ", elementType=" + elementType + "]";
    }
}

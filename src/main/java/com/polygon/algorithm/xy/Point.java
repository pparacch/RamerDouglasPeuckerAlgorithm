package com.polygon.algorithm.xy;

public class Point {

	private double x;
	private double y;
	
	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	@Override
    public boolean equals(Object obj) {
        boolean result = false;
        if (obj instanceof Point) {
            Point point = (Point) obj;
            if (point.toString().equals(toString())) {
                result = true;
            }
        } else {
            result = super.equals(obj);
        }
        return result;
    }
	
	 @Override
	 public String toString() {
		 return "(" + getX() + "," + getY() + ")";
	 }
	
	 @Override
	 public int hashCode() {
	     return toString().hashCode();
	 }
	
}

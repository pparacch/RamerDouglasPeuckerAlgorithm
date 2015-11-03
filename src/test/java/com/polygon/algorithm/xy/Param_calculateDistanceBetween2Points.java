package com.polygon.algorithm.xy;
import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

import org.junit.AfterClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.polygon.algorithm.xy.RamerDouglasPeucker;
import com.polygon.algorithm.xy.Point;


@RunWith(Parameterized.class)
public class Param_calculateDistanceBetween2Points {

	private Point a;
	private Point b;
	private Double expectedDistance;
	
	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
				{new Point(0,0), new Point(0, 1), 1}, 
				{new Point(0,0), new Point(2, 2), 2.828},
				{new Point(3,3), new Point(3, 3), 0.0},
				{new Point(1,0), new Point(50, 50), 70.007}
		});
	}

	
	
	public Param_calculateDistanceBetween2Points(Point a, Point b, double distance) {
		this.a = a;
		this.b = b;
		this.expectedDistance = distance;
	}
	
	@Test
	public void test_calculateDistanceBetween2Points(){
		assertEquals(expectedDistance, RamerDouglasPeucker.calculateDistanceBetweenTwoPoints(a, b),0.01);
	}

}

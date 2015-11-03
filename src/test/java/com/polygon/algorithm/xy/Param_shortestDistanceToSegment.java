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
public class Param_shortestDistanceToSegment {

	private Point thePoint;
	private Point segmentPointA;
	private Point segmentPointB;
	private Double expectedDistance;
	
	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
				{new Point(0.0,15.0), new Point(-20.0, 0.0), new Point(20.0,0.0), 15.0},
				{new Point(0.0,15.0), new Point(-20.0, 0.0), new Point(43.0,17.0), 9.271},
				{new Point(0.0,0.0), new Point(-5.0, 0.0), new Point(0.0,-10.0), 4.47}
		});
	}

	
	
	public Param_shortestDistanceToSegment(Point a, Point b, Point c, double distance) {
		this.thePoint = a;
		this.segmentPointA = b;
		this.segmentPointB = c;
		this.expectedDistance = distance;
	}
	
	@Test
	public void test_Param_shortestDistanceToSegment(){
		Double actual = RamerDouglasPeucker.shortestDistanceToSegment(thePoint, segmentPointA, segmentPointB);
		System.out.println("actual: " + actual);
		assertEquals(expectedDistance, actual, 0.01);
	}

}

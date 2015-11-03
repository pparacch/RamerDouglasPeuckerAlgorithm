package com.polygon.algorithm.xy;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.polygon.algorithm.xy.RamerDouglasPeucker;
import com.polygon.algorithm.xy.Point;

@RunWith(Parameterized.class)
public class Param_calculateTriangleAreaGivenVertices {

	private Point a;
	private Point b;
	private Point c;
	private Double expectedArea;

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][]{
				{new Point(15.0, 15.0), new Point(50.0, 25.0), new Point(23.0, 30.0), 222.5},
				{new Point(0.0, 0.0), new Point(18.0, -7.0), new Point(51.0, 0.0), 178.5},
				{new Point(0.0, 0.0), new Point(1.0, 0.0), new Point(51.0, 0.0), 0.0},
				{new Point(0.0, 0.0), new Point(0.0, 0.0), new Point(0.0, 0.0), 0.0},
				{new Point(0.0, 15.0), new Point(-20.0, 0.0), new Point(20.0, 0.0), 300.0}
				});
	}

	public Param_calculateTriangleAreaGivenVertices(Point a, Point b, Point c,
			double distance) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.expectedArea = distance;
	}

	@Test
	public void test_calculateTriangleAreaGivenVertices() {
		Double actual = RamerDouglasPeucker.calculateTriangleAreaGivenVertices(a, b, c);
		assertEquals(expectedArea, actual, 0.01);
	}

}

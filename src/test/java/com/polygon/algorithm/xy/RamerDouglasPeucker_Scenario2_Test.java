package com.polygon.algorithm.xy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class RamerDouglasPeucker_Scenario2_Test {
	
	@Test
	public void process_passingVerticesList_vertex4DistancesAboveDistanceThreshold_return3VerticesList(){
		
		List<Point> input = new ArrayList<Point>();
		input.add(new Point(-3.0,0.0)); //*
		
		input.add(new Point(-2.0, 2.0));
		input.add(new Point(-1.0, 1.0));
		input.add(new Point(0.0, 3.0));
		input.add(new Point(2.0, 10.0)); //vertex4(1 iter), *
		input.add(new Point(4.0, 6.0)); //vertex4(2 iter), *
		input.add(new Point(5.0, 8.5));
		input.add(new Point(21.0, 25.0));
		
		input.add(new Point(30.0,33.0));//*
		
		Double threshold = 2.0d;
		
		List<Point> actual = RamerDouglasPeucker.process(input, threshold);
		System.out.println("actual: " + actual);
		
		assertNotNull(actual);
		assertFalse(actual.isEmpty());
		assertEquals(4, actual.size());
		assertEquals(input.get(0), actual.get(0));
		assertEquals(input.get(4), actual.get(1));
		assertEquals(input.get(5), actual.get(2));
		assertEquals(input.get(8), actual.get(3));
		
	}
	
}

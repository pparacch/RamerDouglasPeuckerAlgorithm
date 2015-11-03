package com.polygon.algorithm.xy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class RamerDouglasPeucker_Scenario1_Test {
	
	@Test
	public void process_passingVerticesList_allDistancesUnderDistanceThreshold_return2VerticesList(){
		
		//Line connecting start/ end point: y = x + 3
		List<Point> input = new ArrayList<Point>();
		input.add(new Point(-3.0,0.0));
		
		input.add(new Point(-2.0, 2.0));
		input.add(new Point(-1.0, 1.0));
		input.add(new Point(0.0, 3.0));
		input.add(new Point(2.0, 6.0));
		input.add(new Point(4.0, 6.0));
		input.add(new Point(5.0, 8.5));
		input.add(new Point(10.0, 12.0));
		
		input.add(new Point(20.0,23.0));
		
		Double threshold = 1.0d;
		
		List<Point> actual = RamerDouglasPeucker.process(input, threshold);
		
		assertNotNull(actual);
		assertFalse(actual.isEmpty());
		assertEquals(2, actual.size());
		assertEquals(input.get(0), actual.get(0));
		assertEquals(input.get(input.size()-1), actual.get(1));
	}
		
}

package com.polygon.algorithm.xy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class RamerDouglasPeuckerTest {

	static final double ANY_VALUE = 0;
	
	@Test
	public void process_passingNullVerticesList_returnNull() {
		List<Point> actual = RamerDouglasPeucker.process(null, ANY_VALUE);
		assertNull(actual);
	}
	
	@Test
	public void process_passingEmptyVerticesList_returnEmptyVerticesList() {
		List<Point> actual = RamerDouglasPeucker.process(new ArrayList<Point>(), ANY_VALUE); 
		assertNotNull(actual);
		assertTrue(actual.isEmpty());
	}
	
	@Test
	public void process_passing3VerticesList_allDistancesUnderDistanceThreshold_return2VerticesList(){
		
		List<Point> input = new ArrayList<Point>();
		input.add(new Point(0.0,0.0));
		input.add(new Point(1.5,1.5));
		input.add(new Point(1.0,0.0));
		
		Double threshold = 2.0d;
		
		List<Point> actual = RamerDouglasPeucker.process(input, threshold);
		
		assertNotNull(actual);
		assertFalse(actual.isEmpty());
		assertEquals(2, actual.size());
		assertEquals(input.get(0), actual.get(0));
		assertEquals(input.get(input.size()-1), actual.get(1));
	}
	

	//TODO Test calculateTriangleAreaGivenVertices -> Test negative scenarios - based on assumption around vertices (not null)
	
}

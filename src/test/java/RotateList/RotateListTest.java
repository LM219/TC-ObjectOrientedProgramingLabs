package RotateList;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class RotateListTest {

	@Test
	public void rotateTest() {

		// Given
		Integer[] originalArray = { 1, 2, 3, 4, 5, 6 };
		Integer[] expectedOutcome = { 3, 4, 5, 6, 1, 2 };

		RotateList rl = new RotateList();
		rl.addAll(Arrays.asList(originalArray)); 

		RotateList expected = new RotateList();
		expected.addAll(Arrays.asList(expectedOutcome));

		// When
		rl.rotate(2);

		// Then
		Assert.assertEquals(expected, rl);

	}

}

package Thamizh813;
import static org.junit.Assert.*;

import static org.mockito.Mockito.when;

import static org.mockito.Mockito.mock;

import java.util.List;

import org.junit.Test;

public class TestList2 {
	



	   @Test

	   public void testList_Returns_MultipleValues() {

	   List mocklist = mock(List.class);

	   when(mocklist.size()).thenReturn(1).thenReturn(2).thenReturn(3);

	   assertEquals(1, mocklist.size());

	   assertEquals(2, mocklist.size());

	   assertEquals(3, mocklist.size());

	   System.out.println(mocklist.size());

	   System.out.println(mocklist);

	   }

	 }
















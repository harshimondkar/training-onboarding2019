package com.amdocs;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class MobileTest {

	@Test
	public void testStartPhotoAppWhenCameraOnFunctionsNormally() {
		
		//Mocking- creating a dummy variable
		Camera mockitoCamera = Mockito.mock(Camera.class);
		
		Mockito.when(mockitoCamera.on()).thenReturn(true);
		
		//Dependency injection
		Mobile mobile = new Mobile(mockitoCamera);

		
		boolean actualResponse = mobile.startPhotoApp();
		boolean expectedResponse = true;
		
		assertEquals(expectedResponse, actualResponse);
		
		
		Mockito.verify(mockitoCamera,Mockito.times(1)).on();
	}

}

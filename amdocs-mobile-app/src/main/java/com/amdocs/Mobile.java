package com.amdocs;

public class Mobile {
	
	private Camera camera ;
	
	public Mobile() {
		camera = new Camera();
	}
	
	public Mobile(Camera camera) {
		this.camera= camera;
	}
	
	

	public boolean startPhotoApp() {
 
		System.out.println("Inside photo app method");
		
				
		
		if(camera.on()) {
			System.out.println("+ve code path \n assume some hardware interaction happens here");
			return true;
		}
		
		System.out.println("-ve code path \n soem exception handeling happens here");
		return false;
	}

}

package com.practice;

public class ChildPoint extends ParentPoint {
	
	public void place() {
		System.out.println("I need to move for other country");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParentPoint point=new ChildPoint();
		point.properties();
		point.place();
    
	}

}

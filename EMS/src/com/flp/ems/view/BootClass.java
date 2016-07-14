package com.flp.ems.view;

import java.util.Scanner;

public class BootClass

{

	public static void main(String[] args){
		BootClass B=new BootClass();
		B.menuSelection();
		
		
	}
	
	public void menuSelection(){
		UserInteraction ui=new UserInteraction();
		
		System.out.println("1 for AddEmployee");
		System.out.println("2 for ModifyEmployee");
		System.out.println("3 for RemoveEmployee");
		System.out.println("4 for SearchEmployee");
		System.out.println("5 for getAllEmployee");

		Scanner sc=new Scanner(System.in);
	      int i= sc.nextInt();
	      
	      
	    switch(i){
	    case 1:
	    	ui.AddEmployee();
	    	break;
	    case 2:
	    	//ui.ModifyEmployee();
	    	break;
	    case 3:
	    	//ui.RemoveEmployee();
	    	break;
	    case 4:
	    	//ui.SearchEmployee();
	    	break;
	    case 5:
	    	//ui.getAllEmployee();
	    case 6:System.exit(0);
	    
	    	
	    	
	    	
	    }
		
	}
	
}


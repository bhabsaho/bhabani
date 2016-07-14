package com.flp.ems.view;


import com.flp.EMS.service.
//import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class UserInteraction {
	
   private Map<Integer, String> employee= new HashMap<>();
   
   public void AddEmployee(){
	   
	   employee.put(new Integer(1), "Bhabani Sahoo");
	   employee.put(new Integer(2), "9439018800");
	   employee.put(new Integer(3), "A-102 elysium");
	   employee.put(new Integer(4), "30/05/2016");
	   employee.put(new Integer(5), "29/05/1993");
	   
	   EmployeeServiceImpl es= new EmployeeServiceImpl();
	   es.AddEmployee(employee);
	   
   }
   
   public void ModifyEmployee(){
	   
   }
   
   public void RemoveEmployee() {
	
   }
   
   public int SearchEmployee() {
   return 0;	
   }
   
   public void getAllEmployee(){
	   
   }

	
	
}

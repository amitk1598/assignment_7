package acadview_assignment_7;

import java.util.*;
public class sortGeneric  {

	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		
        list.add(5);                             
        list.add(18);
      
        
        
        Collections.sort(list);        
        System.out.println(list);
        
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Amit");
        list1.add("sblkns");
       
        
        Collections.sort(list1);       
        System.out.println(list1);
        
        ArrayList<Float> list2 = new ArrayList<Float>();
        list2.add(7.2f);
        list2.add(1.25f);
        
        
        Collections.sort(list2);        
        System.out.println(list2);
        
        ArrayList<Double> list3 = new ArrayList<Double>();
        list3.add(1.54);
        list3.add(7.55);
       
        
        Collections.sort(list3);        
        System.out.println(list3);
	}

}

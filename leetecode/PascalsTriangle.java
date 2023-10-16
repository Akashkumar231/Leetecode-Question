package com.leetecode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

	
	  public static List<Integer> getRow(int rowIndex) {
	        
	        List<Integer> result = new ArrayList();

	        for(int i = 0 ; i< rowIndex +1;++i){
	        
	        result.add(1);

	        }
	            
	         for(int i = 1 ; i< rowIndex ;++i){
	        
	             for(int j =i ; j>0 ; --j){

	              result.set(j,result.get(j)+result.get(j-1));
	             

	             }

	        }

	        return result;


	    }
	
	public static void main(String [] args) {
		
		
		System.out.print(getRow(2));
		
	}
	
}

package com.vector.demo;
public class MeanStandardDeviation {
	    public static void main(String[] args)
	    {	    	
	    	double sum = 0.0;
		    double standardDeviation = 0.0;
		    double mean = 0.0;
		    double res = 0.0;
		    double sq = 0.0;
		    
		    int[] arr = { 12, 32, 11, 55, 10, 23, 14, 30 };
	        int n = arr.length;
	       
	        for (int i = 0; i < n; i++) {
	            sum = sum + arr[i];
	        }
	       
	        mean = sum / (n);
	 
	        for (int i = 0; i < n; i++) {
	           
	            standardDeviation
	                = standardDeviation + Math.pow((arr[i] - mean), 2);
	           
	        }
	       
	        sq = standardDeviation / n;
	        res = Math.sqrt(sq);
	 
	        System.out.println("Mean : "+mean);
	        System.out.format("Standard Deviation = %.6f", res);
	    }
	}



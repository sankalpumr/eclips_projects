package com.sankalp.javapractice4;

/**
 * Hello world!
 *
 */
public class App 
{
   
         public static void main(String args[]) {
    		
    		
    		int is_full_time = 1;
    		int emp_rate_per_hour = 20;
    		
    		int emphrs =0;
    		int empwage = 0;
    		
    		double empcheck = Math.floor(Math.random() * 10) % 2;
    			
    	    if (empcheck == is_full_time)
    			emphrs = 8;
    		else
    			emphrs = 0;
    		empwage = emphrs * emp_rate_per_hour;
    		System.out.println("emp wage" + empwage);
    	}
    	

    }

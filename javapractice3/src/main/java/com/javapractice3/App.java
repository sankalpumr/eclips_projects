package com.javapractice3;

/**
 * Hello world!
 *
 */
public class App 
{
	
public static final	int is_part_time = 1;
public static final	int is_full_time = 2;
public static final	int emp_rate_per_hour = 20;
	
    public static void main( String[] args )
    {

		int emphrs =0;
		int empwage = 0;
		int empcheck = Math.floor(Math.random() * 10) % 3;
			switch (empcheck) {
			case is_part_time:
			emphrs =4;
		    break;

			case is_full_time:
			emphrs = 8;

			default:
			emphrs = 0;
			}
			empwage = emphrs * emp_rate_per_hour;
		System.out.println("emp wage" + empwage);
	}
	

}
    


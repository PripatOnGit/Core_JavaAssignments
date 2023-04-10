package com.java;

public class Date {
		int day, month, year;
		
		Date(){
			day = 01;
			month = 01;
			year = 1970;
		}
		Date(int day){
			this.day = day;
			month = 01;
			year = 1970;
		}
		Date(int day, int month){
			year = 1970;
			this.day = day;
			this.month = month;
		}
		Date(int day, int month, int year){
			this.day = day;
			this.month = month;
			this.year = year;
		}
		
		public void printDate() {
			if(this.day > 31) {
			System.out.println("Invalid date !!");
			}else if(this.month > 12) {
				System.out.println("Invalid month number !!");
			}else if(this.year < 1970) {
				System.out.println("Invalid year !!");
			}else System.out.println("Date: "+this.day+"/"+this.month+"/"+this.year);
		}
		
		public void nextDate() {
			if((this.day) > 0 && (this.day)< 31){
				this.day++ ;
				System.out.println("Date: "+this.day+"/"+this.month+"/"+this.year);
			}
		}
		public void prevDate() {
			
		}
	
		public static void main(String[] args) {
			Date dt1 = new Date(12,3,1972);
			dt1.printDate();
			dt1.nextDate();
		}
		
}

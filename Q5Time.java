/*
Write a class Time with three data members to store hr, min and seconds.
Create two constructors and apply checks to set valid time. (hr;24, min;60, sec;60). 
Also create display function which displays all data members.
 */
package assignment3;

import java.util.Scanner;

public class Q5Time {
	private int hour;
	private int minute;
	private int second;

	public Q5Time() {
		this(0, 0, 0);
	}

	public Q5Time(int hour, int minute, int second) {
		if (isValidTime(hour, minute, second)) {
			this.hour = hour;
			this.minute = minute;
			this.second = second;
		} else {
			throw new IllegalArgumentException("Invalid time format");
		}
	}

	private boolean isValidTime(int hour, int minute, int second) {
		return hour >= 0 && hour < 24 && minute >= 0 && minute < 60 && second >= 0 && second < 60;
	}

	public void display() {
		System.out.printf("Time: %02d:%02d:%02d%n", hour, minute, second);
	}

	public static void main(String[] args) {
		Q5Time t1 = new Q5Time(12, 30, 45);
		t1.display();

		Q5Time t2 = Q5Time.fromString("09:15:20");
		t2.display();

	}

	public static Q5Time fromString(String timeStr) {
		String[] parts = timeStr.split(":");
		int hour = Integer.parseInt(parts[0]);
		int minute = Integer.parseInt(parts[1]);
		int second = Integer.parseInt(parts[2]);
		return new Q5Time(hour, minute, second);
	}
}

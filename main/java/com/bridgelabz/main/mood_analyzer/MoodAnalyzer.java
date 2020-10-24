package com.bridgelabz.main.mood_analyzer;

import org.apache.commons.math3.exception.NullArgumentException;

public class MoodAnalyzer {
	
	private String message = null;
	
	//Parameterized constructor
	public MoodAnalyzer(String message) 
	{
		this.message = message;
	}

	//Default constructor
	public MoodAnalyzer() 
	{}

	public static void main(String[] args) 
	{
		MoodAnalyzer mood = new MoodAnalyzer();
		mood.analyzeMood();
	}

	public String analyzeMood() 
	{
		try {
			
			if(this.message.contains("sad"))
				return "SAD";
			else
				return "HAPPY";
		
		} catch (NullPointerException e) {
			return "HAPPY";
		}
	}

}

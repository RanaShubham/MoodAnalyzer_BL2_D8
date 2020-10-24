package com.bridgelabz.main.mood_analyzer;

public class MoodAnalyzer {
	
	private String message;
	
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
		MoodAnalyzer mood = new MoodAnalyzer("I am sad");
		mood.analyzeMood();
	}

	public String analyzeMood() 
	{		
		if(this.message.contains("sad"))
			return "SAD";
		else
			return "HAPPY";
	}

}

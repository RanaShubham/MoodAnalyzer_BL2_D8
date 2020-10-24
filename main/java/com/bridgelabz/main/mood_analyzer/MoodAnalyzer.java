package com.bridgelabz.main.mood_analyzer;

public class MoodAnalyzer {

	public static void main(String[] args) 
	{
		MoodAnalyzer mood = new MoodAnalyzer();
		String feel = mood.analyzeMood("I am Sad");
		System.out.println(feel);
	}

	private String analyzeMood(String message) 
	{
		if(message.contains("sad"))
			return "SAD";
		else
			return "HAPPY";
	}

}

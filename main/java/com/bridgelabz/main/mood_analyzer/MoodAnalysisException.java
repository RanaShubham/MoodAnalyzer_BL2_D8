package com.bridgelabz.main.mood_analyzer;

public class MoodAnalysisException extends RuntimeException {

	//My enum
	enum Exception_Error_Type
	{
		NULL_MOOD,
		EMPTY_MOOD
	}
	
	Exception_Error_Type type;
	
	public MoodAnalysisException (Exception_Error_Type type, String message)
	{
		super(type+": "+message);
		this.type = type;
	}
}

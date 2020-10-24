package com.bridgelabz.test.mood_analyzer;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.main.mood_analyzer.MoodAnalyzer;

public class MoodAnalzyerTest 
{
	
	@Test
	public void givenIamSad_Whenproper_ShouldReturnSAD()
	{
		MoodAnalyzer moodObj = new MoodAnalyzer("I am sad");
		String result = moodObj.analyzeMood();
		Assert.assertEquals("SAD", result);
	}
	
	@Test
	public void givenIamAnyMood_WhenProper_ShouldReturnHAPPY()
	{
		MoodAnalyzer moodObj = new MoodAnalyzer("I am happy");
		String result = moodObj.analyzeMood();
		Assert.assertEquals("HAPPY", result);
	}
	
	@Test
	public void givenNullMood_ShouldReturnHAPPY()
	{
		MoodAnalyzer moodObj = new MoodAnalyzer();
		String result = moodObj.analyzeMood();
		Assert.assertEquals("HAPPY", result);
	}
}

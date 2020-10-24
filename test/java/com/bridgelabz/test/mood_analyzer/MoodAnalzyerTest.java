package com.bridgelabz.test.mood_analyzer;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.main.mood_analyzer.MoodAnalysisException;
import com.bridgelabz.main.mood_analyzer.MoodAnalyzer;

public class MoodAnalzyerTest 
{
	
	@Test
	public void givenIamSadMood_ShouldReturnSAD()
	{
		MoodAnalyzer moodObj = new MoodAnalyzer("I am sad");
		String result = moodObj.analyzeMood();
		Assert.assertEquals("SAD", result);
	}
	
	@Test
	public void givenIamAnyMood_ShouldReturnHAPPY()
	{
		MoodAnalyzer moodObj = new MoodAnalyzer("I am happy");
		String result = moodObj.analyzeMood();
		Assert.assertEquals("HAPPY", result);
	}
	
	@Test (expected  = MoodAnalysisException.class)
	public void givenNullMood_ShouldThrowMoodAnalysisException()
	{
		MoodAnalyzer moodObj = new MoodAnalyzer();
		String result = moodObj.analyzeMood();
	}
}

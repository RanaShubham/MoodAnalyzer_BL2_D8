package com.bridgelabz.test.mood_analyzer;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.main.mood_analyzer.MoodAnalyzer;

public class MoodAnalzyerTest 
{
	static MoodAnalyzer moodObj = new MoodAnalyzer();
	
	@Test
	public void givenIamSad_Whenproper_ShouldReturnSAD()
	{
		String result = moodObj.analyzeMood("I am sad");
		Assert.assertEquals("SAD", result);
	}
	
	@Test
	public void givenIamAnyMood_WhenProper_ShouldReturnHAPPY()
	{
		String result = moodObj.analyzeMood("I am excited");
		Assert.assertEquals("HAPPY", result);
	}
}

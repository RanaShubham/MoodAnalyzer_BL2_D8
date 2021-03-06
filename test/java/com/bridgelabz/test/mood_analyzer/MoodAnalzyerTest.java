package com.bridgelabz.test.mood_analyzer;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.main.mood_analyzer.MoodAnalyzer;

public class MoodAnalzyerTest 
{
	static MoodAnalyzer moodObj = new MoodAnalyzer("I am sad");
	
	@Test
	public void givenIamSad_Whenproper_ShouldReturnSAD()
	{
		String result = moodObj.analyzeMood();
		Assert.assertEquals("SAD", result);
	}
}

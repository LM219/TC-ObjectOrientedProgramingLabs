package Superpowers;

import org.junit.Assert;
import org.junit.Test;

import Superpowers.Human.Gender;
import Superpowers.Human.Occupation;

public class SuperHumanTest {
	
	@Test
	 public void getSuperPowerTest()
	{    // :Given
		
		SuperHuman superhuman1 = new SuperHuman("Louise Milligan", 22, Gender.Female, Occupation.Programmer, "45 Bank Street", false);
		
		superhuman1.gainSuperPower(1);
		
		
		String expected= "Invisibility";
		
		String actual= superhuman1.getSuperPower();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void getHeroNameTest()
	{
		SuperHuman superhuman1 = new SuperHuman("Louise Milligan", 22, Gender.Female, Occupation.Programmer, "45 Bank Street", false);
		
		superhuman1.gainSuperPower(1);
		
		
		String expected= "Congratulations, you now are an official superhero, welcome to the team " + "Invisible Programmer";
		
		// Please excuse my terrible superhero name, my creativity skills are poor at 9am...
		String actual= superhuman1.gainSuperHeroName("Invisible Programmer");
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void getHeroNameTest2()
	{
		SuperHuman superhuman1 = new SuperHuman("Louise Milligan", 22, Gender.Female, Occupation.Programmer, "45 Bank Street", false);
		
		superhuman1.gainSuperPower(15);
		
		
		String expected= "Sorry you need a SUPERPOWER to have a Hero Name....!!";
		
		// Please excuse my terrible superhero name, my creativity skills are poor at 9am...
		String actual= superhuman1.gainSuperHeroName("Invisible Programmer");
		
		Assert.assertEquals(expected, actual);
	}

		

}

 package Superpowers;

import Superpowers.Human.Gender;
import Superpowers.Human.Occupation;

public class SuperHuman extends Human {
	private String superPower;
	private boolean isEvil;
	private String heroName;
	
	public SuperHuman(
			String name, 
			int age, 
			Gender gender, 
			Occupation occupation, 
			String address,
			boolean isEvil
			)
	{
		super(name, age, gender, occupation, address);
		this.superPower = "You don't have one yet!";
		this.isEvil = isEvil;
		this.heroName = heroName;
		
	}
	public String gainSuperPower(int powerNum)
	{
		switch (powerNum) {
        case 1:  
        	superPower = "Invisibility";
                 break;
        case 2:  
        	superPower = "Ability to Fly";
        	break;
        case 3:  
        	superPower = "Time Travel";
                 break;
        case 4:  
        	superPower = "Super Strength";
                 break;
        case 5:  
        	superPower = "Super Flexible";
                 break;
        case 6:  
        	superPower = "Read Minds";
                 break;
        case 7:  
        	superPower = "Super Speed";
                 break;
 
        default: 
        	superPower = "You don't have one yet!";
                 break;
	}
		return superPower;

}
	
	public String getSuperPower()
	{
		return superPower;
	}
	
	public String gainSuperHeroName(String heroName)
	{
		if (superPower.equals("You don't have one yet!"))
		{
		
		String output= "Sorry you need a SUPERPOWER to have a Hero Name....!!";
		return output;
		}
		else
		{
			this.heroName = heroName;
			String output2= "Congratulations, you now are an official superhero, welcome to the team ";
			return output2 + heroName;
			
		}
	}
}

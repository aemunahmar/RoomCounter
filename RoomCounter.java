//Developed by Aemun Ahmar 1047508
//CSCI 185-M03: Spring 2017
//Professor Hakkan Peckan
//Classwork 1: Room Counter 
//March 3, 2017

import javax.swing.JOptionPane;

public class RoomCounter 
{
	int addPerson = 0;
	int removePerson = 0;
	int counter = 0;
		
	public void addPerson()
	{
		try
		{	
			String inputPeopleAdded = JOptionPane.showInputDialog("How many people entered the room?");
			int peopleAdded = Integer.parseInt(inputPeopleAdded);
			addPerson =+ peopleAdded;
			
			if(addPerson < 0)
			{
				throw new Exception();
			} 
			
		}
		catch(Exception e)
		{
			System.out.println("There cannot be a negative number of people in the room");
			System.exit(0);
		}
	}
	
	public void removePerson()
	{
		try
		{	
			String inputPeopleRemoved = JOptionPane.showInputDialog("How many people left the room?");
			int peopleRemoved = Integer.parseInt(inputPeopleRemoved);
			removePerson =+ peopleRemoved;
			
			if(removePerson < 0)
			{
				throw new Exception();
			}		
		}
		catch(Exception e)
		{
			System.out.println("There cannot be a negative number of people in the room");
			System.exit(0);
		}
	}
	
	public void getCounter()
	{
		try
		{	
			counter = addPerson - removePerson;
			
			if(counter < 0)
			{
				throw new Exception();
			} 	
					
			System.out.println("Number of people added: " + addPerson + "\nNumber of people removed: " + removePerson
					+ "\nNumber of people left: " + counter);
		}
		catch(Exception e)
		{
			System.out.println("There cannot be a negative number of people in the room");
			System.exit(0);
		}
	}
	
	public static void main(String[] args)
	{
		RoomCounter rc = new RoomCounter();
		
		rc.addPerson();
		rc.removePerson();
		rc.getCounter();
	}
}

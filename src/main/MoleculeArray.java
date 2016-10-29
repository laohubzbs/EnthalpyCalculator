package main;
import java.util.Scanner;
import java.util.ArrayList;
public class MoleculeArray 
{
	private static String molecule;
	public static ArrayList<String> newMolecule;
	public static void main(String[] args)
	{
		scanString();
		System.out.println(getArray());
		
	}
	public static void scanString()
	{
		Scanner s = new Scanner(System.in);
		molecule = s.next();
		
	}
	public static ArrayList<String> getArray()
	{
		int arrayCount = 0;
	
		int subIndex = 0;
		int count = 0;
		for(int i = 0; i<molecule.length(); i++)
		{
			if(Character.isDigit(molecule.charAt(i)))
			{
				int subScript =Character.getNumericValue(molecule.charAt(i));
				
				if(arrayCount == 0)
				{
				while(count< subScript)
				{
					
						//newMolecule[arrayCount] = molecule.substring(0,i-1);
						newMolecule.add(molecule.substring(0, i-1));
						arrayCount++;
				
					
//					else
//					{
//						newMolecule[arrayCount] = molecule.substring(beginIndex)
//						newMolecule.add(arrayCount, molecule.substring(subIndex, i-1));
//						arrayCount++;
//					
//					}
//					
					count++;
					subIndex = i + 1;
				}
				}
			}
		}
		
		return newMolecule;
	}
	

}

package array.controller;

import array.model.Pirannha;

public class ArrayController
{
	private String[][] myString;
	private int[][] myNum;
	private Pirannha[][] myPlant;
	
	public void start()
	{
		fillThePlant();
		fillThePlantsAgain();
		fillTheString();
		fillTheStringAgain();
		fillTheInt();
		changeTheInt();
	}
	
	public ArrayController()
	{
		myString = new String[4][4];
		myNum = new int[5][3];
		myPlant = new Pirannha[6][4];
	}
	
	private void fillThePlant()
	{
		for (int row = 0; row < myPlant.length; row++)
		{
			for (int col = 0; col < myPlant[0].length; col++)
			{
				myPlant[row][col] = new Pirannha();
			}
		}
	}
	
	private void fillThePlantsAgain()
	{
		for (int row = 0; row < myPlant.length; row++)
		{
			for (int col = 0; col < myPlant[0].length; col++)
			{
				myPlant[row][col].setFire(false);
			}			
		}
	}
	
	private void fillTheString()
	{
		for (int row = 0; row < myString.length; row++)
		{
			for (int col = 0; col < myString[0].length; col++)
			{
				myString[row][col] = "variable";
			}
		}
	}
	
	private void fillTheStringAgain()
	{
		for (int row = 0; row < myString.length; row++)
		{
			for (int col = 0; col < myString[0].length; col++)
			{
				myString[row][col] = "variables";
			}
		}

	}
	
	private void fillTheInt()
	{
		myNum[0][0] = 1;
		myNum[0][1] = 2;
		myNum[0][2] = 3;
		myNum[1][0] = 4;
		myNum[1][1] = 5;
		myNum[1][2] = 6;
		myNum[2][0] = 7;
		myNum[2][1] = 8;
		myNum[2][2] = 9;
		myNum[3][0] = 0;
		myNum[3][1] = 11;
		myNum[3][2] = 22;
		myNum[4][0] = 33;
		myNum[4][1] = 44;
		myNum[4][2] = 55;
	}
	
	private void changeTheInt()
	{
		for (int row = 0; row < myNum.length; row++)
		{
			for (int col = 0; col < myNum[0].length; col++)
			{
				if(myNum[row][col] == 2 % 0)
				{
					myNum[row][col] = myNum[row][col] * 2;
				}
			}
		}
	}
}

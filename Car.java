/*
	Item.java
*/

import java.awt.*;
import java.awt.event.*;

public class Car
{
	//
	//	Constructors
	//	Instantiates an item car from scratch
	public Car()
	{
		this(0, 0, "Car Model","Car Model");
	}

	//	Instantiates an item at a given price
	//		with a given value, and a given model and a give make.
	public Car(int somePrice, int someValue, String model,String carMake)
	{
		setup(carMake,model,someValue,somePrice);
	}


	//
	//	Initializes all components of an car.
	//
	public void setup(String make,String model,int someValue, int somePrice )
	{
		
		price =somePrice;
		value = someValue;
		carModel=model;
		carMake=make;
	}

	//
	//	Accessing the value of an car
	//
	public int getValue()
	{
		return value;
	}
	//
	// Accessing the price of the car
	public int getPrice(){
		return price;
	}
	//
	//sets the value of the car
	//
	public void setValue(int someValue)
	{
		value = someValue;
	}

	//
	//	The instance variables
	private int value,price;						//		the value	and price 
	private String carModel, carMake;


	public void paint(Graphics pane) {
		// TODO Auto-generated method stub
		
	}

}	//	end Item
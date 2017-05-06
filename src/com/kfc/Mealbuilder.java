package com.kfc;
//套餐构造接口
public abstract class Mealbuilder {
	Meal meal=new Meal();
	abstract void buildfood();
	abstract void builddrink();
	Meal getmeal()
	{
		return meal;
	}
	

}

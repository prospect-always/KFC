package com.kfc;
//套餐构造具体实现
public class SubmealbuilderA extends Mealbuilder {
	void buildfood()
	{
		meal.setfood("一份汉堡");
	}

	@Override
	void builddrink() 
	{
		meal.setdrink("一杯可乐");	
	}

}

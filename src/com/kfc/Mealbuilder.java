package com.kfc;
//�ײ͹���ӿ�
public abstract class Mealbuilder {
	Meal meal=new Meal();
	abstract void buildfood();
	abstract void builddrink();
	Meal getmeal()
	{
		return meal;
	}
	

}

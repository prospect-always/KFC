package com.kfc;

public class KFCwaiter {
  Mealbuilder mb;
  void setMealbuilder(Mealbuilder mb)
  {this.mb=mb;
	  }
  Meal construct()
  {
	  mb.buildfood();
	  mb.builddrink();
	  return mb.getmeal();
  }
}

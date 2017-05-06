package com.kfc;

public class Client {
   public static void main(String []args){
	   KFCwaiter waiter=new KFCwaiter();//向服务员点餐
	   SubmealbuilderA A=new SubmealbuilderA();//选择套餐类型
	   waiter.setMealbuilder(A); //服务员传递客户需求
	   Meal meal=waiter.construct(); //制作套餐
	 System.out.print("套餐为："+"\t"+meal.getdrink()+"\t"+meal.getfood());
	   //获得套餐，客户可开始用餐
   }
}

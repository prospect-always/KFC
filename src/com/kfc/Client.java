package com.kfc;

public class Client {
   public static void main(String []args){
	   KFCwaiter waiter=new KFCwaiter();//�����Ա���
	   SubmealbuilderA A=new SubmealbuilderA();//ѡ���ײ�����
	   waiter.setMealbuilder(A); //����Ա���ݿͻ�����
	   Meal meal=waiter.construct(); //�����ײ�
	 System.out.print("�ײ�Ϊ��"+"\t"+meal.getdrink()+"\t"+meal.getfood());
	   //����ײͣ��ͻ��ɿ�ʼ�ò�
   }
}

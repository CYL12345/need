package com.jxd.test;

import java.text.ParseException;
import java.util.Scanner;

public class Test1 {
 @SuppressWarnings("resource")
public static void main(String[] args) throws ParseException {
	 
	 //控制台输入
	 Scanner input =new Scanner(System.in);
	 //输入一个long类型的数字
     Long instr = input.nextLong();
	 String id = instr.toString();
	 //循环添加
	 for(int i =0;i<17-instr.toString().length();i++) {
	 if(id.length()!=17) {
			 id ="0"+id;
	 	}
	 }
	 id = "PRO"+id;
	 System.out.println(id);
	 System.out.println(id.length());
 }
}

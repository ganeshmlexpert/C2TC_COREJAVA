//Constructor Demo

package com.tns.ifet.daythreee;

import java.util.Scanner;

public class ConstructorDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name, city;
		int id;
		System.out.print("Enter Customer Id : ");
		id=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Customer Name : ");
		name=sc.nextLine();
		System.out.print("Enter Customer City : ");
		city=sc.nextLine();
		System.out.println(" ");
		Customer c1=new Customer(); //default constructor invoked
		c1.setCusName(name);
		c1.setCusID(id);
		c1.setCusCity(city);
		System.out.println(c1);
		System.out.print("Enter Customer Id : ");
		id=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Customer Name : ");
		name=sc.nextLine();
		System.out.print("Enter Customer City : ");
		city=sc.nextLine();
		Customer c2=new Customer(name, id, city); //parameterized constructor invoked);
		System.out.println(c2);
		sc.close();
	}

}

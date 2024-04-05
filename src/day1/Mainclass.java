package day1;

import modifredemo.Demo;

public class Mainclass extends Demo {

	public static void main(String[] args) {

		Demo dg = new Demo();

		dg.publicm();

		System.out.println(" ");
		
		Mainclass md = new Mainclass();
		md.publicm();
		md.protectm();

	}

}

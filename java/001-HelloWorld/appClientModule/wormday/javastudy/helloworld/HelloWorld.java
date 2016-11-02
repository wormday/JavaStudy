package wormday.javastudy.helloworld;

import wormday.javastudy.biz.Message;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Message m=new Message();
		System.out.println(m.getMessage());
		System.out.println((byte)10000);
		System.out.println(0/0);
	}
}
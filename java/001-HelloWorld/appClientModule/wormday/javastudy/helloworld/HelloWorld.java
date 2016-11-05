package wormday.javastudy.helloworld;

import wormday.javastudy.biz.Message;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Message m=new Message();
		System.out.println(m.getMessage());
	}
}
package com.simple.lesson1;

public class Lesson {
	public String name;

	public Lesson(String name) {
		System.out.println("第一个小栗子初始化姓名");
		this.name = name;
	}

	public void sayHello() {
		System.out.println("hello " + this.name);
	}

	public void test() {
		System.out.println("我简单的测试线看看");
	}
}

package com.ashoit;

import java.lang.reflect.Field;

public class Test {

	public static void main(String[] args) throws Exception {
		
		Class<?> clz = Class.forName("com.ashoit.User");
		
		Field field = clz.getDeclaredField("age");
		field.setAccessible(true);
		Object object = clz.newInstance();
		field.set(object, 25);
		User user=(User)object;
		System.out.println(user.getAge());
		
	}
}

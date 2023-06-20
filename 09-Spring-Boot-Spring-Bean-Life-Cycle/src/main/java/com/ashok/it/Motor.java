package com.ashok.it;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Motor implements InitializingBean, DisposableBean {

	public Motor() {

		System.out.println("Motor :: Const");
	}
	//1st way programmatic aproch
	@Override
	public void afterPropertiesSet() throws Exception {

		System.out.println("**afterPropertiesSet()::Called");
	}

	@Override
	public void destroy() throws Exception {

		System.out.println("**destroy()::Called");
		
	}

}

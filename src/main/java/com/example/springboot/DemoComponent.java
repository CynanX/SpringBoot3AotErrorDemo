package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DemoComponent {

	private final BeanA beanA;

	private final BeanB beanB;

	@Autowired
	private BeanC beanC;

	public DemoComponent(BeanA beanA, BeanB beanB) {
		this.beanA = beanA;
		this.beanB = beanB;
	}

	public DemoComponent(BeanA beanA, BeanB beanB, BeanC beanC) {
		this.beanA = beanA;
		this.beanB = beanB;
		this.beanC = beanC;
	}

}
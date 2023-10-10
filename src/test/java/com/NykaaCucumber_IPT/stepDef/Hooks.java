package com.NykaaCucumber_IPT.stepDef;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import io.cucumber.java.Before;

public class Hooks {
	
	@BeforeAll
	public void beforeAll() {
		System.out.println("Before All");
	}
	
	@Before("@RegressionTest")
	public void before() {
		System.out.println("Before");
	}
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("Before Each");
	}
	
	@AfterAll
	public void afterAll() {
		System.out.println("after All");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("after Class");
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("after Each");
	}
	
	
	
}

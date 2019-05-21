package com.automation.page;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before
	public void startExecution() {
		System.out.println("--------------Scenario Execution Starts-----------");
	}
	
	@After
	public void stopExecution() {
		System.out.println("--------------Scenario Execution Stops-----------");
	}
	
	@Before("@Smoke")
	public void startBeforeSmoke() {
		System.out.println("--------------Smoke Execution Starts-----------");
	}
	
	@After("@Smoke")
	public void stopsAfterSmoke() {
		System.out.println("--------------Smoke Execution Stops-----------");
	}
	
	@Before(order = 1)
	public void startorderedHooks() {
		System.out.println("--------------Scenario Execution Starts-----------");
	}
	
	@After(order = 0)
	public void orderedHooks() {
		System.out.println("--------------Scenario Execution Stops-----------");
	}
	
	
}

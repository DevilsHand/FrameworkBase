package test.core;

import 

public abstract class Hooks {
	public static Scenario scenario;
	public Hooks() {
		scenario = new Scenario();
		scenario.setName();
	}
	public static Scenario getScenario() { return scenario; }
	
	@Before
	public void setup() {
		System.out.println("Criando setup dos testes");
	}
	
	
	
}

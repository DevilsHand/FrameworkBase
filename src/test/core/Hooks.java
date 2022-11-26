package core;
import test.core.Scenario;
import org.testng.annotations.BeforeMethod;


public abstract class Hooks {
	public static Scenario scenario;
	public Hooks() {
		scenario = new Scenario();
	}
	public static Scenario getScenario() { return scenario; }

	@BeforeMethod

	public void setup() {
		System.out.println("Criando setup dos testes");
	}
	
	
	
}

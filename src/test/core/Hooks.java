package test.core;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.lang.reflect.Method;
import static test.core.logger.LogWritter.getLogger;


public abstract class Hooks {
	public Hooks(){
		getLogger().info("\n---------------------------------------------\n"+
		"[INSTANCIANDO TESTES] { "+getClass().toString()+" }\n"+
		"---------------------------------------------\n");
	}
	@BeforeMethod
	public void setup(Method m) {
		getLogger().info("[INICIANDO] - Setup do teste: "+m.getName());
	}
	@AfterMethod
	public void tearDown(Method m, ITestResult context){
		String mensagem = (context.isSuccess())? "[SUCESSO] - ": "[FALHA] - ";
		getLogger().info(mensagem+"Cenario: " + m.getName());
		if (context.getThrowable() != null) {
			getLogger().error(context.getThrowable().getMessage());
		}

		getLogger().info("[ENCERRANDO] " + m.getName()+
				"\n--------------------------------------------------------");
	}
}

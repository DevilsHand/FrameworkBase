package core;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public abstract class Hooks {
	List<String> relatorio;
	public Hooks(){
		relatorio = new ArrayList<>();
	}
	@BeforeMethod
	public void setup(Method m) {
		relatorio.add("[INICIANDO] - Setup do teste: "+m.getName());
	}
	@AfterMethod
	public void tearDown(Method m, ITestResult context){
		String mensagem = (context.isSuccess())? "[SUCESSO] - ": "[FALHA] - ";
		relatorio.add(mensagem+" Cenario: " + m.getName());
		if (context.getThrowable()!= null){
			relatorio.add("[ERRO] - " + context.getThrowable().getMessage());
		}

		relatorio.add("Encerrando setup do teste: " + m.getName()+
				"\n--------------------------------------------------------");
		for (var msg: relatorio) {
			System.out.println(msg);
		}
	}
}

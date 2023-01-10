package test.core.web.pages;

import org.openqa.selenium.By;
import test.core.Context;
import test.core.web.annotation.FindBy;
import test.core.web.annotation.WebPageObj;

import java.lang.reflect.Field;

public abstract class Page {
   public Page() {
       String elementPath;
       WebPageObj page = this.getClass().getAnnotation(WebPageObj.class);
       if (page == null) throw new RuntimeException();
       Context.getDriver().get(page.url());
       Field[] fields = this.getClass().getDeclaredFields();
       for (Field field : fields){
           field.setAccessible(true);
           FindBy findBy = field.getAnnotation(FindBy.class);
           if (findBy.equals("")) throw new RuntimeException("xPath na classe vazio, revisar");
           elementPath = findBy.xPath();
           //TODO: tratar erro quando a pagina não carregar
           try{
               field.set(this, Context.getDriver().findElement(By.xpath(elementPath)));
           } catch (Exception e) {
               e.printStackTrace();
           }
           field.setAccessible(false);
       }
   }
}



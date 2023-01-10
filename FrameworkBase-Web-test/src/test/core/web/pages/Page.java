package test.core.web.pages;

import org.openqa.selenium.WebElement;
import test.core.web.annotation.ByXpath;
import test.core.web.annotation.WebPageObj;

import java.lang.reflect.Field;

@WebPageObj
public abstract class Page {
   public Page() {
       String elementPath;
       WebPageObj persistable = this.getClass().getAnnotation(WebPageObj.class);
       if (persistable == null) throw new RuntimeException();
       Field[] fields = this.getClass().getDeclaredFields();
       for (Field field : fields){
           field.setAccessible(true);
           ByXpath xpath = field.getAnnotation(ByXpath.class);
           if (xpath == null) throw new RuntimeException("xPath na classe vazio, revisar");
           elementPath = xpath.xPath();
           try{
               field.set(this, elementPath);
           } catch (Exception e) {
               e.printStackTrace();
           }
       }
   }
}



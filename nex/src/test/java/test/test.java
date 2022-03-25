package test;

import com.gxy.pojo.Shitang;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Shitang shitang = context.getBean(Shitang.class);
        System.out.println(shitang);
    }
}

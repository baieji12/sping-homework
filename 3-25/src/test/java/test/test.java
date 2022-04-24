package test;

import com.gxy.pojo.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;

public class test {
    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Teacher teacher = context.getBean("teacher", Teacher.class);
        System.out.println(teacher);
        @Test
        public void test01(){
         String config = "spring_config.xml"
         ApplicationContext context1 = new ClassPathXmlApplicationContext(config

        prvite UserDao test(){
             public void test(){
                 System.out.println("test()方法执行了。。。。");
                 userDao.add();
                 @Resource(name="teacher01")
                         private TeacherDao teacherDao;
                 @value(value='gxy')
                         private String name;
                 public void update(){
                     teacherDao.update();
                     System.out.println(name);
                 }
             }
         }
        }
    }
}

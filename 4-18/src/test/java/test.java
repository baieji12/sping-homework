import com.gxy.dao.TeacherDao;
import com.gxy.dao.impl.TeacherDaoImpl;
import com.gxy.proxy.ProxyInvocationHandler;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;

public class test {
    @Test
    public void test01(){
        Class[] interfaces = {TeacherDao.class};
        TeacherDao teacherDao = new TeacherDaoImpl();
        TeacherDao teacherDaoProxy =
                (TeacherDao) Proxy.newProxyInstance(ProxyInvocationHandler.class.getClassLoader(),interfaces,new ProxyInvocationHandler(teacherDao));
        teacherDaoProxy.addHomework("用JDK代理实现teacher的代理");
    }
}

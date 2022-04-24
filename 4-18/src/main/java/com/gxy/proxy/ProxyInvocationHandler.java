package com.gxy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ProxyInvocationHandler implements InvocationHandler {
    // 被代理的接口
    private Object obj;

    public ProxyInvocationHandler(Object obj) {
        this.obj = obj;
    }

    //得到生成代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                obj.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("调用了："+method.getName()+"方法，参数为："+ Arrays.toString(args));
        return method.invoke(obj,args);
    }
}

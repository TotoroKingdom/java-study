package com.totoro.javastudy.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author: totoro
 * @createDate: 2024 07 19 01 18
 * @description:
 **/
public class ProxyFactory implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("喜欢喝可乐");
        Object result = methodProxy.invokeSuper(o, objects);
        return result;
    }
}

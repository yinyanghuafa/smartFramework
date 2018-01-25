package org.smart.aspect;

import org.smart.framework.annocation.Aspect;
import org.smart.framework.annocation.Service;
import org.smart.framework.proxy.AspectProxy;

import java.lang.reflect.Method;

@Aspect(Service.class)
public class ServiceAspect extends AspectProxy {

    @Override
    public void before(Object targetClass, Method method, Object[] params) {
        System.out.println(method.getName()+"被调用了！！！");
    }

    @Override
    public void after(Object targetClass, Method method, Object[] params) {
        System.out.println(method.getName()+"调用结束了");
    }
}

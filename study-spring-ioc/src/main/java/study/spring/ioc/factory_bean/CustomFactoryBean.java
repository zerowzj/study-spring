package study.spring.ioc.factory_bean;

import org.springframework.beans.factory.FactoryBean;

public class CustomFactoryBean implements FactoryBean<Object> {

    @Override
    public boolean isSingleton() {
        return true;
    }

    @Override
    public Object getObject() throws Exception {
        return null;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}

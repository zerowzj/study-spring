package study.spring.ioc.factory_bean;

import org.springframework.beans.factory.FactoryBean;
import study.spring.ioc.bean_factory.bean.XmlBean;

public class CustomFactoryBean implements FactoryBean<XmlBean> {

    @Override
    public boolean isSingleton() {
        return true;
    }

    @Override
    public XmlBean getObject() throws Exception {
        return new XmlBean();
    }

    @Override
    public Class<?> getObjectType() {
        return XmlBean.class;
    }
}

package cn.yufu.starter.factorybean;

import cn.yufu.starter.domain.RainBow;
import org.springframework.beans.factory.FactoryBean;

public class MyFactoryBean implements FactoryBean<RainBow> {
    @Override
    public RainBow getObject() throws Exception {
        return new RainBow();
    }

    @Override
    public Class<?> getObjectType() {
        return RainBow.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}

package cn.yufu.starter.register;

import cn.yufu.starter.domain.Flower;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyBeanRegister implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean a = registry.containsBeanDefinition("cn.yufu.starter.domain.Man");
        if(a){
            RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(Flower.class);
            registry.registerBeanDefinition("flower",rootBeanDefinition);
        }
    }
}

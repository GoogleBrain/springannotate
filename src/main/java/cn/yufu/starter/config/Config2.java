package cn.yufu.starter.config;

import cn.yufu.starter.domain.Person;
import cn.yufu.starter.domain.Teacher;
import cn.yufu.starter.factorybean.MyFactoryBean;
import cn.yufu.starter.importselector.MyImportSelector;
import cn.yufu.starter.register.MyBeanRegister;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({Person.class, Teacher.class, MyImportSelector.class, MyBeanRegister.class})
@Configuration
public class Config2 {


    @Bean
    public MyFactoryBean myFactoryBean(){
        return new MyFactoryBean();
    }

}

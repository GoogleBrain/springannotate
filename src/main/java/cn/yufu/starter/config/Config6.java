package cn.yufu.starter.config;

import cn.yufu.starter.beanpostprocesser.MyBean2;
import cn.yufu.starter.domain.KK;
import cn.yufu.starter.domain.LiftCycle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:/a.properties")
@Configuration
public class Config6 {

    @Bean
   public KK kk(){
        return new KK();
    }
}

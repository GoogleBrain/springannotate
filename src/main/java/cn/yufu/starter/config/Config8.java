package cn.yufu.starter.config;

import cn.yufu.starter.domain.C1;
import cn.yufu.starter.domain.C2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Config8 {


    @Bean
    public C2 c2(){
        return new C2();
    }

    @Bean
    public C1 c1(C2 c2){
        C1 c1 = new C1();
        c1.setC2(c2);
        return c1;
    }
}
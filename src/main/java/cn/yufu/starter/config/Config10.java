package cn.yufu.starter.config;

import cn.yufu.starter.aware.Black;
import cn.yufu.starter.profile.P1;
import cn.yufu.starter.profile.P2;
import cn.yufu.starter.profile.P3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;


@PropertySource("classpath:/a.properties")
@Configuration
public class Config10 {

    @Profile("p1")
    @Bean(value = "p1")
    public P1 p1(){
        return new P1();
    }

    @Profile("p2")
    @Bean(value = "p2")
    public P2 p2(){
        return new P2();
    }

    @Profile("p3")
    @Bean(value = "p3")
    public P3 p3(){
        return new P3();
    }
}
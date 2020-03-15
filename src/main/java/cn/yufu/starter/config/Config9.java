package cn.yufu.starter.config;

import cn.yufu.starter.aware.Black;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Config9 {

    @Bean
    public Black black(){
        return new Black();
    }
}
package cn.yufu.starter.config;

import cn.yufu.starter.beanpostprocesser.MyBean;
import cn.yufu.starter.domain.Bank;
import cn.yufu.starter.domain.Car;
import cn.yufu.starter.domain.Card;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config4 {

    @Bean
    public MyBean myBean(){
        return new MyBean();
    }

    @Bean
    public Bank bank(){

        return new Bank();
    }

    @Bean
    public Card card(){
        return new Card();
    }
}

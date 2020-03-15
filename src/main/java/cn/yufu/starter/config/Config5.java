package cn.yufu.starter.config;

import cn.yufu.starter.beanpostprocesser.MyBean;
import cn.yufu.starter.beanpostprocesser.MyBean2;
import cn.yufu.starter.domain.Bank;
import cn.yufu.starter.domain.Card;
import cn.yufu.starter.domain.LiftCycle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config5 {

    @Bean
   public LiftCycle liftCycle(){
       return new LiftCycle();
   }

   @Bean
   public MyBean2 myBean2(){
        return new MyBean2();
   }
}

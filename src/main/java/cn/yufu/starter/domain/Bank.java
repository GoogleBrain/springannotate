package cn.yufu.starter.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Bank implements InitializingBean, DisposableBean {

    public Bank(){
        System.out.println("bank ....。构造方法");
    }
    @Override
    public void destroy() throws Exception {
        System.out.println("bank .....destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("bank .....afterPropertiesSet");
    }

    @PostConstruct
    public void postCon(){
        System.out.println("bank .....PostConstruct");
    }

    @PreDestroy
    public void predes(){
        System.out.println("bank .......PreDestroy");
    }
}

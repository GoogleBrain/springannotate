package cn.yufu.starter.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LiftCycle implements InitializingBean, DisposableBean {

    public LiftCycle(){
        System.out.println("LiftCycle   构造方法");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("LiftCycle   postConstruct");
    }

    @PreDestroy
    public void preDestory(){
        System.out.println("LiftCycle   PreDestroy");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("LiftCycle   destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("LiftCycle   afterPropertiesSet");
    }
}

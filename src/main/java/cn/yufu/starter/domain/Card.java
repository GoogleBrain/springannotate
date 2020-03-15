package cn.yufu.starter.domain;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Card {
    @PostConstruct
    public void postCon(){
        System.out.println("Card .....PostConstruct");
    }

    @PreDestroy
    public void predes(){
        System.out.println("Card .......PreDestroy");
    }
}

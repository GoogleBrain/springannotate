package cn.yufu.starter.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A1 {

    @Autowired
    private  A2 a2;

    public A1(A2 a2) {

        this.a2 = a2;
    }

    @Override
    public String toString() {
        return "A1{" +
                "a2=" + a2 +
                '}';
    }
}

package cn.yufu.starter;

import cn.yufu.starter.config.*;
import cn.yufu.starter.domain.KK;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class Starter2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config6.class);
        System.out.println("加载完毕....");

        ConfigurableEnvironment environment = context.getEnvironment();
        String age = environment.getProperty("age");
        System.out.println("年龄>>>>>>"+age);
        KK kk = (KK) context.getBean("kk");
        System.out.println(kk);
        context.close();
    }
}

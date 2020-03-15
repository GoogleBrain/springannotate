package cn.yufu.starter;

import cn.yufu.starter.config.Config6;
import cn.yufu.starter.config.Config7;
import cn.yufu.starter.domain.A1;
import cn.yufu.starter.domain.A2;
import cn.yufu.starter.domain.KK;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class Starter3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config7.class);
        System.out.println("加载完毕....");

        A1 a1 = (A1) context.getBean("a1");
        System.out.println(a1.toString());

        A2 a2 = (A2) context.getBean("a2");
        System.out.println(a2);
        context.close();
    }
}

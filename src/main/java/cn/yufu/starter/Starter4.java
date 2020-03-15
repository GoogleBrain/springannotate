package cn.yufu.starter;

import cn.yufu.starter.config.Config7;
import cn.yufu.starter.config.Config8;
import cn.yufu.starter.domain.A1;
import cn.yufu.starter.domain.A2;
import cn.yufu.starter.domain.C1;
import cn.yufu.starter.domain.C2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Starter4 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config8.class);
        System.out.println("加载完毕....");

        C1 c1 = (C1) context.getBean("c1");
        System.out.println(c1.toString());

        C2 c2 = (C2) context.getBean("c2");
        System.out.println(c2);
        context.close();
    }
}

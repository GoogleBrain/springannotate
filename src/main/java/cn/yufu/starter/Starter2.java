package cn.yufu.starter;

import cn.yufu.starter.config.Config2;
import cn.yufu.starter.config.Config3;
import cn.yufu.starter.config.Config4;
import cn.yufu.starter.config.Config5;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Starter2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config5.class);
        System.out.println("加载完毕....");

        context.close();
    }
}

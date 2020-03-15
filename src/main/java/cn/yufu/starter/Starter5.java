package cn.yufu.starter;

import cn.yufu.starter.config.Config8;
import cn.yufu.starter.config.Config9;
import cn.yufu.starter.domain.C1;
import cn.yufu.starter.domain.C2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Starter5 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config9.class);
        System.out.println("加载完毕...."+context);
        context.close();
    }
}

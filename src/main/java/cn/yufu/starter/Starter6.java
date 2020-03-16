package cn.yufu.starter;

import cn.yufu.starter.config.Config10;
import cn.yufu.starter.config.Config9;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.Resource;

import java.io.InputStream;

public class Starter6 {
    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config10.class);
//        System.out.println("加载完毕...."+context);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config10.class);

        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for(int i=0;i< beanDefinitionNames.length;i++){
           System.out.println(">>>>"+beanDefinitionNames[i]);
        }
        context.close();
    }
}

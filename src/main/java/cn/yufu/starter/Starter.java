package cn.yufu.starter;

import cn.yufu.starter.config.Config;
import cn.yufu.starter.config.Config2;
import cn.yufu.starter.domain.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Starter {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config2.class);
        System.out.println("加载完毕....");

//        Object student = context.getBean("student");
//        System.out.println(student);
//        Object student = context.getBean("student");
//        System.out.println(student);
//
//        String[] beanNamesForType = context.getBeanNamesForType(Student.class);
//        for(String name:beanNamesForType){
//            System.out.println("name>>"+name);
//        }

        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for(int i=0;i<beanDefinitionNames.length ;i++){
           System.out.println(beanDefinitionNames[i]);
        }

        Object myFactoryBean = context.getBean("myFactoryBean");
        System.out.println(">>>>"+myFactoryBean.getClass());

        Object bean = context.getBean("&myFactoryBean");
        System.out.println("****>>>>"+bean.getClass());
    }
}

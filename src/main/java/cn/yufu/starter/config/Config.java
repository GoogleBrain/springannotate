package cn.yufu.starter.config;

import cn.yufu.starter.condition.LinuxCondition;
import cn.yufu.starter.condition.WindowsCondition;
import cn.yufu.starter.domain.Student;
import org.springframework.context.annotation.*;

@Configuration
public class Config {

    @Conditional(WindowsCondition.class)
    @Bean
    public Student student(){
        System.out.println("windows");
        return new Student("husan",28);
    }

    @Conditional(LinuxCondition.class)
    @Bean
    public Student student02(){
        System.out.println("linux");
        return new Student("husan",28);
    }
}

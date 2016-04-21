package com.innominds.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import com.innominds.conditional.StudentCondition;
import com.innominds.conditional.StudentService;

@Configuration
public class AdvancedConfiguration {

    @Bean
    @Conditional(StudentCondition.class)
    public StudentService studentService() {
        return new StudentService();
    }
}

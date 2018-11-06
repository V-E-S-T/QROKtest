package com.book;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

    @Bean
    //@Description("Thymeleaf template resolver serving HTML 5")
    public ClassLoaderTemplateResolver templateResolver() {

        ClassLoaderTemplateResolver templateResolver = new ClassLoaderTemplateResolver();

        templateResolver.setPrefix("templates/");
        templateResolver.setCacheable(false);
        templateResolver.setSuffix(".html");
        templateResolver.setTemplateMode("HTML5");
        templateResolver.setCharacterEncoding("UTF-8");

        return templateResolver;
    }

//    @Bean
//    //@Description("Thymeleaf template engine with Spring integration")
//    public SpringTemplateEngine templateEngine() {
//
//        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
//        templateEngine.setTemplateResolver(templateResolver());
//
//        return templateEngine;
//    }
//
//    @Bean
//    //@Description("Thymeleaf view resolver")
//    public ViewResolver viewResolver() {
//
//        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
//
//        viewResolver.setTemplateEngine(templateEngine());
//        viewResolver.setCharacterEncoding("UTF-8");
//
//        return viewResolver;
//    }
//
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
        //registry.addViewController("/author/info/short/{id}").setViewName("authorInfo");
        //registry.addViewController("/login").setViewName("login");
    }


}

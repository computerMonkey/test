package hello.controller;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class App{

    @Bean
    public HttpMessageConverters fastJsonHttpMessageConverter(){
        FastJsonHttpMessageConverter httpMessageConverter = new FastJsonHttpMessageConverter();
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
        httpMessageConverter.setFastJsonConfig(fastJsonConfig);
        return new HttpMessageConverters(httpMessageConverter);
    }

//    @Override
//    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//        super.configureMessageConverters(converters);
//        FastJsonHttpMessageConverter httpMessageConverter = new FastJsonHttpMessageConverter();
//        FastJsonConfig fastJsonConfig = new FastJsonConfig();
//        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
//        httpMessageConverter.setFastJsonConfig(fastJsonConfig);
//        converters.add(httpMessageConverter);
//    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}

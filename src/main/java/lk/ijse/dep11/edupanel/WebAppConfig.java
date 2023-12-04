package lk.ijse.dep11.edupanel;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@ComponentScan
@Configuration

public class WebAppConfig {

//    @Bean
//    public CommonsMultipartResolver multipartResolver(){ //This old version of standard servlet multipart resolver
//        return new CommonsMultipartResolver();
//    }
    @Bean
    public StandardServletMultipartResolver multipartResolver(){ //This is used to convert TO object from multipart file
        return new StandardServletMultipartResolver();
    }
}

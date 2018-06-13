package br.com.spittr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * <b>Web Config:</b>
 * Responsible to enable the MVC Structure.
 * <p>The WebConfig class uses the annotations listed below:</p>
 * <ul>
 * <li>The Configuration annotation is used to Spring identify as a configuration class</li>
 * <li>The EnableWebMvc annotation identify the structure as MVC</li>
 * <li>The ComponentScan annotation make a scan in all packages to search Components, Autowired, Controllers and other elements
 * Wiht the Componenent scan annotation, is not necessary declare any controller here in Configuration class</li>
 * </ul>
 *
 * @author Marcio Marques de Souza
 * @version 1.0
 * @serial 12/06/2018
 */

@Configuration
@EnableWebMvc
@ComponentScan("br.com.spittr.web")
public class WebConfig extends WebMvcConfigurerAdapter {

    /**
     * This Bean ViewResolvers uses the class InternalResourceViewResolver to make the configuration of
     * the jsp view (sufix and prefix).
     * @return: viewResolver
     */

    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        resolver.setExposeContextBeansAsAttributes(true);
        return resolver;
    }

    /**
     * Here we are  asking DispatcherServlet to forward requests for static resources to the servlet container’s
     * default servlet and not to try to handle them itself.
     * @param configurer used to enable the defaul servlet handling;
     */
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}

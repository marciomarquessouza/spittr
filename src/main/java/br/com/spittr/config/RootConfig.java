package br.com.spittr.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * <b>Root Config: </b>The Configuration class responsible to search the element used by ContextLoaderListener
 * When the Dispatcher Servlet is triggered, beyond the web elements (already covered by Web Config Class)
 * it needs also others components no web, created by ContextLoaderListeners. The annotation "ComponentScan" is
 * responsible to search these elements. The Filter is resposible to exclude the web elements from the search.
 *
 * @author Marcio Souza
 * @version 1.0
 * @since 12/06/2018
 */

@Configuration
@ComponentScan(basePackages = {"spitter"},
    excludeFilters = {
        @Filter(type=FilterType.ANNOTATION, value=EnableWebMvc.class)
})
public class RootConfig {
}

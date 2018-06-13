package br.com.spittr.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * <b>Sppitt Web App Initializer</b>: I'll use a Java Class instead a XML file to configure
 * our Dispatcher Servlet creating a class which extends the "AbstractAnnotationConfigDispatcherServletInitializer"
 * (the worst class name in the world) class.
 * <p><b>Note:</b> all classes which extend "AbstractAnnotationConfigDispatcherServletInitializer" are used to configure the
 * Dispatcher Servlet. The Dispatcher Servlet is the root element responsible to bring the request to the controller, send the
 * model to the view and is the heart of all Spring MVC request lifecycle.</p>
 *
 * @author Marcio Maques de Souza
 * @version 1.0
 * @since 12/06/2018
 */

public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    /**
     * The methodd getServletMappings (override from AbstracAnnotationConfgDispatcherServletInitializer)
     * take all maps used by Dispatcher Servlet). In our case, it is mapping our default root ("/").
     * @return a array of Strings to return all mappings - in our case, only one - the default root "/"
     */
    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }

    /**
     * The configurarion to indicate to Dispatcher Servlets all web beans components
     * used by Spring MVC Structure. This method return one or more class with MVC structure enabled
     * and beans as Controllers, views and other web elements.
     * @return one or more class with Web Component configurarion. In our case, the class WebConfig.
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] { WebConfig.class };
    }

    /**
     * Beyond web elements, the Dispatcher Servlet uses other elements which will be collected by
     * getRootConfigClasses (used by ContextLoaderListener);
     * @return one or more class with root components. In our case, the class RootConfig.
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] { RootConfig.class };
    }
}

package Controller;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by sunwq on 2016/12/4.
 */
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected String[] getServletMappings(){
        System.out.println("SpittrWebAppInitializer.getServletMappings");
        return new String[] {"/"};
    }

    @Override
    protected Class<?>[] getRootConfigClasses(){
        System.out.println("SpittrWebAppInitializer.getRootConfigClasses");
        return new Class<?>[] {RootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses(){
        System.out.println("SpittrWebAppInitializer.getServletConfigClasses");
        return new Class<?>[] {WebConfig.class};
    }
}

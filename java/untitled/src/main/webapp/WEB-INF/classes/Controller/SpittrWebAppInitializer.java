package Controller;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by sunwq on 2016/12/4.
 */
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    //指定开始被servlet处理的url,配置从/开始
    @Override
    protected String[] getServletMappings(){
        System.out.println("SpittrWebAppInitializer.getServletMappings");
        return new String[] {"/"};
    }

    //配置root上下文,如Jpa数据源等等的配置
    @Override
    protected Class<?>[] getRootConfigClasses(){
        System.out.println("SpittrWebAppInitializer.getRootConfigClasses");
//        return new Class<?>[] {RootConfig.class};
        return new Class<?>[] {};
    }

    //配置dispatcher servlet，如果在root config指定了该转发规则就可以忽略
    @Override
    protected Class<?>[] getServletConfigClasses(){
        System.out.println("SpittrWebAppInitializer.getServletConfigClasses");
        return new Class<?>[] {WebConfig.class};
    }
}

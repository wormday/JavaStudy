package Controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by sunwq on 2016/12/4.
 */
@Configuration
@ComponentScan(basePackages = {"Controller"},
        excludeFilters = {
        @ComponentScan.Filter(type= FilterType.ANNOTATION,value= EnableWebMvc.class)
})
public class RootConfig {
}

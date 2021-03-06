package r2d2.sample.dashboard.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import r2.dustjs.spring.DustRenderModelHandlerMethodArgumentResolver;
import r2.dustjs.spring.DustjsView;

import java.util.List;

/**
 * @author chanwook
 */
@Configuration
@EnableSpringDataWebSupport
public class WebConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        argumentResolvers.add(new DustRenderModelHandlerMethodArgumentResolver());
    }

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        //TODO 개선 필요.. 우선 동작하게..
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/templates/");
        viewResolver.setSuffix(".html");
        viewResolver.setViewClass(DustjsView.class);

        registry.viewResolver(viewResolver);
    }

}

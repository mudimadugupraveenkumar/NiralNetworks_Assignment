package DISPATCHER;

	import org.springframework.context.annotation.Bean;
	import org.springframework.context.annotation.ComponentScan;
	import org.springframework.context.annotation.Configuration;
	import org.springframework.web.servlet.view.InternalResourceViewResolver;

	@Configuration
	@ComponentScan(basePackages ="CONTROLLER.PACK")
	public class helper_cls {
		
		@Bean
		public InternalResourceViewResolver view()
		{
			InternalResourceViewResolver v=new InternalResourceViewResolver();
			v.setPrefix("/");
			v.setSuffix(".jsp");
			return v;
			
		}

	}




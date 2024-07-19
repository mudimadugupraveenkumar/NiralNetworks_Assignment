package DISPATCHER;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class STUDENT_DISPATCHER extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		Class[] handlormapping= {helper_cls.class};
		return handlormapping ;
	}

	@Override
	protected String[] getServletMappings() {
		String[] c= {"/"};
		return c;
	}

}

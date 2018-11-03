package creatBean._04_FactoryBean;

import org.springframework.beans.factory.FactoryBean;

public class Cat4Factory implements FactoryBean<Cat4>{

	public Cat4 getObject() throws Exception {
		return new Cat4();
	}
	
	
	public Class<?> getObjectType() {
		return Cat4.class;
	}

	
	public boolean isSingleton() {
		return false;
	}
}

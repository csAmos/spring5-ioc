package creatBean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import creatBean._01_constructor.Cat1;
import creatBean._02_staticFactory.Cat2;
import creatBean._03_instanceFactory.Cat3;
import creatBean._03_instanceFactory.Cat3Factory;
import creatBean._04_FactoryBean.Cat4;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:creatBean/APP-Context.xml")
public class APP {
	
	@Autowired
	private Cat1 c1;
	
	@Autowired
	private Cat2 c2;
	
	@Autowired
	private Cat3 c3;
	
	@Autowired
	private Cat4 c4;
	
	@Test
	public void testOld() throws Exception {
		Cat3 c3=new Cat3Factory().createInstance();
		System.out.println(c3);
	}

	@Test
	public void testPrint() throws Exception {
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
	}
}

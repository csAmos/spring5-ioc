package scope;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:scope/APP-Context.xml")
public class APP {
	@Autowired
	private Dog d1;
	
	@Autowired
	private Dog d2;
	
	@Autowired
	private Dog d3;
	
	@Test
	public void test1() throws Exception {
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
	}
	
}

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dubber on 2018/5/4.
 */
public class SpringTest {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext cpxac = new ClassPathXmlApplicationContext("application-context.xml");

		Object bean = cpxac.getBean("SpringTest");

	}
}

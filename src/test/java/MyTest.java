import com.smart.wen.bean.Product;
import com.smart.wen.bean.User;
import com.smart.wen.service.ISomeService;
import com.smart.wen.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test1() {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-context.xml");
        ISomeService some =(ISomeService) applicationContext.getBean("some");
        some.show();
    }
    @Test
    public void test2() {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-context.xml");
        ISomeService some =(ISomeService) applicationContext.getBean("some");
        int count = applicationContext.getBeanDefinitionCount();
        System.out.println(count);
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }

    @Test
    public void test3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        UserService service = (UserService) applicationContext.getBean("userService");
        service.show2();
    }

    @Test
    public void test4(){
        String path="classpath:spring-context.xml";
        ApplicationContext app = new ClassPathXmlApplicationContext(path);
        User user = app.getBean("user", User.class);
        System.out.println(user);
    }

    @Test
    public void test5(){
        String path="classpath:spring-context.xml";
        ApplicationContext app = new ClassPathXmlApplicationContext(path);
        Product product = app.getBean("product", Product.class);
        System.out.println(product);
    }
}

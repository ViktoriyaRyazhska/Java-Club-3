import com.web.club3.config.JavaConfig;
import com.web.club3.service.impl.UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        UserServiceImpl userServiceImpl = context.getBean(UserServiceImpl.class);


        context.close();
    }
}

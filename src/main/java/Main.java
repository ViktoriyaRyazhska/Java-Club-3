import com.web.club3.config.JavaConfig;
import com.web.club3.model.Users;
import com.web.club3.service.UsersService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        UsersService usersService = context.getBean(UsersService.class);
        context.close();
    }
}

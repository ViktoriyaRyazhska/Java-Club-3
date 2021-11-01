import com.web.club3.config.JavaConfig;
import com.web.club3.model.User;
import com.web.club3.service.impl.BookServiceImpl;
import com.web.club3.service.impl.UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        UserServiceImpl userServiceImpl = context.getBean(UserServiceImpl.class);
        BookServiceImpl bookServiceImpl = context.getBean(BookServiceImpl.class);
        bookServiceImpl.findAll();

        System.out.println(bookServiceImpl.findAll());

      /*  User user = new User();
        user.setName("Ivan");
        user.setSurname("Ivanov");
        user.setAge(17);
        user.setLogin("lalalalaal");
        user.setPassword("lflflflf");
        user.setDate(new Date());
        user.setRole("user");*/

       // userServiceImpl.create(user);

        context.close();
    }
}

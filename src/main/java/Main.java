import com.web.club3.config.JavaConfig;

import com.web.club3.dto.BookOrderDto;
import com.web.club3.service.impl.AuthorServiceImpl;
import com.web.club3.service.impl.BookOrderServiceImpl;
import com.web.club3.service.impl.BookServiceImpl;
import com.web.club3.service.impl.UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        UserServiceImpl userServiceImpl = context.getBean(UserServiceImpl.class);
        BookServiceImpl bookServiceImpl = context.getBean(BookServiceImpl.class);
        BookOrderServiceImpl bookOrderServiceImpl = context.getBean(BookOrderServiceImpl.class);
        AuthorServiceImpl authorService = context.getBean(AuthorServiceImpl.class);
        BookOrderDto bookOrderDto = new BookOrderDto();

       // bookOrderServiceImpl.lendBook(userServiceImpl.findUserById(16).getId(), bookServiceImpl.findBookById(7).getId(), bookOrderDto);

        //System.out.println(userServiceImpl.findAllUsers() + "\n");

        context.close();
    }
}

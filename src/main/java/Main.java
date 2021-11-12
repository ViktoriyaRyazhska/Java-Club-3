import com.web.club3.config.JavaConfig;

import com.web.club3.config.WebAppInitializer;
import com.web.club3.service.impl.AuthorServiceImpl;
import com.web.club3.service.impl.BookOrderServiceImpl;
import com.web.club3.service.impl.BookServiceImpl;
import com.web.club3.service.impl.UserServiceImpl;
import com.web.club3.util.DateUtil;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        UserServiceImpl userServiceImpl = context.getBean(UserServiceImpl.class);
        BookServiceImpl bookServiceImpl = context.getBean(BookServiceImpl.class);
        BookOrderServiceImpl bookOrderServiceImpl = context.getBean(BookOrderServiceImpl.class);
        AuthorServiceImpl authorService = context.getBean(AuthorServiceImpl.class);

       //bookOrderServiceImpl.getCountInPeriod(LocalDate.of(2021,6,3),LocalDate.of(2021,10,21));
       // bookOrderServiceImpl.averageTimeOfReadingBook(7);
        context.close();
    }
}

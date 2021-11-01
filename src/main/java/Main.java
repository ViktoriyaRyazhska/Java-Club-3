import com.web.club3.config.JavaConfig;
import com.web.club3.model.Book;
import com.web.club3.model.BookOrder;
import com.web.club3.model.User;
import com.web.club3.service.BookOrderService;
import com.web.club3.service.impl.BookOrderServiceImpl;
import com.web.club3.service.impl.UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
  

        context.close();
    }
}

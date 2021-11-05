import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import team1.config.LibraryConfig;
import team1.service.imp.AuthorServiceImp;
import team1.service.imp.BookServiceImp;

public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LibraryConfig.class);
        AuthorServiceImp author = context.getBean(AuthorServiceImp.class);
        BookServiceImp book = context.getBean(BookServiceImp.class);
//        Author author1 = new Author();
//        author1.setSurname("123");
//        author1.setName("123");
//        author1.setId(1001);
//        System.out.println(author1);
//        //test insert
//        author.add(author1);
        context.close();

    }
}

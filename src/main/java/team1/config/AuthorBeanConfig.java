package team1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import team1.entity.Author;

@Configuration
public class AuthorBeanConfig {
    @Bean
    public Author getAuthorEntityBean() {
        return new Author();
    }
}

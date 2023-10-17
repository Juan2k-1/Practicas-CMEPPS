package miproyecto;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import miproyecto.core.domain.BookServiceImpl;
import miproyecto.core.driven_ports.BookRepository;
import miproyecto.core.driver_ports.BookService;

@Configuration
public class SpringBeans {
	@Bean
	BookService bookService(final BookRepository bookRepository) {
		return new BookServiceImpl(bookRepository);
	}
}

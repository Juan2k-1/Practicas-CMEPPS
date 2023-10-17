package miproyecto.core.domain;

import miproyecto.core.driven_ports.BookRepository;
import miproyecto.core.driver_ports.BookService;

public class BookServiceImpl implements BookService {

	private BookRepository bookRepository;

	public BookServiceImpl(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	@Override
	public Book getBook(Long id) {
		return bookRepository.findById(id);
	}
}
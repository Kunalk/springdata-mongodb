package io.kunalk.springmongo.springdatamongodb.repository;

import java.util.List;

import io.kunalk.springmongo.springdatamongodb.bean.Books;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * This class is the repository interface for accessing Spring Data methods
 * 
 * @author adurand
 */
@Repository
public interface BookRepository extends MongoRepository<Books, Long> {

	/**
	 * This method find a book by his title
	 * 
	 * @param title of the book to be returned
	 * @return a book {@link Books}
	 */
	public Books findByTitle(String title);

	/**
	 * This method find a list of book by an author
	 * 
	 * @param author of the book to be returned
	 * @return a list of books {@link List} {@link Books}
	 */
	public List<Books> findByAuthor(String author);
}

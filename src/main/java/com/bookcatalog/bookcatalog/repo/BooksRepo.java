package com.bookcatalog.bookcatalog.repo;

import com.bookcatalog.bookcatalog.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepo extends JpaRepository<Books,Integer> {

    @Query(value = "select * from books where book_name=?1", nativeQuery = true)
    Books findByBookName(String bookName);

    @Query(value = "select * from books where book_id=?1", nativeQuery = true)
    Books findById(int bookId);

}

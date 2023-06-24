package com.bookcatalog.bookcatalog.repo;

import com.bookcatalog.bookcatalog.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepo extends JpaRepository<Books,Integer> {
}

package org.factoriaf5.libritos.models;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<org.factoriaf5.libritos.models.Book, Long> { }

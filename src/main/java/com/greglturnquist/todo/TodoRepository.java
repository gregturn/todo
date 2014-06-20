package com.greglturnquist.todo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "todos", itemResourceRel = "todos")
public interface TodoRepository extends CrudRepository<Todo, Long> {
}

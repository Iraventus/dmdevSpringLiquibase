package org.example.repository;

import jakarta.persistence.EntityManager;
import org.example.entity.Producer;
import org.springframework.stereotype.Repository;

@Repository
public class ProducerRepository extends RepositoryBase<Long, Producer> {

  public ProducerRepository(EntityManager entityManager) {
    super(Producer.class, entityManager);
  }
}

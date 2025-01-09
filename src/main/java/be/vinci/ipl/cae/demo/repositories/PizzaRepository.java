package be.vinci.ipl.cae.demo.repositories;

import be.vinci.ipl.cae.demo.models.entities.Pizza;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaRepository extends CrudRepository<Pizza, Long> {
    Iterable<Pizza> findAllByOrderByTitleAsc();
    Iterable<Pizza> findAllByOrderByTitleDesc();
}
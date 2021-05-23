package org.shadowalker.dao;

import org.shadowalker.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Shadowalker
 */
public interface ProductDao extends JpaRepository<Product, Integer> {

}

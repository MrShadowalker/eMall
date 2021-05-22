package org.shadowalker.product.dao;

import org.shadowalker.common.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Shadowalker
 */
public interface ProductDao extends JpaRepository<Product, Integer> {

}

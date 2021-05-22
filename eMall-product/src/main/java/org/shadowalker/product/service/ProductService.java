package org.shadowalker.product.service;

import org.shadowalker.common.model.Product;

/**
 * @author Shadowalker
 */
public interface ProductService {
    Product findById(Integer productId);
}

package org.shadowalker.product.service.impl;

import org.shadowalker.common.model.Product;
import org.shadowalker.product.dao.ProductDao;
import org.shadowalker.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Shadowalker
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product findById(Integer productId) {
        return productDao.findById(productId).get();
    }
}

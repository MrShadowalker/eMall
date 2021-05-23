package org.shadowalker.service.impl;

import org.shadowalker.dao.ProductDao;
import org.shadowalker.model.Product;
import org.shadowalker.service.ProductService;
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

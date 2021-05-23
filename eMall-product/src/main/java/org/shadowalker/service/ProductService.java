package org.shadowalker.service;

import org.shadowalker.model.Product;

/**
 * @author Shadowalker
 */
public interface ProductService {

    /**
     * 通过 ID 查询商品信息
     *
     * @param productId
     * @return
     */
    Product findById(Integer productId);
}

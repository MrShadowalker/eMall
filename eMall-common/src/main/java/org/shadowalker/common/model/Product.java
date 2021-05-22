package org.shadowalker.common.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Shadowalker
 */
@Entity(name = "eMall_product")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 价格
     */
    private String price;

    /**
     * 库存
     */
    private String stock;
}

package org.shadowalker.model;

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
    private Integer pid;

    /**
     * 商品名称
     */
    private String pname;

    /**
     * 价格
     */
    private Double pprice;

    /**
     * 库存
     */
    private Integer stock;
}

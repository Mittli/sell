package com.miter.sell.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * 商品
 */
@Entity
@Data
public class ProductInfo {
    /** 商品id */
    @Id
    private String productId;

    /** 商品名称 */
    private String productName;

    /** 单价 */
    private BigDecimal productPrice;

    /** 库存 */
    private Integer productStock;

    /** 描述 */
    private String productDescription;

    /** 商品状态：0正常，1下架 */
    private Integer productStatus;

    /** 小图 */
    private String productIcon;

    /** 类目编号 */
    private Integer categoryType;

    public ProductInfo() {
    }

    public ProductInfo(String productId, String productName, BigDecimal productPrice,
                       Integer productStock, String productDescription, Integer productStatus,
                       String productIcon, Integer categoryType) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productStock = productStock;
        this.productDescription = productDescription;
        this.productStatus = productStatus;
        this.productIcon = productIcon;
        this.categoryType = categoryType;
    }
}

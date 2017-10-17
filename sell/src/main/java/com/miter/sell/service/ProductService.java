package com.miter.sell.service;

import com.miter.sell.pojo.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
* 商品接口
* @author miter
* @create 2017/10/15
*/
public interface ProductService {

    /**
     * 根据商品id查找商品
     * @param productId
     * @return
     */
    ProductInfo findOne(String productId);

    /**
     * 分页查询
     * @param pageable
     * @return
     */
    Page<ProductInfo> findAll(Pageable pageable);

    /**
     * 查询所有上架商品
     * @return
     */
    List<ProductInfo> findUpAll();

    /**
     * 保存
     * @param productInfo
     * @return
     */
    ProductInfo save(ProductInfo productInfo);
}

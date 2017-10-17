package com.miter.sell.service.impl;

import com.miter.sell.enums.ProductStatusEnum;
import com.miter.sell.pojo.ProductInfo;
import com.miter.sell.service.ProductService;
import com.miter.sell.util.IDUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {
    @Autowired
    private ProductService productService;

    @Test
    public void findOne() {
        ProductInfo productInfo = productService.findOne("150720446963623");
        assert productInfo != null;
    }

    @Test
    public void findAll() {
        PageRequest request = new PageRequest(0,2);
        Page<ProductInfo> productInfoPage = productService.findAll(request);
        System.out.println(productInfoPage.getTotalElements());
    }

    @Test
    public void findUpAll() {
        List<ProductInfo> list = productService.findUpAll();
        assert list.size() > 0;
    }

    @Test
    public void save() {
        ProductInfo productInfo = new ProductInfo(IDUtils.getId(),"打卤面",
                new BigDecimal(10.8),30,"打卤面",
                ProductStatusEnum.UP.getCode(),IDUtils.genImageName(),1);

        ProductInfo result = productService.save(productInfo);
        assert result != null;
    }
}
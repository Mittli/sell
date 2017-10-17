package com.miter.sell.repository;

import com.miter.sell.pojo.ProductInfo;
import com.miter.sell.util.IDUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {
    @Autowired
    private ProductInfoRepository repository;

    @Test
    public void saveTest(){
        ProductInfo productInfo = new ProductInfo(IDUtils.getId(),"西红柿鸡蛋",
                new BigDecimal(18.8),33,"鸡蛋炒西红柿",0,IDUtils.genImageName(),
                1);
        ProductInfo result = repository.save(productInfo);
        Assert.assertNotNull(result);
    }
}
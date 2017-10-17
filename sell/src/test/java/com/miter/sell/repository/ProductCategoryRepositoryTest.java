package com.miter.sell.repository;

import com.miter.sell.pojo.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest(){
        ProductCategory productCategory = repository.findOne(1);
        assert productCategory != null : "查询对象不存在";
    }

    @Test
    @Transactional //防止测试数据插入数据库
    public void saveTest(){
        ProductCategory productCategory = new ProductCategory("米饭",3);
        ProductCategory result = repository.save(productCategory);
        assert result != null : "插入数据库失败";
    }

    @Test
    public void findByCategoryTypeInTest(){
        List<Integer> list = Arrays.asList(1,2);

        List<ProductCategory> productCategoryList = repository.findByCategoryTypeIn(list);
        assert productCategoryList.size() > 0 : "查询数据为空";
    }
}
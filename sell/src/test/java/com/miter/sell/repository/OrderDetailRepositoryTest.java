package com.miter.sell.repository;

import com.miter.sell.pojo.OrderDetail;
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
public class OrderDetailRepositoryTest {
    @Autowired
    private OrderDetailRepository repository;

    @Test
    public void saveTest(){
        OrderDetail orderDetail = new OrderDetail(IDUtils.getId(),"150720837444748",
                "150720446963623","西红柿鸡蛋",new BigDecimal(18.8),
                1,"1507204469636332");
        OrderDetail result = repository.save(orderDetail);
        Assert.assertNotNull(result);
    }
}
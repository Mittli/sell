package com.miter.sell.repository;

import com.miter.sell.pojo.OrderMaster;
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
public class OrderMasterRepositoryTest {
    @Autowired
    private OrderMasterRepository repository;

    @Test
    public void saveTest(){
        OrderMaster orderMaster = new OrderMaster(IDUtils.getId(),"miter",
                "13888888888","太原","fasfsfsfs",
                new BigDecimal(18.8),0,0);
        OrderMaster result = repository.save(orderMaster);
        Assert.assertNotNull(result);
    }
}
package com.example.sell.service.impl;

import com.example.sell.dataobject.OrderDetail;
import com.example.sell.dto.OrderDTO;
import com.example.sell.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderServiceImplTest {

    @Autowired
    private OrderService orderService;

    @Test
    public void create() throws Exception {

        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerName("李强");
        orderDTO.setBuyerAddress("电子科技大学");
        orderDTO.setBuyerOpenid("12345678");
        orderDTO.setBuyerPhone("12345678912");

        List<OrderDetail> orderDetailList = new ArrayList<>();
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setProductId("1234");
        orderDetail.setProductQuantity(4);
        OrderDetail orderDetail1 = new OrderDetail();
        orderDetail1.setProductId("2");
        orderDetail1.setProductQuantity(3);
        orderDetailList.add(orderDetail);
        orderDetailList.add(orderDetail1);
        orderDTO.setOrderDetailList(orderDetailList);

        OrderDTO orderDTO1 = orderService.create(orderDTO);
    }

    @Test
    public void findOne() throws Exception {

        OrderDTO orderDTO = orderService.findOne("1552626146609698277");

    }

    @Test
    public void findList() throws Exception {

        PageRequest pageable = new PageRequest(0, 2);

        Page<OrderDTO> list = orderService.findList("12345678", pageable);
        return;

    }

    @Test
    public void cancel() throws Exception {
        OrderDTO orderDTO = orderService.findOne("1552626146609698277");
        orderService.cancel(orderDTO);
    }

    @Test
    public void finish() throws Exception {
        OrderDTO orderDTO = orderService.findOne("1552626146609698277");
        orderService.finish(orderDTO);
    }

    @Test
    public void paid() throws Exception {
        OrderDTO orderDTO = orderService.findOne("1552626146609698277");
        orderService.paid(orderDTO);
    }

}
package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zztd
 * @email zztd@gmail.com
 * @date 2022-03-31 16:58:54
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}

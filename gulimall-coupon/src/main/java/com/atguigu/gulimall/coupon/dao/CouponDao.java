package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author zztd
 * @email zztd@gmail.com
 * @date 2022-03-31 16:11:24
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}

package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zztd
 * @email zztd@gmail.com
 * @date 2022-03-31 16:51:10
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}

package com.dao;

import com.entity.LiushouertongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LiushouertongVO;
import com.entity.view.LiushouertongView;


/**
 * 留守儿童
 * 
 * @author 
 * @email 
 * @date 2021-04-16 18:53:06
 */
public interface LiushouertongDao extends BaseMapper<LiushouertongEntity> {
	
	List<LiushouertongVO> selectListVO(@Param("ew") Wrapper<LiushouertongEntity> wrapper);
	
	LiushouertongVO selectVO(@Param("ew") Wrapper<LiushouertongEntity> wrapper);
	
	List<LiushouertongView> selectListView(@Param("ew") Wrapper<LiushouertongEntity> wrapper);

	List<LiushouertongView> selectListView(Pagination page,@Param("ew") Wrapper<LiushouertongEntity> wrapper);
	
	LiushouertongView selectView(@Param("ew") Wrapper<LiushouertongEntity> wrapper);
	
}

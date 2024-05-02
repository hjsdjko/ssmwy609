package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LiushouertongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LiushouertongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LiushouertongView;


/**
 * 留守儿童
 *
 * @author 
 * @email 
 * @date 2021-04-16 18:53:06
 */
public interface LiushouertongService extends IService<LiushouertongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LiushouertongVO> selectListVO(Wrapper<LiushouertongEntity> wrapper);
   	
   	LiushouertongVO selectVO(@Param("ew") Wrapper<LiushouertongEntity> wrapper);
   	
   	List<LiushouertongView> selectListView(Wrapper<LiushouertongEntity> wrapper);
   	
   	LiushouertongView selectView(@Param("ew") Wrapper<LiushouertongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LiushouertongEntity> wrapper);
   	
}


package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.LiushouertongDao;
import com.entity.LiushouertongEntity;
import com.service.LiushouertongService;
import com.entity.vo.LiushouertongVO;
import com.entity.view.LiushouertongView;

@Service("liushouertongService")
public class LiushouertongServiceImpl extends ServiceImpl<LiushouertongDao, LiushouertongEntity> implements LiushouertongService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LiushouertongEntity> page = this.selectPage(
                new Query<LiushouertongEntity>(params).getPage(),
                new EntityWrapper<LiushouertongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LiushouertongEntity> wrapper) {
		  Page<LiushouertongView> page =new Query<LiushouertongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LiushouertongVO> selectListVO(Wrapper<LiushouertongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LiushouertongVO selectVO(Wrapper<LiushouertongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LiushouertongView> selectListView(Wrapper<LiushouertongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LiushouertongView selectView(Wrapper<LiushouertongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

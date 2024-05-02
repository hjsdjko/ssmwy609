package com.entity.view;

import com.entity.LiushouertongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 留守儿童
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-16 18:53:06
 */
@TableName("liushouertong")
public class LiushouertongView  extends LiushouertongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LiushouertongView(){
	}
 
 	public LiushouertongView(LiushouertongEntity liushouertongEntity){
 	try {
			BeanUtils.copyProperties(this, liushouertongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

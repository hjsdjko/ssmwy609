package com.entity.model;

import com.entity.YiyuanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 医院信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-16 18:53:06
 */
public class YiyuanxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 医院地址
	 */
	
	private String yiyuandizhi;
		
	/**
	 * 医院图片
	 */
	
	private String yiyuantupian;
		
	/**
	 * 医院设施
	 */
	
	private String yiyuansheshi;
		
	/**
	 * 医院详情
	 */
	
	private String yiyuanxiangqing;
		
	/**
	 * 联系方式
	 */
	
	private String lianxifangshi;
				
	
	/**
	 * 设置：医院地址
	 */
	 
	public void setYiyuandizhi(String yiyuandizhi) {
		this.yiyuandizhi = yiyuandizhi;
	}
	
	/**
	 * 获取：医院地址
	 */
	public String getYiyuandizhi() {
		return yiyuandizhi;
	}
				
	
	/**
	 * 设置：医院图片
	 */
	 
	public void setYiyuantupian(String yiyuantupian) {
		this.yiyuantupian = yiyuantupian;
	}
	
	/**
	 * 获取：医院图片
	 */
	public String getYiyuantupian() {
		return yiyuantupian;
	}
				
	
	/**
	 * 设置：医院设施
	 */
	 
	public void setYiyuansheshi(String yiyuansheshi) {
		this.yiyuansheshi = yiyuansheshi;
	}
	
	/**
	 * 获取：医院设施
	 */
	public String getYiyuansheshi() {
		return yiyuansheshi;
	}
				
	
	/**
	 * 设置：医院详情
	 */
	 
	public void setYiyuanxiangqing(String yiyuanxiangqing) {
		this.yiyuanxiangqing = yiyuanxiangqing;
	}
	
	/**
	 * 获取：医院详情
	 */
	public String getYiyuanxiangqing() {
		return yiyuanxiangqing;
	}
				
	
	/**
	 * 设置：联系方式
	 */
	 
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
			
}

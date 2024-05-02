package com.entity.vo;

import com.entity.LiushouertongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 留守儿童
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-16 18:53:06
 */
public class LiushouertongVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 年龄
	 */
	
	private Integer nianling;
		
	/**
	 * 照片
	 */
	
	private String zhaopian;
		
	/**
	 * 家庭住址
	 */
	
	private String jiatingzhuzhi;
		
	/**
	 * 居住条件
	 */
	
	private String juzhutiaojian;
		
	/**
	 * 家庭状况
	 */
	
	private String jiatingzhuangkuang;
		
	/**
	 * 家庭收入
	 */
	
	private Integer jiatingshouru;
		
	/**
	 * 是否在读
	 */
	
	private String shifouzaidu;
		
	/**
	 * 学校名称
	 */
	
	private String xuexiaomingcheng;
		
	/**
	 * 学校联系人
	 */
	
	private String xuexiaolianxiren;
		
	/**
	 * 学校地址
	 */
	
	private String xuexiaodizhi;
		
	/**
	 * 年级
	 */
	
	private String nianji;
		
	/**
	 * 班级
	 */
	
	private String banji;
		
	/**
	 * 健康状况
	 */
	
	private String jiankangzhuangkuang;
		
	/**
	 * 监护人信息
	 */
	
	private String jianhurenxinxi;
		
	/**
	 * 联系方式
	 */
	
	private String lianxifangshi;
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：年龄
	 */
	 
	public void setNianling(Integer nianling) {
		this.nianling = nianling;
	}
	
	/**
	 * 获取：年龄
	 */
	public Integer getNianling() {
		return nianling;
	}
				
	
	/**
	 * 设置：照片
	 */
	 
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
				
	
	/**
	 * 设置：家庭住址
	 */
	 
	public void setJiatingzhuzhi(String jiatingzhuzhi) {
		this.jiatingzhuzhi = jiatingzhuzhi;
	}
	
	/**
	 * 获取：家庭住址
	 */
	public String getJiatingzhuzhi() {
		return jiatingzhuzhi;
	}
				
	
	/**
	 * 设置：居住条件
	 */
	 
	public void setJuzhutiaojian(String juzhutiaojian) {
		this.juzhutiaojian = juzhutiaojian;
	}
	
	/**
	 * 获取：居住条件
	 */
	public String getJuzhutiaojian() {
		return juzhutiaojian;
	}
				
	
	/**
	 * 设置：家庭状况
	 */
	 
	public void setJiatingzhuangkuang(String jiatingzhuangkuang) {
		this.jiatingzhuangkuang = jiatingzhuangkuang;
	}
	
	/**
	 * 获取：家庭状况
	 */
	public String getJiatingzhuangkuang() {
		return jiatingzhuangkuang;
	}
				
	
	/**
	 * 设置：家庭收入
	 */
	 
	public void setJiatingshouru(Integer jiatingshouru) {
		this.jiatingshouru = jiatingshouru;
	}
	
	/**
	 * 获取：家庭收入
	 */
	public Integer getJiatingshouru() {
		return jiatingshouru;
	}
				
	
	/**
	 * 设置：是否在读
	 */
	 
	public void setShifouzaidu(String shifouzaidu) {
		this.shifouzaidu = shifouzaidu;
	}
	
	/**
	 * 获取：是否在读
	 */
	public String getShifouzaidu() {
		return shifouzaidu;
	}
				
	
	/**
	 * 设置：学校名称
	 */
	 
	public void setXuexiaomingcheng(String xuexiaomingcheng) {
		this.xuexiaomingcheng = xuexiaomingcheng;
	}
	
	/**
	 * 获取：学校名称
	 */
	public String getXuexiaomingcheng() {
		return xuexiaomingcheng;
	}
				
	
	/**
	 * 设置：学校联系人
	 */
	 
	public void setXuexiaolianxiren(String xuexiaolianxiren) {
		this.xuexiaolianxiren = xuexiaolianxiren;
	}
	
	/**
	 * 获取：学校联系人
	 */
	public String getXuexiaolianxiren() {
		return xuexiaolianxiren;
	}
				
	
	/**
	 * 设置：学校地址
	 */
	 
	public void setXuexiaodizhi(String xuexiaodizhi) {
		this.xuexiaodizhi = xuexiaodizhi;
	}
	
	/**
	 * 获取：学校地址
	 */
	public String getXuexiaodizhi() {
		return xuexiaodizhi;
	}
				
	
	/**
	 * 设置：年级
	 */
	 
	public void setNianji(String nianji) {
		this.nianji = nianji;
	}
	
	/**
	 * 获取：年级
	 */
	public String getNianji() {
		return nianji;
	}
				
	
	/**
	 * 设置：班级
	 */
	 
	public void setBanji(String banji) {
		this.banji = banji;
	}
	
	/**
	 * 获取：班级
	 */
	public String getBanji() {
		return banji;
	}
				
	
	/**
	 * 设置：健康状况
	 */
	 
	public void setJiankangzhuangkuang(String jiankangzhuangkuang) {
		this.jiankangzhuangkuang = jiankangzhuangkuang;
	}
	
	/**
	 * 获取：健康状况
	 */
	public String getJiankangzhuangkuang() {
		return jiankangzhuangkuang;
	}
				
	
	/**
	 * 设置：监护人信息
	 */
	 
	public void setJianhurenxinxi(String jianhurenxinxi) {
		this.jianhurenxinxi = jianhurenxinxi;
	}
	
	/**
	 * 获取：监护人信息
	 */
	public String getJianhurenxinxi() {
		return jianhurenxinxi;
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

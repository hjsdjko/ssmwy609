package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 留守儿童
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-16 18:53:06
 */
@TableName("liushouertong")
public class LiushouertongEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public LiushouertongEntity() {
		
	}
	
	public LiushouertongEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 儿童姓名
	 */
					
	private String ertongxingming;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：儿童姓名
	 */
	public void setErtongxingming(String ertongxingming) {
		this.ertongxingming = ertongxingming;
	}
	/**
	 * 获取：儿童姓名
	 */
	public String getErtongxingming() {
		return ertongxingming;
	}
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

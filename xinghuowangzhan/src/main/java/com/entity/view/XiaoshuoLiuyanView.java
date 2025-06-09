package com.entity.view;

import com.entity.XiaoshuoLiuyanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 小说评论
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("xiaoshuo_liuyan")
public class XiaoshuoLiuyanView extends XiaoshuoLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;



		//级联表 xiaoshuo
			/**
			* 小说名称
			*/
			private String xiaoshuoName;
			/**
			* 小说类型
			*/
			private Integer xiaoshuoTypes;
				/**
				* 小说类型的值
				*/
				private String xiaoshuoValue;
			/**
			* 小说封面
			*/
			private String xiaoshuoPhoto;
			/**
			* 小说文件
			*/
			private String xiaoshuoFile;
			/**
			* 小说介绍
			*/
			private String xiaoshuoContent;

		//级联表 yonghu
			/**
			* 姓名
			*/
			private String yonghuName;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 照片
			*/
			private String yuangongPhoto;
			/**
			* 余额
			*/
			private Double newMoney;
			/**
			* 是否会员
			*/
			private Integer huiyuanTypes;
				/**
				* 是否会员的值
				*/
				private String huiyuanValue;

	public XiaoshuoLiuyanView() {

	}

	public XiaoshuoLiuyanView(XiaoshuoLiuyanEntity xiaoshuoLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, xiaoshuoLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}




























				//级联表的get和set xiaoshuo
					/**
					* 获取： 小说名称
					*/
					public String getXiaoshuoName() {
						return xiaoshuoName;
					}
					/**
					* 设置： 小说名称
					*/
					public void setXiaoshuoName(String xiaoshuoName) {
						this.xiaoshuoName = xiaoshuoName;
					}
					/**
					* 获取： 小说类型
					*/
					public Integer getXiaoshuoTypes() {
						return xiaoshuoTypes;
					}
					/**
					* 设置： 小说类型
					*/
					public void setXiaoshuoTypes(Integer xiaoshuoTypes) {
						this.xiaoshuoTypes = xiaoshuoTypes;
					}


						/**
						* 获取： 小说类型的值
						*/
						public String getXiaoshuoValue() {
							return xiaoshuoValue;
						}
						/**
						* 设置： 小说类型的值
						*/
						public void setXiaoshuoValue(String xiaoshuoValue) {
							this.xiaoshuoValue = xiaoshuoValue;
						}
					/**
					* 获取： 小说封面
					*/
					public String getXiaoshuoPhoto() {
						return xiaoshuoPhoto;
					}
					/**
					* 设置： 小说封面
					*/
					public void setXiaoshuoPhoto(String xiaoshuoPhoto) {
						this.xiaoshuoPhoto = xiaoshuoPhoto;
					}
					/**
					* 获取： 小说文件
					*/
					public String getXiaoshuoFile() {
						return xiaoshuoFile;
					}
					/**
					* 设置： 小说文件
					*/
					public void setXiaoshuoFile(String xiaoshuoFile) {
						this.xiaoshuoFile = xiaoshuoFile;
					}
					/**
					* 获取： 小说介绍
					*/
					public String getXiaoshuoContent() {
						return xiaoshuoContent;
					}
					/**
					* 设置： 小说介绍
					*/
					public void setXiaoshuoContent(String xiaoshuoContent) {
						this.xiaoshuoContent = xiaoshuoContent;
					}










				//级联表的get和set yonghu
					/**
					* 获取： 姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 照片
					*/
					public String getYuangongPhoto() {
						return yuangongPhoto;
					}
					/**
					* 设置： 照片
					*/
					public void setYuangongPhoto(String yuangongPhoto) {
						this.yuangongPhoto = yuangongPhoto;
					}
					/**
					* 获取： 余额
					*/
					public Double getNewMoney() {
						return newMoney;
					}
					/**
					* 设置： 余额
					*/
					public void setNewMoney(Double newMoney) {
						this.newMoney = newMoney;
					}
					/**
					* 获取： 是否会员
					*/
					public Integer getHuiyuanTypes() {
						return huiyuanTypes;
					}
					/**
					* 设置： 是否会员
					*/
					public void setHuiyuanTypes(Integer huiyuanTypes) {
						this.huiyuanTypes = huiyuanTypes;
					}


						/**
						* 获取： 是否会员的值
						*/
						public String getHuiyuanValue() {
							return huiyuanValue;
						}
						/**
						* 设置： 是否会员的值
						*/
						public void setHuiyuanValue(String huiyuanValue) {
							this.huiyuanValue = huiyuanValue;
						}



}

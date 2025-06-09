package com.entity.view;

import com.entity.DianyingLiuyanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 电影评论
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("dianying_liuyan")
public class DianyingLiuyanView extends DianyingLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;



		//级联表 dianying
			/**
			* 电影名称
			*/
			private String dianyingName;
			/**
			* 电影类型
			*/
			private Integer dianyingTypes;
				/**
				* 电影类型的值
				*/
				private String dianyingValue;
			/**
			* 电影图片
			*/
			private String dianyingPhoto;
			/**
			* 电影视频
			*/
			private String dianyingVideo;
			/**
			* 电影详情
			*/
			private String dianyingContent;

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

	public DianyingLiuyanView() {

	}

	public DianyingLiuyanView(DianyingLiuyanEntity dianyingLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, dianyingLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}







				//级联表的get和set dianying
					/**
					* 获取： 电影名称
					*/
					public String getDianyingName() {
						return dianyingName;
					}
					/**
					* 设置： 电影名称
					*/
					public void setDianyingName(String dianyingName) {
						this.dianyingName = dianyingName;
					}
					/**
					* 获取： 电影类型
					*/
					public Integer getDianyingTypes() {
						return dianyingTypes;
					}
					/**
					* 设置： 电影类型
					*/
					public void setDianyingTypes(Integer dianyingTypes) {
						this.dianyingTypes = dianyingTypes;
					}


						/**
						* 获取： 电影类型的值
						*/
						public String getDianyingValue() {
							return dianyingValue;
						}
						/**
						* 设置： 电影类型的值
						*/
						public void setDianyingValue(String dianyingValue) {
							this.dianyingValue = dianyingValue;
						}
					/**
					* 获取： 电影图片
					*/
					public String getDianyingPhoto() {
						return dianyingPhoto;
					}
					/**
					* 设置： 电影图片
					*/
					public void setDianyingPhoto(String dianyingPhoto) {
						this.dianyingPhoto = dianyingPhoto;
					}
					/**
					* 获取： 电影视频
					*/
					public String getDianyingVideo() {
						return dianyingVideo;
					}
					/**
					* 设置： 电影视频
					*/
					public void setDianyingVideo(String dianyingVideo) {
						this.dianyingVideo = dianyingVideo;
					}
					/**
					* 获取： 电影详情
					*/
					public String getDianyingContent() {
						return dianyingContent;
					}
					/**
					* 设置： 电影详情
					*/
					public void setDianyingContent(String dianyingContent) {
						this.dianyingContent = dianyingContent;
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

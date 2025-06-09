package com.entity.view;

import com.entity.XiaoshuoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 小说
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("xiaoshuo")
public class XiaoshuoView extends XiaoshuoEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 小说类型的值
		*/
		private String xiaoshuoValue;



	public XiaoshuoView() {

	}

	public XiaoshuoView(XiaoshuoEntity xiaoshuoEntity) {
		try {
			BeanUtils.copyProperties(this, xiaoshuoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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














}

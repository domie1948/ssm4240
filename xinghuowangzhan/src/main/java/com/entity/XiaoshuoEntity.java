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
 * 小说
 *
 * @author 
 * @email
 */
@TableName("xiaoshuo")
public class XiaoshuoEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XiaoshuoEntity() {

	}

	public XiaoshuoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 小说名称
     */
    @TableField(value = "xiaoshuo_name")

    private String xiaoshuoName;


    /**
     * 小说类型
     */
    @TableField(value = "xiaoshuo_types")

    private Integer xiaoshuoTypes;


    /**
     * 小说封面
     */
    @TableField(value = "xiaoshuo_photo")

    private String xiaoshuoPhoto;


    /**
     * 小说文件
     */
    @TableField(value = "xiaoshuo_file")

    private String xiaoshuoFile;


    /**
     * 小说介绍
     */
    @TableField(value = "xiaoshuo_content")

    private String xiaoshuoContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：小说名称
	 */
    public String getXiaoshuoName() {
        return xiaoshuoName;
    }


    /**
	 * 获取：小说名称
	 */

    public void setXiaoshuoName(String xiaoshuoName) {
        this.xiaoshuoName = xiaoshuoName;
    }
    /**
	 * 设置：小说类型
	 */
    public Integer getXiaoshuoTypes() {
        return xiaoshuoTypes;
    }


    /**
	 * 获取：小说类型
	 */

    public void setXiaoshuoTypes(Integer xiaoshuoTypes) {
        this.xiaoshuoTypes = xiaoshuoTypes;
    }
    /**
	 * 设置：小说封面
	 */
    public String getXiaoshuoPhoto() {
        return xiaoshuoPhoto;
    }


    /**
	 * 获取：小说封面
	 */

    public void setXiaoshuoPhoto(String xiaoshuoPhoto) {
        this.xiaoshuoPhoto = xiaoshuoPhoto;
    }
    /**
	 * 设置：小说文件
	 */
    public String getXiaoshuoFile() {
        return xiaoshuoFile;
    }


    /**
	 * 获取：小说文件
	 */

    public void setXiaoshuoFile(String xiaoshuoFile) {
        this.xiaoshuoFile = xiaoshuoFile;
    }
    /**
	 * 设置：小说介绍
	 */
    public String getXiaoshuoContent() {
        return xiaoshuoContent;
    }


    /**
	 * 获取：小说介绍
	 */

    public void setXiaoshuoContent(String xiaoshuoContent) {
        this.xiaoshuoContent = xiaoshuoContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Xiaoshuo{" +
            "id=" + id +
            ", xiaoshuoName=" + xiaoshuoName +
            ", xiaoshuoTypes=" + xiaoshuoTypes +
            ", xiaoshuoPhoto=" + xiaoshuoPhoto +
            ", xiaoshuoFile=" + xiaoshuoFile +
            ", xiaoshuoContent=" + xiaoshuoContent +
            ", createTime=" + createTime +
        "}";
    }
}

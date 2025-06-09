package com.entity.vo;

import com.entity.XiaoshuoEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 小说
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xiaoshuo")
public class XiaoshuoVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}

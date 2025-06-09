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
 * 小说评论
 *
 * @author 
 * @email
 */
@TableName("xiaoshuo_liuyan")
public class XiaoshuoLiuyanEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XiaoshuoLiuyanEntity() {

	}

	public XiaoshuoLiuyanEntity(T t) {
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
     * 小说
     */
    @TableField(value = "xiaoshuo_id")

    private Integer xiaoshuoId;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 评论内容
     */
    @TableField(value = "xiaoshuo_liuyan_content")

    private String xiaoshuoLiuyanContent;


    /**
     * 回复内容
     */
    @TableField(value = "reply_content")

    private String replyContent;


    /**
     * 评论时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


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
	 * 设置：小说
	 */
    public Integer getXiaoshuoId() {
        return xiaoshuoId;
    }


    /**
	 * 获取：小说
	 */

    public void setXiaoshuoId(Integer xiaoshuoId) {
        this.xiaoshuoId = xiaoshuoId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：评论内容
	 */
    public String getXiaoshuoLiuyanContent() {
        return xiaoshuoLiuyanContent;
    }


    /**
	 * 获取：评论内容
	 */

    public void setXiaoshuoLiuyanContent(String xiaoshuoLiuyanContent) {
        this.xiaoshuoLiuyanContent = xiaoshuoLiuyanContent;
    }
    /**
	 * 设置：回复内容
	 */
    public String getReplyContent() {
        return replyContent;
    }


    /**
	 * 获取：回复内容
	 */

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }
    /**
	 * 设置：评论时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：评论时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
        return "XiaoshuoLiuyan{" +
            "id=" + id +
            ", xiaoshuoId=" + xiaoshuoId +
            ", yonghuId=" + yonghuId +
            ", xiaoshuoLiuyanContent=" + xiaoshuoLiuyanContent +
            ", replyContent=" + replyContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}

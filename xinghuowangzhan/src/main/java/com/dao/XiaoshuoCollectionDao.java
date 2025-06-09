package com.dao;

import com.entity.XiaoshuoCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoshuoCollectionView;

/**
 * 小说收藏 Dao 接口
 *
 * @author 
 */
public interface XiaoshuoCollectionDao extends BaseMapper<XiaoshuoCollectionEntity> {

   List<XiaoshuoCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}

package com.rsh.coviewer.dao;

import com.rsh.coviewer.pojo.MovieForum;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MovieForumMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MovieForum record);

    int insertSelective(MovieForum record);

    MovieForum selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MovieForum record);

    int updateByPrimaryKey(MovieForum record);
}
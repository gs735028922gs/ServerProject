package com.mo.mapper;

import com.mo.pojo.FreerType;
import com.mo.pojo.ProjectType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * @create 2021-06-04 17:47
 */
@Repository
@Mapper
public interface ProjectTypeMapper {

    Collection<ProjectType> getAll();

    Collection<ProjectType> searchProjectType(String name);

}

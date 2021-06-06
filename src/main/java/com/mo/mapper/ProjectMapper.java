package com.mo.mapper;

import com.mo.pojo.Freer;
import com.mo.pojo.Project;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


import java.util.Collection;

/**
 * @create 2021-06-04 17:47
 */
@Repository
@Mapper
public interface ProjectMapper {

    Collection<Project> getAll();

    Collection<Project> getProjectByName(String name);

    int removeProject(int id);

}

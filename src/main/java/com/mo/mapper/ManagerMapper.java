package com.mo.mapper;

import com.mo.pojo.Manager;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @create 2021-06-04 17:47
 */
@Repository
@Mapper
public interface ManagerMapper {

    String getPassword(String username);

}

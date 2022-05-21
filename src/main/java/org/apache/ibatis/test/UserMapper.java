package org.apache.ibatis.test;

import org.apache.ibatis.annotations.Param;

/**
 * @className: Table1Mapper
 * @description:
 * @author: mufansen
 * @date: 2022/5/21
 **/
public interface UserMapper {

  User getById(@Param("id") int id);

}

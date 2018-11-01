package com.newer.dao;

import com.newer.pojo.Student;
import org.apache.ibatis.annotations.Param;

/**
 * @author shining
 */
public interface UserDao {

    Student findById(@Param("userId") int userId);

    int updateUser(Student student);
}

package com.zb.mapper;

import com.zb.entity.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PersonMapper {
    List<Person> findPersonByPage(@Param("start") Integer start,@Param("size") Integer size ,@Param("name") String name ,@Param("dept") Integer dept );

    Integer findPersonCount(@Param("name") String name ,@Param("dept") Integer dept );

    void savePerson(Person p);

    void updatePerson(Person p);

    void deletePerson(@Param("id") Integer id);

    Person findPersonById(@Param("id") Integer id);
}

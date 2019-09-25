package com.zb.service;

import com.zb.entity.Person;
import com.zb.util.Page;

public interface RpcPersonService {

     Page<Person> findPersonByPage(String name , Integer dept, Integer index , Integer size);

     void savePerson(Person p);

     void updatePerson(Person p);

     void deletePerson(Integer id);

     Person findPersonById(Integer id);
}

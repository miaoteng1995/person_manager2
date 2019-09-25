package com.zb.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zb.entity.Person;
import com.zb.mapper.PersonMapper;
import com.zb.service.RpcPersonService;
import com.zb.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Service
@Component
public class RpcPersonServiceImpl implements RpcPersonService {
    @Autowired
    private PersonMapper personMapper;

    @Override
    public Page<Person> findPersonByPage(String name, Integer dept, Integer index, Integer size) {
        Page<Person> page = new Page<Person>();
        page.setIndex(index);
        page.setSize(size);
        List<Person> list = personMapper.findPersonByPage((index - 1) * size, size, name, dept);
        Integer personCount = personMapper.findPersonCount(name, dept);
        page.setData(list);
        page.setCount(personCount);
        return page;
    }

    @Override
    public void savePerson(Person p) {
        personMapper.savePerson(p);
    }

    @Override
    public void updatePerson(Person p) {
        personMapper.updatePerson(p);
    }

    @Override
    public void deletePerson(Integer id) {
        personMapper.deletePerson(id);
    }

    @Override
    public Person findPersonById(Integer id) {
        return personMapper.findPersonById(id);
    }
}

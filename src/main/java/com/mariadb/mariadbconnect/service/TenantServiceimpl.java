package com.mariadb.mariadbconnect.service;

import com.mariadb.mariadbconnect.entity.Test;
import com.mariadb.mariadbconnect.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service

public class TenantServiceimpl implements TenantService{

    private UserRepository userRepository;
    public TenantServiceimpl(UserRepository repository){
        this.userRepository=repository;
    }










    @Override
    public Test saveTenant(Test test) {
        return userRepository.save(test);
    }

    @Override
    public void deleteTenant(Integer ids) {
       userRepository.deleteById(ids);
    }

    @Override
    public Optional<Test> findbyId(Integer tenantId) {
        return userRepository.findById(tenantId);
    }

    @Override
    public List<Test> getDetails() {
        return userRepository.findAll();
    }

    @Override
    public Test updateTenant(Integer intid, Test test) {
        Test testdb=userRepository.findById(intid).get();
       if(Objects.nonNull(test.getName()) &&
                !"".equalsIgnoreCase(test.getName())) {
            testdb.setName(test.getName());
        }

        if(Objects.nonNull(test.getAddress()) &&
                !"".equalsIgnoreCase(test.getAddress())) {
            testdb.setAddress(test.getAddress());
        }

        if(Objects.nonNull(test.getAge()))
              {
            testdb.setAge(test.getAge());
        }



        return userRepository.save(testdb);

    }

    @Override
    public Optional<Test> findbyName(String add) {
        return userRepository.findByname(add);
    }

    @Override
    public Optional<Test> findbyAddress(String adds) {
        return userRepository.findByaddress(adds);
    }


}

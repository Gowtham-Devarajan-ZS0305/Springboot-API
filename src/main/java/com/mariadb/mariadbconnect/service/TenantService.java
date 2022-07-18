package com.mariadb.mariadbconnect.service;

import com.mariadb.mariadbconnect.entity.Test;

import java.util.List;
import java.util.Optional;

public interface TenantService {
 


   



     

    Test saveTenant(Test test);

    void deleteTenant(Integer ids);

    Optional<Test> findbyId(Integer tenantId);

    List<Test> getDetails();

    Test updateTenant(Integer intid, Test test);


    Optional<Test> findbyName(String add);

    Optional<Test> findbyAddress(String adds);
}

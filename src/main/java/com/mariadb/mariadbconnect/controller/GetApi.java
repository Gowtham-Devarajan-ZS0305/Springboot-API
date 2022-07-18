package com.mariadb.mariadbconnect.controller;

import com.mariadb.mariadbconnect.entity.Test;
import com.mariadb.mariadbconnect.service.TenantService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

 public class GetApi {

    private TenantService tenantService;
    public GetApi(TenantService tenantService){
        this.tenantService=tenantService;
    }



      @GetMapping("/getUser")
      public List<Test> getDetails(){
        return tenantService.getDetails();
    }

     @GetMapping("/getUser/{id}")
      public Optional<Test> findbyId(@PathVariable("id") Integer tenantId) {
        return tenantService.findbyId(tenantId);
    }
    @GetMapping("/getUser/names/{name}")
    public Optional<Test> findbyName(@PathVariable("name") String add){
        return tenantService.findbyName(add);
    }
    @GetMapping("/getUser/adress/{address}")
    public Optional<Test> findbyAddress(@PathVariable("address") String adds){
        return tenantService.findbyAddress(adds);
    }

  @PostMapping("/getUser")
          public Test saveTenant(@RequestBody Test test){
      return tenantService.saveTenant(test);
        }
        @PutMapping("/getUser/{id}")
        public Test updateTenant(@PathVariable("id") Integer intid, @RequestBody Test test){
        return tenantService.updateTenant(intid,test);
        }

     @DeleteMapping("/getUser/{id}")
    public String deleteTenant(@PathVariable("id") Integer ids){
       tenantService.deleteTenant(ids);
       return "Tenant id deleted successfully";
   }



}

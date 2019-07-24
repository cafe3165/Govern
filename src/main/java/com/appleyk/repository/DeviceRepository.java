package com.appleyk.repository;

import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.appleyk.node.Device;
import com.appleyk.node.Service;

@Repository
public interface DeviceRepository extends GraphRepository<Device>{

//	List<Device> findByDName(String DName);
//	List<Device> getDevicesByDName(@Param("DName") String DName);
//
////	@Query("match(d:Device) where d.DName ={DName} return d")
////	List<Device> getDName(@Param("DName") String DName);
//	
//	@Query("match(a:Device) where a.DName={0} return a ")
//	List<Device> getdname(String dname);
//	Device findById(Long Id);

}

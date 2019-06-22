package com.sp.demoservice.repository;

import com.sp.demoservice.domain.DomainItem;
import org.springframework.data.repository.CrudRepository;

public interface DomainRepository extends CrudRepository<DomainItem,Long> {
}

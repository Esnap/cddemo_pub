package com.sp.demoservice.domain.repository;

import com.sp.demoservice.domain.DomainItem;
import org.springframework.data.repository.CrudRepository;

public interface DomainItemRepository extends CrudRepository <DomainItem, Long> {
}

package com.sp.demoservice.endpoint;

import com.sp.demoservice.domain.DomainItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DomainItemService {
    private List<DomainItem> domainItems = new ArrayList<>();

    @RequestMapping(value = "items/findall", method = RequestMethod.GET)
    public List<DomainItem> findAll() {
        return domainItems;
    }

    @RequestMapping(value = "item/{id}", method = RequestMethod.GET)
    public DomainItem findOne(@PathVariable String id) {
        return domainItems.stream().filter(domainItem -> domainItem.getId().equals(id)).findFirst().get();
    }
}

package com.sp.demoservice.endpoint;

import com.sp.demoservice.domain.DomainItem;
import com.sp.demoservice.repository.DomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DomainItemService {
    public static final String JSON_UTF_8 = MediaType.APPLICATION_JSON_UTF8_VALUE;

    @Autowired
    private DomainRepository domainRepository;

    @GetMapping(path = "items/findall", produces = JSON_UTF_8)
    public Iterable<DomainItem> findAll() {
        return domainRepository.findByIdNotNull();

    }

    @PostMapping(path = "items/add/{id}/{content}")
    public void add(@PathVariable String id, @PathVariable String content) {
        long domainItemId = getLong(id);
        domainRepository.save(new DomainItem(id,content));
        System.out.println(String.format("added element: id: %s, content: %s", id, content));
    }

    @GetMapping(path = "item/{id}", produces = JSON_UTF_8)
    public DomainItem findOne(@PathVariable String id) {
        long domainItemId = getLong(id);
        return domainRepository.findOne(domainItemId);
    }

    private long getLong(String id) {
        long domainItemId;
        try {
            domainItemId = Long.valueOf(id);
        } catch (Exception e) {
            throw new IllegalArgumentException("Only Numbers are allowed as Id");
        }
        return domainItemId;
    }
}

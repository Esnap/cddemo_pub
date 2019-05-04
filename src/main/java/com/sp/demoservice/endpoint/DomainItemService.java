package com.sp.demoservice.endpoint;

import com.sp.demoservice.domain.DomainItem;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class DomainItemService {
    public static final String JSON_UTF_8 = MediaType.APPLICATION_JSON_UTF8_VALUE;
    private List<DomainItem> domainItems = new ArrayList<>();

    @GetMapping(path = "items/findall", produces = JSON_UTF_8)
    public List<DomainItem> findAll() {
        return domainItems;

    }

    @PostMapping(path = "items/add/{id}/{content}")
    public void add (@PathVariable String id, @PathVariable String content) {
        domainItems.add(new DomainItem(id,content));
        System.out.println(String.format("added element: id: %s, content: %s",id,content));
    }

    @GetMapping(path = "item/{id}", produces = JSON_UTF_8)
    public DomainItem findOne(@PathVariable String id) {
        Optional<DomainItem> optional = domainItems.stream().filter(domainItem -> domainItem.getId().equals(id)).findFirst();
        return optional.isPresent() ? optional.get() : null;
    }
}

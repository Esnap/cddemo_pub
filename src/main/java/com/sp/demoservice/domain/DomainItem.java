package com.sp.demoservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;

import javax.persistence.Entity;

@Getter
@AllArgsConstructor
@Data
@Entity

public class DomainItem {

    @NonNull
    private String id;

    @NonNull
    private String information;

}

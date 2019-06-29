package com.sp.demoservice.domain;

import lombok.*;
import lombok.extern.log4j.Log4j2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Log4j2
@Builder
@Table(name="DomainItem")
public class DomainItem {

    private static final long serialVersionUID = -3009157732242241606L;

    @NonNull
    @Id
    private String id;

    @Column(name="information")
    private String information;

    @Column(name="domainData")
    private String domainData;

    public void setInformation(String info){
        information = info;
        domainData = info;
    }

    public void setDomainData(String data){
        domainData = data;
        information = data;
    }
}

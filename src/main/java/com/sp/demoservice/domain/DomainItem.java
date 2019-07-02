package com.sp.demoservice.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@NoArgsConstructor
@Entity
@Builder
@Table(name="DomainItem")
public class DomainItem  {

    public DomainItem (String id, String information){
        this.id = id;
        this.information = information;
        this.domainData = information;
    }

    public DomainItem (String id, String information, String domainData){
        this.id = id;
        this.information = information;
        this.domainData = domainData;
    }

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

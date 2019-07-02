package com.sp.demoservice.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@Entity
@Builder
@Table(name="DomainItem")
public class DomainItem  {

    public DomainItem (String id, String domainData){
        this.id = id;
        this.domainData = domainData;
    }
    @NonNull
    @Id
    private String id;

    @Column(name="domainData")
    private String domainData;

    public void setDomainData(String data){
        domainData = data;
    }

    public String getDomainData(){
        return domainData;
    }

    public String getId(){
        return id;
    }

}

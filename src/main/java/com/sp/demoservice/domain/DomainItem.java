package com.sp.demoservice.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@NoArgsConstructor
@Entity
@Builder
@Table(name="DomainItem")
public class DomainItem implements Serializable {

    private static final long serialVersionUID = -3009157732242241606L;

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

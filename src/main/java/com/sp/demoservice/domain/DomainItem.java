package com.sp.demoservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@AllArgsConstructor
@Data
@Entity

@Table(name="DomainItem")
public class DomainItem {

    private static final long serialVersionUID = -3009157732242241606L;

    @NonNull
    @Id
    private String id;

    @NonNull
    @Column(name="information")
    private String information;

}

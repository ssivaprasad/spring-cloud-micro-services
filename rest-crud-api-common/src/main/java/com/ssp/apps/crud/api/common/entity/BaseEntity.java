package com.ssp.apps.crud.api.common.entity;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {

    @CreatedDate
    @Column(name = "createdOn")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    protected Date createdOn;

    @CreatedBy
    @Column(name = "createdBy")
    protected String createdBy;

    @LastModifiedDate
    @Column(name = "updateOn")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    protected Date updatedOn;

    @LastModifiedBy
    @Column(name = "updatedBy")
    protected String updatedBy;


}

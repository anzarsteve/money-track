package com.anthoen.moneytrack.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
public class Audit {

    public boolean active = true;

    @Column(updatable = false, name = "created_by")
    public String createdBy;

    @Column(updatable = false, name = "created_at")
    @CreationTimestamp
    public LocalDateTime createdAt;

    @Column(name = "updated_by")
    public String updatedBy;

    @Column(name = "updated_at")
    @CreationTimestamp
    public LocalDateTime updatedAt;

}

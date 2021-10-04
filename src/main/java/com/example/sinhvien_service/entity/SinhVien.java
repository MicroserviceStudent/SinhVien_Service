package com.example.sinhvien_service.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@JsonIgnoreProperties(value={"hibernateLazyInitializer"})
public class SinhVien implements Serializable {
    @Id
    @GeneratedValue
    private long id;

    private String firstName;
    private String lastName;
    private String email;
    private Long khoaId;

}

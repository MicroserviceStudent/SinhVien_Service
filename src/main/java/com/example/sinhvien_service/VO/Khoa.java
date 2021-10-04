package com.example.sinhvien_service.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Khoa {
    private Long Id;

    private String khoaName;
    private String khoaAddress;
    private String description;
}

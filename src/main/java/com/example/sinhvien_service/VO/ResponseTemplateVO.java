package com.example.sinhvien_service.VO;

import com.example.sinhvien_service.entity.SinhVien;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplateVO {
    private SinhVien sinhVien;
    private Khoa khoa;
}

package com.example.sinhvien_service.service;

import com.example.sinhvien_service.VO.Khoa;
import com.example.sinhvien_service.VO.ResponseTemplateVO;
import com.example.sinhvien_service.entity.SinhVien;
import com.example.sinhvien_service.repository.SinhVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SinhVienService {

    @Autowired
    private SinhVienRepository sinhVienRepository;
    @Autowired
    private RestTemplate restTemplate;

    public SinhVien saveSinhVien(SinhVien sinhVien){
        return sinhVienRepository.save(sinhVien);
    }

    public ResponseTemplateVO getSinhVienWithKhoa(Long sinhVienId){
        ResponseTemplateVO vo = new ResponseTemplateVO();
        SinhVien sinhVien = sinhVienRepository.getById(sinhVienId);

        vo.setSinhVien(sinhVien);
        System.out.println(sinhVien);
        Khoa khoa =
                restTemplate.getForObject("http://localhost:9001/khoa/"
                                + sinhVien.getKhoaId(),
                        Khoa.class);

        vo.setKhoa(khoa);
        return vo;
    }
}

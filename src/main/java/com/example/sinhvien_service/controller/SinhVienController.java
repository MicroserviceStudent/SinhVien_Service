package com.example.sinhvien_service.controller;

import com.example.sinhvien_service.VO.ResponseTemplateVO;
import com.example.sinhvien_service.entity.SinhVien;
import com.example.sinhvien_service.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sinhvien")
public class SinhVienController {

    @Autowired
    private SinhVienService sinhVienService;

    @PostMapping("/")
    public SinhVien saveSinhVien(@RequestBody SinhVien sinhVien){

        return sinhVienService.saveSinhVien(sinhVien);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id")
                                                            Long sinhVienId){
        return sinhVienService.getSinhVienWithKhoa(sinhVienId);
    }
}

package com.example.sinhvien_service.repository;

import com.example.sinhvien_service.entity.SinhVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SinhVienRepository extends JpaRepository<SinhVien, Long> {
}

package com.propen.resismiop.repository;

import com.propen.resismiop.model.NOPModel;
import com.propen.resismiop.model.ProvinsiModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProvinsiDb extends JpaRepository<ProvinsiModel, Long> {
    List<NOPModel> findByIdProvinsi(Long idProvinsi);
}

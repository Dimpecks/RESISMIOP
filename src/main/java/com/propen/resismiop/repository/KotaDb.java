package com.propen.resismiop.repository;

import com.propen.resismiop.model.KotaModel;
import com.propen.resismiop.model.NOPModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface KotaDb extends JpaRepository<KotaModel, Long> {
    List<NOPModel> findByIdKota(Long id);
}

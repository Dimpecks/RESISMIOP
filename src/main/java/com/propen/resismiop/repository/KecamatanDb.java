package com.propen.resismiop.repository;

import com.propen.resismiop.model.KecamatanModel;
import com.propen.resismiop.model.NOPModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KecamatanDb extends JpaRepository<KecamatanModel, Long> {
    List<NOPModel> findByIdKecamatan(Long id);
}

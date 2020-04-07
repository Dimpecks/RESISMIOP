package com.propen.resisimiop.repository;

import com.propen.resisimiop.model.DataTransaksiModel;
import com.propen.resisimiop.model.NOPModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NOPDb extends JpaRepository<NOPModel, Long> {
    List<DataTransaksiModel> findByNop(Long nop);
}

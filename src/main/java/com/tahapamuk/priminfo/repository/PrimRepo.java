package com.tahapamuk.priminfo.repository;

import com.tahapamuk.priminfo.model.PrimInfo;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface PrimRepo extends JpaRepository<PrimInfo,Integer> {
}

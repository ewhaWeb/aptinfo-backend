package com.ewha.aptinfobackend.repository;

import com.ewha.aptinfobackend.entity.AreaMetadata;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MetadataRepository extends JpaRepository<AreaMetadata, Integer> {
    List<AreaMetadata> findByParent(Integer parentCode);
}

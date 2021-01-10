package com.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.customer.datamodel.ImageFile;

@Repository
public interface ImageFileRepository extends JpaRepository<ImageFile, Long> {

}

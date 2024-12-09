package com.example.uti.repositry;

import com.example.uti.entity.utiEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface utiRepository extends JpaRepository<utiEntity,Long> {
}

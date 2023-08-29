package com.example.crimedetection.repository;

import com.example.crimedetection.Entity.Crimeentity;
import com.example.crimedetection.Entity.Userentity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface Crimerepository extends JpaRepository<Crimeentity, Long> {
    @Query("select  count(i) from Crimeentity i where i.crimetype=?1")
    int countitem(String item);

    Crimeentity findBycrimetype(String item);
}

package com.dairy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dairy.model.MilkCollection;

@Repository
public interface MilkCollectionRepo extends JpaRepository<MilkCollection, Integer> {

	int deleteByid(int id);

}

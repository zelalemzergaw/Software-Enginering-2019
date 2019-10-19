package edu.mum.cs425exercise.studentdata.repository;

import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface ClassRepository extends CrudRepository<Long, Id> {
}

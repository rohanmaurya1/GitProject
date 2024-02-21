package org.springframework.boot.BenchWorktRecords.repository;

import org.springframework.boot.BenchWorktRecords.entity.Contributor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContributoRepo extends JpaRepository<Contributor,Integer> {
}

package org.sid.bilingservice.repository;

import org.sid.bilingservice.entities.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource
public interface BillRepository extends JpaRepository<Bill,Long> {

}

package com.pgpe.pgpempresarial.repositories;

import com.pgpe.pgpempresarial.models.UsersProjects;
import com.pgpe.pgpempresarial.models.UsersProjectsId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersProjectsRepository extends JpaRepository<UsersProjects, UsersProjectsId> {
}

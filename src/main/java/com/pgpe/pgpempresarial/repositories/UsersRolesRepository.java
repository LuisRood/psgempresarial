package com.pgpe.pgpempresarial.repositories;

import com.pgpe.pgpempresarial.models.UsersRoles;
import com.pgpe.pgpempresarial.models.UsersRolesId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRolesRepository extends JpaRepository<UsersRoles, UsersRolesId> {
}

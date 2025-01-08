package com.pgpe.pgpempresarial.repositories;

import com.pgpe.pgpempresarial.models.UsersTasks;
import com.pgpe.pgpempresarial.models.UsersTasksId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersTasksRepository extends JpaRepository<UsersTasks, UsersTasksId> {
}

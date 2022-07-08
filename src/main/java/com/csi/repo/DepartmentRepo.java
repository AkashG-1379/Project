package com.csi.repo;

import com.csi.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long> {
    //Earlier we were usind Dao class to  create update and delete the user,
    // With Spring data JPA, it helps us to use the readily available method such
    // as createuserdetails, update, delete
    // hence we need not to write the logic by ourselves. Implementation of this methods to already
    // is alreasdy done. we need to just call them.
}

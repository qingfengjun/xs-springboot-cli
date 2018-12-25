
package com.springboot.cli.dao;


        import com.springboot.cli.pojo.UserRole;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.transaction.annotation.Transactional;


public interface UserRoleRepository extends JpaRepository<UserRole, String> {
    @Transactional
    Long deleteByUserId(String userId);
}

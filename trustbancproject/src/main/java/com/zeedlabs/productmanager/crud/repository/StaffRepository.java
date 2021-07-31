/*
 * package com.zeedlabs.productmanager.crud.repository;
 * 
 * import org.springframework.data.jpa.repository.JpaRepository; import
 * org.springframework.data.jpa.repository.Query; import
 * org.springframework.data.repository.query.Param;
 * 
 * import com.zeedlabs.productmanager.crud.entity.Staff;
 * 
 * public interface StaffRepository extends JpaRepository<Staff, Long> {
 * 
 * @Query("SELECT u FROM Staff u WHERE u.username = :username") public Staff
 * getUserByUsername(@Param("username") String username);
 * 
 * 
 * }
 */
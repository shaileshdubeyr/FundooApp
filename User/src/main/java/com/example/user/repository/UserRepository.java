package com.example.user.repository;

import com.example.user.entity.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author shailesh dubey
 * @Version 16.0.2
 * @Since 24-03-2022
 * @purpose JpaRepository have methods for basic operation of database
 */
@Repository
public interface UserRepository extends JpaRepository<UserData,Integer> {
    /**
     *
     * @param email
     * @return the UserData which extracted from database
     */
    UserData findByeMail(String email);
}

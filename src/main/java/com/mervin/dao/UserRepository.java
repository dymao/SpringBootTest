package com.mervin.dao;

import com.mervin.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

/**
 * @author Mervin
 * @Description:
 * @date 2017/7/16 16:03
 */
public interface UserRepository extends JpaRepository<User,Integer> {
}

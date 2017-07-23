package com.mervin.dao;

import com.mervin.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Mervin
 * @date 2017/7/16 16:03
 */
public interface UserRepository extends JpaRepository<User,Integer> {
}

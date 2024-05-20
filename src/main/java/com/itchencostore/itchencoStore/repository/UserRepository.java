package com.itchencostore.itchencoStore.repository;

import com.itchencostore.itchencoStore.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Long> {
}

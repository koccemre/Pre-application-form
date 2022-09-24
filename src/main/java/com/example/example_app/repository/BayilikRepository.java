package com.example.example_app.repository;

import com.example.example_app.model.UserInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BayilikRepository extends JpaRepository<UserInformation,Integer> {
}

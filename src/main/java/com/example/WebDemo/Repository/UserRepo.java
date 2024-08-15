package com.example.WebDemo.Repository;

import com.example.WebDemo.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//Layer3
//tuong tac voi DBMS
@Repository
public interface UserRepo extends JpaRepository<User, String> {

}

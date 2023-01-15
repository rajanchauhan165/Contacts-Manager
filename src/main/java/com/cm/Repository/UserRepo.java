package com.cm.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cm.Model.User;
@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

}

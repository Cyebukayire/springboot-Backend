package net.javaguides.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.model.*;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}

//package net.javaguides.repository;
//
//import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;
//import org.springframework.stereotype.Repository;
//
//import net.javaguides.model.*;
//
//@Repository
//public interface UserRepository extends JpaRepositoryExtension<User, Long>{
//
//	
//}

package rs.dcloud.springmysqldockerized.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import rs.dcloud.springmysqldockerized.model.User;

public interface UserRepo extends JpaRepository<User,Integer> {

}

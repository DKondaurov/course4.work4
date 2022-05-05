package pro.sky.java.course4.work4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pro.sky.java.course4.work4.model.Faculty;

import java.util.Collection;

@Repository
public interface FacultyRepository extends JpaRepository<Faculty, Long> {

    Collection<Faculty> findFacultyByColorIgnoreCaseOrNameIgnoreCase(String color, String name);

}

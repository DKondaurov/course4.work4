package pro.sky.java.course4.work4.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pro.sky.java.course4.work4.model.Faculty;
import pro.sky.java.course4.work4.repository.FacultyRepository;
import pro.sky.java.course4.work4.service.FacultyService;

import java.util.Collection;

@Service
public class FacultyServiceImpl implements FacultyService {

    private final FacultyRepository facultyRepository;
    Logger logger = LoggerFactory.getLogger(FacultyServiceImpl.class);

    public FacultyServiceImpl(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    @Override
    public Faculty addFaculty(Faculty faculty) {
        logger.debug("Requesting a method addFaculty");
        return facultyRepository.save(faculty);
    }

    @Override
    public Faculty findFaculty(long id) {
        logger.debug("Requesting a method findFaculty");
        return facultyRepository.findById(id).get();
    }

    @Override
    public void removeFaculty(long id) {
        logger.debug("Requesting a method removeFaculty");
        facultyRepository.deleteById(id);
    }

    @Override
    public Faculty editFaculty(Faculty faculty) {
        logger.debug("Requesting a method editFaculty");
        return facultyRepository.save(faculty);
    }

    @Override
    public Collection<Faculty> filterFacultyByColor(String color, String name) {
        logger.debug("Requesting a method filterFacultyByColor");
        return facultyRepository.findFacultyByColorIgnoreCaseOrNameIgnoreCase(color, name);
    }

}

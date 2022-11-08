package proyectoOne.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import proyectoOne.Entidades.Course;
import proyectoOne.Repositorio.courseRep;



@RestController
@RequestMapping("api")
public class courseController {
	
	courseRep courseRepo;
	
	@GetMapping("curso/{id}")
	public Course getCourse(@PathVariable long id) {
		Course course = courseRepo.findById(id).get();

		return course;
	}
	
}

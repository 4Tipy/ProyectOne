package proyectoOne.Repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import proyectoOne.Entidades.Course;



public interface courseRep extends CrudRepository<Course , Long>{
	
	public List<Course> findAll();
}

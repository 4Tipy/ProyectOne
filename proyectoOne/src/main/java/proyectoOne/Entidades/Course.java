package proyectoOne.Entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Course {
		
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;	
		private String curso;
		
		public Course(){
			
		}

		public Course(String curso) {
			super();
			this.curso = curso;
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getCurso() {
			return curso;
		}

		public void setCurso(String curso) {
			this.curso = curso;
		}

		@Override
		public String toString() {
			return "Course [id=" + id + ", curso=" + curso + "]";
		}

		
		
		
	
}

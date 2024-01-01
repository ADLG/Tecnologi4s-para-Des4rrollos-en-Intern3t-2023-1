package com.FormStudentValidation.control;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.FormStudentValidation.modelo.Materias;
import com.FormStudentValidation.modelo.Student;
import com.FormStudentValidation.repository.RepoMaterias;
import com.FormStudentValidation.repository.RepoStudent;

@Controller
public class CtrlStudent
{
	@Autowired
	RepoStudent repo;
	
	@Autowired
	RepoMaterias repoM;
	
	@GetMapping("/")
	public String index()
	{
		return "index";
	}
	
	@PostMapping("/materias")
	public void materias(String email, Model model)
	{
		Student s = repo.findByemail(email);
		
		ArrayList<Materias> ms = new ArrayList<>();
		String materias = s.getSubjects();
		Materias m,m1,m2,m3,m4,m5,m6 = new Materias();
		
		m1 = repoM.findByAsignatura("Physics");
        m2 = repoM.findByAsignatura("Chemistry");
        m3 = repoM.findByAsignatura("Life Science");
        m4 = repoM.findByAsignatura("Political Science");
        m5 = repoM.findByAsignatura("Computer Science");
        m6 = repoM.findByAsignatura("Mathmatics");
        ArrayList<Materias> listmat = new ArrayList<>();
        listmat.add(m1);
        listmat.add(m2);
        listmat.add(m3);
        listmat.add(m4);
        listmat.add(m5);
        listmat.add(m6);
        for (int i = 0; i < listmat.size(); i++) {
        	if (materias.contains(listmat.get(i).getAsignatura())) { 
        		m = repoM.findByAsignatura(listmat.get(i).getAsignatura());
        		ms.add(m);
        	}
      	}
		
        model.addAttribute("listaMaterias",ms);
	}
	
	@PostMapping("/success")
	public String success(Student s, Model model)
	{
		repo.save(s);
		List<Student> listaAlumno = new ArrayList<>();
		listaAlumno.add(s);
		model.addAttribute("listaAlumno",listaAlumno);
		return "success";
	}
	
	@GetMapping("/consultar")
	public String consultar()
	{
		return "pasoNombre";
	}
}

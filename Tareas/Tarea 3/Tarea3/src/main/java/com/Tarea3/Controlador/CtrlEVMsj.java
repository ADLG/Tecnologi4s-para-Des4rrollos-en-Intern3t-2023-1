package com.Tarea3.Controlador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.Tarea3.Entity.Mensaje;
import com.Tarea3.Repository.RepoMensaje;

@Controller
public class CtrlEVMsj
{
    @Autowired
    RepoMensaje repo;
	
	@GetMapping("/")
	public String index()
	{
		return "index";
	}
	
	@GetMapping("/envio")
	public String envio()
	{
		return "envio";
	}
	
	@PostMapping("/envio")
	public String envioMensaje(Mensaje m)
	{
		List<Mensaje> l = new ArrayList<>();
		m.setFecha(m.getFecha());
		Mensaje copia = new Mensaje();
		copia.setDestinatario(m.getCopia());
		copia.setTexto(m.getTexto());
		copia.setRemitente(m.getRemitente());
		copia.setFecha(copia.getFecha());
		l.add(m);
		l.add(copia);
		repo.saveAll(l);
		
		return "redirect:/";
	}
	
	@GetMapping("/mostrar")
	public String mostrarMensajes()
	{
		return "mostrar";
	}
	
	@PostMapping("/mostrar")
	public String verMensajes(String nombre, Model model)
	{
		List<Mensaje> listaMensajes = repo.findByDestinatario(nombre);
		if (listaMensajes.size() == 0)
			return "nomensajes";
		else
		model.addAttribute("listaMensajes",listaMensajes);
		return "ver";
	}
	
	@GetMapping("/eliminar/{m_id}")
	public String eliminaMensaje(@PathVariable String m_id)
	{
		repo.eliminarMensaje(m_id);
		return "redirect:/";
	}
}

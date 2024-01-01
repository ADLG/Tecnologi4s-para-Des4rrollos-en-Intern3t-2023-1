package com.Tarea3.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Tarea3.Entity.Mensaje;

@Repository
public interface RepoMensaje extends JpaRepository<Mensaje, Integer>
{
    @Modifying
    @Transactional
    @Query(value = "DELETE FROM mensajes WHERE m_id = :m_id", nativeQuery = true)
    void eliminarMensaje(@Param("m_id") String m_id);
	
	@Query(value = "SELECT * FROM mensajes WHERE destinatario = :destinatario", nativeQuery = true)
	List<Mensaje> findByDestinatario(@Param("destinatario") String destinatario);
}

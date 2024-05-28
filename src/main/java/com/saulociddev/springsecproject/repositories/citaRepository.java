package com.saulociddev.springsecproject.repositories;

import com.saulociddev.springsecproject.entities.cita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface citaRepository extends JpaRepository<cita,Integer> {

    @Query(value = "SELECT m.nombre, m.apellido, COUNT(*) as repeticiones FROM\n" +
            " cita c JOIN medico m ON m.id = c.id_medico \n" +
            " JOIN especialidad e ON e.id = m.id_especialidad \n" +
            " WHERE c.id_paciente = :idPaciente AND e.id = :idEspecialidad GROUP BY m.nombre, m.apellido ORDER BY repeticiones DESC limit 1", nativeQuery = true)
    List<Object[]> recomdoctor(@Param("idPaciente") String idPaciente,@Param("idEspecialidad") String idEspecialidad);


}

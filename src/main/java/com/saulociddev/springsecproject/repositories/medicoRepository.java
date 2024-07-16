package com.saulociddev.springsecproject.repositories;

import com.saulociddev.springsecproject.entities.medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface medicoRepository extends JpaRepository<medico,Integer> {

    @Query("SELECT m.nombre FROM medico m WHERE m.id = :id")
    String findNombreById(@Param("id") int id);


    @Query("SELECT m.apellido FROM medico m WHERE m.id = :id")
    String findApellidoById(@Param("id") int id);

    @Query(value = "select e.nombre from medico m join especialidad e on m.id_especialidad=e.id where m.id= :idMedico", nativeQuery = true)
    String obtenerEspeci(@Param("idMedico") int idPaciente);

    @Query(value="SELECT * FROM medico m WHERE m.id_especialidad = :idEsp", nativeQuery = true)
    public List<medico> getMedEsp(@Param("idEsp") int idEsp);

    @Query(value="SELECT * FROM medico m WHERE m.id_especialidad = :idEsp", nativeQuery = true)
    public String getEsp(@Param("idEsp") int idEsp);

}

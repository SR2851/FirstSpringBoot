package fr.formation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.formation.model.Hopital;
@Repository
public interface IHopitalRepository extends JpaRepository<Hopital, Long>{

}

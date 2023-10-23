package reposotory;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.Etudiant;

public interface EtudiantRepo extends JpaRepository<Etudiant, Long>{

}

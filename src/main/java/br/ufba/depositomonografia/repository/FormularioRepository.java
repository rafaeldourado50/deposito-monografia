package br.ufba.depositomonografia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.ufba.depositomonografia.model.Formulario;

@Repository
public interface FormularioRepository extends JpaRepository<Formulario, Long> {

}

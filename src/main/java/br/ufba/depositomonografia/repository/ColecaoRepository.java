package br.ufba.depositomonografia.repository;

import br.ufba.depositomonografia.model.Colecao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColecaoRepository extends JpaRepository<Colecao, Long> {

}

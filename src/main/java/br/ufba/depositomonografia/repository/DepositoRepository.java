package br.ufba.depositomonografia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.ufba.depositomonografia.model.Deposito;

@Repository
public interface DepositoRepository extends JpaRepository<Deposito, Long> {

}

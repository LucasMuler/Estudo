package med.vol.api.entitie.medico;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.stream.DoubleStream;

public interface MedicoRepository extends JpaRepository<medico, Long> {

    Page<medico> findAllByAtivoTrue(Pageable paginacao);
}

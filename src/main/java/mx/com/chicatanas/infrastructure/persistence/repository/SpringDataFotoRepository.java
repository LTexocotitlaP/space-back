package mx.com.chicatanas.infrastructure.persistence.repository;

import mx.com.chicatanas.infrastructure.persistence.entity.FotoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataFotoRepository extends JpaRepository<FotoEntity, Long> {}
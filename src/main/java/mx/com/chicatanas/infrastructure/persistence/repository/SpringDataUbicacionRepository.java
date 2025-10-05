package mx.com.chicatanas.infrastructure.persistence.repository;

import mx.com.chicatanas.infrastructure.persistence.entity.UbicacionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataUbicacionRepository extends JpaRepository<UbicacionEntity, Long> {}
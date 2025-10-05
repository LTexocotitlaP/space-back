package mx.com.chicatanas.infrastructure.persistence.repository;

import mx.com.chicatanas.infrastructure.persistence.entity.FotografiaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataFotografoRepository extends JpaRepository<FotografiaEntity,Long> {}
package mx.com.chicatanas.infrastructure.persistence.repository;

import mx.com.chicatanas.infrastructure.persistence.entity.FotografoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface SpringDataFotografoRepository extends JpaRepository<FotografoEntity, Long> {

}
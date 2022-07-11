package rw.ac.rca.WebsiteDownloadManager.server.repositories;

import rw.ac.rca.WebsiteDownloadManager.server.models.Website;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface WebsiteRepository extends JpaRepository<Website, UUID> {
  Optional<Website> findById(UUID uuid);
}

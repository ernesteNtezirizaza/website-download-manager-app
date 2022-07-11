package rw.ac.rca.WebsiteDownloadManager.server.repositories;

import rw.ac.rca.WebsiteDownloadManager.server.models.Link;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface LinkRepository extends JpaRepository<Link,UUID> {
    Optional<Link> findById(UUID uuid);
}

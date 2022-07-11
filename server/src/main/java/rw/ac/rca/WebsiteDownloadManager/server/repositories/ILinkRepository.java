package rw.ac.rca.WebsiteDownloadManager.server.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rw.ac.rca.WebsiteDownloadManager.server.models.Link;

@Repository
public interface ILinkRepository extends JpaRepository<Link, Long> {

}

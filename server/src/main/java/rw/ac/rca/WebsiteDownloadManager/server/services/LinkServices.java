package rw.ac.rca.WebsiteDownloadManager.server.services;

import rw.ac.rca.WebsiteDownloadManager.server.dtos.CreateLink;
import rw.ac.rca.WebsiteDownloadManager.server.dtos.UpdateLink;
import rw.ac.rca.WebsiteDownloadManager.server.models.Link;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface LinkServices {
    List<Link> findAll();

    Link findById(UUID id);

    Link post(CreateLink createLink);

    Link edit(UpdateLink updateLink, UUID id);

    Boolean deleteLink(UUID id);
}

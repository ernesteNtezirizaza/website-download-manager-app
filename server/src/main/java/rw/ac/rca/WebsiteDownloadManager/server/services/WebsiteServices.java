package rw.ac.rca.WebsiteDownloadManager.server.services;

import rw.ac.rca.WebsiteDownloadManager.server.dtos.CreateWebsite;
import rw.ac.rca.WebsiteDownloadManager.server.dtos.UpdateWebsite;
import rw.ac.rca.WebsiteDownloadManager.server.models.Website;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface WebsiteServices {

  List<Website>findAll();

  Website findById(UUID id);

  Website post(CreateWebsite createArticle);

  Website edit(UpdateWebsite updateArticle, UUID id);

  Boolean deleteWebsite(UUID id);


}

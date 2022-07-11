package rw.ac.rca.WebsiteDownloadManager.server.serviceImpl;

import rw.ac.rca.WebsiteDownloadManager.server.dtos.CreateWebsite;
import rw.ac.rca.WebsiteDownloadManager.server.dtos.UpdateWebsite;
import rw.ac.rca.WebsiteDownloadManager.server.exceptions.WebsiteNotFoundException;
import rw.ac.rca.WebsiteDownloadManager.server.models.Website;
import rw.ac.rca.WebsiteDownloadManager.server.repositories.WebsiteRepository;
import rw.ac.rca.WebsiteDownloadManager.server.services.WebsiteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class WebsiteServiceImpl implements WebsiteServices {

  @Autowired
  private WebsiteRepository websiteRepository;
  @Override
  public List<Website> findAll() {
    return websiteRepository.findAll();
  }

  @Override
  public Website findById(UUID id) {
    Optional<Website>foundArticle=websiteRepository.findById(id);
    if (!foundArticle.isPresent())
      throw new WebsiteNotFoundException("website doesn't exists");
    return foundArticle.get();
  }

  @Override
  public Website post(CreateWebsite createWebsite) {
    Website newWebsite= new Website(
            createWebsite.getName(),
            createWebsite.getStartDate(),
            createWebsite.getEndDate(),
            createWebsite.getElapsedTime(),
            createWebsite.getDownloadedKilobytes()
    );


    return websiteRepository.save(newWebsite);
  }

  @Override
  public Website edit(UpdateWebsite updateWebsite, UUID id) {

    Optional<Website>foundArticle=websiteRepository.findById(id);
    if (!foundArticle.isPresent())
      throw new WebsiteNotFoundException("website doesn't exists");

    Website updatedWebsite=new Website(
            updateWebsite.getName(),
            updateWebsite.getStartDate(),
            updateWebsite.getEndDate(),
            updateWebsite.getElapsedTime(),
            updateWebsite.getDownloadedKilobytes()
    );

    updatedWebsite.setId(id);

    return websiteRepository.save(updatedWebsite);
  }

  @Override
  public Boolean deleteWebsite(UUID id) {
    Optional<Website>foundArticle=websiteRepository.findById(id);
    if (!foundArticle.isPresent())
      throw new WebsiteNotFoundException("article doesn't exists");

     websiteRepository.deleteById(id);
    return true;
  }
}

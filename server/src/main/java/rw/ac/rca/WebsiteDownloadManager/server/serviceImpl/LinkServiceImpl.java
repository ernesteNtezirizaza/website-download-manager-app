package rw.ac.rca.WebsiteDownloadManager.server.serviceImpl;

import rw.ac.rca.WebsiteDownloadManager.server.dtos.CreateLink;
import rw.ac.rca.WebsiteDownloadManager.server.dtos.UpdateLink;
import rw.ac.rca.WebsiteDownloadManager.server.exceptions.LinkNotFound;
import rw.ac.rca.WebsiteDownloadManager.server.exceptions.WebsiteNotFoundException;
import rw.ac.rca.WebsiteDownloadManager.server.models.Link;
import rw.ac.rca.WebsiteDownloadManager.server.models.Website;
import rw.ac.rca.WebsiteDownloadManager.server.repositories.LinkRepository;
import rw.ac.rca.WebsiteDownloadManager.server.repositories.WebsiteRepository;
import rw.ac.rca.WebsiteDownloadManager.server.services.LinkServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class LinkServiceImpl implements LinkServices {
    @Autowired
    private LinkRepository linkRepository;
    @Autowired
    private WebsiteRepository websiteRepository;

    @Override
    public List<Link> findAll() {
        return linkRepository.findAll();
    }

    @Override
    public Link findById(UUID id) {
        Optional<Link> foundArticle=linkRepository.findById(id);
        if (!foundArticle.isPresent())
            throw new LinkNotFound("link doesn't exists");
        return foundArticle.get();
    }

    @Override
    public Link post(CreateLink createLink) {

        Optional<Website>foundWebsite=websiteRepository.findById(createLink.getWebsiteId());
        if (!foundWebsite.isPresent())
            throw new WebsiteNotFoundException("website doesn't exists.");

        Link newLink= new Link(
               createLink.getName(),
                createLink.getElapsedTime(),
                createLink.getDownloadedKilobytes()
        );

        newLink.setWebsite(foundWebsite.get());
        return linkRepository.save(newLink);
    }

    @Override
    public Link edit(UpdateLink updateLink, UUID id) {

        Optional<Link>foundLink=linkRepository.findById(id);
        if (!foundLink.isPresent())
            throw new LinkNotFound("link doesn't exists");

        Optional<Website>foundWebsite=websiteRepository.findById(updateLink.getWebsiteId());
        if (!foundWebsite.isPresent())
            throw new WebsiteNotFoundException("website doesn't exists");

        Link updatedLink=new Link(
              updateLink.getName(),
                updateLink.getElapsedTime(),
                updateLink.getDownloadedKilobytes()
        );

        updatedLink.setWebsite(foundWebsite.get());
        updatedLink.setId(id);

        return linkRepository.save(updatedLink);
    }

    @Override
    public Boolean deleteLink(UUID id) {
        Optional<Link>foundArticle=linkRepository.findById(id);
        if (!foundArticle.isPresent())
            throw new LinkNotFound("link doesn't exists");

        linkRepository.deleteById(id);
        return true;
    }
}

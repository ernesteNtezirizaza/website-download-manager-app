package rw.ac.rca.WebsiteDownloadManager.server.services;

import rw.ac.rca.WebsiteDownloadManager.server.utils.dtos.CreateLinkDTO;
import rw.ac.rca.WebsiteDownloadManager.server.models.Link;

import java.util.List;

public interface ILinkService {

    List<Link> all();

    Link create(CreateLinkDTO course);

}

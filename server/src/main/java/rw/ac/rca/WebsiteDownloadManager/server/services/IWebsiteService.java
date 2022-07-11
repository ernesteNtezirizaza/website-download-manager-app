package rw.ac.rca.WebsiteDownloadManager.server.services;

import rw.ac.rca.WebsiteDownloadManager.server.models.Website;

import java.io.IOException;
import java.util.List;
import java.net.URL;

public interface IWebsiteService {
    List<Website> all();

    Website create(URL url) throws IOException;
}

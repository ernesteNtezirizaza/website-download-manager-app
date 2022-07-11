package rw.ac.rca.WebsiteDownloadManager.server.utils.dtos;

import lombok.Data;

import java.net.URL;
import java.util.UUID;

@Data
public class CreateLinkDTO {

    private URL url;
    private String path;
    private UUID website_id;
}

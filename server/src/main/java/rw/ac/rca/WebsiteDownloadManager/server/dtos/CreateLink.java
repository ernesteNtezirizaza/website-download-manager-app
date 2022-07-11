package rw.ac.rca.WebsiteDownloadManager.server.dtos;
import java.util.UUID;

public class CreateLink {

    private String name;
    private String elapsedTime;
    private String downloadedKilobytes;
    private UUID websiteId;

    public CreateLink(){}

    public CreateLink(String name, String elapsedTime, String downloadedKilobytes, UUID websiteId) {
        this.name = name;
        this.elapsedTime = elapsedTime;
        this.downloadedKilobytes = downloadedKilobytes;
        this.websiteId = websiteId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(String elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    public String getDownloadedKilobytes() {
        return downloadedKilobytes;
    }

    public void setDownloadedKilobytes(String downloadedKilobytes) {
        this.downloadedKilobytes = downloadedKilobytes;
    }

    public UUID getWebsiteId() {
        return websiteId;
    }

    public void setWebsiteId(UUID websiteId) {
        this.websiteId = websiteId;
    }

    @Override
    public String toString() {
        return "Link{" +
                ", website_name='" + name + '\'' +
                ", website='" + websiteId + '\'' +
                ", elapsed_time='" + elapsedTime + '\'' +
                ", total_kilobytes=" + downloadedKilobytes +
                '}';
    }
}

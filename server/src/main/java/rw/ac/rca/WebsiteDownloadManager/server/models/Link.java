package rw.ac.rca.WebsiteDownloadManager.server.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Entity(name = "link_tbl")
public class Link {
        @Id
        @GeneratedValue(generator = "UUID")
        @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
        @Type(type="uuid-char")
        @Column(columnDefinition = "VARCHAR(255)")
        private UUID id;

        @Column(name = "link_name")
        private String name;
        @Column(name = "total_elapsed_time")
        private String elapsedTime;
        @Column(name = "total_downloaded_kilobytes")
        private String downloadedKilobytes;

       @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
       @ManyToOne(fetch = FetchType.LAZY)
       @JoinColumn(name = "website_id")
       private Website website;


       public Link(){

       }

    public Link(String name, String elapsedTime, String downloadedKilobytes, Website website) {
        this.name = name;
        this.elapsedTime = elapsedTime;
        this.downloadedKilobytes = downloadedKilobytes;
        this.website = website;
    }

    public Link(String name, String elapsedTime, String downloadedKilobytes) {
        this.name = name;
        this.elapsedTime = elapsedTime;
        this.downloadedKilobytes = downloadedKilobytes;
    }


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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

    public Website getWebsite() {
        return website;
    }

    public void setWebsite(Website website) {
        this.website = website;
    }

    @Override
    public String toString() {
        return "Link{" +
                "id=" + id +
                ", website_name='" + name + '\'' +
                ", website='" + website + '\'' +
                ", elapsed_time='" + elapsedTime + '\'' +
                ", total_kilobytes=" + downloadedKilobytes +
                '}';
    }
}

package rw.ac.rca.WebsiteDownloadManager.server.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "links")
public class Link {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String link_name;

    private UUID website_id;

    private Long  total_elapsed_time;

    private Long  total_downloaded_kilobytes;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "website_id", insertable = false, updatable = false)
    private Website website;

}

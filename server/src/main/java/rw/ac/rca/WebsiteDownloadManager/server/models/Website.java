package rw.ac.rca.WebsiteDownloadManager.server.models;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "website_tbl")
public class Website {
  @Id
  @GeneratedValue(generator = "UUID")
  @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
  @Type(type="uuid-char")
  @Column(columnDefinition = "VARCHAR(255)")
  private UUID id;
  @Column(columnDefinition = "TEXT",name = "website_name" )
  private String name;
  @Column(name = "download_start_date_time")
  private Date startDate;

  @Column(name = "download_end_date_time")
  private Date endDate;

  @Column(name = "total_elapsed_time")
  private String elapsedTime;
  @Column(name = "total_downloaded_kilobytes")
  private String downloadedKilobytes;


  public Website(){}

  public Website(String name, Date startDate, Date endDate, String elapsedTime, String downloadedKilobytes) {
    this.name = name;
    this.startDate = startDate;
    this.endDate = endDate;
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

  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
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

  @Override
  public String toString() {
    return "Website{" +
        "id=" + id +
        ", website_name='" + name + '\'' +
        ", start_time='" + startDate + '\'' +
        ", end_time='" + endDate + '\'' +
        ", elapsed_time='" + elapsedTime + '\'' +
        ", total_kilobytes=" + downloadedKilobytes +
        '}';
  }

}

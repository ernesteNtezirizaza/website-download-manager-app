package rw.ac.rca.WebsiteDownloadManager.server.dtos;
import java.util.Date;

public class CreateWebsite {

  private String name;
  private Date startDate;
  private Date endDate;
  private String elapsedTime;
  private String downloadedKilobytes;
  public CreateWebsite(){}


  public CreateWebsite(String name, Date startDate, Date endDate, String elapsedTime, String downloadedKilobytes) {
    this.name = name;
    this.startDate = startDate;
    this.endDate = endDate;
    this.elapsedTime = elapsedTime;
    this.downloadedKilobytes = downloadedKilobytes;
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
            ", website_name='" + name + '\'' +
            ", start_time='" + startDate + '\'' +
            ", end_time='" + endDate + '\'' +
            ", elapsed_time='" + elapsedTime + '\'' +
            ", total_kilobytes=" + downloadedKilobytes +
            '}';
  }

}

package rw.ac.rca.WebsiteDownloadManager.server.controllers;

import rw.ac.rca.WebsiteDownloadManager.server.dtos.CreateWebsite;
import rw.ac.rca.WebsiteDownloadManager.server.dtos.UpdateWebsite;
import rw.ac.rca.WebsiteDownloadManager.server.models.Website;
import rw.ac.rca.WebsiteDownloadManager.server.serviceImpl.WebsiteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/websites")
@CrossOrigin
public class WebsiteController {

  @Autowired
  private WebsiteServiceImpl websiteService;

  @GetMapping
  public List<Website>findAll(){
    return websiteService.findAll();
  }

  @GetMapping("/{id}")
  public Website findById(@PathVariable UUID id){
    return websiteService.findById(id);
  }

  @PostMapping
  public ResponseEntity<?>save(@RequestBody CreateWebsite createWebsite){
    Website newWebsite= websiteService.post(createWebsite);

    return ResponseEntity.ok(newWebsite);
  }


  @PutMapping("/{id}")
  public ResponseEntity<?>update(@RequestBody UpdateWebsite updateWebsite, @PathVariable UUID id){
    Website updated= websiteService.edit(updateWebsite,id);

    return ResponseEntity.ok(updated);
  }


  @DeleteMapping("/{id}")
  public ResponseEntity<?>delete(@PathVariable UUID id){
    boolean isDeleted=websiteService.deleteWebsite(id);
    return ResponseEntity.ok(isDeleted);
  }

}

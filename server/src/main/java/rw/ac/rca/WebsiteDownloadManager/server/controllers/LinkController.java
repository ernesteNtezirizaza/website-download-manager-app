package rw.ac.rca.WebsiteDownloadManager.server.controllers;


import rw.ac.rca.WebsiteDownloadManager.server.dtos.CreateLink;
import rw.ac.rca.WebsiteDownloadManager.server.dtos.UpdateLink;
import rw.ac.rca.WebsiteDownloadManager.server.models.Link;
import rw.ac.rca.WebsiteDownloadManager.server.serviceImpl.LinkServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/links")
@CrossOrigin
public class LinkController {

    @Autowired
    private LinkServiceImpl linkService;

    @GetMapping
    public List<Link> findAll(){
        return linkService.findAll();
    }

    @GetMapping("/{id}")
    public Link findById(@PathVariable UUID id){
        return linkService.findById(id);
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody CreateLink createLink){
        Link newArLink= linkService.post(createLink);
        return ResponseEntity.ok(newArLink);
    }


    @PutMapping("/{id}")
    public ResponseEntity<?>update(@RequestBody UpdateLink updateLink, @PathVariable UUID id){
        Link updated= linkService.edit(updateLink,id);

        return ResponseEntity.ok(updated);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?>delete(@PathVariable UUID id){
        boolean isDeleted=linkService.deleteLink(id);
        return ResponseEntity.ok(isDeleted);
    }
}

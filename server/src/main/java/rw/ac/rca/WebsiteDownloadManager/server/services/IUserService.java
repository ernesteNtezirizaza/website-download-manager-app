package rw.ac.rca.WebsiteDownloadManager.server.services;

import rw.ac.rca.WebsiteDownloadManager.server.models.User;

import java.util.List;

public interface IUserService {

    List<User> getAllUsers();

    User save(User user);

    User getLoggedInUser();
}

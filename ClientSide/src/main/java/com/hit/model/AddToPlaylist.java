package com.hit.model;

import com.hit.client.Client;
import com.hit.client.Request;
import com.hit.client.RequestGenerator;
import com.hit.controller.MainPageController;

public class AddToPlaylist {
    public void addToPlaylist(String username, Long id) {
        String requestStr = String.format("{'username': '%s', 'songId': %d}", username, id);
        Request request = RequestGenerator.generateRequest("playlist/add", requestStr);

        new Client().sendRequest(request);
//        Updating current user
        MainPageController.currentConnectedUser = new LoginUser().loginUser(MainPageController.currentConnectedUser.username);
    }
}

package com.hit.model;

import com.hit.client.Client;
import com.hit.client.Request;
import com.hit.client.RequestGenerator;
import com.hit.client.Response;
import com.hit.dm.Song;

import java.util.List;

public class GetAllSongs extends SongGetter {

    public List<Song> getSongs() {
        Request request = RequestGenerator.generateRequest("song/get", null);
        Response response = new Client().sendRequest(request);

        return extractSongs(response.getJsonData().get("songs"));
    }
}

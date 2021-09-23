package com.rvbenlg.springcloudnetflixeurekasecondclient.services.impl;

import com.rvbenlg.springcloudnetflixeurekasecondclient.restmodels.responses.AlbumResponse;
import com.rvbenlg.springcloudnetflixeurekasecondclient.services.AlbumService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlbumServiceImpl implements AlbumService {

    @Override
    public List<AlbumResponse> getUserAlbums(String userId) {
        List<AlbumResponse> userAlbums = new ArrayList<>();

        AlbumResponse firstAlbum = new AlbumResponse();
        firstAlbum.setUserId(userId);
        firstAlbum.setAlbumId("1");
        firstAlbum.setName("First album name");
        firstAlbum.setDescription("First album description");

        AlbumResponse secondAlbum = new AlbumResponse();
        firstAlbum.setUserId(userId);
        firstAlbum.setAlbumId("2");
        firstAlbum.setName("Second album name");
        firstAlbum.setDescription("Second album description");

        userAlbums.add(firstAlbum);
        userAlbums.add(secondAlbum);

        return userAlbums;
    }
}

package com.rvbenlg.springcloudnetflixeurekasecondclient.services;

import com.rvbenlg.springcloudnetflixeurekasecondclient.restmodels.responses.AlbumResponse;

import java.util.List;

public interface AlbumService {

    List<AlbumResponse> getUserAlbums(String userId);

}

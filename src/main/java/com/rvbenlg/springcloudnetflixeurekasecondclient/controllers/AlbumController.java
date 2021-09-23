package com.rvbenlg.springcloudnetflixeurekasecondclient.controllers;

import com.rvbenlg.springcloudnetflixeurekasecondclient.restmodels.responses.AlbumResponse;
import com.rvbenlg.springcloudnetflixeurekasecondclient.services.AlbumService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/users/{id}/albums")
public class AlbumController {

    private final AlbumService albumService;

    public AlbumController(AlbumService albumService) {
        this.albumService = albumService;
    }

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public List<AlbumResponse> getUserAlbums(@PathVariable String id) {
        return albumService.getUserAlbums(id);
    }

}

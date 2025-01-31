package com.techie.backend.playlist_video.entity;

import com.techie.backend.playlist.entity.Playlist;
import com.techie.backend.video.entity.Video;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "playlist_video")
public class PlaylistVideo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "playlist_id", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private Playlist playlist;

    @JoinColumn(name = "video_id", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private Video video;
}

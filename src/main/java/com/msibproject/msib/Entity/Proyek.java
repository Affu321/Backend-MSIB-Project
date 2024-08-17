package com.msibproject.msib.Entity;

import jakarta.persistence.*;
import lombok.Data;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "proyek")
public class Proyek extends AbstrackDate implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nama_proyek")
    private String namaProyek;

    @Column(name = "client")
    private String client;

    @Column(name = "tgl_mulai")
    private LocalDateTime tglMulai;

    @Column(name = "tgl_selesai")
    private LocalDateTime tglSelesai;

    @Column(name = "pimpinan_proyek")
    private String pimpinanProyek;

    @Column(name = "keterangan")
    private String keterangan;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }
}

package com.himedias.spserver.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Member {

    @Id
    private String nickname;
    private String email;
    private String pwd;
    private String phone;
    private String snsid;
    private String provider;
    private String profileimg;
    private String profilemsg;

}

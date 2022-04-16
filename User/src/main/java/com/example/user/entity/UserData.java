package com.example.user.entity;

import com.example.user.dto.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author shailesh dubey
 * @Version 16.0.2
 * @Since 24-03-2022
 */
@Entity
@Table(name = "userTable")
@NoArgsConstructor
@Data
@AllArgsConstructor
public class  UserData {
    //user data which is insert into database
    @GeneratedValue
    @Id
    private int id;
    public String FirstName;
    public String lastName;
    private String eMail;
    private String password;
    private String address;
    Date date;
    private boolean verified;

    /**
     *
     * @param userDTO
     * userDTO object holds the all the meta information of the
     * user i am setting here to insert into database
     */
    public UserData(UserDTO userDTO) {
        this.FirstName = userDTO.FirstName;
        this.lastName= userDTO.lastName;
        this.address = userDTO.address;
        this.password = userDTO.password;
        this.eMail = userDTO.eMail;
        this.verified = false;
        this.date = userDTO.date;
    }
}

package org.ada.school.model;

import org.ada.school.dto.UserDto;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.UUID;

@Document
public class User

{
    @Id
    String id;

    String name;

    @Indexed( unique = true )
    String email;

    String lastName;

    Date createdAt;

    /*public User(String id, String name, String email, String lastName, Date createdAt) {

    }*/

    public User() {
    }

    public User(String id, String name, String email, String lastName, Date createdAt) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.lastName = lastName;
        this.createdAt = createdAt;
    }

    public User(UserDto userDto )
    {
        id = UUID.randomUUID().toString();
        name = userDto.getName();
        lastName = userDto.getLastName();
        email = userDto.getEmail();
        createdAt = userDto.getCreatedAt();
    }


    public void update( UserDto userDto )
    {
        name = userDto.getName();
        lastName = userDto.getLastName();
        email = userDto.getEmail();
    }


    public String getId()
    {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName()
    {
        return name;

    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}

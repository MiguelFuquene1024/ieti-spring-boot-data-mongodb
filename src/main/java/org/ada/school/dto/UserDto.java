package org.ada.school.dto;

import java.util.Date;

public class UserDto
{
    String name;

    String email;

    String lastName;

    Date createdAt;

    public UserDto()
    {
    }

    public String getName()
    {
        return name;
    }

    public String getEmail()
    {
        return email;
    }

    public String getLastName()
    {
        return lastName;
    }

    public Date getCreatedAt() { return createdAt; }
}

package org.resk.studysail.dto;

import org.resk.studysail.model.User;

public record UserDTO(String name, String email ) {
    public User getModel(){
        User user = new User();
        user.setEmail(email);
        user.setName(name);
        return user;
    }

}

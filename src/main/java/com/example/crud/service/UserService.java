package com.example.crud.service;

import com.example.crud.entity.User;
import com.example.crud.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<User> getAllUser() {
        return userRepository.findAll();
    }

   public  User getUserById(Long id){
        return userRepository.findById(id).orElse(null);
   }

   public User createUser(User user){
        return userRepository.save(user);
   }

   public User updateUser(Long id, User updatedUser){
        return userRepository.findById(id).map(user -> {
            user.setName(updatedUser.getName());
            user.setSurName(updatedUser.getSurName());
            user.setPhoneNumber(updatedUser.getPhoneNumber());
            user.setCity(updatedUser.getCity());
            user.setCountry(updatedUser.getCountry());
            user.setEmail(updatedUser.getEmail());
            return userRepository.save(user);
        }).orElse(null);
   }

   public void deleteUser(Long id){
        userRepository.deleteById(id);
   }

}

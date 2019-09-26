package dev.fujioka.java.avancado.web.service;

import dev.fujioka.java.avancado.web.domain.User;
import dev.fujioka.java.avancado.web.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class UserService implements CrudInterface<User> {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> save(User entity) {
        return Optional.of(userRepository.save(entity));
    }

    @Override
    public Optional<User> findById(long id) {
        return userRepository.findById(id);
    }

    @Override
    public void delete(User entity) {
        userRepository.delete(entity);
    }

    @Override
    public void deleteById(long id) {
        userRepository.deleteById(id);
    }

    @Override
    public long count() {
        return userRepository.count();
    }
    
 /*Novos Metodos*/
    
    public User buscarPorLogin(String login) {
    	return this.userRepository.buscarPorLogin(login);
    }

    public List<User> buscarPorFirstNameLike(String firstName) {
    	return this.userRepository.buscarPorFirstNameLike(firstName);
    }

    public List<User> buscarPorLastNameLike(String lastName) {
    	return this.userRepository.buscarPorLastNameLike(lastName);
    }

    public List<User> buscarPorNomeCompleto(String firstName, String lastName) {
    	return this.userRepository.buscarPorNomeCompleto(firstName, lastName);
    }

    public Date pegarDataCriacao(Long id) {
    	return this.userRepository.pegarDataCriacao(id);
    }
}

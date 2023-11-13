package com.example.SpringBoard.repository;

import com.example.SpringBoard.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class jdbcUserRepository implements userRepository{

    private final JdbcTemplate jdbcTemplate;

    public jdbcUserRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public User save(User user) {
        SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(jdbcTemplate);
        jdbcInsert.withTableName("user").usingGeneratedKeyColumns("ID");

        Map<String, Object> parameters = new HashMap<>();
        parameters.put("id", user.getId());
        parameters.put("uid", user.getUid());
        parameters.put("upw", user.getPassword());
        parameters.put("unick", user.getNickname());

        Number key = jdbcInsert.executeAndReturnKey(new MapSqlParameterSource(parameters));
        user.setId((int) key.longValue());

        return user;

    }

    @Override
    public Optional<User> findById(int id) {
        return Optional.empty();
    }

    @Override
    public Optional<User> findByUid(String uid) {
        return Optional.empty();
    }

    @Override
    public Optional<User> findByPw(String password) {
        return Optional.empty();
    }

    @Override
    public Optional<User> findByNick(String nickname) {
        return Optional.empty();
    }

    @Override
    public Optional<User> findAll() {
        return Optional.empty();
    }
}

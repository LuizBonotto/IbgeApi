package com.dev.ibgeapi.repository;

import com.dev.ibgeapi.dto.Distrito;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@EnableAutoConfiguration
public class IbgeRepository {
    private static String INSERT = "insert into minha_tabela (id, nome) VALUES (?,?)";

    private JdbcTemplate jdbcTemplate;

    public IbgeRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    public void insert(Distrito distrito){
        Object[] attr = new Object[] {
          distrito.getId(),
          distrito.getNome()
        };
        jdbcTemplate.update(INSERT,attr);
    }
}

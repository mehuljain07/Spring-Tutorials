package com.example.SpringJDBCDemo.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import com.example.SpringJDBCDemo.model.Alien;

import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;


@Repository
public class AlienRepo {

    private JdbcTemplate template;
    public JdbcTemplate getTemplate() {
        return template;
    }
    @Autowired
    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public void save(Alien a1){
        //Add an alien
        String sql_query = "INSERT INTO alien (id, name, tech) values(?,?,?);";
        
        int r = template.update(sql_query, a1.getId(),a1.getName(),a1.getTech());
        System.out.println("Rows added" + r);
    }

    public List<Alien> findAll(){
        //return all the aliens
        String sql_query = "select * from alien;";
        RowMapper<Alien> mapper = new RowMapper<Alien>() {

            @Override
            public Alien mapRow(@NonNull ResultSet rs, int intRow) throws SQLException {
                Alien a = new Alien();
                a.setId(rs.getInt(1));
                a.setName(rs.getString(2));
                a.setTech(rs.getString(3));
                return a;
            }
        };
        List<Alien> aliens = template.query(sql_query,mapper);
        return aliens;
    }
}

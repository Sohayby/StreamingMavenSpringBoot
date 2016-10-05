/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.test;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import streaming.entity.Film;
import streaming.spring.SpringConfig;
import streaming.service.FilmServiceCRUD;

/**
 *
 * @author admin
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringConfig.class)
public class FilmDAOTest {
    @Autowired
    
    private FilmServiceCRUD dAO;
    
    
    @Before
    public void avant (){
        dAO.deleteAll();
    }
    
    @Test
    public void ajouter2Film(){
        dAO.save(new Film ());
        dAO.save(new Film());
    }
} 


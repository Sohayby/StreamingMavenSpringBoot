/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.io.Serializable;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import streaming.entity.Film;

/**
 *
 * @author admin
 */
public interface FilmServiceCRUD extends CrudRepository<Film, Long> {

    public Film findOneByTitre(String t);

    public List<Film> findAllByAnnee(Integer annee);

    public List<Film> findAllByTitreOrAnnee(String t, Integer annee);

    public List<Film> findAllByTitreAndAnnee(String t, Integer annee);

    public List<Film> findAllByGenre(Long id);

    public List<Film> findAllByPays(Long id);

    public List<Film> findAllByGenreAndPays(Long id, Long id1);

    public List<Film> findAllByActeursNomAndActeursPrenom(String n, String p);

    public Long countAllByActeursNomAndActeursPrenom (String nom, String prenom);

    public List<Film> findAllByRealisateursOrderByTitreAsc(String realisateur);

    public Long countByRealisateurs(Integer realisateurs);

    public List<Film> findAllByPaysAndGenreAndRealisateursAndActeurs(String pays, Long genre, String realisateur, Long acteur);
}

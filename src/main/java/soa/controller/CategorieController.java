package soa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import soa.entities.Categorie;
import soa.repository.CategorieRepository;

import java.util.List;

@RestController // pour déclarer un service web de type REST
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/categorie")  //    http://localhost:8080/categorie
public class CategorieController {
    @Autowired // pour l'injection de dépendances
    private CategorieRepository categorieRepository;

    @GetMapping(
            // spécifier le path de la méthode
            value = "/",
            // spécifier le format de retour en XML
            produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE}
    )
    public List<Categorie> getAllCategories() {
        return categorieRepository.findAll();

    }

}

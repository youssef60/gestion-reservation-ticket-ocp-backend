package com.mahdaoui.gestionticketaquaocp.controllers.Api;

import com.mahdaoui.gestionticketaquaocp.models.Conjoint;
import com.mahdaoui.gestionticketaquaocp.models.Enfant;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@Api("/api/enfants")
public interface EnfantApi {

    @PostMapping(value = "/enfants" , consumes = MediaType.APPLICATION_JSON_VALUE,  produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "enregistrer un enfant" , response = Enfant.class)
    @ApiResponses( value = { @ApiResponse( code = 201 ,  message = "enfant a été enregistré" ) })
    public ResponseEntity<Enfant> save(@RequestBody Enfant enfant);

    @DeleteMapping(value ="/enfants/{id}" )
    @ApiOperation(value = "supprimer un enfant" )
    @ApiResponses( value = { @ApiResponse( code = 200 ,  message = "enfant a été supprimé" ) })
    public void  deleteById(@PathVariable Long id);

    @DeleteMapping(value ="/enfants" )
    @ApiOperation(value = "supprimer tous les enfants" )
    @ApiResponses( value = { @ApiResponse( code = 200 ,  message = "tous les enfants ont été supprimé" ) })
    public void deleteAll();

    @GetMapping(value = "/enfants/{matricule}" , produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "trouver tous les enfants par matricule " , responseContainer = "List<Enfant>")
    @ApiResponses( value = { @ApiResponse( code = 200 ,  message = "la liste des enfants par matricule" ) })
    ResponseEntity<List<Enfant>> findAllByMatricule(String matricule);

    @GetMapping(value = "/enfants"  , produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "trouver tous les enfants  " , responseContainer = "List<Enfant>")
    @ApiResponses( value = { @ApiResponse( code = 200 ,  message = "la liste des enfants " ) })
    public ResponseEntity<List<Enfant>> findAll();

}

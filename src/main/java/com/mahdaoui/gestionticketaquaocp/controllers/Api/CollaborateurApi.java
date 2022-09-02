package com.mahdaoui.gestionticketaquaocp.controllers.Api;

import com.mahdaoui.gestionticketaquaocp.models.Collaborateur;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/api")
@Api("/api/collaborateurs")
public interface CollaborateurApi {

    @GetMapping(value = "/collaborateurs" , produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "voir la liste de tous les collaborateurs" , responseContainer = "List<Collaborateur>")
    @ApiResponses( value = { @ApiResponse( code = 200 ,  message = "la liste des collaborateurs" ) })
    public ResponseEntity<List<Collaborateur>> findAll();

    @PostMapping( value = "/collaborateurs" , consumes = MediaType.APPLICATION_JSON_VALUE ,produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "enregistrer un collaborateur" , response =  Collaborateur.class )
    @ApiResponses( value = { @ApiResponse( code = 201 ,  message = "collaborateur a été enregistrer avec succes" ) })
    public ResponseEntity<Collaborateur> save(@RequestBody Collaborateur collaborateur);

    @PutMapping( value = "/collaborateurs" , consumes = MediaType.APPLICATION_JSON_VALUE ,produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "modifier un collaborateur" , response =  Collaborateur.class )
    @ApiResponses( value = { @ApiResponse( code = 201 ,  message = "collaborateur a été modifié avec succes" ) })
    public ResponseEntity<Collaborateur> update(@RequestBody Collaborateur collaborateur);

    @ApiOperation(value = "supprimer tous les collaborateurs"  )
    @ApiResponses( value = { @ApiResponse( code = 200 ,  message = "la liste des collaborateurs a été supprimer " ) })
    @DeleteMapping( value = "/collaborateurs")
    public void  deleteAll();


    @GetMapping(value = "/collaborateurs/{matricule}" , produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "trouver  un collaborateur par matricule"  )
    @ApiResponses( value = { @ApiResponse( code = 200 ,  message = "collaborateur a été trouvé " ) })
    public ResponseEntity<Collaborateur> findCollaborateurByMatricule(@PathVariable String matricule);


    @GetMapping(value = "/collaborateurs/total" , produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "return nombre total des collaborateurs"  )
    @ApiResponses( value = { @ApiResponse( code = 200 ,  message = "nombre total des collaborateurs " ) })
    public ResponseEntity<Long> countAllCollaborateurs();

}

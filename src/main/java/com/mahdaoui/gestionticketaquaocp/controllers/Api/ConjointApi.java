package com.mahdaoui.gestionticketaquaocp.controllers.Api;

import com.mahdaoui.gestionticketaquaocp.models.Conjoint;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.apache.coyote.Response;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/api")
@Api("/api/conjoints")
public interface ConjointApi {

    @PostMapping( value = "/conjoints" , consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "enregistrer une conjointe" , response = Conjoint.class)
    @ApiResponses( value = { @ApiResponse( code = 201 ,  message = "conjoint a été enregistré" ) })
    public ResponseEntity<Conjoint> save(@RequestBody Conjoint conjoint);

    @DeleteMapping(value = "/conjoints/{id}")
    @ApiOperation(value = "supprimer une conjointe" )
    @ApiResponses( value = { @ApiResponse( code = 200 ,  message = "conjoint a été supprimer" ) })
    public void  deleteById(@PathVariable Long id);

    @DeleteMapping(value = "/conjoints")
    @ApiOperation(value = "supprimer tous les  conjointes" )
    public void deleteAll();

    @GetMapping(value = "/conjoints" ,  produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "voir la liste de tous les conjointes" , responseContainer = "List<Cnojoint>")
    @ApiResponses( value = { @ApiResponse( code = 200 ,  message = "la liste des Conjointes" ) })
    public ResponseEntity<List<Conjoint>> findAll();

}

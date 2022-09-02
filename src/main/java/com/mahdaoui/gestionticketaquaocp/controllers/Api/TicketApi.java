package com.mahdaoui.gestionticketaquaocp.controllers.Api;

import com.mahdaoui.gestionticketaquaocp.models.Enfant;
import com.mahdaoui.gestionticketaquaocp.models.Ticket;
import com.mahdaoui.gestionticketaquaocp.models.TypeTicket;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@Api("/api/TicketApi")

public interface TicketApi {

    /*@GetMapping(value ="/tickets/{matricule}" , produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "trouver tous les tickets par matricule "  , responseContainer = "List<Ticket>>")
    @ApiResponses( value = { @ApiResponse( code = 200 ,  message = "list des tickets par matricule" ) })
    ResponseEntity<List<Ticket>> findAllByMatricule(String matricule);*/

    @PostMapping(value ="/tickets" , consumes = MediaType.APPLICATION_JSON_VALUE , produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "enregistrer un ticket" ,response = Ticket.class)
    @ApiResponses( value = { @ApiResponse( code = 201 ,  message = "ticket a été crée" ) })
    public ResponseEntity<Ticket> save(@RequestBody Ticket ticket);

    @DeleteMapping("/tickets/{id}")
    @ApiOperation(value = "supprimer  un ticket" )
    @ApiResponses( value = { @ApiResponse( code = 200 ,  message = "ticket a été supprimé" ) })
    public void  deleteById(@PathVariable Long id);

    @DeleteMapping("/tickets")
    @ApiOperation(value = "supprimer  tous les tickets" )
    @ApiResponses( value = { @ApiResponse( code = 200 ,  message = "tous les ticket ont été supprimé" ) })
    public void deleteAll();

    @GetMapping(value ="/tickets/{id}"  , produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "touver un ticket par id "  , response = Ticket.class)
    @ApiResponses( value = { @ApiResponse( code = 200 ,  message = "ticket a été trouvé par l'id" ) })
    public ResponseEntity<Ticket> findById(@PathVariable Long id);

    @GetMapping(value = "/tickets" , produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "trouver tous les tickets "  , responseContainer = "List<Ticket>")
    @ApiResponses( value = { @ApiResponse( code = 200 ,  message = "la liste des tickets" ) })
    public ResponseEntity<List<Ticket>> findAll();


}

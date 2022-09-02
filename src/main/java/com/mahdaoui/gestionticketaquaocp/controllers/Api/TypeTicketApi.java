package com.mahdaoui.gestionticketaquaocp.controllers.Api;

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

@RequestMapping("/api")
@Api("/api/TypeTicket")
public interface TypeTicketApi {

    @PostMapping(value = "/typeTicket" , consumes = MediaType.APPLICATION_JSON_VALUE,  produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "enregistrer un type ticket" ,response = TypeTicket.class)
    @ApiResponses( value = { @ApiResponse( code = 201 ,  message = "type ticket a été crée" ) })
    public ResponseEntity<TypeTicket> save(@RequestBody TypeTicket typeTicket);

    @DeleteMapping(value = "/typeTicket/{id}")
    @ApiOperation(value = "supprimer  un type ticket" )
    @ApiResponses( value = { @ApiResponse( code = 200 ,  message = "type ticket a été supprimé" ) })
    public void  deleteById(@PathVariable Long id);

    @GetMapping(value = "/typeTicket/type/{type}" , produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "trouver typeTicket par type "  , response = TypeTicket.class)
    @ApiResponses( value = { @ApiResponse( code = 200 ,  message = "type ticket par Type" ) })
    public ResponseEntity<TypeTicket> findTypeTicketByType(@PathVariable String type);

    @GetMapping(value = "/typeTickets", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "trouver tous les type tickets "  , responseContainer = "List<TypeTicket>")
    @ApiResponses( value = { @ApiResponse( code = 200 ,  message = "la liste des type tickets" ) })
    public ResponseEntity<List<TypeTicket>> findAll();

    @GetMapping(value ="/typeTickets/{id}"  , produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "touver un typeTicket par id "  , response = Ticket.class)
    @ApiResponses( value = { @ApiResponse( code = 200 ,  message = "typeTicket a été trouvé par l'id" ) })
    public ResponseEntity<TypeTicket> findById(@PathVariable Long id);

}

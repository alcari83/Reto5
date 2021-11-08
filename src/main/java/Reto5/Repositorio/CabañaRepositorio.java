/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto5.Repositorio;

import Reto5.Interface.InterfaceCabaña;
import Reto5.Modelo.Cabaña;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



/**
 *
 * @author Alvaro Calderón
 */
@Repository
public class CabañaRepositorio {
      @Autowired
    private InterfaceCabaña crud;
    

    public List<Cabaña> getAll(){
        return (List<Cabaña>) crud.findAll();       
    }
    
    public Optional <Cabaña> getCabaña(int id){
        return crud.findById(id);
    }
    
    public Cabaña save(Cabaña cabaña){
        return crud.save(cabaña);
    }
     public void delete(Cabaña cabaña){
        crud.delete(cabaña);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto5.Servicios;

import Reto5.Modelo.Cabaña;
import Reto5.Repositorio.CabañaRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Alvaro Calderón
 */
@Service
public class ServiciosCabaña {
        @Autowired
    private CabañaRepositorio metodosCrud;
    
    public List<Cabaña> getAll(){
        return metodosCrud.getAll();
    }
    
    public Optional<Cabaña> getCabaña(int idCabaña){
        return metodosCrud.getCabaña(idCabaña);
    }
    
    public Cabaña save(Cabaña Cabaña){
        if(Cabaña.getId()==null){
            return metodosCrud.save(Cabaña);
        }else{
            Optional<Cabaña> evt=metodosCrud.getCabaña(Cabaña.getId());
            if(evt.isEmpty()){
                return metodosCrud.save(Cabaña);
            }else{
                return Cabaña;
            }
        }
    }
    public Cabaña update(Cabaña cabaña){
        if(cabaña.getId()!=null){
            Optional<Cabaña> e=metodosCrud.getCabaña(cabaña.getId());
            if(!e.isEmpty()){
                if(cabaña.getName()!=null){
                    e.get().setName(cabaña.getName());
                }
                if(cabaña.getBrand()!=null){
                    e.get().setBrand(cabaña.getBrand());
                }
                if(cabaña.getRooms()!=null){
                    e.get().setRooms(cabaña.getRooms());
                }
                if(cabaña.getDescription()!=null){
                    e.get().setDescription(cabaña.getDescription());
                }
                if(cabaña.getCategory()!=null){
                    e.get().setCategory(cabaña.getCategory());
                }
                metodosCrud.save(e.get());
                return e.get();
            }else{
                return cabaña;
            }
        }else{
            return cabaña;
        }
    }


    public boolean deleteCabaña(int cabañaId) {
        Boolean aBoolean = getCabaña(cabañaId).map(cabaña -> {
            metodosCrud.delete(cabaña);
            return true;
        }).orElse(false);
        return aBoolean;
    }
    
    
}

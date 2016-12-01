package com.operaciones;

import com.modelo.Contacto;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "agenda")
@SessionScoped
public class AgendaOperaciones {

    private Contacto contacto;
    private List<Contacto> listaContacto;

    @PostConstruct
    public void init() {
        contacto = new Contacto();
        listaContacto = new ArrayList<>();
    }


    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }

    public List<Contacto> getListaContacto() {
        return listaContacto;
    }

    public void setListaContacto(List<Contacto> listaContacto) {
        this.listaContacto = listaContacto;
    }

    public void agregarContacto(){
        this.listaContacto.add(this.contacto);
    }

    public void borrarContacto(Contacto contacto){
        this.listaContacto.remove(contacto);
    }
}

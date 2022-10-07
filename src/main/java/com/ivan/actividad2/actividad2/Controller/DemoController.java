package com.ivan.actividad2.actividad2.Controller;
import com.ivan.actividad2.actividad2.entities.Coches;
import com.ivan.actividad2.actividad2.entities.Coche;
import com.ivan.actividad2.actividad2.entities.Coches;
import com.ivan.actividad2.actividad2.entities.CochesRam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;



@Controller

public class DemoController {
    private final Coches coches;

    public DemoController() {
        this.coches = new CochesRam();
    }

    @GetMapping("/inicio")
    String mostrar(Model model) {
        model.addAttribute("coches", coches.mostrar());
        return "inicio";
    }

    @GetMapping("/formulario")
    String añadir(Coche coche) {
        return "formulario";
    }

    @PostMapping("/index")
    String index(Coche coche, Model model) {
        this.coches.añadir(coche);
        model.addAttribute("coche", coche);
        return "index";
    }

    @GetMapping("/busquedaMatricula")
    String busqueda(@RequestParam String matricula , Model model) {
        model.addAttribute("coches", coches.buscar(matricula));

            return "busquedaMatricula";
        }
    }



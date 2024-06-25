package edu.escuelaing.arsw;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Objects;

@Controller
public class GreetingController {
    @GetMapping("calculadora")
    public String calculadora(@RequestParam(name = "primerValor", defaultValue = "") String primerValor,
                           @RequestParam(name = "segundoValor", defaultValue = "") String segundoValor,
                           @RequestParam(name = "operacion", defaultValue = "") String operation, Model model) {
        Integer resultado = 0;
        if(Objects.equals(operation, "suma"))
            resultado = Integer.parseInt(primerValor) + Integer.parseInt(segundoValor);
        else if(Objects.equals(operation, "resta")){
            resultado = Integer.parseInt(primerValor) - Integer.parseInt(segundoValor);
        }
        else if(Objects.equals(operation, "multiplicacion")){
            resultado = Integer.parseInt(primerValor) * Integer.parseInt(segundoValor);
        }
        else if(Objects.equals(operation, "division")){
            resultado = Integer.parseInt(primerValor) / Integer.parseInt(segundoValor);
        }
        model.addAttribute("resultado", resultado);
        return "calculadora";
    }

}

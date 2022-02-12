package uia.com.apimvcrest.controller;

import org.springframework.web.bind.annotation.*;
import uia.com.apimvcrest.modelo.CotizacionModelo;
import uia.com.apimvcrest.servicio.CotizacionServicio;

import java.io.IOException;
import java.util.ArrayList;

@RestController
public class CotizacionesController
{
    private CotizacionServicio servicioCotizaciones = new CotizacionServicio();

    public CotizacionesController() throws IOException {
    }

    @GetMapping("/cotizaciones")
    public ArrayList<CotizacionModelo> cotizaciones()
    {
        return servicioCotizaciones.getCotizaciones();
    }

    @GetMapping("/cotizacion/{id}")
    public CotizacionModelo cotizacionById(@PathVariable int id)
    {
        return  servicioCotizaciones.getCotizacion(id);
    }

    @DeleteMapping("/cotizacion/{id}")
    public CotizacionModelo deleteCotizacionById(@PathVariable int id)
    {
        return  servicioCotizaciones.deleteCotizacion(id);
    }
    @PutMapping("/cotizacion/{id}")
    public CotizacionModelo updateCotizacion(@PathVariable int id, @RequestBody CotizacionModelo cotizacion)
    {
        return  servicioCotizaciones.updateCotizacion(id, cotizacion);
    }

}

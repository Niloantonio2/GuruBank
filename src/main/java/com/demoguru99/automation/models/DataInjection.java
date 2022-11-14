package com.demoguru99.automation.models;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;

import java.util.Locale;

public class DataInjection {
    /**Esta clase DataInjection se crea con el fin de crear datos aleatorios para la prueba */

    //Faker encargado de generar datos aleatorios configurado en español
    Faker faker = new Faker(new Locale ("en-U$"));

    //Variables String para almacenar data
    private String nombreDeUsuario,contrasena, nombreCliente,fechaDia, fechaMes, fechaAno, direccion,
            ciudad,departamento, pin,numeroTelefono,correo, contrasena1,DepositoInicial;

    //Variables boleanas para almacenar data
    private boolean genero,tipoDeCuenta;

    public DataInjection() {

        //Asignacion de datos a las variables
        this.nombreDeUsuario = "mngr370265";
        this.contrasena = "zErysyz";
        this.nombreCliente = faker.name().firstName();
        this.genero = faker.bool().bool();

        this.fechaDia = Integer.toString(faker.number().numberBetween(1,30));
        this.fechaMes = Integer.toString(faker.number().numberBetween(1,12));
        this.fechaAno = Integer.toString(faker.number().numberBetween(1970,2000));

        this.direccion = faker.address().buildingNumber();
        this.ciudad = faker.address().city();
        this.departamento = faker.address().state();

        this.pin = Long.toString(faker.number().randomNumber(6,true));
        this.numeroTelefono = Integer.toString(faker.number().numberBetween(300000000,999999999));
        this.correo = faker.internet().emailAddress();
        this.contrasena1 = faker.internet().password();

        this.tipoDeCuenta = faker.bool().bool();
        this.DepositoInicial = Long.toString(faker.number().randomNumber(4,true));
    }
    //Creacion de metodos Getters para acceder a los datos desde otras clases
    public String getNombreDeUsuario() {
        return nombreDeUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public boolean genero() {
        return genero;
    }

    public String getFechaDia() {
        return fechaDia;
    }

    public String getFechaMes() {
        return fechaMes;
    }

    public String getFechaAno() {
        return fechaAno;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getPin() {
        return pin;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContrasena1() {
        return contrasena1;
    }

    public String getDepositoInicial() {
        return DepositoInicial;
    }

    public boolean TipoDeCuenta() {
        return tipoDeCuenta;
    }
}




package com.demoguru99.automation.steps;

import com.demoguru99.automation.models.DataInjection;
import com.demoguru99.automation.pageobjects.ClienteNuevoPageObjects;
import com.demoguru99.automation.pageobjects.CuentaNuevaPageObjects;
import com.demoguru99.automation.pageobjects.InicioDeSecionPageObjects;
import com.demoguru99.automation.utils.Esperas;
import net.thucydides.core.annotations.Step;

public class ClienteYCuentaNuevaSteps {

    /**este Framework de automatizacion se realizo con patron de diseño Page object Model
     * Por lo cual se realiza la separacion de los codigos por capas para facilidad de entender, mantener
     * y dectetar errores, Step es la capa o clase donde se traen las demas clases para realizar todos los
     * pasos
     *
     */

    //Se importan las demas clases como objetos
    InicioDeSecionPageObjects inicioDeSecionPageObjects = new InicioDeSecionPageObjects();
    ClienteNuevoPageObjects clienteNuevoPageObjects = new ClienteNuevoPageObjects();
    CuentaNuevaPageObjects cuentaPageObjects = new CuentaNuevaPageObjects();
    DataInjection dataInjection = new DataInjection();
    Esperas esperas = new Esperas();


    @Step
    public void AbrirSitioWebGuru(){
        inicioDeSecionPageObjects.open();//Abre el navegador pero como en la clase   inicioDeSecionPageObjects le dimos URL por defecto entonces empiza desde alli
    }

    @Step
    public void  inicioDeSesion (){
        esperas.esperaExplicitaClick(inicioDeSecionPageObjects.Btn_iniciar); //Espera hasta que aparezca el elemento de la pagina
        inicioDeSecionPageObjects.setTxtNombreUsuario(dataInjection.getNombreDeUsuario()); //Escribe Usuario
        inicioDeSecionPageObjects. setTxt_Contrasena(dataInjection.getContrasena());//Escribe Contraseña
        inicioDeSecionPageObjects.setBtn_iniciar(); //Click en iniciar
    }
    @Step
    public void MensajeBienvenido(){
        esperas.esperaImplicita(1);//Espere 1 segundo
        inicioDeSecionPageObjects.setLbl_Bienvenido(); //Nos dice si  elemento html localizado se encuentra visible como medio de validacion

    }


   @Step
    public void IngresarDatosCliente(){
       clienteNuevoPageObjects.setBtn_ClienteNuevo();
       esperas.esperaExplicitaClick(clienteNuevoPageObjects.Btn_Enviar);//Espera hasta que aparezca el elemento de la pagina y sea clikeable
       clienteNuevoPageObjects.setTxt_Nombre(dataInjection.getNombreCliente()); //Escribe nombre


       //De acuerdo al dato seleccionado aleatoriamente en DataInjecion selecionamos el genero
        if (dataInjection.genero() == true){
            clienteNuevoPageObjects.setBtn_Masculino();
        }
        else {
            clienteNuevoPageObjects.setBtn_Femenina();}


       esperas.esperaFluida();//Espera que aparezcan elementos en la pagina con cierto tiempo de consulta
       //concatenacion de la fecha dia+mes+año
       clienteNuevoPageObjects.setTXt_FechaDeNacimiento(dataInjection.getFechaDia() + dataInjection.getFechaMes() + dataInjection.getFechaAno());
       clienteNuevoPageObjects.setTxt_Direccion(dataInjection.getCiudad()+ dataInjection.getDireccion());//concatenacion de direccion
       clienteNuevoPageObjects.setTxt_Ciudad(dataInjection.getCiudad());// Escribir ciudad
       clienteNuevoPageObjects.setTxt_Departamento(dataInjection.getDepartamento()); //Escribir departamento
       clienteNuevoPageObjects.setTxt_Pin(dataInjection.getPin()); // Escribir PIN
       clienteNuevoPageObjects.setTxt_NumeroCelular(dataInjection.getNumeroTelefono());//Escribir NUMERO CELULAR
       clienteNuevoPageObjects.setTxt_Email(dataInjection.getCorreo()); //Ecribir correo electronico
       clienteNuevoPageObjects.setTxt_Contrasena(dataInjection.getContrasena1());// Escribir contraseña
       clienteNuevoPageObjects.setBtn_Enviar();// click enviar
       clienteNuevoPageObjects.setLbl_IDcliente(); //Guardar dato en variable

    }
  @Step
    public void validacionMensajeCliente(){
      esperas.esperaImplicita(1);//esperar 1 segundo
      clienteNuevoPageObjects.setLbL_ClienteRegistadoOK();//Nos dice si  elemento html localizado se encuentra visible como medio de validacion

     }
     @Step
   public void datosCuentaNueva() {
         cuentaPageObjects.setBtn_NuevaCuenta();//Click nuev cuenta
         esperas.esperaExplicitaClick(cuentaPageObjects.Btn_envia2); ////Espera hasta que aparezca el elemento de la pagina y sea clikeable
         cuentaPageObjects.setTxt_ClienteID(clienteNuevoPageObjects.ID); //Escribe ID

        //Deacuerdo a los datos aleatoros elige tipo de cuenta Ahorros o corriente
         if(dataInjection.TipoDeCuenta() == true) {
             cuentaPageObjects.setLst_CuentaAhorros();
         }
         else { cuentaPageObjects.setLst_CuentaCorriente();}


         esperas.esperaFluida();//Espera que aparezcan elementos en la pagina con cierto tiempo de consulta
         cuentaPageObjects.setTxt_DepositoInicial(dataInjection.getDepositoInicial()); //Escribe cuanto va a depositar para abrir cuenta
         cuentaPageObjects.setBtn_envia2();// click en enviar

    }
   @Step
    public void mensajeCuentaCreadaExitosamente(){
        cuentaPageObjects.setLbl_Cuentaregistrada();//Nos dice si  elemento html localizado se encuentra visible como medio de validacion
   }


}



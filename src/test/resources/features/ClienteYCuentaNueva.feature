#language: es
#Author: Nilo Chaverra
#Correo:Nilo.Chaverra@sqasa.co

Característica: Guru99Bank
  Descripción: Creación de un nuevo cliente y de una cuenta para este cliente en el baco guru99

  Antecedentes: Inicio de sesion
    Dado que me encuentro en el sitio web
    Cuando ingrese mis credenciales
    Entonces vizualizare bienvenido a gerente de Guru Bank


  Escenario: Cliente nuevo
    Cuando Diligencio el formulario de cliente nuevo
    Entonces  vizualizare cliente registrado exitosamente


  Escenario: Cuenta nueva
    Cuando Igrese el ID customer y creo nueva cuenta
    Entonces  vizualizare cuenta creada exitosamente
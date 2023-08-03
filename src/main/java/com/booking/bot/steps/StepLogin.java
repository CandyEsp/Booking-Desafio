package com.booking.bot.steps;

import com.booking.bot.helpers.BaseDriver;
import com.booking.bot.pageobject.ObjLogin;
import com.booking.bot.utility.mobileUtilObject;
import net.serenitybdd.core.Serenity;

public class StepLogin extends BaseDriver {

    ObjLogin objLogin = new ObjLogin();
    mobileUtilObject util = new mobileUtilObject();

    public void ingresar_usuario(String usuario) throws Throwable {
        util.click(androidDriver(),objLogin.btnIniciarCorreo);
        util.sendKeyValue(androidDriver(),objLogin.txtCorreo,usuario);
        util.click(androidDriver(),objLogin.btnContinuar);
    }

    public void ingresar_contrasena(String pass) throws Throwable {
        util.waitVisibleElement(androidDriver(),objLogin.txtContrasena);
        util.sendKeyValue(androidDriver(),objLogin.txtContrasena,pass);
    }
    public void iniciar_sesion() throws Throwable {
        util.click(androidDriver(),objLogin.btnIniciarSesion);
        Thread.sleep(2000);
        if(element(objLogin.btnNunca).isCurrentlyVisible()){
            util.click(androidDriver(),objLogin.btnNunca);
        }
        util.waitVisibleElement(androidDriver(),objLogin.btnEmpezar);
        util.click(androidDriver(),objLogin.btnEmpezar);
    }

    public void crear_contrasena(String contrasena) throws Throwable {
        util.waitVisibleElement(androidDriver(),objLogin.txtPass1);
        util.sendKeyValue(androidDriver(),objLogin.txtPass1,contrasena);
        util.sendKeyValue(androidDriver(),objLogin.txtPass2,contrasena);
        util.click(androidDriver(),objLogin.btnCrearCuenta);
    }

    public boolean muestra_alerta(){
        try{
            util.waitVisibleElement(androidDriver(),objLogin.lblAlert);
        }catch(Exception e){
            System.out.println("No se muestra la alerta");
        }
        return element(objLogin.lblAlert).isCurrentlyVisible();
    }
    public boolean muestra_home(){
        try{
            util.waitVisibleElement(androidDriver(),objLogin.btnEmpezar);
        }catch(Exception e){
            System.out.println("No se muestra menú perfil");
        }
        return element(objLogin.btnEmpezar).isCurrentlyVisible();
    }
}

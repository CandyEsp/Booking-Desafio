package com.booking.bot.pageobject;


import com.booking.bot.helpers.BaseDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class ObjLogin extends BaseDriver {

    @AndroidFindBy(id = "com.google.android.gms:id/never_button")
    public WebElement btnNunca;
    @AndroidFindBy(id = "com.booking:id/identity_email_start")
    public WebElement btnIniciarCorreo;
    @AndroidFindBy(id = "com.booking:id/identity_text_input_edit_text")
    public WebElement txtCorreo;
    @AndroidFindBy(id = "com.booking:id/identity_text_input_edit_text")
    public WebElement txtContrasena;
    @AndroidFindBy(id = "com.booking:id/identity_email_continue")
    public WebElement btnContinuar;
    @AndroidFindBy(id = "com.booking:id/identity_password_continue")
    public WebElement btnIniciarSesion;
    @AndroidFindBy(id = "com.booking:id/genius_onbaording_bottomsheet_cta")
    public WebElement btnEmpezar;
    @AndroidFindBy(xpath = "(//*[@resource-id='com.booking:id/identity_text_input_edit_text'])[1]")
    public WebElement txtPass1;
    @AndroidFindBy(xpath = "(//*[@resource-id='com.booking:id/identity_text_input_edit_text'])[2]")
    public WebElement txtPass2;
    @AndroidFindBy(id = "com.booking:id/identity_landing_social_button_text")
    public WebElement btnCrearCuenta;
    @AndroidFindBy(id = "com.booking:id/bui_alert_title")
    public WebElement lblAlert;
    @AndroidFindBy(id = "com.booking:id/facet_profile_header_avatar")
    public WebElement imgAvatar;
}

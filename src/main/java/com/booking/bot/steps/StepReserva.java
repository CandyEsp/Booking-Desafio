package com.booking.bot.steps;

import com.booking.bot.helpers.BaseDriver;
import com.booking.bot.pageobject.ObjLogin;
import com.booking.bot.pageobject.ObjReserva;
import com.booking.bot.utility.Constantes;
import com.booking.bot.utility.mobileUtilObject;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;


public class StepReserva extends BaseDriver {

   ObjReserva objReserva= new ObjReserva();
   mobileUtilObject util = new mobileUtilObject();

   public void buscar_alojamiento(String destino) throws Throwable {
      util.click(androidDriver(),objReserva.txtIntrodcDestino);
      util.sendKeyValue(androidDriver(),objReserva.txtDestino,destino);
      util.click(androidDriver(),objReserva.optDestino);
      util.click(androidDriver(),objReserva.opcDiaInicio);
      util.click(androidDriver(),objReserva.opcDiaFinal);
      util.click(androidDriver(),objReserva.btnSeleccionarFecha);
      util.click(androidDriver(),objReserva.txtHabitPersonas);
      // util.click(androidDriver(),objLogin.btnAddAdulto);
      util.click(androidDriver(),objReserva.btnAddNino);
      util.click(androidDriver(),objReserva.opcEdadNino);
      util.click(androidDriver(),objReserva.btnOk);
      util.click(androidDriver(),objReserva.btnAplicar);
      util.click(androidDriver(),objReserva.btnBuscar);
   }

   public void seleccionar_opcion() throws Throwable {
      util.click(androidDriver(),objReserva.opcDosResult);
   }

   public void seleccionar_habitacion() throws Throwable {
      Dimension dimension = androidDriver().manage().window().getSize();
      Point start= new Point((int)(dimension.width*0.5), (int)(dimension.height*0.4));
      Point end= new Point((int)(dimension.width*0.5), (int)(dimension.height*0.2));
      int contador=0;
      while(element(objReserva.txtPriceSelect).isCurrentlyVisible()==false && contador<3){
         util.doSwipe(appiumDriver(), start, end, 500);
         contador++;
      }
      Constantes.initialPrice = objReserva.txtPriceSelect.getText();
      util.click(androidDriver(),objReserva.btnSelectHabitac);
   }

   public void elegir_instancia() throws Throwable {
      Dimension dimension = androidDriver().manage().window().getSize();
      Point start= new Point((int)(dimension.width*0.5), (int)(dimension.height*0.4));
      Point end= new Point((int)(dimension.width*0.5), (int)(dimension.height*0.2));
      util.waitVisibleElement(androidDriver(),objReserva.iconInfo);
      int contador=0;
      while(element(objReserva.btnSelect).isCurrentlyVisible()==false && contador<3){
         util.doSwipe(appiumDriver(), start, end, 500);
         contador++;
      }
      Constantes.finalPrice=objReserva.txtPriceSelect.getText();
      util.click(androidDriver(), objReserva.btnSelect);
      if(element(objReserva.btnConfirmar).isCurrentlyVisible()){
         util.click(androidDriver(),objReserva.btnConfirmar);
      }
   }

   public String validar_habitacion_seleccionada(){
      Dimension dimension = androidDriver().manage().window().getSize();
      Point start= new Point((int)(dimension.width*0.5), (int)(dimension.height*0.4));
      Point end= new Point((int)(dimension.width*0.5), (int)(dimension.height*0.2));
      int contador=0;
      while(element(objReserva.txtHabitaselect).isCurrentlyVisible()==false && contador<3){
         util.doSwipe(appiumDriver(), start, end, 500);
         contador++;
      }
      String habSeleccionada=objReserva.txtHabitaselect.getText();
      return habSeleccionada;
   }


}

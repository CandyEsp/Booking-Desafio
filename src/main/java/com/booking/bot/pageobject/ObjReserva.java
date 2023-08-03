package com.booking.bot.pageobject;

import com.booking.bot.helpers.BaseDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class ObjReserva extends BaseDriver {

    @AndroidFindBy(id = "com.booking:id/facet_search_box_accommodation_destination")
    public WebElement txtIntrodcDestino;
    @AndroidFindBy(id = "com.booking:id/facet_with_bui_free_search_booking_header_toolbar_content")
    public WebElement txtDestino;
    @AndroidFindBy(xpath = "(//*[@text='Cusco'])[2]")
    public WebElement optDestino;
    @AndroidFindBy(accessibility = "14 agosto 2023")
    public WebElement opcDiaInicio;
    @AndroidFindBy(accessibility = "28 agosto 2023")
    public WebElement opcDiaFinal;
    @AndroidFindBy(id = "com.booking:id/facet_date_picker_confirm")
    public WebElement btnSeleccionarFecha;
    @AndroidFindBy(id = "com.booking:id/facet_search_box_accommodation_occupancy")
    public WebElement txtHabitPersonas;
    @AndroidFindBy(xpath = "//*[@resource-id='com.booking:id/group_config_adults_count']//following-sibling::android.widget.Button[2]")
    public WebElement btnAddAdulto;
    @AndroidFindBy(xpath = "//*[@resource-id='com.booking:id/group_config_children_count']//following-sibling::android.widget.Button[2]")
    public WebElement btnAddNino;
    @AndroidFindBy(xpath = "//*[@resource-id='android:id/numberpicker_input']//preceding-sibling::android.widget.Button")
    public WebElement opcEdadNino;
    @AndroidFindBy(id = "android:id/button1")
    public WebElement btnOk;
    @AndroidFindBy(id = "com.booking:id/group_config_apply_button")
    public WebElement btnAplicar;
    @AndroidFindBy(id = "com.booking:id/facet_search_box_cta")
    public WebElement btnBuscar;

    //Pantalla resultados de busqueda
    @AndroidFindBy(xpath = "//*[@resource-id='com.booking:id/results_list_facet']/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]")
    public WebElement opcDosResult;

    @AndroidFindBy(id = "com.booking:id/select_room_cta")
    public WebElement btnSelectHabitac;
    @AndroidFindBy(id = "com.booking:id/listitem_info_icon")
    public WebElement iconInfo;
    //Scroll
    @AndroidFindBy(id = "com.booking:id/rooms_item_select_text_view")
    public WebElement btnSelect;
    @AndroidFindBy(id = "com.booking:id/price_view_price")
    public WebElement txtPriceSelect;
    //text US$56
    @AndroidFindBy(id = "com.booking:id/rooms_item_select_text_view")
    public WebElement txtHabitaselect;
    //text 1 habitación seleccionada

    @AndroidFindBy(id = "com.booking:id/rooms_item_select_layout")
    public WebElement btnSeleccPersonalizar;
    @AndroidFindBy(id = "com.booking:id/bui_input_stepper_title")
    public WebElement lblNumeroHabitaciones;
    @AndroidFindBy(id = "com.booking:id/room_pref_select")
    public WebElement btnConfirmar;

    @AndroidFindBy(id = "com.booking:id/rooms_item_select_text_view")
    public WebElement txtItemSelect;
    //text 1 habitación seleccionada
    @AndroidFindBy(xpath = "//*[@text='Reserva ahora']")
    public WebElement btnReservaAhora;
}

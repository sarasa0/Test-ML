package Tests;

import Steps.HeaderSteps;
import Steps.Herramientas.TextilSteps;
import Steps.PublicacionSteps;
import Steps.Vehiculos.VehiculosSearchSteps;
import Steps.Vehiculos.VehiculosSteps;
import Test.BaseTest;
import Utils.Log;
import Watcher.ReportAggregatorTestWatcher;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class TestVehiculos extends BaseTest {
    private String descripcion;
    private String precio;

    @Rule
    public ReportAggregatorTestWatcher myTestWatcher = new ReportAggregatorTestWatcher();

    @Before
    public void clearData() {
        descripcion="";
        precio="";
    }

    @Test
    public void testPrecioPublicacionVehiculos() {
        HeaderSteps header = new HeaderSteps();
        header.clickVehiculos();
        VehiculosSearchSteps searchPage = new VehiculosSearchSteps();
        searchPage.clickBuscar();
        VehiculosSteps catalogPage = new VehiculosSteps();
        catalogPage.clickFiltro();
        descripcion = catalogPage.getDescripcionPublicacion();
        precio = catalogPage.getPrecioPublicacion();
        catalogPage.clickPublicacion();
        PublicacionSteps publicacion = new PublicacionSteps();
        Assert.assertEquals("no coincide el precio del catalogo con el de la publicacion",precio,publicacion.getPrecio());
        Assert.assertEquals("no coincide la descripcion del catalogo con el de la publicacion",descripcion,publicacion.getPublicacionTitle());
        Log.info("Asserts correctos");
    }

}

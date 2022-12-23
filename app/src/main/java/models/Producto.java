package models;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Producto {

    private String idproducto;
    private String barcode;
    private String costo;
    private String preciounidad;
    private String preciomayorista;

    public String getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(String idproducto) {
        this.idproducto = idproducto;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getPreciounidad() {
        return preciounidad;
    }

    public void setPreciounidad(String preciounidad) {
        this.preciounidad = preciounidad;
    }

    public String getPreciomayorista() {
        return preciomayorista;
    }

    public void setPreciomayorista(String preciomayorista) {
        this.preciomayorista = preciomayorista;
    }

   public Producto(JSONObject a) throws JSONException {
        idproducto = "Id Producto: " + a.getString("id").toString();
        barcode = a.getString("barcode").toString() ;
       costo = a.getString("costo").toString() ;
        preciounidad = a.getString("precio_unidad").toString() ;
      preciomayorista = a.getString("precio_mayorista").toString() ;
   }


    public static ArrayList<Producto> JsonObjectsBuild(JSONArray productos) throws JSONException {
        ArrayList<Producto> productoslist = new ArrayList<>();

        for (int i = 0; i < productos.length(); i++) {
            productoslist.add(new Producto(productos.getJSONObject(i)));
        }
        return productoslist;
    }

}

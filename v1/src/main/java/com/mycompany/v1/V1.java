/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.v1;

/**
 *
 * @author HP
 */
public class V1 {

   private String myBrand, myModel;
public V1() {
myBrand = "unknown";
myModel = "unknown";
}
public V1(String brand, String model) {
setBrand(brand);
setModel(model);
}
public String getBrand() {
return myBrand;
}
public String getModel() {
return myModel;
}
public void setBrand(String brand) {
myBrand = brand;
}
public void setModel(String model) {
myModel = model;
}
public String toString() {
return getBrand() + " " + getModel();
}
}

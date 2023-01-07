package com.rizqiadr.pizzarest;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Posts {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("harga")
    @Expose
    private String harga;
    @SerializedName("desc")
    @Expose
    private String desc;
    @SerializedName("nama")
    @Expose
    private String nama;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrice() {
        return harga;
    }

    public void setPrice(String price) {
        this.harga = price;
    }



    public String getDetails() {
        return desc;
    }

    public void setDetails(String details) {
        this.desc = details;
    }

    public String getFoodName() {
        return nama;
    }

    public void setFoodName(String foodName) {
        this.nama = foodName;
    }

}
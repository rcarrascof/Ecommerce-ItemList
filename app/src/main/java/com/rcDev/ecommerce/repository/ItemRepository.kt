package com.rcDev.ecommerce.repository

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.rcDev.ecommerce.model.ShopItem
import java.util.ArrayList

/**
Created by Reinold Carrasco
on 2022-03-24
 */
object ItemRepository {

    val menShopItemList: ArrayList<ShopItem>
        get() = Gson().fromJson(jsonMenItems, object : TypeToken<ArrayList<ShopItem>>() {

        }.type)





    internal var jsonMenItems = "[\n" +
            "  {\n" +
            "    \"id\":\"Men\",\n" +
            "    \"name\":\"All too easy tee\",\n" +
            "    \"image\":\"men_cloth_1\",\n" +
            "    \"currency\":\"$\",\n" +
            "    \"price\":\"200\",\n" +
            "    \"original_price\":\"240\",\n" +
            "    \"category_name\":\"Clothing\",\n" +
            "    \"rating_count\":\"45\",\n" +
            "    \"total_rating\":\"4.5\",\n" +
            "    \"discount\":\"20\",\n" +
            "    \"is_liked\":\"true\",\n" +
            "    \"description\":\"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc sed tellus orci.\",\n" +
            "    \"image_list\":[\n" +
            "      {\n" +
            "        \"image_name\":\"men_cloth_1\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"men_cloth_2\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"men_cloth_3\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"shop\" : {\n" +
            "           \"shop_name\":\"Nike\",\n" +
            "      \"shop_email\":\"template.com\",\n" +
            "      \"shop_phone\":\"+957777777\",\n" +
            "      \"shop_website\":\"rcdev.com\",\n" +
            "      \"shop_address\":\"Avenida churchill\"\n" +
            "    },\n" +
            "    \"view_count\":\"3500\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\":\"Men\",\n" +
            "    \"name\":\"America loves texas tee\",\n" +
            "    \"image\":\"men_cloth_2\",\n" +
            "    \"currency\":\"$\",\n" +
            "    \"price\":\"200\",\n" +
            "    \"original_price\":\"240\",\n" +
            "    \"category_name\":\"Clothing\",\n" +
            "    \"rating_count\":\"50\",\n" +
            "    \"total_rating\":\"5\",\n" +
            "    \"discount\":\"20\",\n" +
            "    \"is_liked\":\"false\",\n" +
            "    \"description\":\"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc sed tellus orci.\",\n" +
            "    \"image_list\":[\n" +
            "      {\n" +
            "        \"image_name\":\"men_cloth_1\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"men_cloth_2\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"men_cloth_3\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"shop\" : {\n" +
            "           \"shop_name\":\"Nike\",\n" +
            "      \"shop_email\":\"template.com\",\n" +
            "      \"shop_phone\":\"+957777777\",\n" +
            "      \"shop_website\":\"rcdev.com\",\n" +
            "      \"shop_address\":\"Avenida churchill\"\n" +
            "    },\n" +
            "    \"view_count\":\"2500\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\":\"Men\",\n" +
            "    \"name\":\"Angler fleece pullover\",\n" +
            "    \"image\":\"men_cloth_3\",\n" +
            "    \"currency\":\"$\",\n" +
            "    \"price\":\"200\",\n" +
            "    \"original_price\":\"240\",\n" +
            "    \"category_name\":\"Clothing\",\n" +
            "    \"rating_count\":\"450\",\n" +
            "    \"total_rating\":\"4.5\",\n" +
            "    \"discount\":\"20\",\n" +
            "    \"is_liked\":\"false\",\n" +
            "    \"description\":\"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc sed tellus orci.\",\n" +
            "    \"image_list\":[\n" +
            "      {\n" +
            "        \"image_name\":\"men_cloth_1\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"men_cloth_2\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"men_cloth_3\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"shop\" : {\n" +
            "          \"shop_name\":\"Nike\",\n" +
            "      \"shop_email\":\"template.com\",\n" +
            "      \"shop_phone\":\"+957777777\",\n" +
            "      \"shop_website\":\"rcdev.com\",\n" +
            "      \"shop_address\":\"Avenida churchill\"\n" +
            "    },\n" +
            "    \"view_count\":\"1500\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\":\"Men\",\n" +
            "    \"name\":\"Austin city limits track tee\",\n" +
            "    \"image\":\"men_cloth_4\",\n" +
            "    \"currency\":\"$\",\n" +
            "    \"price\":\"200\",\n" +
            "    \"original_price\":\"240\",\n" +
            "    \"category_name\":\"Clothing\",\n" +
            "    \"rating_count\":\"50\",\n" +
            "    \"total_rating\":\"5\",\n" +
            "    \"discount\":\"20\",\n" +
            "    \"is_liked\":\"false\",\n" +
            "    \"description\":\"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc sed tellus orci.\",\n" +
            "    \"image_list\":[\n" +
            "      {\n" +
            "        \"image_name\":\"men_cloth_1\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"men_cloth_2\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"men_cloth_3\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"shop\" : {\n" +
            "          \"shop_name\":\"Nike\",\n" +
            "      \"shop_email\":\"template.com\",\n" +
            "      \"shop_phone\":\"+957777777\",\n" +
            "      \"shop_website\":\"rcdev.com\",\n" +
            "      \"shop_address\":\"Avenida churchill\"\n" +
            "    },\n" +
            "    \"view_count\":\"2300\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\":\"Men\",\n" +
            "    \"name\":\"Backpack bear long tee\",\n" +
            "    \"image\":\"men_cloth_5\",\n" +
            "    \"currency\":\"$\",\n" +
            "    \"price\":\"200\",\n" +
            "    \"original_price\":\"240\",\n" +
            "    \"category_name\":\"Clothing\",\n" +
            "    \"rating_count\":\"33\",\n" +
            "    \"total_rating\":\"4.5\",\n" +
            "    \"discount\":\"20\",\n" +
            "    \"is_liked\":\"true\",\n" +
            "    \"description\":\"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc sed tellus orci.\",\n" +
            "    \"image_list\":[\n" +
            "      {\n" +
            "        \"image_name\":\"men_cloth_1\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"men_cloth_2\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"men_cloth_3\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"shop\" : {\n" +
            "        \"shop_name\":\"Nike\",\n" +
            "      \"shop_email\":\"template.com\",\n" +
            "      \"shop_phone\":\"+957777777\",\n" +
            "      \"shop_website\":\"rcdev.com\",\n" +
            "      \"shop_address\":\"Avenida churchill\"\n" +
            "    },\n" +
            "    \"view_count\":\"2500\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\":\"Men\",\n" +
            "    \"name\":\"Bermuda Polo\",\n" +
            "    \"image\":\"men_cloth_6\",\n" +
            "    \"currency\":\"$\",\n" +
            "    \"price\":\"200\",\n" +
            "    \"original_price\":\"240\",\n" +
            "    \"category_name\":\"Clothing\",\n" +
            "    \"rating_count\":\"25\",\n" +
            "    \"total_rating\":\"4.5\",\n" +
            "    \"discount\":\"20\",\n" +
            "    \"is_liked\":\"true\",\n" +
            "    \"description\":\"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc sed tellus orci.\",\n" +
            "    \"image_list\":[\n" +
            "      {\n" +
            "        \"image_name\":\"men_cloth_1\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"men_cloth_2\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"men_cloth_3\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"shop\" : {\n" +
            "      \"shop_name\":\"Nike\",\n" +
            "      \"shop_email\":\"template.com\",\n" +
            "      \"shop_phone\":\"+957777777\",\n" +
            "      \"shop_website\":\"rcdev.com\",\n" +
            "      \"shop_address\":\"Avenida churchill\"\n" +
            "    },\n" +
            "    \"view_count\":\"4500\"\n" +
            "  }\n" +
            "]\n"



}

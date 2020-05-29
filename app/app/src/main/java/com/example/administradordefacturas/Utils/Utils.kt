package com.example.administradordefacturas.Utils

import com.example.administradordefacturas.model.Purchase
import com.example.administradordefacturas.model.Store
import com.example.administradordefacturas.model.Tag
import java.util.ArrayList

class Utils {
    companion object {
        fun getTagsTestData(): ArrayList<Tag> {

            val tagList = ArrayList<Tag>()
            tagList.add(Tag("Food",0, 0))
            tagList.add(Tag("Entertainment",0, 0))
            tagList.add(Tag("Drinks",0, 0))

            return tagList
        }

        fun getStoresTestData(): ArrayList<Store> {

            val storeList = ArrayList<Store>()
            storeList.add(Store("Compre Bien", 0))
            storeList.add(Store("Wallmart", 0))

            return storeList
        }

        fun getPurchaseHistoryWithTestData(): ArrayList<Purchase> {
            val storeList = getStoresTestData()
            val purchaseList = ArrayList<Purchase>()
            purchaseList.add(Purchase(storeList.get(0), "2-2-20",35))
            purchaseList.add(Purchase(storeList.get(0), "2-2-20",10))
            purchaseList.add(Purchase(storeList.get(1), "2-2-20",35))
            return
        }
    }
}
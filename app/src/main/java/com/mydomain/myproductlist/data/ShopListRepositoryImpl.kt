package com.mydomain.myproductlist.data

import com.mydomain.myproductlist.domain.Product
import com.mydomain.myproductlist.domain.ShopListRepository

object ShopListRepositoryImpl :ShopListRepository{

    private val shopList = mutableListOf<Product>()

    private var autoIncrementId = 0

    override fun addProduct(product: Product) {
        if (product.id == Product.UNDEFINED_ID) {
            product.id = autoIncrementId++
        }
        shopList.add(product)
    }

    override fun deleteProduct(product: Product) {
        shopList.remove(product)
    }

    override fun editProduct(product: Product) {
        val oldElement = getProductById(product.id)
        shopList.remove(oldElement)
        addProduct(product)
    }

    override fun getProductById(productId: Int): Product {
        return shopList.find {
            it.id == productId
        } ?: throw RuntimeException("Element with id $productId not found" )
    }

    override fun getShopList(): List<Product> {
        return shopList.toList()
    }
}
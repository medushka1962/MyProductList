package com.mydomain.myproductlist.domain

class GetShopListUseCase (private val shopListRepository: ShopListRepository) {
    fun getShopList(): List<Product>{
        return shopListRepository.getShopList()
    }
}
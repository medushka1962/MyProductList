package com.mydomain.myproductlist.domain

class EditProductUseCase(private val shopListRepository: ShopListRepository) {
    fun editProduct(product: Product){
        shopListRepository.editProduct(product)
    }
}
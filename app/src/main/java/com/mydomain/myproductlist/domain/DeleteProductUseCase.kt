package com.mydomain.myproductlist.domain

class DeleteProductUseCase(private val shopListRepository: ShopListRepository){
    fun deleteProduct(product: Product){
        shopListRepository.deleteProduct(product)

    }
}
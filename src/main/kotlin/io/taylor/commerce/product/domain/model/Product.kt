package io.taylor.io.taylor.commerce.product.domain.model

data class Product(
    val id: Long,
    val name: String,
    val price: Long,
    val totalQuantity: Int,
    val soldQuantity: Int = 0,
    val status: ProductStatus = ProductStatus.FOR_SALE
) {
    fun changeStatus(to: ProductStatus): Product = copy(status = to)
}
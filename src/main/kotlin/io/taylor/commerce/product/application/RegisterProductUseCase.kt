package io.taylor.io.taylor.commerce.product.application

import io.taylor.io.taylor.commerce.product.domain.model.Product
import io.taylor.io.taylor.commerce.product.domain.model.port.ProductRepositoryPort
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class RegisterProductUseCase(
    private val productRepo: ProductRepositoryPort
) {
    @Transactional
    fun register(name: String, price: Long, quantity: Int): Product {
        val product = Product(name = name, price = price, totalQuantity = quantity)
        return productRepo.save(product)
    }
}
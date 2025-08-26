package io.taylor.io.taylor.commerce.product.api

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/products")
class ProductController (
    private val register: RegisterProductUseCase,
    private val getProduct: GetProductUseCase,
    private val changeStatus: ChangeStatusUseCase
){
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody @Valid req: CreateProductRequest): ProductResponse =
        ProductResponse.from(register.register(req.name, req.price, req.quantity))


}
package apitestbsale

import grails.transaction.Transactional

@Transactional
class ProductService {

    def list() {
        return Product.getAll()

    }

    def findAllByCategory(int categoryInstance){
        return Product.findAllByCategory(categoryInstance)
    }
}

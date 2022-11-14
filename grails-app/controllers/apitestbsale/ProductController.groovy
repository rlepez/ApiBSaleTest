package apitestbsale

import grails.converters.JSON
import grails.transaction.Transactional

@Transactional
class ProductController {
    def productService

    def index() {}

    def listProduct(){
        def lista=productService.list()
        render (text:[lista:lista] as JSON,contentType: 'application/json')
    }

    def listProductByCategory(){

        def lista=productService.findAllByCategory(2)
        render (text:[lista:lista]as JSON,contentType: 'application/json')

    }
}

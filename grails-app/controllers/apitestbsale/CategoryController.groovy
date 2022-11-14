package apitestbsale

import grails.converters.JSON
import grails.transaction.Transactional

@Transactional

class CategoryController {
    def categoryService

    def index() { }

    def listCategory(){

        def lista=categoryService.list()
        render (text:[lista:lista] as JSON,contentType: 'application/json')
    }

}

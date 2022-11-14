package apitestbsale

import grails.transaction.Transactional

@Transactional
class CategoryService {

    def list() {
        return Category.getAll()
    }

}

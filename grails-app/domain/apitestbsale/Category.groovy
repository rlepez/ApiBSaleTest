package apitestbsale

class Category {
    String name

    static constraints = {
        name nullable:true

    }
    static mapping = {
        version false
    }
}

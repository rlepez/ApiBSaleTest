package apitestbsale

class Product {
    String name
    String urlImage
    Double price
    int discount
    int category

    static constraints = {
        name nullable: true
        urlImage nullable: true
        price nullable: true
        discount nullable:true
        category nullable:true

    }
    static mapping = {
        version false
    }
}

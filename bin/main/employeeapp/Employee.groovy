package employeeapp


class Employee {
    String first_name
    String last_name
    String address1
    String address2
    String zipcode
    String city
    String state

    static constraints = {
        first_name(nullable:false)
        last_name(nullable:false)
        address1(nullable:false)
        address2(nullable:false)
        zipcode(nullable:false)
        city(nullable:false)
        state(nullable:false)
    }

    static mapping = {
        table 'employee'
        address1 column:'address1', type:'text'
        address2 column:'address2', type:'text'
        zipcode column:'zipcode', type:'text'
        city column:'city', type:'text'
        state column:'state', type:'text'
        version false
    }
}

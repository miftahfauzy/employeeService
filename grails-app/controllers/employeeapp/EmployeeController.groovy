package employeeapp


import grails.rest.*
import grails.converters.*

class EmployeeController extends RestfulController {
    static responseFormats = ['json']
    EmployeeController() {
        super(Employee)
    }
}

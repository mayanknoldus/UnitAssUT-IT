package com.knoldus.validator

import com.knoldus.db.CompanyReadDto
import com.knoldus.models.Employee

class EmployeeValidator {

  val employeeobj = new CompanyReadDto
  val emailvalidobj = new EmailValidator

  def employeeIsValid(employee: Employee): Boolean =
    if(employeeobj.companies.contains(employee.companyName) /*exits*/ && emailvalidobj.emailIdIsValid(employee.emailId)) true
    else false


}

package com.knoldus.validator

import com.knoldus.db.CompanyReadDto
import com.knoldus.models.Employee

class EmployeeValidator {

  val companyReadDto = new CompanyReadDto
  val emailValidator = new EmailValidator

  def employeeIsValid(employee: Employee): Boolean = {
    if(companyReadDto.getCompanyByName(employee.companyName).isDefined && emailValidator.emailIdIsValid(employee.emailId))true
    else false
  }
}

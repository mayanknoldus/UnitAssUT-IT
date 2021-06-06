package com.knoldus.validator

import com.knoldus.db.CompanyReadDto
import com.knoldus.models.Company

class CompanyValidator {

  val companyReadDto = new CompanyReadDto
  val emailValidator = new EmailValidator
  def companyIsValid(company: Company): Boolean = {

    if(companyReadDto.getCompanyByName(company.name).isEmpty && emailValidator.emailIdIsValid(company.emailId)) true
    else false
  }
}

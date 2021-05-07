package com.knoldus.validator

import com.knoldus.db.CompanyReadDto
import com.knoldus.models.Company

class CompanyValidator {

  val companyObj = new CompanyReadDto
  val emailvalidobj = new EmailValidator

  def companyIsValid(company: Company): Boolean = {
    if(companyObj.companies.contains(company.name)/*does not exits*/) false
    else {
      if(emailvalidobj.emailIdIsValid(company.emailId) == true/*ifemailvalid*/) true
      else false
    }
  }
}

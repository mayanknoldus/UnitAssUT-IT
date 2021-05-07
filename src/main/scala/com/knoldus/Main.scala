package com.knoldus

import com.knoldus.db.CompanyReadDto
import com.knoldus.validator.{CompanyValidator, EmployeeValidator}
import com.knoldus.models.{Company, Employee}
import com.knoldus.request.CompanyImpl

object Main {

    def main(args: Array[String]): Unit = {

    val first = new CompanyReadDto
    val second = new CompanyValidator
    val third = new EmployeeValidator

//    println(first.companies("Knoldus"))
//      println("\n")
    //println((first.getCompanyByName("Knoldus")))
//      println("\n")
//      println(first.companies.contains("Knoldus"))
//      println(first.companies.contains("Knolduss"))
//      println("\n")
//    println(first.knoldusCompany)
    println(second.companyIsValid( Company("Knoldusss", "@gmail.com", "Noida")))

    println(third.employeeIsValid( Employee("May","Ver",22,40000,"Software Consultant","Knoldus","mayank.verma@knoldus.com")))
  }

}

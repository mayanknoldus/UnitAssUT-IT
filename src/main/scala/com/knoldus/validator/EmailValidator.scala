package com.knoldus.validator

class EmailValidator {

  def emailIdIsValid(emailId: String): Boolean = if ("""^[-a-zA-Z0-9!#$%&'*+/=?^_`{|}~]+(\.[-a-z0-9!#$%&'*+/=?^_`{|}~]+)*@([a-z0-9]([-a-z0-9]{0,61}[a-z0-9])?\.)*(com|net|org|[a-z][a-z])$""".r.findFirstIn(emailId) == None)false else true

  //("""^[A-Za-z-._0-9!#$%^&*+?]*@(([-a-zA-Z0-9]{1,61})?\.)*(com|net|org)$""".r.findFirstIn(emailId) == None)false else true
}

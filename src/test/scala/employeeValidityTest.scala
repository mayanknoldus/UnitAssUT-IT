import com.knoldus.db.CompanyReadDto
import com.knoldus.models.{Employee}
import com.knoldus.validator.{EmailValidator, EmployeeValidator}
import org.mockito.MockitoSugar.{mock, when}
import org.scalatest.flatspec.AnyFlatSpec

class EmployeeValidityTest extends AnyFlatSpec{

  val sampleEmployee: Employee = Employee("Mayank","Verma",22,500000,"fgdf","Knoldus","mayank@knoldus.com")
  val mockedCompanyReadDto: CompanyReadDto = mock[CompanyReadDto]
  val mockedEmailValidator: EmailValidator = mock[EmailValidator]

  "employee" should "be valid" in{
    val employeeValidator = new EmployeeValidator

    when(mockedCompanyReadDto.getCompanyByName(sampleEmployee.companyName).isDefined && mockedEmailValidator.emailIdIsValid(sampleEmployee.emailId)) thenReturn true

    assert(employeeValidator.employeeIsValid(sampleEmployee))
  }

  "employee" should "be invalid" in{
    val employeeValidator = new EmployeeValidator

    when(mockedCompanyReadDto.getCompanyByName(sampleEmployee.companyName).isDefined && mockedEmailValidator.emailIdIsValid(sampleEmployee.emailId)) thenReturn false

    assert(!employeeValidator.employeeIsValid(sampleEmployee))
  }

}

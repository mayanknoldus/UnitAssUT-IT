import com.knoldus.db.CompanyReadDto
import com.knoldus.models.Company
import com.knoldus.validator.{CompanyValidator, EmailValidator}
import org.mockito.MockitoSugar.{mock, when}
import org.scalatest.flatspec.AnyFlatSpec

class CompanyValidityTest extends AnyFlatSpec {

  val sampleCompany: Company = Company("Knoldus", "knoldus@gmail.com", "Noida")
  val mockedCompanyReadDto: CompanyReadDto = mock[CompanyReadDto]
  val mockedEmailValidator: EmailValidator = mock[EmailValidator]

  "company" should "be valid" in{
    val companyValidator = new CompanyValidator

    when(mockedCompanyReadDto.getCompanyByName(sampleCompany.name).isEmpty && mockedEmailValidator.emailIdIsValid(sampleCompany.emailId)) thenReturn true

    assert(companyValidator.companyIsValid(sampleCompany))
  }

  "company" should "be invalid" in{
    val companyValidator = new CompanyValidator

    when(mockedCompanyReadDto.getCompanyByName(sampleCompany.name).isEmpty && mockedEmailValidator.emailIdIsValid(sampleCompany.emailId)) thenReturn false

    assert(!companyValidator.companyIsValid(sampleCompany))
  }

}

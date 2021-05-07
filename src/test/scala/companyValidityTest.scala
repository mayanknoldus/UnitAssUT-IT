import com.knoldus.models.Company
import com.knoldus.validator.CompanyValidator
import org.scalatest.flatspec.AnyFlatSpec

class companyValidityTest extends AnyFlatSpec{

  "companyValidityTest" should "verify if company is valid or not" in {

    val companyValidityObj = new CompanyValidator
    assert(companyValidityObj.companyIsValid(Company("KnoldusSoftware", "knoldus@gmail.com", "Noida")) == true)

  }

}

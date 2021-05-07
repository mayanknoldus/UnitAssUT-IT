import com.knoldus.validator.EmailValidator
import org.scalatest.flatspec.AnyFlatSpec

class emailValidityTest extends AnyFlatSpec{

  "emailValidityTest" should "Verify if the emailId or not" in {

    val emailValidityObj = new EmailValidator
    assert(emailValidityObj.emailIdIsValid("MaYank!$&verma1999@gamil.com") == true)

  }
}

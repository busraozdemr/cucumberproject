@web @login
Feature: Web - Login

  Scenario: Web - Login Success Scenario
    Given YS User open the Login Page
    And YS User try to login
      | username                | password |
      | busraozdmr.80@gmail.com | B.c.1993 |
    Then YS User should logged-in

    ####################################################################################################################

  Scenario Outline: Web - Login Fail Scenarios
    Given YS User open the Login Page
    And YS User try to login
      | username   | password   |
      | <username> | <password> |
    Then YS User have fail message "Hatalı giriş. Lütfen kullanıcı adı ve şifrenizi kontrol edip tekrar deneyiniz." at Login Page

    Examples:
      | username                | password |
      | testfail                | B.c.1993 |
      | busraozdmr.80@gmail.com | testfail |
      | testfail                | testfail |

    #####################################################################################################################

  Scenario: Web - Login Fail Scenarios with fail case for report
    Given YS User open the Login Page
    And YS User try to login
      | username | password |
      | testfail | B.c.1993 |
    Then YS User have fail message "Hatalı giriş." at Login Page

@web @myFavorite
Feature: Web - Added Favorite Restaurant

  Scenario:AddedFavoriteRestaurant - Added Favorite Restaurant Success
    Given YS User open the Login Page
    And YS User try to login
      | username                | password |
      | busraozdmr.80@gmail.com | B.c.1993 |
    Then YS User should logged-in
    And YS User close banabi popup
    And YS User choose location "Merkez (Şirinevler Mah.)"
    And YS User search "döner"
    And YS User click first restaurant
    And YS User click added my favorite restaurant
    Then YS User should have "Favorilerden Çıkar"
    And YS User click exit my favorite restaurant
    Then YS User should have "Favorilere Ekle"

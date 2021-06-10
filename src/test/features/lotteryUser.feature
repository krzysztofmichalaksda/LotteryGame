Feature: Sprawdz poprawnosc danych dla uzytkonika
  Jako uzytkownik,
  chce wprowadzic swoje poprawne dane,
  aby moc odebrac ewentualna nagrade

  Scenario Outline: Uzytkownik wprowadza puste dane
    When wprowadzam do programu imie "<imie>"
    And wprowadzam do programu nazwisko "<nazwisko>"
    Then program powinien zwrocic informacje "Niepoprawne dane"
    Examples:
      | imie      | nazwisko |
      |           | Nowak    |
      | Jan       |          |

  Scenario Outline: Uzytkownik wprowadza poprawne dane
    When wprowadzam do programu imie "<imie>"
    And wprowadzam do programu nazwisko "<nazwisko>"
    Then program powinien przywitac mnie jako "<imie> <nazwisko>"
    Examples:
      | imie      | nazwisko  |
      | Jan       | Nowak     |
      | Krzysztof | Michalak  |
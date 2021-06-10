Feature: Filtrowanie ofert pracy po specjalizacji
  Jako użytkownik niezalogowany,
  chcę sortować oferty pracy po specjalizacji,
  aby przeglądać oferty pracy wyłącznie dla danej specjalizacji

  Background: zainicjuj środowisko testowe
    Given w bazie pracuj znajdują się oferty pracy dla testera
    And w bazie pracuj znajdują się oferty pracy dla programisty
    And jestem wylogowany z aplikacj

  Scenario Outline: Filtrowanie ofert pracy po specjalizacji w Oferty pracy IT
    When otwieram stronę pracuj.pl
    And klikam na zakładkę "Oferty pracy IT"
    And klikam na "Więcej" w obszarze Specjalizacji
    And klikam na specjalizację <spec1>
    Then powinienem widzieć oferty pracy dla specjalizacji <spec1>
    And nie powinienem widzieć ofert pracy dla specjalizacji <spec2>
    Examples:
    | spec1       | spec2       |
    | tester      | programista |
    | programista | tester      |

  Scenario: Filtrowanie ofert pracy po specjalizacji dla testera ze strony głównej
    When otwieram stronę pracuj.pl
    And klikam na "IT - Rozwój oprogramowania" w najpopularniejszych ofertach
    And klikam na specjalizację "Tester oprogramowania"
    Then powinienem widzieć oferty pracy dla testera
    And nie powinienem widzieć ofert pracy dla programisty

#  Scenario: Filtrowanie ofert pracy po specjalizacji dla testera - 3 osoba
#    Given w bazie pracuj znajdują się oferty pracy dla testera
#    And w bazie pracuj znajdują się oferty pracy dla programisy
#    And użytkownik jest wylogowany z aplikacji
#    When użytkownik otwiera stronę pracuj.pl
#    And użytkownik klika na zakładkę "Oferty pracy IT"
#    And użytkownik klika na "Więcej" w obszarze Specjalizacji
#    And użytkownik klika na specjalizację "tester"
#    Then użytkownik powinien widzieć oferty pracy dla testera
#    And użytkownik nie powinien widzieć ofert pracy dla programisty





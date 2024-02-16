Adapter to wzorzec projektowy, który umożliwia współpracę klas o niekompatybilnych interfejsach.
W przypadku konwersji plików XML do JSON możemy stworzyć adapter,
który dostosuje interfejs parsera XML do interfejsu oczekiwanego przez klasę obsługującą JSON.
Stosuje się go również gdy chcemy ponownie wykorzystać wiele istniejących podklad, którym brakuje jakiejś wspólnej funkcjonalności
niedającej się dodać do ich nadklasy.

W tym przykładzie użyłem biblioteki org.json, która dostarcza narzędzia do konwersji danych JSON i XML w języku Java.
## Задание 2

### Урок 2. Принципы ООП Абстракция и интерфейсы. Пример проектирования

Реализовать класс Market и все методы, которые он обязан реализовывать.
Методы из интерфейса QueueBehaviour, имитируют работу очереди, MarketBehaviour – помещает и удаляет человека из очереди

Формат сдачи: ссылка на гитхаб проект
____

## Задание 3

 — Создать класс Поток, содержащий в себе список УчебныхГрупп и реализующий интерфейс Iterable. 

— Создать класс StreamComparator, реализующий сравнение количества групп, входящих в Поток.

___

## Задание 4

Создайте обобщенный класс ***Book < T >***, который представляет книгу в библиотеке. Каждая книга должна содержать параметр типа ***T*** для ее названия.

Создайте обобщенный класс ***LibraryCard<K, V>***, который представляет библиотечную карточку для определенной книги. Каждая карточка должна содержать параметры типов ***K*** для номера карточки и ***V*** для информации о книге.

Создайте класс Library, который будет представлять библиотеку. У этого класса должны быть методы для добавления книг и выдачи библиотечных карточек.

Добавьте метод для вывода информации о всех выданных книгах с их библиотечными карточками.

## Задание 5


— Создать класс TeacherView с функцией создание и возвращения всех учителей.
___ 


## Задание 6

S - Принцип единственной ответственности (Single Responsibility Principle):
Добавьте новый класс OrderLogger, который будет отвечать только за логирование информации о заказах. Теперь класс Order будет отвечать только за размещение заказа, а OrderLogger - за запись логов.

O - Принцип открытости/закрытости (Open/Closed Principle):
Добавьте новый метод calculateDiscount() в класс Customer, который будет рассчитывать скидку для заказов. Это позволит расширить функциональность класса без изменения его исходного кода.

L - Принцип подстановки Барбары Лисков (Liskov Substitution Principle):
Создайте класс Square, который наследуется от класса Rectangle. Убедитесь, что все методы, работающие с Rectangle, также корректно работают с Square, не изменяя их поведения.

I - Принцип разделения интерфейса (Interface Segregation Principle):
Создайте интерфейсы Driveable и Flyable. Реализуйте их в соответствующих классах Car и Airplane. Теперь классы Car и Airplane зависят только от интерфейсов, которые они используют.

D - Принцип инверсии зависимостей (Dependency Inversion Principle):
Создайте абстракцию Logger, которая будет иметь методы для логирования различных типов сообщений. Затем создайте классы FileLogger и DatabaseLogger, реализующие эту абстракцию. Теперь классы, которые требуют логирования, будут зависеть только от Logger, а не от конкретных реализаций.


## Задание 7

Создать проект калькулятора комплексных чисел (достаточно сделать сложение, умножение и деление).
Применить при создании программы архитектурные паттерны, добавить логирование калькулятора.
Соблюдать принципы SOLID, паттерны проектирования.

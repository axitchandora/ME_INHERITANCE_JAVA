# ME_INHERITANCE_JAVA

>A Project Repository for Inheritance Byte in Java

#### Summary of Inheritance

-   **Why** is it useful? - It helps separate out common functionality and fields so that they can be reused across many other classes cleanly. Avoids code redundancy.
-   **Where** to apply? - In the code base when different objects need to share common fields and functionality.
-   **How** to apply? - Define a parent class with all shared functionalities & child classes that inherit these from the parent class.
-   **What** is the drawback if we don’t use inheritance? - Code duplication, Higher maintenance cost.

  

#### Types of Inheritance

-   [Types of Inheritance](https://www.studytonight.com/cpp/types-of-inheritance.php)

-   Single inheritance
-   Multiple inheritance
-   Hierarchical inheritance
-   Multilevel inheritance
-   Hybrid inheritance

#### Practical Scenarios

-   Java Collections is a good example of application of inheritance.

![image](https://raw.githubusercontent.com/axitchandora/Personal-Stuff/main/Images/ME_INHERITANCE_JAVA_MODULE_BYTE_image_20.png?token=GHSAT0AAAAAABTQZSL6LIHYXIYIDE2RR4KEYUD6RHA)

-   Java Exceptions is among one of the notable Class hierarchies displaying the effective use of inheritance.

  

![image](https://raw.githubusercontent.com/axitchandora/Personal-Stuff/main/Images/ME_INHERITANCE_JAVA_MODULE_BYTE_image_21.png?token=GHSAT0AAAAAABTQZSL6GLV6ENZV64TNT7PKYUD6RMQ)

  

#### General rules of Inheritance

-   A class (child class) can extend another class (parent class) by inheriting its features.
-   Implements the DRY (Don’t Repeat Yourself) programming principle.
-   Improves code reusability.

#### Inheritance vs Composition

-   Composition is another way to reuse code from another class. It is achieved by creating a class containing instances of other classes that implement the desired functionality, rather than inheritance from a base or parent class.
-   Further Reading:- [Inheritance Vs Composition (veerpalbrar.github.io)](https://veerpalbrar.github.io/blog/2021/06/30/Inheritance-vs-Composition)

#### Encapsulation and Abstraction vs Inheritance

-   Encapsulation and Abstraction are helpful to develop and maintain a big codebase.
-   When there are similar objects in this big codebase that share common functionality, the common functionality and fields can be separated out into a separate base class which is then inherited by child classes.

# Part 1
## Assesment 1
- Modules must not have access modifiers
- A protected method can be accessed by a reference of a subclass outside the parent package
- Autoboxing is not applied in lambda parameters.

## Chapter 1
- The **JDK** contains the minimum software that we need to do *Java* development.
    - `javac`
    - `java`
    - `jar`
    - `javadoc`
    - *APIs*
- The JRE does no longer eixst in *Java 11*
- *Java 11* came out in **September, 2018**
- *Long Term Supoort (LTS)* versions are released every trhee years and Non-LTS are supported only for six months.
- These are the **8 benefits of Java (OEPRSSMB)**:
    - Object Oriented
    - Encapsulation
    - Platform Independent
    - Robust
    - Simple
    - Secure
    - Multi-thread
    - Backward compatibility
- **Classes** are the basic building blocks of *Java* programs
- An **object** is a runtime instance of a class in memory
- All the various objects of all different classes represent the **state of the program**
- A **reference** is a variable that points to an object
- Java classes have two primary elements **(members of the class)**:
    - Fields: Hold the state of an object
    - Methods: Operate on the state
- Other building blocks are enums and interfaces
- A **keyword** is a word with special meaning for the language
- The method name and the parameter types are the **method signature**
- **Method declaration** consists of additional information such as the return type
- There are 3 types of comments:
    - Single-line
    - Multiple-line
    - Javadoc
- In a file with more than one class, at most one class can be `public`
- If a file contains a public class, the class name must match the file name
- A java program begins its execution in its `main()` method
- The `main()` method lets the *JVM* call our code; is a gateway between the startup of a *Java* process and the beggining of our code.
- **Bytecode** consists of instructions that the *JVM* know how to execute
- The keyword `static` bind a method/field to its class, so it can be called by just the class name
- Use `void`as the return type of methods that change an object's state.
- There are three ways to declare the arguments in the main method:
    1. `String[] args`
    2. `String args[]`
    3. `String... args`
- The characters **...** are called *varargs (variable arguments list)*
- An **array** is a fixed-size list of items that are all of the same type
> Since Java 11 you can run a program without compliling it  first (without executing javac). Just by passing the java file name to the `java` command.
> Differences with the traditional way of compiling:
> 1. For programs with one file
> 2. Can only import code that comes with the *JDK*
> 3. Fully in Memory (does not generate `.class` file)
- If your program has more than 2 `.java` files, you still have to execute `javac` first.
- Imports are a way of using code writeen by others
- A package is a logical grouping for classes
- Import statements tell Java which packages to look in for classes
- Usin the wildcard `*` does not slow down your programs
- The package `java.lang` is automatically imported
- `Files` and `Paths` are both in package `java.nio.file`
- **You can only have one wildcard and it must be at the end**
- One of the reasons of using packages is so that class names do not have to be unique
- When a class is found in multiple classes Java gives you a compilation error
- **An explicit import of a class name takes precedende over any wildcard**
- Use the option `-d` (in *javac*) to place the generated `.class` files in a directory different from the source code directory.
- Use the class path option to tell Java where to look for classes
    - -cp
    - -classpath
    - --clas-path
- You can add *jars* and folders to the class path. `java -cp ".:/jars/jarFile.jar:/folder"`
- Command to create a *JAR* with files from the current directory `jar -cvf myFile.jar`
- Options for the command `jar`:
    - -create, -c
    - -verbose, -v
    - -file, -f
    - -C directory. Directory is the folder containing the files to be used to create the JAR file
- Comments are allowed anywhere in the source code (.java files)
- The order of declaring a class is PIC:

| Element | Required | Place
| -- | -- | -- |
| Package Declaration | No | First line in the file |
| Import statements | No | After package, if present |
| Class declaration | Yes | After the imports, if any |
| Field declaration | No | Anywhere inside a class |
| Method declaration | No | Anywhere inside a class |

## Chapter 2
- A **constructor** is a special type of method that creates an object
- Code block is code between/inside the braces
- Instance initializers are code blocks that appear outside of methods
- Order of initialization
    1.  Fields/instance initializers (In the order they appear)
    2.  Constructor
- Java programs contain two kinds of data:
    1.  Primitive types (8 built-in)
    2.  Reference types
- A primitive does not represent an object. It is just a value in memory, such as a number or a character.

- The 8 built-in primitives

| Keyword | Size | Range of values
| -- | -- | -- |
| boolean | true, false | |
| byte	| 8-bit integral value | -128 to -127 |
| short | 16-bit integral value | |
| int | 32-bit integral value | |
| long | 64-bit integral value | |
| float | 32-bit floating-point value | |
| double | 64--bit floating-point value | |
| char | 16-bit unicode | |

- A float requires an *f* after the number
- All numeric types are signed. That means that they reserve one of their bits to cover a negative range.
- A **literal** is a number present in the code. Literals of type `long` need the letter 'L' at the end
- Java allos you specify digits in these formats:
    1. Octal `0259`
    2. Hexadecimal `0x14F0` or `0X14F0`
    3. Binary `0b101` or `0B101`
- You can have underscores in numbers in order to make them easy to read
> You can not use underscores:
> - At the beginning neither at the end of a literal
> - Right after the decimal point
> - Right before the decimal point
- You can place multiple undersocres next to each other
- A **reference type** refers to an object (an instance of a class)
- A reference points to an object by storing the memory address where the object is located
- A value is assigned to a reference in one of two ways:
    1. It can be assigned to another object of the same or compatible type
    2. A new object using the operator `new`
- *Differences between reference and primitive types?*.
    - Reference types can be assigned `null`
    - Reference types can be used to call methods
    - Primitives have lower case type name
- A **variable** is a name for a piece of memory that stores data. Initialize a variable means to give it a value
- An **identifier** is a name of a:
    1. Variable
    2. Method
    3. Class
    4. Interface
    5. Enum
    6. Package
> Rules for valid identifiers:
> - Can beggin with a letter, a symbol `$`, or a symbol `_`
> - Can include numbers but not start with them
> - A single undersocre is not allowed
> - Cannot use the same name as a java reserved word

- A semicolon (;) separates statements in Java
- A **local variable** is a variable defined within a constructor, a method, or an initializer block
- Local variables do not have a default value and must be initialized before use
- Constructor/method parameters are local variables that have been pre-initialized
- An **instance variable** (a field) is a value defined within an specific instance of an object
- **Class variables** are defined on the class level and shared among all instances of the class. A variable is a class variable if it has the keyword `static` in its declaration
- Instance and class variables are initialized with default values: **null for objects and 0/false for primitive types**
- In **local variable type inference** the compiler determines the type for you
- `var`  can only be used with local variables
- The value for a `var` can change after it is declared but the type never does.
- For local variable type inference, the compiler only looks at the line with the declaration
- The initial value, that is used to determine the type, needs to be part of the same statement.
- All the types declared in a single line must be the same type and share the same declaration.
- VAR is not allowed in multiple variable declarations.
- VAR cannot be initialized to null
- You can assign VAR to NULL if it has been properly initialized first and the type inferred is an object.
- Naming a local variable _var_ is legal because it is not a reserved word.
- A **reserved type name** cannot be used to define a type such as a _class, enum, or interface._
- Rules for var:
    1. A var is used as a local variable in a constructor, method, or initializer block
    2. A var cannot be used in constructor/method parameters, instance variables, or class variables
    3. A var is always initialized on the same line where it is declared.
    4. The value of var can change, but the type cannot.
    5. A var cannot be initialized with a `null` value without a type.
    6. A var is not permitted in a multiple-variable declaration.
    7. A var is a reserved type name but not a reserver word, meaning it can be used as an identifier except as a class, interface, or enum name.
- Each block of code has its own scope
- All java objects are stored in your program memory's heap.
  **- Garbage collector** refers to the process of automatically freeing memory on the heap by deleting objects that are no longer reachable in your program.
- `System.gc()` is not guaranteed to run or do anything
- An object is no longer reachable when:
    - There are no references pointing to the object
    - All reference to the object have gone out of scope
- `finalize()` is not in the exam an it is deprecated since Java 9. It can run cero or one time.

### Exam Essentials
- Be able to recognize a constructor
- Be able to identify legal and illegal declarations and initialization
- Be able to use `var` correctly
- Be able to determine where variables go into and out of scope
- Know how to identify when an object is eligible for garbage collection.

## Chapter 3
- Three flavors of operators ar available in Java:
    1. Unary
    2. Binary
    3. Ternary

| Operator | Symbol |
| -- | -- |
| Post-unary | `expr++`, `expr--` |
| Pre-unary | `++expr`, `--expr` |
| Other unary | `-`, `!`, `+`, `~`, `(type)` |
| Multiplication/Division/Modulus | `*`, `/`, `%` |
| Addition, Substraction | `+`, `-`|
| Shift | `<<`, `>>`, `>>>` |
| Relational| `<`, `>`, `<=`, `>=`, `instanceof` |
| Comparision | `==`, `!=`|
| Logical | `&`, `^`, `|` |
| Short-circuit logical | `&&`, `||` |
| Ternary | `() ? : `|
| Assignment | `=`, `+=`, `-=`, `*=`, `/=`|

- If two operators have the same level of precedence, then Java guarantees, left-to-right evaluation
- You cannot apply a negation operator (`-`) to a boolean expression
- You cannot apply a logical complement operator (`!`) to a numeric expression
> Numeric promotion rules:
> 1. If two values have different data types, Java will promote one of the values, to the larger of the two data types.
> 2. If one of the values is integral an the other is floating-point, Java will promote the integral value to te floating-point value's data type
> 3. Smaller data types (byte, short, char) are first promoted to `int` every time they are used with binary arithmetic operators even if neither of the operands is `int`
> 4. After all promotions are ocurred and all the operands have the same data type, the resulting value will have the same data type as its promoted operands.

- **Casting** is an unary operator where the data type is explicitly interpreted as anoter data type
- Casting is required when you are going from a larger numerical data type to a smaller numerical data type or from floating-point to an integral value.
- In compund operators (+=, -=, *=, /=), casting is done automatically
- The result of an assignment is an expression
- Wen comparing two primitive types, if the numeric values are of different types, the values are promoted
- The equality opeator can be used to (You cannot mix and match types):
    1. Compare numeric values
    2. Compare boolean values
    3. Compare objects (null, and String included)
- **Relatioonal Operators** compare two expressions and return a boolean
- `a instanceof b` returns true if the that `a` points to is an instance of a class, subclass, or class that impelements the interface, as named in `b`
- **Using `null` on the right side of `instanceof`  does no compile**
- Calling `null` on the null literar or a null reference always returns false
- Logical operators (&, |, ^) can be applied to numerical and boolenan data types
- Exlusive OR is true only when the two operands are different
- There is no requirement that second an third expressions in a ternary operator have the same data type

### Exam Essentials
- Be able to write code that uses Java operators
- Be able to recognize which operators are associated with which data types
- Understand when casting is required or numeric promotion occurs
- Understand java operator precedence
- Be able to write code that uses parenthesis to override operator precedence

## Chapter 4
- A java **statement** is a complete unit of execution terminated with a semicolon (;)
- A **control flow statement** breaks up the flow of execution by using decision-making, looping, and branching, allowing the application to selectively execute a particular segment of code.
- A **block of code** is a group of zero or more statements between balanced braces
- In the **switch** statement, parenthesis and braces are required. **Case, break, and default** are optioonal
- The **switch variable** can be:
    1. An `int` or those values that can be promoted to `int` (byte, short, char, int) and their wrapper classes.
    2. Enums
    3. Strings
    4. `var` if te type resolved is supported by switch.
- The **switch variable** does not allow **boolean, long, float, and double,**
- **If you leave out the break statement, flow will continue to the next preceding case or default block automatically**
- Case and default can be in any order
- The type of the case must match the type of the switch variable
- The values in each case statement must be compile-time constants values ie:
    - Literals
    - Enums
    - Final constants
    - Expressions
- **Final constant** means that t he variable must be marked final and initialized with a literal value in the same expression in which it is declared.
- Switch statements supports numeric promotion that does no require explicit casting
- While loop is often used in places where you expect zero or more executions of the loop
- A **do/while** loop guarantees that the block of code will be executed at leas once
> When you are using any repetitive structure make sure that they alwayw terminate.
- There are two type of loops:
    1. Basic *for* loop
    2. Enhanced for loop (for-each loop)
- The right side of a *for-each* loop must be:
    1. A java array
    2. An object whose type implements `java.lang.Iterable`
- A `var` might also be used in the left side of a *for-each* loop
- A **label** is a pointer to the head of an statement that allows the application flow to jum to it or break from it
- **if, switchn, and loops** can have optional labels
- Labels follow the same rules of identifiers
- **Continue** ends the current iteration of a loop
> Any code placed inmediately after break, continue, return, in the same block is considered unreacable and will not compile.

### Exam Essentials
- Understand **if** and **else** control statements
- Understand **switch** statements and their proper usage
- Understand **while** loops
- Be able to use **for** loops
- Understand how **break**, **continue**, and **return** can change the flow control.

## Chapter 5
- A **string** is basically a sequence of characters
- A string does not need to be instantiated with the operator `new`
- String implements `CharSequence`
- Rules for concatenation:
    1. If both operands are numeric, then `+` means numeric addition
    2. If either operand is a *String*, then `+` means concatenation
    3. The expression is evaluated left to right
- *String* is inmutable. **Inmutable classes in java are final**.
- Methods of String for the exam:
    - lenght()
    - char charAt(int index)
    - *idexOf(String str)*
    - *idexOf(String str, int fromIndex)*
    - *idexOf(int ch)*
    - *idexOf(int ch, int fromIndex)*
    - *String substring(int beginIndex)*
    - *String substring(int beginIndex, int endIndex)*
    - *toUpperCase(), toLowerCase()*,  only affect letters
    - *equals(Object obj), equalsIgnoreCase(Object obj)*
    - *startsWith(String prefix), endsWith(String sufix)*
    - *replace(char oldChar, char newChar)* replace all ocurrences
    - *replace(CharSequence target, CharSequence replacemente)*, replaces all ocurrences
    - *strip(), stripLeading(), stripTrailing()*, support unicode
    - *trim()*, remove withspaces, tabs, new lines, from the beggining and end
    - *intern()*

- Ways to create a *StringBuilder*
    - new StringBuilder()
    - new StringBuilder("Hello")
    - new StringBuilder(100)
- Method from StringBuilder:
    - Same as String: charAt(), indexOf(), length(), substring()
    - append()
    - insert(int offset, String str)
    - delete(int start, int end)
    - deleteCharAt(int index)
    - reverse()
    - toString()
    - replace(int start, int end, String str): Deletes the characters from start until the character before end and finally inserts the string at the start index.
- The **StringBuilder class does not override the method equals()**
- If a class does not override the method `equals()`, the default behaviour is similar to the operator `==`
- The type of the two operrands of the *object reference equality* operator must be compatible
- The **string pool** is a location in the JVM that contains string literals and constants that appear in you program
- An **array** in an area of memory in the heap with space for a designated number of elements
- Ways to create an array: *// Create flashcard*
```java
int[] numbers = new int[3]; // elements in the array are initiallize to its default value
int[] numbers = new int[]{1, 2, 3};
int[] numbers = {1, 2, 3}; // anonymous array
```
- You can type `[]` before or after the array name and adding space is optional
- Methods for arrays from `java.util.Arrays`:
    - `sort()`
    - `binarySearch()`: If the searched element does not exist, it returns a negative number, one smaller that its corresponding index.
    - `compare()`: Both arrays have to be of the same type.
    - `mismatch()`: Returns -1 if both arrays are equal. Otherwise returns the first index where they differ.
- Rules for camparing two arrays:
    - If all the elements are the same but the second array has extra elements, return a negative number
    - If all the elements are the same but the first array has extra elements, return a positive number
    - If the first element that differs is smaller in the first array, return a negative number
    - If the first element that differs is smaller in the second array, return a positive number
- What does small mean?
    - `null` is smaller than any other value
    - For strings `"1"` is smaller if it is a prefix of any other string
    - For strings and chars, numbers are smaller than letters
    - For strings and chars, upper case letters are smaller than lowercase
- Ways to create an `ArrayList`:
```java
new ArrayList<>();
new ArrayList<>(100); // with initial capacity
new ArrayList<>(anotherList); // with the values from another list
``` 

- When using `var` with the diamond operator, the type of the elements in the `ArrayList` is `Object`
- `ArrayList` overrides the method `toString()`
- Methods in `ArrayList`:
```java
boolean add(E element);
boolean add(int index, E element);

boolean remove(Object object);
E remove(int index); // returns the removed element
void clear();

E set(int index, E newElement); // returns the element replaced/updated

boolean contains(Object object);
```

- The method `ArrayList.caontains()` calls the `equals()` method on each element of the *ArrayList*
- You use the `equals()` method to compare whether two elements contain the same elements in the same order
- Methods of the wrapper classes:
    - `parseXXX(String str)`. To get a primitive from an string
    - `valueOf(String str)`.  To convert from an string to a wrapper class
- **Autoboxing** is when you write a primitive type and the compiler automatically converts it to the corresponding wrapper class for you. **Unboxing** is the opposite.
- Methods to convert from *ArrayList* to array
```java
Object toArray();
E toArray(E[] array);
```

- Methods to convert from array to *List*

```java
List<E> Arrays.asList(E[] backedArray); // A list backed by the given array.
List<E> List.of(E[] array): // Returns an inmutable list
```

- `TreeSet` is used when sorting is important.
- An index in a set does not make sense because order is not important
- The method `Set.add(E element)` returns false if the element already exists

### Exam Essentials
- Be able to determine the output of code using *String*
- Be able to determine the output of code using *StringBuilder*
- Understand the difference between `==` and `equals()`
- Be able to determine the output of code using arrays
- Be able to determine the output of code using *ArrayList*


## Chapter 6 - Lambdas an Functional Interfaces
- A **lambda expression** is a block of code that gets passed around. They are like methods, without a name, that you can pass as if they were variables.
- Lambda syntax:
    - Parenthesis are optional only when there is only one parameter and it does not have its type declared
    - We can omit braces when we have only a single statement
    - Java does not require you to type *return* or use a semicolon when no braces are used
- A **functional interface** has only one abstract method
- Standard functional interfaces:
```java
Predicate:	boolean test(T t)
Consumer:	void accept(T t)
Supplier:	T get()
Function:	R apply(T t)
Comparator	int compare(T t1, T t2)
```

- Most of the standard functional interfaces are in the package `java.util.function`
- In lambdas, variables can appear in these places:
    1. Parameter list
    2. Local variables inside the lambda body
    3. Variables referenced from the lambda body
- A lambda infers the type from the surrounding context
> A lambda block with a local variablel, is a good hint that you should extract that code into a method.
- A variable is **effectively final** if its value does not change after it is set (regardless of whether it is marked as *final*)
- Rules for accesing a variable from a lambda body inside a method:
    - Instance and static variables are allowed
    - Local variables and method parameters, are allowed if they are effectively final
    - Lambda parameters are allowed
- A lambda can define parameter or variables in the body as long as their names are different from existing local variables.


### Exam Essentials
- Write simple lambda expressions
- Identify common functional interfaces
- Identify wheter a variable can be used in a lambda body
- Use common APIs with lambdas

## Chapter 7 - Methods and Encapsulation
- Method name and parameter list are the method signature
- Syntax for defining a method:
```
access_modifier specifier(optional) return_type name params exceptions
```

- Optional specifiers for methods:
    1. *static* - used for class and methods
    2. *abstract* - used when a method body is not provided
    3. *final* - used when a method is not allowed to be overriden
    4. *syncronized*
    5. *native*
    6. *strictfp* - used for making floating point calculaltion portable

- You can have multiple specifiers in the same method, but not all combinations are legal.
- A **varargs** parameter must be the last element in the method's parameter list. And only one *varargs* parameter per method is allowed.
- When calling a method with a varargs parameter you can pass in an array.
- Accessing a varargs parameter is just like accessing an array
- **Static methods** have two main purposes:
    1. Utility or  helper methods that do not require any object state.
    2. For state that is shared by all instances of a class
- You can access a static variable/method using an instance variable. Java does not care if the instance variable happens to be null.
- An static member cannot call an instance memeber without referencing an instance of the class.
- All the static initializers are run when the class is first used in the order they are defined
- You getn a compilation error if you try to explicitly do an static import of two static members with the same name.
- **Method overloading** occurs when methods have the same name but different parameters
> A method with an array parameter  and a method with a varargs parameter have the same signature, so the following overloading does not compile:
```java
	void fly(int[] lengths) {}
	void flly(int... lengths) {}
```
- Java tries to use the most specific parameter list it can find
- Java will not automatically convert to a narrower primitive type.
```java
	// At compile time these methods are the same
	void walk(List<String> strings) {}
	void walk(Liste<Integer> integers) {} // DOES NOT COMPILE
```
- However type erasure does not apply for arrays
```java
	// A valid overloading
	void walk(int[] ints) {}
	void walk(Integer[] integers) {}
```
- The order that java uses to choose the right overloaded method:
    1. Exact match
    2. Larger primitive type
    3. Autoboxed types
    4. Varargs
- Java does only one convertion in method overloading. Java converts from `int` to `Integer` but it will not convert the `Integer` to a `Long`
- **Encapsulation** refers to preventing callers from changing the instance variables directlly.


### Exam Essentials
- Be able to identify correct and incorrect method declarations
- Identify when a method or field is accesible
- Recognize valid and invalid uses of static imports
- State the output of code involving  methods
- Recognize the correct overloaded method
- Identify properly encapsulated classes.

## Chapter 8 - Class Design
- **Inheritance** is the process by which a sublcass automatically includes any *public/protected* members of its parent class
- Package-private members are available if the child class is in the same package as the parent
- It is possible to prevent a class from being extended by marking the class with the modifier: **final**
- **Top level classes** can be only either *public* or *package-private*
- A top level class is a class that is not defined inside another class
- An **inner-class** is a class defined inside of another class. They can have the access modifiers: *public, protected, package-private- and private*
- The **this** keyword refers to the current instance of the class. Can be used to acces any member of the class, including inherited members.
- The keyword `this` can be used in:
    - Instance methods
    - Constructors
    - Instance initializer blocks
- We use the **super** keyword to reference the parent version of a method/varialbe that is defined in a child class and also in the parent class. The member must be accesible via inheritance.
- A **constructor** is a special method that matches the name of the class and has no return type.
- The way to call an overloaded constructor is by using `this()`
- Rules for using `this()`
    - Must be the first statement in the constructor
    - Ther can be only one call to `this()` in any constructor
> The first statement in every constructor is either a call to another constructor within the class, using `this()`, or a call to another constructor in the direct parent class, using `super()`.
> The compiler automatically inserts a call to `super()` if you do not explicitly call `this()` or `super()` as the first line of the constructor.
- Rules for instance variables marked with *final*
    - By the moment the constructor finishes, all final variable must be assigned a value, only once.
    - They must be assigned a value in:
        - The line in which they are declared
        - Instance initializer
        - Constructor
    - Default values are not used for final instance variables
    - If a final instance variable is not assigned a value, we get a compilation error at the line where the constructor is declared.
    - We can assign null to a final instance variable
- **Local final variables** are not required to be assigned a value unless they are actually used.
- A **class may be initialized**:
    - When the program starts
    - A static member of the class is referenced
    - Shortly before an instance of the class is created
- A class must be initialized before it is referenced or used
> A class containing the `main()` mehtod is loaded before the `main()` method is executed
- Order of initialization of the class *X*
    - If there is a super class *Y* of *X*, then *Y* is initialized first
    - Process all the static variable declarations in the order they appear
    - Process all static initializers in the order they appera.
> An instance is initialized any time the `new()` operator is used.
- Order of  initialization of aninstance of class *X*
    1. If there is a super class *Y* of *X*, then *Y* is initialized first.
    2. Process all the instance variables in the order they appear.
    3. Process all instance initializers in the order they appear.
    4. Initialize the constructor including any overloaded constructor referenced with `this`
- Constructor rules:
    1. The first statement must be a call to an overloaded constructor with `this`, or a call to a direct parent constructor with `super`
    2. If there is no call to `this()` / `super()`, the compile inserts a a no-arg call to `super()`
    3. Calling `this()` / `super()` after the first line results in a compilation error
    4. If the parent class does not have a no-arg constructor, every constructor in the child class must start with an explicit call to `this()` / `super()`
    5. If the parent class does not have a no-arg constructor and the child does not define any constructor, the child class does not compile
    6. If a class only defines a `private` constructor, then it cannot be extended by a top-level class.
    7. All final instance variable must be assigned a value exactly once by the end of the constructor.
-  Classes can access any *public/protected* member of a parent class, using `this`, `super`, or directly. If the parent class is in the same package as the child class, then the child can acces any *package-private* member of the parent.
- Rules for overriding methods:
    1. The method in the child must have the same signature as the method in the parent
    2. The method in the child must be as accesible as the method in the parent.
    3. The method in the child must not declare any new or broader checked exception. `IOException` is broader than `FileNotFoundException`
    4. If the method returns a value, it must be the same or a subtype of the return type of the method in the parent class.
- You can override a method with generic parameters, but you must match the signature, including the generic type exactly.
- When you are working with overriden methods that return generic types, the generic parameter type must match its parent's type exactly. Covariance does not apply for generic parameter types.
- Generic method cannot be overloading by changing the generic parameter type only.
- Private method cannot be overriden but they can be redeclared in a child class.
- Overriding a method replaces the parent method on all reference variables
- A **hidden method** occurs when a child class defines a static method with the same signature as an inherited static method defined in a parent class.
- Hidden method have the same rules as overriding. Additionally: *The method in the child class must be marked as static if it is marked as static in the parent*
- You can not hide a method if it is marked as *final* in the parent.
- A **hidding variable** occurs when the child class defines a variable with the same name as an inherited variable defined in the parent class
-  Hidding a method/variable replaces the members only if a child reference type is used.
-  **Polymorphism** is the property of an object to take on many different forms
-  A java object may be accessed:
    1. Using a reference with the same type as the object
    2. Using a reference that is a super class of the object
    3. Using a reference to an interface that the object implements either directly or through a super class
> Only the variales/methods available to the reference type are callable on the object without an explicit cast
- Object vs Reference rules:
    1. The type of the object determine which properties exist within the object in memory.
    2. The type of the reference to the object determines which methods/variables are accesible to the Java program
- Rules for casting objects:
    1. Casting reference from subtypes to supertypes does not require explicit casting
    2. Casting a reference from a supertype to a subtype requires explicit casting.
    3. The compiler disallows casts of unrelated classes
    4. At runtime, an invalid casting of a reference to an unrelated type results in `ClassCastException`
- The `instanceof` operator is used to check wheter an object belongs to a particular class or interface and to prevent `ClassCastException` at runtime. It cannot be used with unrelated types
> Polymorphism staties that when you override a method, you replace all calls to it, even those defined in the parent class
> Hidding is very sensitive to the reference type and location where the member is being used.
- Do not hide members in practice
- The following parts can acess the special reference variables `this` and `super`:
    - Instance methods
    - Constructors
    - Instance initializers.

### Exam Essentials
- Be able to write code that extends other classes
- Be able to distinguis and make use of *this, this(), super* and *super()*
- Evaluate code involving constructors
- Understand the rules for method overriding
- Understand the rules for hiding methods and variables.
- Recognize the difference between method overriding and method overloading
- Understand polymorphism
- Recognize valid reference casting


## Chapter 9 - Advanced Class Design
- An **abstract class** is a class that cannot be instantiated and may contain abstract methods.
- An **abstract method** is a method that does not define an implementation when it is declared.
> An abstract class is commonly used when you want another class to inherit properties of a particular class, but you want the subclass to fill in some of the implementation details.
- An abstract class can include the same members as a non-abstract class:
    - Constructors
    - Variables
    - Static and instance methods/initializers
    - Inner classes
- An abstract method can only be declared in an asbstract class or an interface
- The abstract modifier can be placed before or after the access modifier in a class/method declaration
- The `abstract` modifier cannot be placed after the `class` keyword nor after the return type in a method declaration.
- It is possible to mark a method as both `private` and `final`
- Abstract class definition rules:
    1. Abstract classes cannot be instantiated
    2. All top-level types, including abstract classes, cannot be marked protected or private.
    3. Abstract classes cannot be marked final
    4. Abstract classes can include zero or more abstract and nonabstract methods
    5. An abstract class that extends another abstract class inherints all of its abstract methods
    6. The first concret class that extends an abstract class must provide an implementation for all of the inherited abstract mtehods
    7. Abstract class constructors follow the same rules for initialization as regular constructors, except they can be called only as part of the initialization of a subclass.
- Abstract method definition rules:
    1. Abstract methods can only be defined in abstract classes or interfaces.
    2. Cannot be declared `private` or `final`
    3. Must not provide a method body/implementation in the abstract class in which they are declared
    4. Implementig an abstract method in a subclass follows the same rules for overriding a method.
- An interface is always considered *abstract*
- Mehtods, wihtout a body, in an interface are implicitly `public abstract`
- Variables in an interface are implicitly `public static final`
- An interface can extend multiple interfaces.
- An interface can be inherited in one of three ways:
    - An interface can extend another interface
    - A class can implement an interface
    - A class can extend another class wose ancestor implements an interface.
> The fact that a class can implement multiple interfaces limits some of the checks that the compiler can perform.
- **Prefer abstract reference types when defining the type of parameters.**
- The compiler does not allow a cast from an interface reference to an object reference if the object type does not implement the interface.
```java
Canine canine = new Wolf();
Object badDog = (String) canine; // Does not compile
```
- In the **instanceof** operator the compiler can check for unrelated interfaces if the reference is a class that is marked final.
```java
Integer i = 6; // Integer class is final

if (i instanceof List) {} // Does not compile
```
- Interface declaration rules:
    1. Cannot be instantiated
    2. Top-level interfaces cannot be marked protected or private
    3. Are assumed to be abstract and are not allowed to be marked as final
    4. May include zero or more abstract methods
    5. Can extend any number of interfaces
    6. An interface reference can be cast to any reference that inherits the interface, although this may produce an exception at runtime if the classes are not related
    7. The compiler only reports an unrelated type error for an instanceof operation with an interface on the right side if the reference on the left side is a final class that does not inherit the interface.
    8. An interface method with body must be marked as *default, private, static, or private static*
- Abstract interface method rules (Same as in abstract methods in abstract classes)
    1. Interface methods without a body are assuemd to be abstract and public
- Interface variable rules
    1. Variables are assumed to be *public, static and final*
    2. They must be initialized with a value when they are declared
- Differences between abstract classes and interfaces:
    - Interface include implicit modifiers
    - Interfaces do not include constructors
    - Interfaces support multiple inheritance
    - Interfaces do not contain state
- A **member innner class** is a class defined at the member level of a class (the same level as methods, instance variables, and constructors)
> Define an inner class inside another class if the relationship between the two classes is very close
- A member inner class can be defined with any of the access modifiers: public, protected, private-package, private
- Static member are disallowed in member inner classes
- The top-level class can manage the life-cycle of the member inner class.

### Exam Essentials
- Be able to write code that creates and extends abstract classes.
- Be able to write code that creates, extends, and implements interfaces.
- Know the implicit modifiers that the compiler will automatically apply to an interface.
- Distinguish between top-level and inner classes/interfaces and know which access modifiers are allowed.

## Chapter 10 - Exceptions
- An **exception** indicates something unexpected happened. It is an event that alters the program flow.
- Key exception classes: *Throwable, Exception, Error, RuntimeException*
- `Error` means something went so horrible wrong that your program should not attempt to recover from it.
- A **checked exception** is an exception that must be declared or handled by the application code where it is thrown. It tend to be more anticipated.
- An **unchecked exception** is any exception that does not need to be declared or handled by the application code where it is thrown. They include any class than inherits `RuntimeException.java` or `Error.java`. Tend to be unexpected but not necessarily fatal.
- The reserved word `throw` is used in code blocks and `thorws` is only used in a method declaration.
- `RuntimeException` can be trhown by the programmer or the JVM
- Some unchecked exceptions:
    1. ArithmeticException
    2. ArrayIndexOutOfBoundsException
    3. ArrayStoreException
    4. ClassCastException
    5. MissingResourceException
    6. NullPointerException
    7. IllegalArgumentException (Programmer)
    8. IllegalStateException
    9. NumberFormatException (extends IllegalArgumentException)
    10. UnsupportedOperationException
- Checked exceptions have `Exception.java` in their hierarchy but not `RuntimeException.java`
- Some checked exceptions:
    - IOException
    - FileNotFoundException (extends IOException)
- Errors are unchecked exceptions that exted the class `Error.java`. They are thrown by the JVM and should not be handled nor declared
- Some errors:
    1. ExceptionInInitializerError
    2. StackOverflowError
    3. NoClassDefError
- Try statements require braces even if they consists only of one statement
- Only classes that extend `Throwable` can appear in the throws part of a method declaration
- A method that declares an exception isn’t required to throw one
- A compiler error occurs *(about unreachable code)*, when a superclass catch block appears before a subclass catch block:
```java
try {

} catch(IOException ex) {

} catch(FileNotFoundException ex) {
	// DOES NOT COMPILE: Unreachable code
}
```
- An variable exception defined by the catch statement is only in scope for that catch block
- A **multicatch block** allows multiple unrelated exception types to be caught by the same catch block.
```java
try {

} catch (Exception1 | Exception2 ex) {

}
```
- There can be only one exception variable per multicatch block and it must be at the end
- The multicatch must be used for exceptions that are unrelated
- The order does not matter for multicatch blocks withing a single catch exception
- The **finally** claluse is alway run at the end regardless of whether an exception is thrown
- The finally block is executed shortly before the method completes. It interrupts the return statement from inside both `try` and `catch` blocks.
- While a finally block will alway be executed it may not finish
> When `System.exit()` is called in the try or catch blocks, the finally block does not run
- **The compiler replaces a try-with-resources block with a try/finllay block**
- Syntax of **try-with-resources**:
```java
// Semicolon between resource declaration, last semicolon is optional
// Each resource must include its data type.
// You can use var as the type of a resource.
try (InputStream in = new InputStream; var os = new OutputStream()) {

}
// Catch and finnally are optional. A finally exists implicitly
```
- The implicit `finally` block runs before any `finally` and `catch` block written by the programmer
- Java requires classes used in the `try-with-resources` implement the `AutoClosable` interface.
- The resources created are only in scope withing the try block.
- Rules for the order in which code runs:
    1. Resources are closed after the try block ends and before any `catch` or `finally` block.
    2. Resources are closed in the reverse order from which they were created.
- There are 3 ways to print an exception.
    1. Let java print it out (on the exam.)
    2. Print only the message
    3. Print where the stack trace comes from.
- **If both, catch and finnaly throw an exception, the one from finally gets thrown**

### Exam Essentials
- Understand the various types of exceptions
- Differentiante between checked and unchecked exceptions
- Understand the flow of a `try` statement
- Be able to follow the order of a `try-with-resources` statement
- Identify wheter an exception is thrown by the programmer or the JVM
- Write methods that declare exceptions
- Recognize when to use `throw` versus `throws`

##  Chapter 11 - Modules
- The **Java Platform Module System (JPMS)** was introduced in *Java 9* to group code at a higer level.
- The main purpose of **modules** is to provide groups of related packages to offer a particular set of functionality to developers
- The JPMS includes:
    - A format for module JAR files
    - Partitioning of the JDK into modules
    - Additional command-line options for Java tools
- A **module** is a group of one or more packages plus a special fila called `module-info.java`
- Benefits of the JPMS:
    1. *Better access control*: Act as a fifth level of access. Modules can expose packages within the modular JAR to only other specific packages.
    2. *Clearer dependency management*: Each project specifies all its dependencies in the file `module-info.java`
    3. *Custom Java builds*: We can create a smaller runtime image that is customized to what the app needs and nothing more
    4. *Improved performance*
    5. *Unique package enforcement*: A package is only allowed to be supplied by one module
- Differences betwen a java class file and a module-info file:
    1. module-info must be in the rood directory of you module, java classes should be in packages
    2. module-info must use the reserved word `module` instead of `class, interface, enum`
    3. Module name follows the same rules as package names. It often includes periods. Dashes are not allowed
- Commonly a directory named `mods` exists, to store the modules artifacts. It is at the same level of the module
- You can thing of `--module-path` as a replacement for the classpath option, when you are working on modular programs
- Compile a module
```sh
javac --module-path mods -d dir classesToCompileIncludingModulesInfo
```
- Run a modular program:
```sh
java --module-path mods --module module.name/package.ClassName
java -p	mods -m module.name/package.ClassName
```
- It is possible to version your module using the option `--module-version`
- Package a module:
```sh
jar -cvf mods/module.name.jar -C module_dir/
```
- The **exports** keyword is used to indicate that a package can be used by code outside of the module
- Without the exports, a module can be only run via command-line by its own
- The **requires** keyword indicates that a module is needed.
- A package must have at least one class in order to be exported
- The keywords can appear in any order in the modules-info file
- Export package to an specific module:
```sh
exports package.name to module.name
```
- The exports keywords give us these extra level of access:
    - *protected*: Accesible, outside the module, to subclasses only if package is exported
    - *public*: Accesible, outside the module, only if package is exported
- The **requires transitive** means that any module that depends on this module will also depend on another module.
```java
requires transitive module.name
```
- Java does not allow you to repeate the same module in a requires clause
- The **provides** keyword specifies that a class is an implementation for a service
```java
provides service.name with service.implementation
```
- The **uses** keyword indicates that a module is relaying on a service
- The **open** keyword is used for allowing the use of reflection on this module.
- The `java` command-line has these options to work with modules:
    1. `--describe-module` (`-d`) - Pints info about a module
    2. `--list-modules` - List modules that are available
    3. `--show-module-resolution` - Shows modules when running a program
- The `java.base` module is automaticaly added as a dependency to all modules
- The `jar` command can describe a module
```sh
jar --file mods/module.name.jar --describe-module
jar -f mods/module.name.jar -d
```
- The **jdeps** command-line gives you information about the dependencies withing a module. Looks into the code in addition to the *modules-info* file. It tells you what dependencies are actually used.
```sh
jdeps -summary mods/module.name.jar
jdeps -s mods/module.name.jar
# Complete output
jdeps mods/module.name.jar
```
- We need to indicate the module path when the module depends on other modules different from the ones in the JDK
- **There is no shor version for --module-path in the jdeps command**
- **JMOD files** are recommended when you have native libraries or something that can't go inside a JAR file
- The **jmode command** is used for working with JMOD files
- These are the made operations of the jmod command:
    - create
    - extract
    - describe
    - list
    - hash
- Options for the `javac` command

| Options | Desc |
| -- | -- |
| -cp, -classpath, --class-path path | Location of JARs in a nonmodular program |
| -d dir | Directory to place the generated class files |
| - p, --module-path path | Location of JARs in a modular program |

- Options for the `java` command

| Options | Desc |
| - | - |
| - p, --module-path path | Location of JARs in a modular program |
| -m, --module-name name | Module name to run |
| -d, --describe-module | Describes the details of a module |
| --list-modules |  List observable modules without running the program |
| --show-module-resolution | Shows modules when running a program |

- Options for the `jar` command

| Options | Desc |
| - | - |
| -c, --create | Create a new JAR file |
| -v, --verbose  | Prints details when working with JAR files |
| -f, --file | JAR file name |
| -C | Directory containing files  to be used to create the JAR file |
| -d, --describe-module |  Describes the details of a module |

- Options for the `jdeps` command

| Options | Desc |
| - | - |
| --module-path path | Location of JARs in a modular program |
| -s, -summary | Summarizes output |

### Exam Essentials
- Identify benefits or the Java Platform Module System
- Use command-line syntax with modules
- Create basic module-info files.
- Identify advanced module-info keywords
- Display information about modules

### Learnings from evaluation
- The module-info can be empty
- The keyword `requires` must be followed by a module name, and not a package name
- The java command has an `--add-exports` option that allows exporting a package at runtime. However, it is not encouraged to use it
- Directory can have a `.` in their names.
- Dashes are not allowed in packages names nor classes names
- A module claims the packages underneath it.
- Module names look a lot like package names. Each segment is separated by a period (.) and uses characters valid in Java identifiers. `com.book$` is a valid module name

# Part 2
## Chapter 12 - Java Fundamentals
- Marking a *variable final* means its value cannot be changed after it is assigned
- Marking a *method final* means it cannot be overriden
- Marking a *class final* means it cannot be extended
- A *static final variable* must be assigned a value when it is declared or in an static initializer.
- The compiler does not allow the use of a *local variable* that may not have been assigned a value, whether it is marked final or not.
- An **enumeration** is like a fixed set of constants.
- An *enum* can be a top-level type as well as a nested type
- Helper methods in an enum:
    - `name()`
    - `values()`: Returns an array with all the enum values
    - `valueOf(String str)`: Gets an enum value from a *String*
    - `ordinal()`: Returns the position of the enum constant
- Enums cannot be extended
- Enums constants cannot be compared to *int* values
- Semicolon is required if there is anything in the enum besides the constants
- *Immutable Object* is an object that cannot be modified after it is created.
- In the `case` statements you must use only the constat (enum value), without the enum type:
```java
switch(size) {
	case Size.SMALL: //Does not compile
		break;
}
```
- All *enum constructors* are implicitly *private*
- If the enum has an *abstract method*, it means that each enum value is required to implement it.
- We can have a *non-abstract method* and override it only for some of the enum values
- The list of *enum constants* must be declared first
- A *nested class* is a class defined within another class
- There are four flavors of nested classes:
    - *Inner classes*: A non-static type defined at the member  level of a class
    - *Static nested class*:
    - *Local class*: A class defined within the body of a method
    - *Anonymous class*: A special case of local class that does not have a name
- Interfaces and enums can be declared as inner and static nested classes **but not as local or anonymous classes**.
- Way to instantiate an inner class:
```java
Outer outer = new Outer();
Inner inner = outer.new Inner();
```
- Inner classes can have variables with the same name as variables in the outer class
```java
// How to access a variable, declared with the same name, in the outer class
OuterClass.this.variableName;
```
- When you have multiple nested classes you have to declare all of them when defining a reference:
```java
A a = new A();
A.B b = a.new B();
A.B.C c = b.new C();
```
- Inner classes have the following properties:
    1. Can be declared `public`, `protected`, package-private (default), `private`
    1. Can extend any class and implement interfaces
    1. Can be marked abstract or final
    1. Cannot declared static fields or methods, except for `static final` fields.
    1. Can access members of the outer class, induding `private` members
- An *static nested class* cannot acces any instance member in the outer class directly.
- Properties of an *static nested class*:
    1. The nesting creates a namespace because the enclosing class name must be used to refer to it.
    2. Can me made `public`, `protected`, package-private,`private`
    3. The enclosing/outer class can refer to the fields and methods of the static nested class
- Properties of *local classes*:
    1. They do not have an access modifier
    2. They cannot be declared static and cannot declare static fields or methods, except for static final fields.
    3. They have access to all fields and methods of the enclosing class, when defined in an instance method.
    4. They can access local variables if they are final or effectivelly final.
    5. They can be defined in constructors and initializers too.
- Properties of *anonymous classes*
    - They are required to extend an existing class or implement an existing interface.
    - They cannot implement both an interface and extend a class
    - You can define an anonymous class outised of a method body
  ```java
  public class Gorilla {
      interface Climb {}
      Climb climb = new Climb() {} //anonymous class outside of a method
  }
  ```

- Modifiers in *inner classes*:
    - All access modifiers
    - abstract and final
- Modifiers in *static nested classes*:
    - All access modifiers
    - abstract and final
- Modifiers in *local classes*:
    - abstract and final
- *Anonymous classes* cannot have modifiers
- Members in nested classes

| Member | Inner class | static nested class | local class | anonymous class |
|--|--|--|--|--|
| instance methods | Yes | Yes | Yes | Yes |
| instance variables | Yes | Yes | Yes | Yes |
| static methods | No | Yes | No | No |
| static variables | Yes (if final) | Yes | Yes (if final) | Yes (if final) |

- Nested classes access rules

| -  | Inner class | static nested class | local class | anonymous class |
|--|--|--|--|--|
| Can extend any class or implement any number of interfaces | Yes | Yes | Yes | No - Must have on superclass or one interface |
| Can access instance members of enclosing class without a reference | Yes | No | Yes, if in an instance method | Yes, if in an instance method |
| Can access local variable of enclosing method | N/A | N/A | Yes, if final/effectively final | Yes, if final/effectively final |


- An interface can have 6 types of members:
    1. Constant variables
    2. Abstract methods
    3. Default methods
    4. Static methods
    5. Private methods
    6. Private static methods
- A **default method** is a method defined in an interface marked with the *default*  keyword and it includes a method body.
- Default method definition rules
    1. It might be declared whithin an `interface`
    2. Must be marked with `default` and include method body
    3. Is assumed to be `public`
    4. Cannot be marked `abstract`, `final`, nor `static`
    5. It may be overriden by a class that implements the interface
    6. If a class inherits to two or more *default* methods with the same method signature, then the class must override the method
- If a class implements 2 or more interfaces that have default methods with the same signature, the compiler reports an error.
- We can call the *default method* for an specific interface:
```java
	InterfaceName.super.defaultMethodName();
```
- Static Interface Method Definition Rules
    1. Must include the *static* keyword and include a method body
    2. A *static method* without an acess modifier is assumed to be public
    3. Cannot be markef *abstract* nor *final*
    4. It is not inherited and cannot be accessed in a class implementing the interface without a reference to the interface name.
- A class that implements two interfaces containing static methods with the same signature, will still compile.
- Private and private static methods were introduced in Java 9.
- Private Interface Mehod Definition Rules
    1. Must be marked with the `private` modifier and include a method body
    2. May be called only by `default` and `private` (non-static) methods within the interface definition
- Private Static Interface Method Definition Rules
    1. Must be marked with the `private` and `static` modifiers and include a method body
    2. May be called only by other methods within the interface definition
- Interface member access

| Member | Accesible from default and private methods | Accessible from static methods | Acessible from instance methods implementing or extending the interface | Accessible outside the interface without an instance of the interface |
|--|--|--|--|--|
| Constant variable | Yes | Yes | Yes | Yes |
| Abstract method | Yes | No | Yes | No |
| Default method | Yes | No | Yes | No |
| Private method | Yes | No | No | No |
| Static method | Yes | Yes | Yes | Yes |
| Private static method | Yes | Yes | No | No |

- Adding the annotation `@FunctionalInterface` to a functional interface is optional
- If a functional interface contains an abstract method with the same signature as a public method found in the class *Object*, then these methods do not count toward the single abstract method test.
- You cannot declare an interface method that is incompatible with *Object*
```java
interface Thing {
	int toString(); // Does not compile
}
```
- Any functional interface can be implemented as a lambda expression
- `() -> {}` is a valid lambda expression. If the return type of the functional interface is `void`, you do not need the semicolon nor the return type.
- `var` can be used in the lambda parameter list. If it is used in one of the parameters, then it must be used for all the parameters in the list
- A lambda infers the types from the sorrounding context
    - The left side of an assignment where the lambda expression is used.
    - Method signature


### Exam Essentials
- Be able to correctly apply the final modifier
- Be able to create an use enum types
- Identify and distinguish between types of nested classes.
- Be able to declare an use nested classes
- Be able to create default, static, private, and private static interface methods
- Determine whether an interface is a functional interface.
- Write simple lambda expressions
- Determine whether a variable can be used in a lamda expression.

### Evaluation
I got 72%. 18 correct, 7 incorrect
- I was not aware of the following way of creating an instance of an static nested class:
```java
public class Lion {
  static class Dan {}
  static void rest() {
    Lion.Dan g = new Lion.Dan();
	var d = new Dan();
  }
}
```
- If an enum has abstract methods, make sure that all of the enum constants/values declarations override them.
- One advantage of private interface method is *Encapsulate interface implementation* because making interface methods private means users of the interface do not have access to them.
- Anoter advantage of default interface methods: *default methods in some APIs offer a number of convenient methods to classes that implement the interface.*
- Effectively final refers to **local variables** whose value is not changed after it is set
- An **anonymous class cannot extend a final class**. Pay attention to inner classes that are final.
- *var* and *final* can be used together
- Inner classes are only allowed to contain *static* variables that are marked *final*
- Pay attention to an interface that extend more than one interface and then inherits abstract methods with the same signature. To compile it should override/implement the method.
- Enum constructors are implicitly *private*
- if a parameter of a lambda uses var, then all of the other paramaters must use var as well.
- In a lambda expression, a return statement is permitted only inside braces

## Chapter 13 - Annotations
### Notes
- **Metadata** is data that provides information about other data. In java, metada provides information about the code but it is not part of the code.
- Java **annotations** are all about metadata. They allow you to add a lot of value to your code. **The purpose of annotations** is to assign metada attributes to classes, methods, variables, and other Java types.
- **Annotations are one of the most convenient tools available in the Java language**
> By using an annotation, we leave the class structure intact.
- Rules about annotations:
    1. Function a lot like *interfaces*.  Allow us to mark a class, as of the type of the interface without changing its inheritance structure.
    2. Establish relationships, that make it easier to manage data about our application.
    3. Assigns custom information on the declaration where it is defined
    4. Are optional metada and by themselves do nothing. They are not utilized where they are defined.
- Steps to create an annotaion:
    1. Assign a name:
  ```java
  public @interface Big {} // An annotation without elements is aka marker annotation
  ```
    1. Define optional an required elements:
  ```java
  public @interface Big {
      int size() default 10; // optional element
      String description(); // required element
  }
  ```
    3. Specify its usage
  ```java
  
  // The following two annotations define the usage of @Big. It can be used only
  // in methods and the metadata is available at runtime.
  @Target(ElementType.Method)
  @Retention(RetentionPolicy.RUNTIME)
  public @interface Big {
      int size() default 10; // optional element
      String description(); // required element
  }
  ```

- An annotation without elements is reffered as a marker annotaion
- When using a marker annotation, parenthesis are optional
- An **annotation element** is an attribute that stores values about the particular usage of an annotation
- Behind the scenes, the JVM creates elements as interface methods and annotations as implementations of these interfaces.
- Any element without a default value is considered required.
- The default value of an annotation element must be a **non-null constant expression** (similar to the value of case statements). *Null is not permitted, but the empty string is.*
- The type of an annotation element must be:
    1. Primitive (Not wrappers)
    2. String
    3. The `Class` type
    4. Enum
    5. An annotation
    6. An array of any of those types.
- Annotation elements are implicityly `public abstract`
- Annotations can include constant variables. These are not considered elements.
- Annotation variables are implicitly `public static final`
- Annotations can be applied to any of those declarations:
    1. Classes (anonymous after the `new` keyword), interfaces, enums, and modules.
    2. Variables (static, instance, local)
    3. Methods and Constructors
    4. Parameters (Methods, Constructors, Lambdas)
    5. Cast expressions `String m = (@Tasty String) "carrot"`
    6. Other annotations
> An annotation can specify which declaration type it can be applied to using the `@Target` annotation.
- Rules for using the **shorthand annotation notation**:
    1. Must contain an element named `value()`, required or optional.
    2. Must not contain any other elements that are required
    3. The annotation usage must not provide values for any other elements
- Tipically the `value()` of an annotation should be related to the name of the annotation.
- Annotations support a shorthand notation for providing an array that contains a single element
```java
@interface Music {
	String[] genres();
}

// These usages are equivalent
@Music(genres = {"Pop"})
@Music(genres = "Pop")
```
- Shorthand notations (value() and array) can be combined
```java
@interface Rythm {
	String[] value();
}

// Usages
@Rythm(value = {"Swing"})
@Rythm(value = "Swing")
@Rythm({"Swing"})
@Rythm("Swing")
```
- Annotation-specific annotations: `@Target, @Retention, @Documented, @Inherited, @Repeatable`
- `@Target` takes an array of `ElementType` enum values as its `value()` element.
- Values of the `@Target` annotation
  | ElementType value | Applies to |
  | -- | -- |
  | 1. TYPE | Classes, interfaces, enums, annotations |
  | 2. FIELD | Instance/static variables, enum values |
  | 3. METHOD | Method declarations |
  | 4. PARAMETER | Constructor, method, and lambda parameters |
  | 5. CONSTRUCTOR | Constructor declarations |
  | 6. LOCAL_VARIABLE | Local variables |
  | 7. ANNOTATION_TYPE | Annotations |
  | 8. PACKAGE | Packages declared in `package-info.java` |
  | 9. TYPE_PARAMETER | Parameterized types, generic declarations |
  | 10. TYPE_USE | Able to be applied anywhere there is a Java type declared or used |
  | 11. MODULE | Modules |

- Standard annotations are placed in the package: `java.lang.annotations`. They are not imported automatically.
- `TYPE_USE` allows annotations in places:
    1. Where types are used
    2. Cast operations
    3. Object creation with `new`
    4. Generic type declarations
```java
// @Techical is annotation annotated with @Target(ElementType.TYPE_USE)
public class NetworkRepair {
	// A type is used
	class OutSrc extends @Technical NetworkRepair {
		public void repair() {
			// Object creation
			var repairSubclass = new @Technical NetworkRepair() {};
			var o = new @Technical NetworkRepair().new @Technical OutSrc();
			// Cast operation
			int remaining = (@Technical int) 10.0;
		}
	}
}
```
- Values for `@Retention`
    1. SOURCE - Used only in the source file, discarded by the compiler.
    2. CLASS - Stored in the *.class* file but not available at runtime (default)
    3. RUNTIME - Stored in the *.class* file and available at runtime.
- When `@Documented`is present, then the generated *javadoc* will include annotation information defined in Java types.
> Javadoc annotations are all lowercase, while Java annotations start with an uppercase letter.
- When an annotation is defined with `@Inherited`, and is applied to a class, subclasses will inherit the annotation information found in the parent class.
- `@Repeatable` is used when you want to scpecify an annotation more than once on a type. Without it, an annotation can be applied only once.
- A **containing annotation type** is a separate annotation that defines a `value()`array element. The type of this array is the particular annotation you want to repeat. By convention the name of the containing annotation is the plural form of the repeatable annotation.
```java
// Containing annotation
@interface Risks {
	Risk[] value();
}

// The annotation that we want to repeat
@Repeatable(Risks.class)
@interface Risk {
	String danger();
	int level default 1;
}
```
- Rules for declaring repeatable annotations:
    1. The repeatable annotation must be declared with `@Repeatable` and contain a value that refers to the containing type annotation
    2. The containing type annotation must contain a required element named `value()`, which is an array of the repeatable annotation type.
- When `@Target` is not present, an annotation can be applied in any place except: `TYPE_USE` and `TYPE_PARAMETER` scenarios (cast operations, object creation, generic declarations, etc.)
- Common annotations:
    1. `@Override` - A marker annotaion used to indicate that a method is overriding an inherited method, wheter it be inherited  from an interface or a parent class
    2. `@FunctionalInterface`
    3. `@Deprecated`
    4. `@SupressWarnings` - Tells the compiler *do not warn me about this*.
    5. `@SafeVarargs` - Indicates that a method does not perform any potential unsafe operations (often involve generics) on its varargs parameters. It can be applied to constructor/methods that cannot be overriden (methods marked *private, static, final*)
- Common `@SupressWarnings` values:
    1. *deprecation* - Ignore warnings related to types/methods marked with `@Deprecated`
    2. *unchecked* - Ignore warnings related to the use of raw types, such as `List` instead of `List<String>`
- Understanding common annotations.

| Annotation | Marker | Type of value()  | Optional members |
| -- | -- | -- | -- |
| @Override | Y | - | - |
| @FunctionalInterface | Y | - | - |
| @Deprecated | N | - | String since(), boolean forRemoval() |
| @SupressWarnings | N | String[] | - |
| @SafeVarargs | Y | - | - |
- Applying common annotations

| Annotation | Applies To | Compiler error when |
| -- | -- | -- |
| @Override | Methods | Method signature does not match the method signature of the inherited method |
| @FunctionalInterface | Interfaces | Interface does not contain a single abstract method |
| @Deprecated | Most Java declarations | - |
| @SupressWarnings | Most Java declarations | - |
| @SafeVarargs | Most Java declarations | Method/constructor does not contain a varargs parameter or is applied to a method not marked private, static, or final |

### Exam Essentials
- Be able to declare annotations with required elements, optional elements, and variables.
- Be able to identify where annotations can be applied
- Understand how to apply an annotation without without an element name
- Understand how to apply an annotation with a single-element array.
- Apply built-in annotations to other annotations
- Apply common annotations to various Java types.

### Evaluation
- `@SafeVarargs` can be used in constructor or any method that includes a varargs parameter and that cannot be overriden, i.e. marked with *private, static, or final*
- The default retention policy is **CLASS**
- Where can annotation defined with `TYPE_USE` can be applied to?

## Chapter 14 - Generics and Collections
### Notes
- A **method reference** is a compact syntax for writing lambdas that refer to methods.
- You can pretend that the compiler turns your method references into lambdas
- The operator `::` is used for deferred execution with a funcional interface
- Functional interfaces:

| # | Functional Interface | Method |
| -- | -- | -- |
| 1 | `Supplier<T>` | `T get()` |
| 2 | `Consumer<T>` | `void accept(T)` |
| 3 | `BiConsumer<T, U>` | `void accept(T, U)` |
| 4 | `Predicate<T>` | `boolean test(T)` |
| 5 | `BiPredicate<T, U>` | `boolean test(T, U)` |
| 6 | `Function<T, R>` | `R apply(T)` |
| 7 | `BiFunction<T, U, R>` | `R apply(T, U)` |
| 8 | `UnaryOperator<T>` | `T apply(T)` |
| 9 | `BinaryOperator<T,T>` | `T apply(T, T)` |

- Types of method references:
    1. Static methods
  ```java
  Consumer<List<Integer>> methodRef = Collections::sort;
  Consumer<List<Integer>> lambda = x -> Collections.sort(x);
  ```
    2. Instance method on a particular instance
  ```java
  var str = "Hello";
  Predicate<String> methodRef = str::startsWith;
  Predicate<String> lambda = s -> str.startsWith(s);
  ```
    4. Instance method on a paramter
  ```java
  Predicate<String> methodRef = String::isEmpty;
  Predicate<String> lambda = s -> s.isEmpty();

  BiPredicate<String, String> methodRef = String::startsWith;
  // The first lambda parameter is the instance object for the instance method.
  // Any other lambda parameter is a method parameter.
  BiPredicate<String, String> lambda = (s, p) -> s.startsWith(p);
  ```
    6. Constructor
  ```java
  Supplier<List<String>> methodRef = ArrayList::new;
  Supplier<List<String>> lambda = () -> new ArrayList<>();
  ```
- The **diamond operator** is a shorthand notation that allows you to omit the generic type from the right side of an assignment when the type can be inferred
- The diamond operator can be used only in the right side of an assignment.
- `var list = new ArrayList<>();` creates a list which contains elements of type `Object`
- A **collection** is a group of objects contained in a single object. The **Java Collections Framework** is a set of classes in `java.util` for storing collections.
- Main interfaces in the *Java Collections Framework* (include diagram):
    - **List**:
        - Ordered collection of elements
        - Allows duplicates
        - Elements can be accesed  by an int index
    - **Set**: A collection that does not allow duplicate entries
    - **Queue**: A collection that order its elements in a specific order for processing
    - **Map**:
        - Maps keys to values
        - Does not allow duplicate keys
        - Its elements are key-value pairs
- Common methods in the `Collection<E>` interface:
    1. `boolean add(E element)`: Inserts a new element into the collection and returns whether it was successful.
    2. `boolean remove(Object object)`: Removes a single matching element in the collection.
    3. `int size()`
    4. `int isEmpty()`
    5. `void clear()`
    6. `boolean contains(Object object)`: Checks wheter a certain value is in the collection. Calls `equals()` on elements to see wheter there are any matches.
    7. `boolean removeIf(Predicate<? super E>)`: Removes all elements that match the given condition.
    8. `void forEach(Consumer<? super E> action)`
- **You use a list when you want an ordered collection that contains duplicate entries**
- An **ArrayList** is like a resizible array. You can look up any element in constant time. Adding/removing an element is slower (linear time) than accesing an element.
- ArrayList is a good choice when you are reading more often than writing to the array list.
- **LinkedList** implements both: `List` and `Queue`.
- You can access/add/remove from the beggining and end of the linked list in constant time
- Dealing with an arbitrary index, in linked lists, takes linear time
- `LinkedList` is a good choice when you will be using it as a `Queue`
- Methods in the `List<E>` interface:

| Method | Desc |
| -- | -- |
| `void add(int index, E element)` | |
| `E get(int index)` | |
| `E remove(int index)` | Removes element at index and returns the removed element.|
| `void replaceAll(UnaryOperator<E> op)` | Replaces each element in the list with the result of the operator.|
| `E set(int index, E element)` | Replaces the element at index and returns the original element.|

- You use a **Set** when you do not want to allow duplicate entries.
- A **HashSet** stores its elements in a hash table. Which means the keys are a hash and the values are an object.
- Adding and checking for elements in a `HashSet` have constant time.
- The trade-off, in a `HashSet` is that you lose the order in which you inserted the elements.
- A **TreeSet** stores its element in a sorted tree structure. The main benefit is that the set is always in sorted order. The trade-off is that adding and checking whether an element exists takes longer than with *HashSet*, specially as the tree grows larger.
- You use a **Queue** when you add an remove elements in an specific order.
- A **LinkedList** is a double-endend queue. You can add/remove elements from both the front and back of the queue
- The main benefit of `LinkedList` is that it implements both `List` and `Queue`. The trade-off is that it is not as effiecient as a pure queue (`ArrayDequeue` is more efficient).
- Queue methods:
  | Name | Desc | Throws exception on failure? |
  | -- | -- | -- |
  | `boolean add(E e)` | Adds an element at the back of the queue and returns true or throws an exception | Yes |
  | `E element()` | Returns next element or throws exception if queue is empty | Yes |
  | `boolean offer(E e)` | Adds an element at the back of the queue and returns wheter successfull | No |
  | `E remove()` | Removes and returns next element or throws exception if queue is empty | Yes |
  | `E poll()` | Removes and returns next element or nulll if queue is empty | No |
  | `E peek()` | Returns next element or returns null if queue is empty | No |

- The most common methods of a queue are: `offer()`, `poll()`, `peek()`.
- You use a **Map** when you want to identify a value by a key.
- A **HashMap** stores the keys in a hash table. Adding/retrieving elements by key has constant time. The trade-off is that you lose the order in which you inserted the elements
- A `TreeMap` stroes the keys in a sorted tree structure. Keys are always in sorted order. The trade-off is that adding/checking wheter a key is present takes longer as the tree grows larger.
- The method `V putIfAbsent(K key, V value)`, sets a value in the Map but skips it if the value is already set to a non-null value.
- The method `merge()` does not calll the bi-function (mapping function) if null values or missing keys are involved. It simply uses the new value. When the mapping function returns null, the key is removed from the Map
- The data structures that invollve sorting do not allow null values
- Numbers sort before letters, and uppercase before lowercase
- You implement `Comparable` when you want your class to be used in data structrues that require comparisions.
- `Comparator` is used to specify that you want to use a different order than the object itself provides.
- Rules of the `int compareTo(T o)`
    1. Return 0 when the current object is equivalent to the given object
    2. Returns a negative number when the current object is smaller than the given object
    3. Returns a positive number when the current object is larger than the given object
- Wrapper classes provide a method to compare two objects.
```java
	Integer.compare(int1, int2);
```
- You must make your `Comparable` classes consistent with the mehtod `equals()`
- A natural ordering that uses `comparteTo()` is said to be consistent with `equals()` if, and only if:
  1.`x.equals(y)` is true whenever `x.compareTo(y)` is 0.
    2. `x.equals(y)` must be false whenever `x.compareTo(y)` is not 0
- Classes that implement `Comparable` are said to have a natural order.
- `Comparator` is used when:
    1. You want to compare objects that do not implement `Comparable`
    2. You want to sort object in different ways at different times
- Comparision of *Comparable* and *Comparator*
    1. The are in different package. Comparable is in `java.lang` and Comparator is in `java.util`
    2. Method name in interface is different. `Comparable.compareTo()` and `Comparator.compare()`
    3. Number of parameters is different: `compareTo(T o)`, `compare(T obj1, T obj2)`
    4. Comparator is commonly declared as lambda.
- Helper methods you should know for building `Comparator`
    1. comparing()
    2. comparingDouble()
    3. comparingInt()
    4. comparingLong()
    5. naturalOrder() - Use the order specified by the *Comparable* implementation on the object
    6. reverseOrder() - Use the reverse of the order specified by the *Comparable* implementation
- Methods that you can chain to a `Comparator` to further specify its behaviour
    1. reversed()
    2. thenComparing()
    3. thenComparingDouble()
    4. thenComparingInt()
    5. thenComparingLong()
- The methods `sort()` and `binarySearch()` allow you to pass in a comparator object when you do not want to use the natural order.
> Collections that require classes to implement *Comparable*, do not check that you have actually implemented Comparable, at compile time
- You can tell collections that require sorting that you want to use an specific comparator
```java
Set<Rabbit> rabbits = new TreeSet<>( (r1, r2) -> r1.id - r2.id);
```
- Comparators let you separate sort order from the object to be sorted.
- **Generic classes** become useful when the classes used as the type parameter are unrelated
- The process of removing the generic syntax from your code is referred to as **type erasure**. It allow your code to be compatible with older versions of Java that does not contain generics
- Limitations of generics:
    1. Calling a constructor
    2. Creating an array of a generic type
    3. Calling `instanceof`
    4. Using a primitive as generic type parameter
    5. Creating a static variable as a generic type parameter
- Most of the limitations have to do with type erasure.
- Types whose information is fully available at runtime are referred to as **refiable**
- In a **generic method** we declare the type parameter before the return type:
```java
public static <T> void prepare(T t) {}
```
- Optional syntax for invoking generic methods
```java
Box.<String>ship("package");
```
- The generic type declared in a method is different/independent of the class generics.
```java
public class Crate<T> {
	public <T> tricky() {
	// The parameter type <T> is different from the one declared at the class 
	}
}
```
- A **wildcard** generic type is an unknown generic type represented with a question mark `?`
- Types of bounds:
  | Type of Bound | Syntax | Example |
  | -- | -- | -- |
  | Unbounded wildcard | ? | `List<?> l = new ArrayList<>();`|
  | Wildcard with an upper bound | ? extends type | `List<? extends Exception> l = new ArrayList<RuntimeException>();` |
  | Wildcard with a lower bound | ? super type | `List<? super Exception> l = new ArrayList<Object>();` |

- An unbounded wildcard represents any data type.
- Generic type cannot just use a sublcass
```java
List<Number> l = new ArrayList<Integer>(); // Does not compile
```
- The **upper bounded wildcard** says that any class that extends a class/interface or the class/interface itself can be used as the formal parameter type.
- When using upper-bounded or unbounded wildcards, the class becomes logically immutable
```java
List<? extends Number> l = new ArrayList<>();  
l.add(Integer.valueOf("10")); // Does not compile
```
- Lower bound can get tricky
```java
List<? super IOException> l = new ArrayList<>();
l.add(new Exception()); // Does not compile
l.add(new IOException());
l.add(new FileNotFoundException());
```

### Exam Essentials
- Translate method references to the long form lambda.
- Use autoboxing and unboxing
- Pick the correct type of collection from a description
- Work with convenience methods from the Collections framework
- Differentiate between `Comparable` and `Comparator`
- Write code using the diamond operator
- Identfify valid and invalid uses of generics and wildcards
### Evaluation
- `List<?>`  means the list is treated as if all the elements are of type Object
- Using the method `removeIf()` on a list created with the factory method `List.of()`, will throw an `UnsuporttedOperationException`
- **Be aware of the paramater names of lambdas, make sure the name is not already used in a local variable**
- Keep track of the types when `var` is used, to spot compilation errors
- The wildcard (?) is not allowed to be on the right side of an assignment
- In assignments that involve generics, the generic type of the right side must match the generic type in the left side. The following does not compile:
```java
List<Exception> list = new LinkedList<IOException>();
```
- `LinkedList` has a method `pop()` which removes the first element in the list
- Be aware of the method used to add elements in a map. Maps have method `put()` and not `add()`
- `HashSet` accepts null
- When using `binarySearch()`, the List must be sorted in the same order that the Comparator uses.
- All methods that extend `Collection` have the method `remove(Object)`

## Chapter 15 - Functional Programming
### Notes
- `Supplier<T>` is used when you want to supply or generate values without taking any input
- You use `Consumer<T>` when you want to do something with a parameter but not return anything
- `Predicate<T>` is often used when you need to do filtering or matching
- A `Funtion<T, R>` is responsible for turning one parameter into a value of a potentially different type and returning it
- A `UnaryOperator<T>` transforms its value into one of the same type. It extends Function
- **Predicate returns a boolean primitive and not a Boolean object**
- Convenient methods in functional interfaces

| Interface | Return type | Method name | Parameters |
| -- | -- | -- | -- |
| Consumer | Consumer | `andThen()` | Consumer |
| Function | Function | `andThen()` | Function |
| Function | Function | `compose()` | Function |
| Predicate | Predicate | `and()` | Predicate |
| Predicate | Predicate | `negaet()` | - |
| Predicate | Predicate | `or()` | Predicate |

- `compose()` method passes along the output of one functional interface to the input of another
```java
Function<Integer, Integer> before = x -> x + 1;
Function<Integer, Integer> after = x -> x * 2;

// Here, before will be executed first
Function<Integer, Integer> combined = after.compose(before);
System.out.println(combined.apply(3)); // prints 8
```

- Think of `Optional` as a box that might have something in it or might instead be empty
- Methods to create an `Optional<T>`
    1. `Optional.empty()`
    2. `Optional.of()`
    3. `Optional.ofNullable()`
- Instance methods of `Optional`:
    - `get()`
    - `ifPresent(Consumer c)`
    - `isPresent()`
    - `orElse(T other)`
    - `orElseGet(Supplier s)`
    - `orElseThrow()` - Throws `NoSuchElementException` if empty
    - `orElseThrow(Supplier s)`
- A **stream** in Java is a sequence of data
- A **stream pipeline** consists of the operations that run on a stream to produce a result
- **Lazy evaluation** delays execution until it is necessary
- The `Stream<T>` interface is defined in the package `java.util.stream`
- Parts of a stream pipeline:
    1. *Source*: Where the stream comes from
    2. *Intermediate Operations*: Transform the stream into another stream. They do not run untile the terminal operation is performed **(they are lazy)**.
    3. *Terminal Operation*: Produces a result. **After it completes, the stream is no longer valid**.
- Methods to create a stream source:
    1. `Stream.empty()`
    2. `Stream.of(varargs)`
    3. `coll.stream()`
    4. `coll.parallelStream()`
    5. `Stream.generate(Supplier s)` - An infinite stream
    6. `Stream.iterate(seed, unaryOperator)` - An infitie stream
    7. `Stream.iterate(seed, predicate, unaryOperator)`
- **You can perform a terminal operation without any intermediate operation** but not the other way around.
- **Reductions** are terminal operations where all of the contents of the stream are combined into a single primitive or object.
- Terminal stream operations:
    1. `count()` return `long`
    2. `min(), max()` return `Optional<T>`
    3. `findFirst(), findAny()` Infinite stream terminates, return `Optional<T>`
    4. `allMatch(), anyMatch(), noneMatch()` Infinite stream sometimes terminates, return `boolean`
    5. `forEach()`
    6. `reduce()`
    7. `collect()`
- The version of `reduce()` with 3 parameters is used when we are dealing with different types.
- An **itermediate operation** returns a new stream as a result
- Intermediate operations:
    1. `filter()`
    2. `distict()`: Returns a new stream with duplicate values removed
    3. `limit()` / `skip()`: Make a stream smaller. They could make a finite stream out of an infinite stream
    4. `map()`
    5. `flatMap()`: Usefult when you want to remove empty elements or you want to combine a stream of lists
    6. `sorted()`: Uses natural order unless we specify a Comparator
    7. `peek()`: Allow us to perform a stream operation without actually changing the stream.
- Types of primitive streams:
    1. IntStream
    2. LongStream
    3. DoubleStream
-  Methods in `IntStream`
    1. `OptionalDouble average()`
    2. `Stream<T> boxed()`
    3. `OptionalInt min()`
    4. `OptionalInt max()`
    5. `IntStream range(int a, int b)`
    6. `IntStream rangeClosed(int a, int b)`
    7. `int sum()`
    8. `IntSummaryStatistics summaryStatistics()`
- Methods in `LongStream`
    1. `OptionalDouble average()`
    2. `Stream<T> boxed()`
    3. `OptionalLong min()`
    4. `OptionalLong max()`
    5. `LongStream range(long a, long b)`
    6. `LongStream rangeClosed(long a, long b)`
    7. `long sum()`
    8. `LongSummaryStatistics summaryStatistics()`
- Methods in `DoubleStream`
    1. `OptionalDouble average()`
    2. `Stream<T> boxed()`
    3. `OptionalDouble min()`
    4. `OptionalDouble max()`
    5. `double sum()`
    6. `DoubleSummaryStatistics summaryStatistics()`
- The `Random` class provides methods to get primitive streams  of random numbers.
- You can map a stream to any other kind of stream.
- `OptionalDouble` is for primitive and `Optional<Double>` is for the `Double` wrapper class
- Primitive streams have the method `summaryStatistics()` which produces:
    1. Smallest number: `getMin()`
    2. Largest number: `getMax()`
    3. Average:	`getAverage()`
    4. Sum:	`getSum()`
    5. Number of values: `getCount()`
- Common functional interfaces for primitives
    1. `DoubleSupplier` / `IntSupplier` / `LongSupplier` - `getAsDouble()` / `getAsInt()` / `getAsLong()`
    2. `DoubleConsumer`/ `IntConsumer`/ `LongConsumer`/
    3. `DoublePredicate`/ `IntPredicate`/ `LongPredicate`
    4. `DoubleFunction`/ `IntFunction`/ `LongFunction`
    5. `DoubleUnaryOperator`/ `IntUnaryOperator`/ `LongUnaryOperator` - `applyAsDouble()` / `applyAsInt()` / `applyAsLong()`
    6. `DoubleBinaryOperator`/ `IntBinaryOperator`/ `LongBinaryOperator` - `applyAsDouble()` / `applyAsInt()` / `applyAsLong()`
- A few intermediate operations of Stream are available for `Optional`
- Chaining calls to `flatMap()`, in `Optional`, is useful when you want to transform one optional type to another optional type.
- Examples of grouping/partitioning collectors
    1. `averagingDouble(ToDoubleFunction f)` / `averagingInt(ToIntFunction f)` / `averagingLong(ToLongFunction f)` - Returns `double` when passed to `collect()`
    2. `count()` - Returns `long`
    3. `groupingBy(Function f)` / `groupingBy(Function f, Collector dc)` / `groupingBy(Function f, Supplier s, Collector dc)` - Returns `Map<K, List<T>>`
    4. `joining(CharSequence delimiter)` - Returns a `String`
    5. `minBy(Comparator c)` / `maxBy(Comparator c)`  - Returns `Optional<T>`
    6. `mapping(Function f, Collector dc)` - Returns a `Collector`
    7. `partitioningBy(Predicate p)` / `partitioningBy(Predicate p, Collector dc)` - Returns `Map<Boolean, List<T>>`
    8. `summarizingDouble(ToDoubleFunction f)` / `summarizingInt(ToIntFunction f)` / `summarizingLong(ToLongFunction f)` - Returns `DoubleSummaryStatistics` / `IntSummaryStatistics` / `LongSummaryStatistics`
    9. `summingDouble(ToDoubleFunction f)` / `summingInt(ToIntFunction f)` / `summingLong(ToLongFunction f)` - Returns `Double` / `Integer` / `Long`
    10. `toList()` - Returns an arbitrary type of `List`
    11. `toSet()` - Returns an arbitrary type of `Set`
    12. `toCollection(Supplier s)` - Returns a `Collection` of the specified type
    13. `toMap(Function k, Function v)` / `toMap(Function k, Function v, BinaryOperator m)` / `toMap(Function k, Function v, BinaryOperator mergeFunction, Supplier mapTypeSupplier)` - Returns a `Map`
- When collecting to a `Map` you have to specify two functions:
    1. The first function tells the collector how to create the key
    2. The second function how to create the value
- The `groupingBy()` tells the collector that it should group all of the elements of the stream in a `Map`. The function determines the key. Each value is a `List` of all the elements that match that key.
- `partitioningBy()` is a special case of grouping. With partitioning there are  only two possible groups: `true` and `false`. It is like splitting a llist into 2 parts.
- `mapping()` adapts a collector accepting elments of type `U` to one accepting elements of type `T`, by applying a mapping function to each element befor accomulation.
### Exam Essentials
- Identify the correct functional interface given the number of parameters, return type, and method name. And vice versa
- Write code that uses `Optional`
- Recognize which operation cause a stream pipeline to execute
- Determine which terminal operations are reductions
- Write code for common intermediate operations
- Compare primitive streams to `Stream<T>`
- Convert primitive stream types to other primitive stream types.
- Use `peek()` to inspect a stream
- Search a stream
- Sort a stream
- Compare `groupingBy()` and `partitioningBy()`

### Evaluation
- Befor cally `collect(Collectors.groupingBy())`, make sure the stream is not a stream of primitives.
- `average()` in primitive streams returns `OptionalDouble`
- `Collectors.joining()` expects to get a `Stream<String>`.
- `Stream.iterate(1, x -> x++)` returns a stream where al elements are `1`. If we use `++x` , we get `1, 2, 3, 4, ...`
-



## Chapter 16 - Exceptions and Localization
### Notes
- Examples of checked exceptions
    1. `IOException`
    2. `FileNotFoundException`
    3. `SQLException`
    4. `NotSerializableException`
    5. `ParseException`
- When we want to force callers to deal with a situation/exception we use **checked exceptions**
- If we do not want to force the caller to deal with things that might remotely happen, we use *unchecked exceptions*
- You can use these common constructors to pass more information in your custom exceptions:
    1. Super constructor that takes an exception
    2. Super constructor that takes a string (error/exceptio message)
- A **stack trace** shows the exception along with the method calls it took to get there
- *try-with-resources* is also known as **automatic resource management**
- Resources declared within a `try-with-resource` statement are in scope only within the `try` block
- It is possible to use resources declared prior the `try-with-resources`  statement as long as they were marked `final` or they are *effectively final*.
- When multiple exceptions are thrown, all but the first are called **suppressed exceptions**
- Java remembers the *suppressed exceptions* that go with a primary exception even if we do not handle them in the code.
- *Suppressed exceptions* only apply to the exceptions thrown in the try clause.
- Which are the date and time types:
    1. `java.time.LocalDate`
    2. `java.time.LocalTime`
    3. `java.time.LocalDateTime`
    4. `java.time.ZonedDateTime`
- Common date and time symbols:
  | # | Symbol | Meaning | Example |
  | -- | -- | -- | -- |
  | 1 | y | Year | 20, 2020 |
  | 2 | M | Month | 1, 01, Jan, January |
  | 3 | d | Day | 5, 05 |
  | 4 | h | Hour | 9, 09 |
  | 5 | m | Minute | 45 |
  | 6 | s | Second | 52 |
  | 7 | a | a.m. / p.m. | AM, PM |
  | 8 | z | Time Zone name | Eastern Standard Time, EST |
  | 9 | Z | Time Zone offset | -0400 |
- There are two ways to format a date/time
```java
var dateTime = LocalDateTime.of(2020, Month.OCTOBER, 20, 16, 15, 30);
var formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss");

System.out.println(dateTime.format(formatter));
System.out.println(formatter.format(dateTime));
```
- **In a formatting string, you can scape text by sorrounding it with a pair of single quotes**. Two single quotes without text, prints one quote.
- **Internacionalization** is the process of designing your program so it can be adapted to different languages and regions.
- **Localization** means to support multiple locales or geographic regions.
- You can think of a locale as being like a language and country pair.
- The `Locale` class is in the package `java.util`
- The format of a locale is: `en_US`, `languagecode_COUNTRYCODE` where language code is lower case and required. The country code is upper case and optional.
- Three ways to create a `Locale`
```java
//1. Use predefined constants
Locale.GERMAN // de
Locale.GERMANY // de_DE

// 2. Use the Locale`s constructor
new Locale("fr");
new Local("es", "MX");

// 3. Use a builder
new Locale.Builder()
	.setRegion("US")
	.setLanguage("en")
	.build();
```

- Use `java.text.NumberFormat` to apply a format to a number.
- Factory methods to get a `NumberFormat`
```java
// 1. A general purpose formatter
NumberFormat.getInstance();
NumberFormat.getInstance(locale);
NumberFormat.getNumberInstance();
NumberFormat.getNumberInstance(locale);

// 2. For formatting monetary amounts
NumberFormat.getCurrencyInstance();
NumberFormat.getCurrencyInstance(locale);

// 3. For formatting percentages
NumberFormat.getPercentInstance();
NumberFormat.getPercentInstance(locale);

// 4. Rounds decimal values before displaying
NumberFormat.getIntegerInstance();
NumberFormat.getIntegerInstance(locale);
```
- Once you have an instance of `NumberFormat` you can call the method `format()` to convert a number into a String or `parse()` to turn an String into a Number.

> The format classes are not thread-safe. You must not store them in instance/static variables.

- Make sure you parse a String with the correct `Locale`
- `DecimalFormat` symbols:
    - `#` - Omit the position if no digit exists for it: $2.2
    - `0` - Put a 0 in the position if no digit exists for it: $002.20
```java
// Example of the use of DecimalFormat symbols
double d = 1234567.467;
NumberFormat f1 = new DecimalFormat("###,###,###.0");
System.out.println(f1.format(d)); // 1,234,567.5

NumberFormat f2 = new DecimalFormat("000,000,000.00000");
System.out.println(f2.format(d)); //001,234,567.46700

NumberFormat f3 = new DecimalFormat("$#,###,###.##");
System.out.println(f3.format(d)); // $1,234,567.47

```
- Factory methods to get a `DateTimeFormatter`
```java
// For formatting dates
DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);

// For formatting times
DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL);

// For formatting dates and times
DateTimeFormatter.ofLocalizedDateTime(dateStyle);
DateTimeFormatter.ofLocalizedDateTime(dateStyle, timeStyle);

// Formatter for an specific Locale
dtf.withLocale(locale).format(dateTime);
```
- Possible values of FormatStyle: SHORT, MEDIUM, LONG, FULL
- Values of `Locale.Category`
    - DISPLAY - Used for displaying data about the Locale
    - FORMAT - Used for formatting dates, number or currencies
- **You can set parts of the Locale independently.**
- A **resource bundle** contains the Locale specific objects to be used by a program. It is commonly stored in a properties file.
- The `ResourceBundle` class has the method `keyset()` to get a set with all the keys.
> An approach for resources bundles is to have all of the properties files in a separate  JAR or folder and load them in the classpath at runtime

- Methods for obtaining a resource bundle
```java
ResourceBundle.getBundle("Zoo"); // Default locale
ResourceBundle.getBundle("Zoo", locale);
```
- Steps to pick a resource bundle:
    1. Look for the RB for the requested locale followed by the one for the default locale.
    2. For each locale check language_country followed by just the language.
    3. Use the default bundle if a matching locale cannot be found
- Java is not required to get all of the keys from the same RB. It can get them from any parent of the matching RB. `Zoo_fr_FR.properties -> Zoo_fr.properties -> Zoo.properties`
- If a property is not found in any RB, a `MissingResourceException` is thrown
- `Properties` class has both methods: `get()` and `getProperty()`. But only `getProperty()` has a parameter for a default value.

> Avoid using `get()/put()` methods when using an instance of `Properties`


### Exam Essentials
- Be able to create custom exception classes
- Perform automatic resource management with *try-with-resources* statement
- Apply *try-with-resources* to existing resources
- Identify valid locale strings
- Format dates, numbers, and messages
- Determine which resource bundle, Java will use to look up a key

### Evaluation
- Si una cadena, que representa una fecha, no tiene tiempo, se debe usar un formateador para `LocalDate`
- `ResourceBundle` is an abstract class
- The JVM sets a default locale automatically
- When using builder to create a `Locale` make sure that the method `build()` is called at the end.
- `Closable` extends `AutoClosable`. Then it can be used as well in a *try-with-resources* statement.
- Once a resource bundle is chosen, only resources in that hierarchy are allowed
- Methods in the `Properties` class: `get(String key)`, and `getProperty(String key, String defaultValue)`
- A country without a language is not a valid `Locale`
- An exception thronw in any of the resources of *try-with-resources* might be handled by a catch block written by the developer

## Chapter 17 - Modular Applications
### Notes
- Types of modules:
    - Named modules
    - Automatic modules
    - Unnamed modules
- A **named module** is one that contains a `module-info.java` file. They appear in the module path rather than the classpath
- An **automatic module** appears on the *modulepath* but it does not contain a `module-info` file. It is a *JAR* that is treated as a module. All its package are exported and its module name its determined automatically
- The name of an automatic module can be specified in the `META-INF/MANIFEST.MF` file (the manifest file of a JAR), using the property: `Automatic-Module-Name`
- Algorith to determine the name of an automatic module:
    1. Remove the file extension from the JAR name
    2. Remove any version information from the end of the name. A version is digits and dots with possible extra info at the end
    3. Replace any remaining characters other than letters and numbers with dots
    4. Replace any sequence of dots with a single dot
    5. Remove the dot if it is the first or last character of the result
- An **unamed module** is a regular JAR that appears on the classpath rather than the modulepath.
- Properties of an unamed module:
    - If it contains a modue info file, it is ignored.
    - Does not export any packages to named/automatic modules
    - Can read from any JAR in the classpath/modulepath

> Code on the classpath can access the modulepath. Code on the modulepath is unable to read from the classpath

- Common modules:
    1. `java.base`
    2. `java.desktop`
    3. `java.logging`
    4. `java.sql`
    5. `java.xml`
- Since Java 9, you can run an app on a full JDK or on a subset.
- The `requires` directive specifies which modules need to be present both at compiletime and runtime
- `java.base` is available to all modular appas. It is redundant to require it in the module-info file
- The `jdeps` command helps you when you want to migrate a project to modules. It can identify dependencies
- The option `--jdk-internals` or `-jdkinternals` provides details about unsupported APIs that are being used
- Determining the order/structure of the dependencies:
    - Projects that do not have dependencies are at the bottom
    - Project at the top have a dependency
- **Bottom-up migration strategy**  to migrate a project to modules:
    1. Pick the lowest-level project that has not yet been migrated
    2. Add a `module-info.java`  file to that project. Export any package used by higher level JAR files. Add a requires directive for any modules it depends on
    3. Move the newly created module to the module path
    4. Ensure that any projects that have not yet been migrated stay as unamed modules on the classpath
    5. Repeat with the next low-level project until  you are done
- **Top-down migration strategy**:
    1. Place all projects on the module path (all projects are going to be automatic modules)
    2. Pick the highest level project that has not yet been migrated
    3. Add a module-info file to that project, to convert it to a named module. Add any required `exports` or `requuires` directive.
    4. Repeat with the next low level project until you are done.
- **Bottom-up** strategy works best when you have the power to convert any JAR files that are not already modules
- **Top-down** strategy is useful when you do not have control of every JAR files used by your app.
- The JPMS does not allow cyclic dependencies. It prevents you from writing code that has cyclic dependencies

> A technique to get rid of cyclic dependencies is to introduce another module, which contains the code that the two other modules share

- Java will still allow you to have cyclic dependencies between packages within a module
- A service is compose of:
    - An interface
    - Class the interface references to
    - A way of looking up implementations of the interface
- The **service provider interface** specifies what behaviour our service will have. It can be an *abstract class*
- A **service locator** is able to find any classes that implement a *service provider interface*
- `java.util.ServiceLoader` finds the implementations of an interface
- The service locator module contains the two directives: `requires` and `uses`
- A **consumer** (a client) is a module that obtains and uses a service
- A **service provider** is the implementation of a *service provider interface*
- We do not export the package that implements the interface. Instead, we use the `provides` directive
- Java allows only one service provider for a service provider interface in a module.
- Services and directives:

| Artifact | Part of the Service | Directives in module-info.java |
| - | - | - |
| Service Provider Interface | Yes | `exports` |
| Service Provider | No | `requires` - `provides` |
| Service Locator | Yes | `exports` - `requires` - `uses` |
| Consumer | No | `requires` |

- We can compile a module indicating the source folder that contains the module:
```sh
# module names should be separated by commas without spaces
# * is replaced by a module name.
javac -d classes --module-source-path "./*/src/main/java" -m module.one,module.two
```
- Modules can be included when execution a main class with `--add-modules`
- Automatic modules can access the `classpath` (confirm)
- The following does not compile:
```java
open module my.module {
	// This is redundant and it is not allowed because the module
	// is already marked with the open directive at module name level
	opens package.name;
}
```
- You can export a package to more than one module in the same line:
```java
module my.module {
	exports package.name to mod.one, mode.two;
}
```

### Exam Essentials
- Identify the 3 types of modules
- List built-in JDK modules
- Use `jdeps` to list required packages and internal packages.
- Explain **top-down** and **bottom-up** migration
- Differentiate the four main parts of a service.
- Code directives for use with services.

### Evaluation
- A cyclic dependency can involve two or more modules that require each other
- When a new modoule is created, to get rid of the cyclic dependency between 2 modules, the two modules do not need to expose anything. Only the new module has to expose the common code required by the 2 packages.
- The `jdeps` command provides information about the class or package level depending on the options passed. It is frequently used to determine what dependencies you will need when converting to modules. This makes it useful to run against a regular JAR.

## Chapter 18 - Concurrency
### Notes
- A **thread** is the smalles unit of execution that can be scheduled by the OS.
- A **process**  is a group of associated threads that execute in the same shared environment.
- A **task** is a a single unit of work perfomed by a thread. A thread can perform multiple independent tasks but only one at a time.
- A **system** thread is created by the JVM and runs in the background. Such as the garbage collector (GC)
- A **user-defined thread** is created by the app developer to accomplish an specific task.
- The property of executing multiple threads/processes at the same time is referred to as **concurrency**
- A **thread scheduler** determines which threads should be concurrently executing
- **Context switch** is the process of storing a thread's concurrent state and later restoring it to continue execution.
- A **thread priority** is a numeric value associated with a thread that is taken into consideration by the thread scheduler when determining which trhead should concurrentlly be executing
- The `Runnable` interface is commonly used to define the task/work that a thread will execute, separate from the main app thread.
- We can define a task, which an instance of `Thread` will execute, in two ways:
    1. Provide a `Runnable` object (it can be a lambda expression) to the constructor of `Thread`.
    2. Extend the `Thread` class and override its method `run()`
- After you create a `Thread` instance you have to start the task with a call to the method `start()`

> Extend `Thread` only under specific circunstances, such as when you are creating your own priority based thread

- **Polling** is the process of intermittently checking data at some fixed interval
- An **ExecutorService** defines services to create and manage threads for you
- Some features of the **Concurrency API**
    1. Thread pooling
    2. Thread scheduling
- `Executors` is a factory class to get/create instances of `ExecutorService`
- With a *single-thread* executor, threads are guaranteed to be executed sequentially
- How to run tasks with an executor service:
```java
import java.util.concurrent.*;

public class ZooInfo {
	// The main method is an independent thread from the executor.
	public static void main(String... args) {
		ExecutorService executor = null;
		Runnable task = () -> System.out.println("Printing Info");

		try {
			executor = Executors.newSingleThreadExecutor();
			executor.execute(task);
			System.out.println("end.");
		} finally {
			// failing to call this method results in your app never terminating
			executor.shutdown();
		}
	}
}
```

- If a new task is submitted to the executor while it is shutting down a `RejectedEcutionException` will be thrown
- `shutdown()` does not acctually stops any tasks that have already been submitted to the thread executor
- `shutdownNow()` attempts to stop all running taks and discards any that have not been started yet. Returns a `List<Runnable>` of the tasks that were not started.
- Executor service life cycle:
    - ACTIVE: accepts and executes tasks
    - SHUTTING DOWN: Rejects new tasks, executes tasks.
    - SHUT DOWN: Rejects new tasks, no tasks running.
- `ExecutorService` does not implment `AutoClosable`. It extends the `Executor` interface.
- `submit()` returns an instance of a `Future` that can be used to determine wheter a task  was completed.
- `ExecutorService` methods:
    1. `void execute(Runnable task)`
    2. `Future<?> submit(Runnable task)`
    3. `<T> Future<T> submit(Callable<T> task)`
    4. `<T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) throws InterruptedException`
    5. `<T> T invokeAny(Collection<? extends Callable<T>> taks) throws InterruptedException, ExecutionException`

> Prefer submit() over execute() whenever possible.

- Methods of `Future`
    1. `boolean isDone()` - Returns `true` if the task was completed, threw an exception, or was cancelled
    2. `boolean isCancelled()` - Returns `true` if the task was cancelled before it completed normally
    3. `boolean cancel(booblean mayInterruptIfRunning)` - Attempts to cancel the execution of the tasks. Returns `true` if it was successfully cancelled or `false` if it could not be cancelled or is complete
    4. `V get()` - Retrieves the result of a task, waiting endlessly if it is not yet available.
    5. `V get(long timeout, TimeUnit unit) throws TimeoutException` - Retrieves the result of a task, waiting the specified amount of time.
- The method `get()` of `Future` always returns null when working with `Runnable` expressions
- `TimeUnit` values:
    1. `NANOSECONDS` - Time in one-billionth of a second (1/1,000,000,000)
    2. `MICROSECONDS` - Time in one-millionth of a second (1/1,000,000)
    3. `MILLISECONDS` - Time in one-thousandth of a second (1/1,000)
    4. `SECONDS`
    5. `MINUTES`
    6. `HOURS`
    7. `DAYS`
- `Callable` is a functional interface with `V call()` that throws a checked exception. It is preferable over `Runnable` since it allows more details to be returned more easily from the task after it is completed.
- `awaitTermination()` waits the specified time to complete all tasks, returning sooner if all tasks are finished or an `InterruptedException` is detected. **It should be called after `shutdown()`**
- `ExecutorService` has an overloaded version of  `invokeAll()` and `invokeAny()`, that take a timeout value and a `TimeUnit` parameter.
- `ScheduledExecutorService` allow us to schedule a task to happen at some future time, and to schedule a task to happen repeatedly at some set interval.
- Methods of `ScheduledExecutorService`
    - `schedule(Callable<v> callable, long delay, TimeUnit unit)`
    - `schedule(Runnable command, long delay, TimeUnit unit)`
    - `scheduleAtFixedRate(Runnable command, long initialDelay, long period, TimeUnit unit)` - Creates a new task and submits it to the executor every period regardless of wether the previous task finished. It is useful for tasks that need to be run at specific intervals.
    - `scheduleWithFixedDelay(Runnable command, long initialDelay, long delay, TimeUnit unit)` - Creates a task only after the previous task has finished. It is usefult for processes that you want to happen repeatedly but whose specific time is unimportant.
- A **thread pool** is a group of pre-instantiated and reusable threads that are available to perform a set of arbitrary tasks..
- Factory methods of `Executors`
    1. `ExecutorService newSingleThreadExecutor()`
    2. `ScheduledExecutorService newSingleThreadScheduledExecutor()`
    3. `ExecutorService newCachedThreadPool()`
    4. `ExecutorService newFixedThreadPool(int)`
    5. `newScheduledThreadPool(int)`
- `newCachedThreadPool()` is commonly used for pools that require executing many short-lived async tasks.**For long-lived processes this pool is discouraged**

> It is a common practice to allocate thread pools based on the number of available processors: `Runtime.getRuntime().availableProcessors()`

- **Thread-safety** is the property of an object to guarantee safe execution by multiple threads at the same time.
- The increment operator `++` is not thread-safe because it is not atomic
- The unexpected result of two tasks executing at the same ti me is referred to as **race condition**
- **Atomic** is the property of an operation to be carried out as a single unit of execution without any interferance by another thread
- Atomic classes
    1. `AtomicBoolean`
    2. `AtomicInteger`
    3. `AtomicLong`
- Common atomic methods
    1.  `get()`
    2. `set()`
    3. `getAndSet()` - Sets the new value and returns the old value (atomically)
    4. `incrementAndGet()` - Atomic pre-increment, equivalent to `++value`
    5. `getAndIncrement()` - Atomic post-increment, equivalent to `value++`
    6. `decrementAndGet()` - Atomic pre-decrement, equivalent to `--value`
    7. `getAndDecrement()` - Atomic post-decrement, equuivalent to `value--`
- Using atomic classes ensures that the data is consistent between workers and that no values are lost due to concurrent modifications.
- **Mutual exclusion** is the property that ensures that at most one thread is executing a particular segment of code at a given time
- A **monitor** is an structure that supports *mutual excllusion*
- Any object can be used as a monitor aloong with the `synchronized` keyword
- We can apply the `syncronized` modifier to any instance method to synchronize on the object itself
- The `synchronized` modifier can also be applied to static methods. The monitor is the class object.

> Avoid  syncrhonization whenever possible and prefer: atomic classes, the Lock framework, concurrent collections, and cyclic barriers

- The Concurrency API includes the `Lock` interface, which is conceptually similar to using the `synchronized` keyword/modifier
```java
Lock lock = new ReentrantLock();
try {
	lock.lock();
	// Protected code
} finally {
	lock.unlock();
}
```
- The `ReentrantLock` class ensures that once a thread has called `lock()` and obtained the lock, all other threads that call `lock()` will wait until the first thread call `unlock()`
- `ReentrantLock` has a constructor with a  *boolean* fairness parameter. If it is set to true, then the lock will be granted to each thread in the order it was requested.
- Make sure that you only release a lock that you actually have. Otherwise you will get a `IllegalMonitorStateException` at runtime.
- Methods of `Lock`
    1. `lock()`
    2. `unlock()`
    3. `boolean tryLock()`
    4. `boolean tryLock(long, TimeUnit)`
- It is critical that you release the lock the same number of times it is aquired. For calls to `tryLock()` you need to call `unlock()` only if the method returned true.
- We can use `CyclicBarrier` to coordinate a group of tasks
- The `CyclicBarrier` class takes in its constructor a limit value, that indicates the number of threads to wait for.
- Coordinating tasks with `CyclicBarrier` requires the object to be static or passed to the thread performing the task.
- `CyclicBarrier` has a constructor with a `Runnable` parameter that is run upon completion.
- If you are using a thread pool make usre that you set the number of available threads to be at least as larg as the limit of the `CyclicBarrier`
- If the `CyclicBarrier` limit is 5 and we have 15 threads that call `await()` then the cyclic barrier will be activated 3 times
- **Memory consistency errors** ocurr when two threads have inconsistent views of what should be the same data.
- The concurrent classes were created to avoid common issues in which multiple threads are adding and removing objects from the same collection
- You should use a concurrent collection class anytime that you are going to have multiple threads modify a collection object outside a syncronized block/method

> Immutable/Read-only objects can be accesssed by multiple threads without a concurrent collection.

> A good practice is to intstantiate a concurrent collection and pass it around using a non-concurrent collection whenever possible.

- Concurrent collection classes:

| Name | Interfaces | Ordered? | Sorted? | Blocking? |
| -- | -- | -- | -- | -- |
| ConcurrentHashMap | ConcurrentMap| No | No | No |
| ConcurrentLinkedQueue | Queue | Yes | No | No |
| ConcurrentSkipListMap | ConcurrentMap SortedMap NavigableMap | Yes | Yes | No |
| ConcurrentSkipListSet | SortedSet NavigableSet | Yes | Yes | No |
| CopyOnWriteArrayList | List | Yes | No | No |
| CopyOnWriteArraySet | Set | No | No | No |
| LinkedBlockingQueue | BlockingQueue | Yes | No | Yes |

- `ConcurrentSkipListSet` and `ConcurrentSkipListMap` are concurrent versions of `TreeSet` and `TreeMap`
- `CopyOnWriteArrayList` and `CopyOnWriteArraySet` copy all of their elements to a new underlying structure anytime an element is added, modified or removed. Modified means that the reference to the object in the collection has changed.
- Although the data is copied to a new structure the reference to the collection object is the same.
- Any iteration stablished prior to a modification will not see the changes. It will iterate over the original collection.
- The CopyOnWrite classes can use a lot of memory. They are commonly used in multithreaded environments situations where reads are far more common than writes
- The `BlockingQueue` is like a regualr queue, excep that it includes methods that will wait an specific amount of time to complete an operation.
- Methods of `BlockingQueue`
    1. `offer(E e, long timeout, TimeUnit unit)` - Returns false if the time elapses before space is available.
    2. `poll(long timeout, TimeUnit unit)` - Return null if the time elapses before the item is available
- Methods to obtain syncronized collections
    1. `synchronizedCollection(Collection<T> c)`
    2. `synchronizedList(List<T> list)`
    3. `synchronizedMap(Map<K, V> map)`
    4. `synchronizedNavigableMap(NavigableMap<K, V> m)`
    5. `synchronizedNavigableSet(NavigableSet<T> s)`
    6. `synchronizedSet(Set<T> s)`
    7. `synchronizedSortedMap(SortedMap<K, V> m)`
    8. `synchronizedSortedSet(SortedSet<T> s)`
- If you are given a existent collection that is not a concurrent class, and need to access it among multiple threads, you can wrap it using the synchronized collections methods from `Collections`.
- The synchronized collections classes throw an exception if they are modified withinn an iteration
- Collections returned by the synchronized collection methods are safe from memory consistency errors and can be used among multiple threads.
- **Liveness** is the ability of an application to execute in a timely manner.
- Liveness problems make the app:
    1. Unresponsive
    2. To be in a kind of stuck state
- Types of liveness issues:
    1. Deadlock
    2. Starvation
    3. Livelock
- **Deadlock** ocurrs when two or more threads are blocked forever, each waiting on the other. Participants are blocked forever waiting on resources that will never become available.
- **Starvation** ocurrs when a single thread is perpetually denied access to a shared resource or lock.
- **Livelock** ocurrs when two or more threads are conceptually blocked forever. Although they are still active and trying to complete their task. Livelock is often the result of 2 threads trying to resolve a *deadlock*
- A **race condition** is an undesirable result that ocurrs when two tasks, which hould be completed sequentially, are completed at the same time. They lead to invalid data if they are not handled properly.
- A solution to *race condtion* is to use a *monitor* to synchronize on the relevant overlapping task.
- A **parallel stream** is a stream that is capable of processing results concurrently using multiple threads

> You can use a parallel stream and `map()` to improve preformance.

- There are 2 ways of creating a parallel stream
    - Method `parallel()` on an existing stream. This method is an intermediate operation that operates on the original stream
    - Method `parallelStream()` on a *Collection* object.
- A **parallel decompostion** is the process of taking a task, breaking it up into smaller pieces than can be performed concurrently, and then reassembling the resutls.
- The `map()` and `forEach()` operations on a parallel stream are equivalent to submitting multibple *Runnable* lambda expressions to a pooled thread executor and then waiting for the result.
- `forEachOrdered()` forces the parallel stream to process the results in order at the cost of performance
- The results from parallel reductions can be different from what you expect when working with parallel streams
- `findAny()` on a parallel stream may result in unexpected behaviour.
- Calling `skip()`, `limit()`, `findFirst()` will return the same result on ordered serial and parallel streams. The performance is slower in parallel streams.
- An unordered stream can improve performance: `List.of(1, 2, 3).stream().unordered()...`
- On parallel stream the method `reduce()` works by applying the reduction to pairs of elements and then combines the intermediate values.
- To prevent the results from being combined incorrectly, make sure that the *accomulator* and the *combiner* work regardless of the order they are called in
- The combiner (in reduce) can be omitted if the intermediate data types are the same.
- You can see unexpected results if you do not provide a proper identity (in reduce())
- As part of the parallel process the identity is applied to multiple elements.

> It is recommended the 3 argument version of `reduce()` when working with parallel streams. The JVM will parition the operations more efficiently.

- To use `collect()` on a parallel stream we must provide an *accomulator* and a *combiner* operations that process results in any order
- You should use a concurrent class to combine the results to avoid `ConcurrentModificationException`. Using an ordered collection such as `List` may reduce performance
- Requirements for parallel reductions with `collect()`:
    1. The stream must be parallel
    2. The param of the `collect()` has the characteristic `CHaracteristics.CONCURRENT`
    3. Either the stream is unordered or the collector has the characteristic `Characteristics.UNORDERED`
- `toConcurrentMap()` and `groupingByConcurrent()` return a collector which is both  UNORDERED and CONCURRENT.
- A **stateful lambda expression** is one whose result depends on any state that might change during the execution of a pipeline

> Avoid stateful operations when using parallel streams and even with sequential streams.

- Difference between `Callable` an `Runnable`. The former returns a generic type, can throw a checked exception, and it is in the package `java.util.concurrent`.
- `ReentrantLock` has these advantages over `syncronized` blocks/methods:
    - Check wheter a lock is available without blocking on it
    - Supports fair acquisition of the lock
- `CyclicBarrier` forces a set of threads to wait until they are at a certain stage of execution before continuing.
- **Race condition** occurs when two threads execute at the same time, resulting in an unexpected outcome.

### Exam Essentials
- Create concurrent tasks with a thread executor service using *Runnable* and *Callable*
- Be able to apply the atomic classes
- Be able to write thread-safe code
- Manage a process with a *CyclicBarrier*
- Be able to use the concurrent collection classes
- Identify potential threading problems.
- Understand the impact of using *parallel streams*
-

### Evaluation
- Using a *single-thread* executor means that the tasks are not executed concurrently.
- Even on serial streams, `findAny()` is free to select any element.
- Sorting on a parallel stream does not mean that `findAny()` will return the first record
-  Keep in mind that there is a cost associated with allocating additional memory and CPU time to manage the concurrent process
- Single-processor CPUs have been benefiting from concurrency for decades
- Remember that the `tryLock()` method returns immediately with a value of false if the lock cannot be acquired.
- In the exam a mehtod without a body and comment that the body is implemented prior running the code can throw a `RuntimeException`
- When adding elements to a `Set` remember that adding duplicates are not allowed/ignored.
- Method `execute()` in `ExecuteService` returns `void`
- Methods `offer(E element, long timeout, TimeUnit unit)` and `poll(long timeout, TimeUnit uni)` can throww `InterruptedException`
- The `findFirst()` method guarantees the first element in the stream will be returned, whether it is serial or parallel
- The `forEachOrdered()` method will process the elements in the order they are stored in the stream
- A thread needs to call `unlock()` once for each call to `lock()` and `tryLock()`.
- `awaitTermination()`does not throw any exception if the waiting time is reached, it returns false instead, when the executor is stilll running tasks.
- `scheduleWithFixedDelay()` accepts only `Runnable`
- `Executors.newSingleThreadScheduledExecutor()` returns an implementation of `ScheduledExecutorService`
- Calling `parallel()` on an already parallel stream is allowed, and it may in fact return the same object.
- Pay special attention at the usage of `reduce(identity, accumulator, combiner)`, the accumulator is a bi-function in which the first type is the type of the identity and the second is the type of the elments in the stream. The bi-function return type is the same tye as the identity.
- Semicolon is required in the return statement of a lambda body that uses brakets
- The value in the second parameter of `LongStream.range(1, 10)` is excluded. The stream only contains 9 elments from 1 to 9.


## Chapter 19 - I/O
### Notes
- A **file** is a record withing a storage device that holds data. Files are organized into hierarchies using directories.
- A **directory** is a location that can contain files as well as other directories.
- A **path** is a string representation of a file or directory within a file system.
- The `File` class is used to:
    1. reaad information about existent files and directories.
    2. List contents of direcotries
    3. Create/delete files and directories
- An instance of `File` represents the path to a particualr file/directory. It cannot read/write data withing a file.
- Java offer two options two options to retrieve the local separator character:
```java
System.out.println(System.getProperty("file.separator"));
System.out.println(File.separator);
```
- `File` has three constructor that you should know for the exam:
    1. `File(String pathName)`
    2. `File(String parent, String child)` - If parent is null, it is skipped
    3. `File(File parent, String child)`
- Commonly used `java.io.File` methods:
    1. `boolean delete()` - if it is a directory in must be empty.
    2. `boolean exists()`
    3. `String getAbsolutePaht()`
    4. `String getName()`
    5. `String getParent()` - Returns `null` if there is none
    6. `boolean isDirectory()`
    7. `boolean isFile()`
    8. `long lastModified()`
    9. `long length()`
    10. `File[] listFiles()`
    11. `boolean mkdir()`
    12. `boolean mdirs()` - Includes none existent parent directories
    13. `boolean renameTo(File dest)`
- **On the exam you might get paths that look like files but are directories, or vice versa.**
- A **stream** is a list of data elements presented sequentially.
- Thee are two sets of reading/writing streams: **byte streams and character streams**
- Differences betwen binary and character streams:
    1. Binary streams read/write binary data (images, executable files) and have names that end with *InputStream* or  *OutputStream*
    2. Character streams read/write text data (text files) and have names that end in *Reader* or *Writer*
- `PrintWriter` has no accompanying *PrintReader* class.
- `PrintStream` is an *OutputStream* that has no corresponding *InpuStream* class.
- A **low-level stream** connects directly with the source of the data, such as a file, an array, or a string. They process the raw data or resource and are accessed in a direct and unfiltered manner. For example `FileInputStream` reads file data one byte at a time.
- A **high-level stream** is built on top of another stream using wrapping.
- The high-level stream may add new methods, such as `readLine()`, as well as enhancements for reading and filtering the low level data.
- Parents of the stream classes:
    1. `InputStream`
    2. `OutputStream`
    3. `Reader`
    4. `Writer`
- The constructor of *high-level* classes often take a reference to an abstrac class.
- Properties of the class names in `java.io`
    1. A class with the word *InputStream* or *OutputStream* in its name is used for reading or writing binary or byte data
    2. A clas with the word *Reader* or *Writer* in its name is used for reading or writing character or string data
    3. Most, but not all, input classes have a corresponding output class
    4. A low-level stream connects directly with the source of the data.
    5. A *high-level* stream is built on top of another stream using wrapping.
    6. A class with the word *Buffered* in its name read or writes data in groups of bytes or characters
    7. With a few exceptions, you only wrap a stream with another stream if they share the same abstract parent.
- Concret classes in `java.io`
    1. FileInputStream / FileOutputStream
    2. FileReader / FileWriter
    3. BufferedInputStream / BufferedOutputStream - *high level*
    4. BufferedReader / BufferedWriter - high level
    5. ObjectInputstream / ObjectOutputStream - high level - Deserialize/Serialize primitive Java data types and graphs of java object from/to an existing InputStream/OutputStream
    6. PrintStream - high level - Writes formatted representation of Java objects to a binary stream
    7. PrintWriter - high level - Writes formatted representation of Java objects to a character stream
- `-1` indicates the end of a stream
- Methods for reading/writing
 ```java
 // InputStream
 int read() throws IOException;
 int read(byte[] b) throws IOException;
 int read(byte[] b, int offset, int length) throws IOException;
 // Reader
 int read(char[] b) throws IOException;
 int read(char[] b, int offset, int length) throws IOException;
 
 // OutputStream
 void write(int b) throws IOException;
 void write(byte[] b) throws IOException;
 void write(byte[] b, int offset, int length) throws IOException;
 // Writer
 void write(char[] b) throws IOException;
 void write(char[] b, int offset, int length) throws IOException;
 ```
- An `offset` of 5 and a `length` of 3, indicates that the stream should read up to 3 bytes of data and put them into the array starting with position 5
- Since all I/O classes implement closeable the best way to close them is using the `try-with-resources` statement.
- The stream should be closed in the method that created it.
> When working with a wrapped stream you only need to use close() on the topmost object

- All stream classes include these methods to manipulate the order in which data is read from a stream
```java
// InputStream and Reader
boolean markSupported() // not all support mark() and reset()
void mark(int readLimit)
void reset() throws IOException
long skip(long n)throws IOException
```
- `readLimit` in the method `mark()` indicates that we expect to call `reset()` after at most reading `readLimit` bytes. If we call `reset` after reading more that `readLimit` and exception may be thrown depending on the stream class.
- You should not call `mark()` with too large a value as this could take a lot of memory
- The return value of `skip()` tell us how many values were actually skipped
- The `flush()` method requests that all accumulated data be written immediately to disk. It may cause a noticeable delay in the app, especially for large files. It should not be necessarily called after every write.
- Constructors of the concrete classes to read/write binary data:
```java
public FileInputStream(String name) throws FileNotFoundException
public FileInputStream(File file) throws FileNotFoundException

// There is an overloaded constructor that takes an append flag.
// useful if we want to append data to a file.
public FileOutputStream(String name) throws FileNotFoundException
public FileOutputStream(File file) throws FileNotFoundException

// Buffering binary data
public BufferedInputStream(InputStream in)
public BufferedOutputStream(OutputStrem out)
```
- Constructors of the concrete classes to read/write character data
```java
public FileReader(String name) throws FileNotFoundException
public FileReader(File file) throws FileNotFoundException

public FileWriter(String name) throws FileNotFoundException
public FileWriter(File file) throws FileNotFoundException

public BufferedReader(Reader in) // Add readLine() method
public BufferedWriter(Writer out) // It adds newLine() method
```
- Method `readLine` in `BufferedReader` strips out the line break character
- `FileWriter` inherits a method to write string values: `void write(String str) throws IOException`
- **Serialization** is the process of converting an in-memory object to a byte stream
- **Deserialization** is the process of converting from a byte stream into an object
- To serializa an objecto using the I/O API, the object must implement the `java.io.Serializable` interface, you should only mark data-oriented classes serializable.
- Any field that is marked `transient`  will not be saved to a stream when the class is serialized

> It is a good practice to declare a `static serialVersionUID` variable in every class that implements `Serializable`. Any time the class structure changes, this value is updated/incremented
> If an older version of the class is encountered during deserialization a `java.io.InvalidClassException` may be thrown

- Oftentimes, `transient` is used for sensitive data, like password.
- At deserialization, fields marked with `transient` are set to their default java values
- Marking `static` fields `transient` has little effect on serialization. Other than `serialVersionUID`, only the instance members of a class are serialized.
- Any attempt to serialize an object that does not implement `Serializable` properly will throw `NotSerializableException`
- How to make a class serializable
    1. The class must be marked `Serializable`
    2. Every instance member of the class is serializable, marked `transient`, or has a `null` value at the time of serialization
- The `ObjectInputStream` class is used to deserialize an object from a stream
    - `public ObjectInputStream(InputStream in) throws IOException`
- The `ObjectOutputStream` class is used to serialize an object to a stream.
    - `public ObjectOutputStream(OutputStream out) throws IOException`
- Methods related to working with objects:
```java
// ObjectInputStream
public Object readObject() throws IOException, ClassNotFoundException

// ObjectOutputStrream
public void writeObject(Object obj) throws IOException
```
- When reading objects instead of getting `-1` or `null` at the end of the stream, we get a `EOFException`
- When you deserialize an object, the constructor of the serialized class, along with any instance initializers, is not called when the object is created. Java will call the no-arg constructor of the first nonserializable parent class it can find in class hierarchy. Static or transient values are ignored. Values that are not provieded will be given their defaul value
- `PrintStream` and `PrintWriter` are high-level output print streams classes that are useful for writing text data to a stream.
```java
public PrintStream(OutputStream out)
public PrintStream(File file) throws FileNotFoundException
public PrintStream(String fileName) throws FileNotFoundException

public PrintWriter(Writer out)
public PrintWriter(File file) throws FileNotFoundException
public PrintWriter(String fileName) throws FileNotFoundException
// The only exception when we can mix a byte and a character stream
public PrintWriter(OutputStream out)
```
- Methods in the print stream classes, these methods do not throw a checked exception:
    1. `print()`
    2. `println()`
    3. `format()`
- The stream classes provide a `checkError()` method, that can be used to check for an error after a write.
- Under the cover `print()` calls `String.valueOf()` or `toString()`
- How to get the line separator of a system:
    - `System.getProperty("line.separator")`
    - `System.lineSeparator()`
- Common print stream `format()` symbols
    1. %s
    2. %d
    3. %f
    4. %n - Inserts a line break
- Mixing data types may cause an exceeption:
```java
System.out.format("Food %d", 2.0); // IllegalFormatConversionException
```
- `FilterInputStream` and `FilterOutputStream` are high-level super classes that filter or transform data
- The `InputStreamReader` wraps an `InputStream` with a `Reader`
- The `OutputStreamReader` class wraps an `OutputStream` with a `Writer`
- **Study diagram 19.4 of I/O stream classes. Page 952**
- Java provides `PrintStream` instances for providing information to the user:
    - `System.out`
    - `System.err`
- Reading input from the user:
```java
var reader = new BufferedReader(new InputStreamReader(System.in));

String userInput = reader.readLine();
```
- Closing system streasm is not recommended. If you close `System.out` nex time you want to display text for the user, nothing will be displayed.
- `Console` is a class with numerous  methods centered around user input
- The `Console` is singleton. All constructors are private.
- How to read/write user input with `Console`
```java
Console console = System.console();
// Always check that console is provided
if (console != null) {
	String userInput = console.readLine();
	console.writer().println("You entered: " + userInput);
} else {
	System.out.println("Console is not available.");
}
```
- Most used methods in `Console` class.
    1. `reader()`
    2. `writer()`
    3. `format(String format, Object... args)`
    4. `String readLine()`, `String readLine(String fmt, Object... args)`
    5. `char[] readPassword()`, `char[] readPassword(String fmt, Object... args)`
- The `Console` class includes access to two streams for reading/writing data
    1. `public Reader reader()`
    2. `public PrintWriter writer()`
- `Console` does not include an overloaded `format()` that takes a `Local` instance.
- Differences between `readLine()` and `readPassword()` methods:
    1. The text the user types is not displayed on the screen
    2. The data is returned as `char[]` instead of `String`
- The streams differ in these points:
    1. Byte vs character streams
    2. Input vs output streams
    3. Low-level vs high-level streams
- All java wrappers/primitives and String are serializable.

### Exam Essentials
### Evaluation
- `Console` does not have a method `println()`. It has the method `format()`. However, you can do this: `console.writer().println()`
- `readObject()` declares the `ClassNotFoundException` even if the class is not cast to a specific type.
- Character streams perform character encoding automatically
- `file` class does not have a method to copy files
- While it is a good practice for a serializable class to include a static `serialVersionUID` variable, it is not required.
- The `try-with-resources` statement itself must be handled or declared, since the close() method throws a checked `IOException` exception
- Class `Object` is not serializable. If a serializable class has a member of type `Object`, it will compile but will throw an exception at runtime if we attempt to serialize an instance of the  class
- The data may not  made it to disk yet after a write unless we use `flush`.
- The `File.delete()` method returns false if the file or directory cannot be deleted.
- Not all I/O streams support the `mark()` operation; therefore, without calling `markSupported()` on the stream, the result is unknown until runtime
- `Console` includes a `format()` method that takes a `String` along with a list of arguments


## Chapter 20 - Introducion NIO 2
### Notes
- A `Path` instance represents a hierarchical path, on the stroage system, to a file or directory
- Similarities between `java.io.File` and `java.nio.file.Path`
    1. They may refer to an absolute or relative path within the file system
    2. Both may refer to a file or a directory
- One difference between `File` and `Path` is that the latter contains support (creating, detecting, navigating) for *symbolic links*
- Since `Path` is an interface we cannot create instances directly.
- Methods to create an instance of `Path` form the interface `Path`
```java
public static Path of(String first, String... more)
public static Path of(URI uri)
```
- The advantage of the varargs is that it inserts the proper system path separator for you.
- Methods to create an instance of `Path` from `java.nio.file.Paths` factory class:
```java
public static Path get(String first, String... more)
public static Path get(URI uri)
```
- An **Uniform Resource Identifier (URI)**  is a string of characters that identifies a resource.
- The `URI` class has an `isAbsolute()` method, although this refers to wheter the URI has a schema, not the file location
- The `FileSystems` class creates instances of `FileSystem` abstract class.
- Methods for obtaining a `Path` using `FileSystem` class:
```java
public Path getPath(String first, String... more)
```
- The `FileSystems` class give us the freedom to connect to a remote file system:
```java
FileSystem fs = FileSystems.getFileSystem(new URI("http://www.selikoff.net"));
Path path = fs.getPath("duck.txt");
```
- We can obtain a path using a `java.io.File` instance:
```java
// Path instance method
public default File toFile()

// File instance method
public Path toPath()
```
- The utility class `Files` operates on instances of `Path`, not `java.io.File` instances.
- Common method arguments (enums) in NIO 2:
    - `LinkOption`  implements `CopyOption` and `OpenOption`
        - NOFOLLOW_LINKS
    - `StandardCopyOption` implements `CopyOption`
        1. ATOMIC_MOVE
        2. COPY_ATTRIBUTES
        3. REPLACE_EXISTING
    - `StandardOpenOption` implements `OpenOption`
        1. APPEND - creates the file if it does not exist; otherwise, it starts writing from the end of the file
        2. CREATE
        3. CREATE_NEW - Create a new file only if it does not exist, fail otherwise
        4. READ
        5. TRUNCATE_EXISTING  - If file is already open for write, then erase file and append to beginning
        6. WRITE
    - `FileVisitOption`
        - FOLLOW_LINKS
- Common causes of a method, in a NIO 2 class,  throwing `IOException`:
    1. Loss of communication to underlying file system
    2. File/directory exists but can not be accessed/modified
    3. File exists but cannot be overwritten
    4. File/directory is required but does not exist.
- In general, methods that operate with `Path` do not throw checked exceptions. On the other hand mehtods that operate or change files/directories, such as those in the `Files` class, often declare `IOException`
- Path methods:
    1. `Path.of(String, String...)`
    2. `URI toURI()`
    3. `File toFile()`
    4. `String toString()`
    5. `int getNameCount()`
    6. `Path getName(int)`
    7. `Pat subpath(int, int)`
    8. `Path getFileName()`
    9. `Path getParent()`
    10. `Path getRoot()`
    11. `boolean isAbsolute()`
    12. `Path toAbsolutePath()`
    13. `Path relativize()`
    14. `Path resolve(Path)`
    15. `Path normalize()`
    16. `Path toRealPath(LinkOption...)`
- `Path` instances are immutable.
- If a method declares an `IOException`, then it usually requires the path it operates on to exist.
- The methods `getName(int)` and `getNameCount()` do not take into account the root directory as part of the path
- In the method `Path subpath(int beginIndex, int endIndex)`, beginIndex is inclusive and the end index is exclusive. This method does not include the root.
- The method `getParent()` returns `null` if operated on the root path or at the top of a relative path
- The `getRoot()` method return null if the path is relative
- Methods in the `Path` class do not resolve the path symbols and treat them as a distinct part of the path.
- If a path is relative then the method `toAbsolutePath()` joins it to the currrent working directory. Otherwise the method just return the path object
- You cannot combine to absolute paths using `resolve()`.  **If an absolute path is provided as input to the method, then that is the value that is returned**
- The method `relativize()` constructs the relative path from one path to another, often using path symbols. **The file itself counts as one level**
- If both paths are relative `relativize()` computes both paths as if they are in the same current working directory
- If both paths are absolute `relativize()` computes the relative path from one absolute location to another, regardless of the current working directory
- The `relativize()` method requires that both paths are relative/absolute, otherwise it throws `IllegalArgumentException` if types are mixed. For windows, it also requires that if the paths are absolute, the root must be the same drive letter.
- `normalize()` eliminates unnecessary redundancies in the path. It does not elminate all the path symbols, only the ones that can be reduced. It allows to better compare different paths.
- `toRealPath()` verifies that the path actually exists within the file system. Eliminates any redundancy (similar to *normalize()*) and will join the path to the current working directory if it is a relative path (similar to *toAbsolutePath()*). Throws `IOException` if the path does not exist.
- Gain acces to the current working directory:
```java
	Paths.get(".").toRealPath()
```
- Methods of the `Files` class:
    1. `boolean exists(Path, LinkOption...)`
    2. `boolean isSameFile(Path, Path)`
    3. `Path createDirectory(Path, FileAttribute<?>...)`
    4. `Path createDirectories(Path, FileAttribute<?>...)`
    5. `Path copy(Path, Path, CopyOption...)`
    6. `long copy(InputStream, Path, CopyOption...)`
    7. `long copy(Path, OutputStream)`
    8. `Path move(Path, Path, CopyOption)`
    9. `void delete(Path)`
    10. `boolean deleteIfExists(Path)`
    11. `BufferedReader newBufferedReader(Path)`
    12. `BufferedWriter newBufferedWriter(Path)`
    13. `List<String> readAllLines(Path)`
- The method `isSameFile()` resolves all path symbols, and follow symbolic links. Can also be used to determine wether two path objects refer to the same directory. Must usages of this method will throw an exceeption if the paths do no exist. If the two paths are equal, in terms of the mehtod `equals`, the the method will return true without checking wether the file exists
- The mehtod `createDirectories()` will complete without doing anything if all the directories in the path already exist.
- A **shallow copy** means that the files and subdirectories within the directory are not copied.
- A **deep copy** menas all the entire tree is copied
- `copy()` / `move()` throws an exception if the file already exists, unless we include the CopyOption `REPLACE_EXISTING`
- `copy()` / `move()` will not put a file in a directory, if the source is a file and the target is a directory. Instead it will create a new file with the name of the directory.
- An enum value for the `move()` is `ATOMIC_MOVE`. It will likely throw an exception if this enum value is passed to the `copy()` method.
- `delete()` / `deleteIfExists` throw an exception if the directory is not empty. If the path is a symbolic link, the the symbolic link will be deleted
- In the method `copy()` if the paths are directories then the copy is shallow.
- A **file attribute** is data (size, permissions, etc) about a file/directory within the file system.
- Methods to determine the type of a path, all of them do not throw exceptions:
    1. `boolean isDirectory(Path path, LinkOption... options)`
    2. `boolean isSymbolicLink(Path path)`
    3. `boolean isRegularFile(Path path, LinkOption... options)`
- Methods to check file accesibility:
    1. `boolean isHidden(Path path) throws IOException`
    2. `boolean isReadable(Path path)`
    3. `boolean isWritable(Path path)`
    4. `boolean isExecutable(Path path)`
- Method to determine the size of a file in bytes:
    - `public static long size(Path path)`
- If you need to determine the size of a directory you have to traverse the directory tree
- Method to check file changes:
    - `public static FileTime getLastModifiedTime(Path path, LinkOptions... options) throws IOException`
- It is more efficient to ask the file system for all of the attributes aat once
- A **view** is a  group of relalted file attributes for a particular file system
- Attributes and view types
    1. BasicFileAttributes - BasicFileAttributesView
    2. DosFileAttributes - DosFileAttributesView
    3. PosixFileAttributes - PosixFileAttributesView
- Retrieving attributes:
```java
public static <A extends BasicFileAttributes> readAttributes(Path path, Class<A> type, LinkOptions... options) throws IOException

var path = Paths.get("/user/file.txt")
BasicFileAttributes.data = Files.readAttirbutes(path, BasiFileAttributes.class);
```
- Modifying attributes:
```java
public static <V extends FileAttributeView> getFileAttributeView(Path path, Class<V> type, LinkOption... options)
```
- Not all file attributes can be modified with a view.
- Methods that work with a stream:
    1.  `public static Stream<Path> list(Path dir) throws IOException` - JVM does not follow symbolic links
    2. `public static Stream<Path> walk(Path start, FileVisitOption... options) throws IOException`
    3. `public static Stream<Path> walk(Path start, int maxDepth, FileVisitOption... options) throws IOException` - a depth of 0 indicates the current path itself. This method does not follow links by default.
    4. `public static Stream<Path> find(Path start, int maxDepth, BiPredicate<Path, BasicAttributes> matcher, FileVisitOption... optins) throws IOException`
    5. `public static Stream<String> lines(Path path) throws IOException` - Contetns of the file a read/processed lazily
- Always use `try-with-resources` when using those stream methods
- Stream methods use *depth-first-search* with a depth limit, which can be optionally changed
- When the `FOLLOW_LINKS` option is used, the `walk()` method will track all of the paths it has visited, throwing a `FileSystemLoopException` if a path is visited twice
- Differences between `readAllLines()` and `lines()`
    1. `readAllLines()` reads the entire file into memory
    2. `readAllLines()` returns a `List` not a `Stream`

### Exam Essentials
- Understand how to create `Path` objects
- Be able to manipulate `Path` objects
- Be able to operate on files and directories using the `Files` class
- Manage file attributes
- Be able to operate on directories using functional programming
- Understand the difference between `readAllLines()` and `lines()`

### Evaluation
-  Performance is not often the reason to prefer `Files.readAllLines()` over `Files.lines()`
- Remember, most Files methods declare `IOException`, especially the ones that modify a file or directory.
- There is an overloaded static method in Path that takes a `URI` instead of a `String`
- `Files.walk()` does not follow symbolic links by default
- `isSameFile()` returns true only if the files pointed to in the file system are the same, without regard to the file contents.
- `find()` method in a stream takes only a predicate with one argument, on the other hand  `find()` method in the class `Files` takes a `depthLimit` and  a bi-predicate with a path and an instance of `BasicAttributes`.
- `Files.createDirectories()` does not throw an exception if the path already exists.
- `equals()`, in path objects, checks only if the path values are the same, without reducing the path symbols
- The `normalize()`  method does not convert a relative path into an absolute path
- Method `resolve()` has an overloaaded version that takes a `String` as an argument
- `Path` is `Iterabel` and `Comparable`

## Chapter 21 - JDBC
### Notes
- A **database** is an organized collection of data.
- **JDBC** stands for *Java Database Connectivity*
- The five most importat interfaces in `java.sql`
    1. `Driver`
    2. `Connection`
    3. `PreparedStatement` - executes a SQL query
    4. `CallableStatement` - executes commands/code stored in the database
    5. `ResulSet` - Reads results of a query
- When working with SQL you need the `java.sql` module and import `java.sql.*`
- Parts of a JDBC URL:
    1. The protocol
    2. The subprotocol (product/vendor name)
    3. Subname (DB specific details)
- Each part is separated by `:`
- There are two main ways to get a connection: using `DriverManager` or a `DataSource`
- Methods to get a connection:
    1. `DriverManager.getConnection(String jdbcUrl) throws SQLEXception`
    2. `DriverManager.getConnection(String jdbcUrl, String user, String password) throws SQLException`
- `SQLException` is a checked exception
- There are 3 types of statements: `Statemen`, `PreparedStatement`, and `CallableStatement`. The latter two are subinterfaces of `Statement`
- `Statement` and `PreparedStatement` are similar to each other, except that `PreparedStatement` takes parameters
- An instance of  `PreparedStatement` represents a SQL statement that you want to run using the `Connection`
- Methods to run SQL statements using  `PreparedStatement`
    1. `int executeUpdate()` - Used with statements that change the data in a table: INSERT, UPDATE, DELETE. Returns the number of rows that were inserted, deleted, or changed
    2. `ResultSet executeQuery()` - Used with statements that start with SELECT
    3. `booleann execute()` - Can run either a query or an update. Returns a boolean so that we know wether there is a `ResultSet`. We can use either `getResulSet()` if it is true or `getUpdateCount()` otherwise
- A **bind variable** is a placeholder that lets you specify the actual values at runtime
- Bind variables can be set in any order and are counting starting by 1 rather than 0
- We get an `SQLException`:
    1. if we use the wrong method for a SQL statement.
    2. If we do not set all the bind variables
    3. If you set more values than you have as bind variables
- Methods to set bind variables:
    1. `setBoolean()`
    2. `setDouble()`
    3. `setInt()`
    4. `setLong()`
    5. `setObject()`
    6. `setString()`
- You can pass the sql string when using `execute()`/`executeUpdate()`/`executeQuery()` because there is a version that takes a stirng defined in the parent interface `Statment` but if you use them with `PreparedStatement` you get a `SQLException`
- You cann execute the same prepared statement multiple times with different parameters.
- JDBC supports batching so you can run multiple statements.
- Reading a `ResulSet`
```java
try(ResultSet rs = ps.executeQuery()) {
	while(rs.next()) {
		int id = rs.getInt("id");
		int name = rs.getString("name");
	}
}
```
- A `ResultSet` has a **cursor**, which points to the current location in the data
- When `next()` returns `false`, it means that there is no more data available to get
- Chech that `next()` returns `true` before trying to call a getter on the `ResulSet`. If a query did not return any rows, it would throw `SQLException`
- Attempting to access a column name or index that does not exist throws `SQLException`
- It is importan to remember the following:
    1. Always use an `if` statement or `while` loop when calling `rs.next()`
    2. Column indexes begin with 1
- We can nest `try-with-resources`, one  to create the `PreparedStatemnt` and set its parameters, and the nested one to create a `ResultSet`
- `ResultSet` get methods:
    1. `getBoolean()`
    2. `getDouble()`
    3. `getInt()`
    4. `getLong()`
    5. `getObject()`
    6. `getString()`
- A **stored procedure** is code that is compiled in advance and stored in the database.
- A stored procedure reduces network round-trips. They are database specific and introduce complexity of maintaining your app
- Stored procedures allow parameters to be for input only, output only, or both input/output.
- Calling stored procedure without parameters
```java
String sql = "{call read_prices()}";
try (CallableStatement cs = conn.prepareCall(sql);) {
	ResultSet rs = cs.executeQuery();

	while(rs.next()) {
		System.out.println(rs.getString(1));
	}
}
```
- Passing an input only parameter
```java
String sql = "{call read_prices_by_country(?)}";
try (CallableStatement cs = conn.prepareCall(sql)) {
	// the parameter name is 'country'
	cs.setString("country", "MX");
	try (var rs = cs.executeQuery()) {
		while(rs.next()) {
			System.out.println(rs.getString(2));
		}
	}
}
```
- Unlike with `PreparedStatement`, we can use either the parameter number or the parameter name.
- The two special characters `?=` specify that the stored procedure has an **ouput value**. They are optional.
- Returning an out parameter:
```java
var sql = "{?= call magic_number()}"
try (var cs = conn.prepareCall(sql)) {
	cs.registerOutParameter(1, Types.INTEGER);
	cs.execute();
	System.out.println(cs.getInt("num"));
}
```
- Always call `registerOutParameter()` for each OUT/INOUT parameter
- Working with an INOUT parameter
```java
var sql = "{call double_number(?)}";
try (var cs = conn.prepareCall(sql)) {
	cs.setInt(1, 8);
	cs.registerOutParameter(1, Types.INTEGER);
	cs.execute();
	System.out.println(cs.getInt("num"));
}
```
- JDBC resources such as `Connection` are expensive to create. Not closing them creates a resource leak that will eventually slow down you program
- Closing a JDBC resource should  close any resources that it created
- Rules for closing JDBC resources
    1. Closing a `Connection` also closes `PreparedStatement`/`CallableStatement` and the `ResultSet`
    2. Closing a `PreparedStatement`/`CallableStatement` also closes the `ResultSet`
    3. JDBC automatically closes a `ResultSet` when you run another SQL statement from the same `Statement`
- Methods in `SQLException`
    - `getMessage()`
    - `getSQLState()`
    - `getErrorCode()`

### Exam Essentials
- Name the core five JDBC interfaces and where they are defined
- Identify correct and incorrect  JDBC urls
- Describe how to get a *Connection* using *DriverManager*
- Run queries using a *PreparedStatement*
- Run queries using a *CallableStatement*
- Choose which method to run given a SQL statement.
- Loop through a *ResultSet*
- Identify when a resource should be closed

### Evaluation
- The SQL string for an stored procedure must have braces `{call method()}`
- `executeQuery(sql)`  fails at runtime. A SQLException is thrown
- When you see a question that appears to be about SQL, think about what it might be trying to test you on.

## Chapter 22 - Security
### Notes
- The **principle of least privilege** has to do with limiting access to your classes as much as possible. Think of it as *need to know* for objects.
- If your app uses modules, export security packages to the specific modules that should have access
- Mark any **sensitive class** final to prevent any subclasses
- **Immutable objects** are helpful when writing secure code because you do not have to worry about the values changing. They also simplify code when dealing with concurrency.
- Strategy for making a class immutable.
    1. Mark the class `final`
    2. Mark all the instance variables `private`
    3. Do not define any setter methods and make fields final
    4. Do not allow referenced mutable objects to be modified
    5. Use a constructor to set all the properties of the object, making a copy if needed
- Meke a copy of the mutable objects that you receive in a constructor. This is know as **defensive copy**
- By default the `clone()` method makes a **shallow copy** of the data, which means only top-level object references and primitives are copied. No new objects from within the cloned objects are created. **You can write an implementation that does a deep copy and clones the objects inside**
- The `clone()` method is defined in the class `Object`
- Clonable logic
    1. If object does not implement `Cloneable`, an exception is thrown
    2. If the object implements `Cloneable` and does not override `clone()` then a shallow copy is created
    3. If the object implements `Cloneable` and overrides `clone()` an implementation dependent copy is created. It might be a deep copy.
- **Injection** is an attack where dangerous input runs in a program as part of a command
- An **exploit** is an attack that takes advantages of a weak security
- Sources of untrusted data:
    1. User input
    2. Reading from files
    3. Retrieving data from a database
- **Command injection** uses operating system commands to do something unexpected
- A **whitelist** allow us to specify which values are allowed.
- When validation fails you can:
    1. Throw an exception
    2. Log a message
    3. Take any other action of your choosing
- Avoid putting confidential information in a `toString()` call.
- Sensitive contexts:
    1. Writing to a log file
    2. Printing an exception or stack trace
    3. `System.out` and `System.err` messages
    4. Writing to data files
- A **dump file** contains values of everything in memory
- It is a good practice to set confidential information to `null` when you are done using it.
- Try to have confidential data in memory for as short a time is possible
- Use a **security policy** to control what the program can access
- **Defense in depth** is to apply multiple techniques to protect your application. For instance: *validation and using a security policy*
- It is important not to rely on the constructor for custom validation logic (it is not called at deserialization).
- You can specify the fields to be serialized in a an array:
```java
private static final ObjectStreamField[] serialPersistenFields = { new ObjectStreamField("fieldName", String.class)};
```
- You can think of `serialPersistentFields` as the opposite of `transient`
- Alway use the modifiers `private static fianl` with `serialPersistentFields`
- If fields that were not declared to be serializable are referenced in `writeObject/readObject`, we get an `IllegalArgumentException`
- The method `Object readResolve()` is run after `readObject()` and is capable of replacing the reference of the object returned by deserialization
- The `writeReplace` is run before `writeObject()` and allow us to replace the object that gets serialized.
- `readResolve()` and `writeReplace()` can have any  modifiers (except `static`), including any access modifier
- `readObject()`, `readResolve()`, `writeObject()`, `writeReplace()` are optional and must be declared in the `Serializable` object to be used
- When constructing sensitive objects you need to ensure that subclasses can't change the behaviour
- Make methods `final`. You should not allow a constructor to call methods that a sublcass can override
- Make classes `final`
- Make constructors `private` to prevent or control subclasses. Factory methods give you more control over the process of object creation.
- A **Denial of Service (DoS)** attack is when a hacker makes one or more requests with the intent of disrupting legitimate requests.
- Check the size of the file before reading it
- An **inclusion attack** is when multiple files or components are embedded within a single file. *Any file that you did not create is suspect*
- When accepting numeric input, you need to verify it is not to large or to small
- Beware of code that attempts to create a very large array or other data structure. You could limit the size of an array parameter or, better yet, do not allow the size to be set at all.

### Exam Essentials
- Identify ways of prevention DOS attacks
- Protect confidential information in memory
- Compare injections, inclusions, and input validation
- Design secure object
- Write serialization and deserialization code securely.
-

### Evaluation
- If a class is immutable then it must have good encapsulation and it must restrict extensibility
- A DDos/Dos attacke requires multiple requests
- `readResolve()` and `writeReplace()` return `Object` and throw `ObjectStreamException`


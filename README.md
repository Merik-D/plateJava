# plateJava
Create a class according to your option from the list below
Using the lombok library, you should implement the set and get methods, constructors with arguments, the constructor by soaking and the overridden method toString()
The written class must contain a public static method getInstance(), and a field static field instance whose value will be returned by the method getInstance
In the class, you should also write the main method, in which you should create an array of class objects using:
- the default designer
- a constructor that receives all parameters
- 2 objects obtained when the getInstance method is called


Create a Laptop class that will have the following fields:
model: laptop model, by default "Unknown";
screenSize: laptop screen size in inches, default 15.6;
ram: the amount of RAM in GB, by default 8;
storage: the amount of storage memory in GB, by default 256;
batteryLife: battery life in hours, default 5.

The Laptop class must have the following public methods:
addRam(int value): a method that increases the amount of RAM by a given number;
addStorage(int value): a method that increases the amount of disk space by a given number;
charge(): A method that sets the maximum charge level

# Using Processing 3 in IntelliJ IDEA

This repository contains an example [Processing 3](https://processing.org) multi-sketch project in [IntelliJ IDEA](https://www.jetbrains.com/idea/).

![image](https://user-images.githubusercontent.com/7855659/47369190-70038800-d6e3-11e8-9ae0-1090784ca0e0.png)

Setting up:

1. Clone this repo 
1. Open the project in IntelliJ IDEA (File > Open.. > Navigate to processing-intellij)
1. Open Debug Config (see screenshot below)
1. Add the same configuration you see on the screenshot (see screenshot)
1. Build & run (```shift+f10``` on windoes)

![image](https://user-images.githubusercontent.com/7855659/47367486-0766dc00-d6e0-11e8-9369-331faebfd56e.png)
![image](https://user-images.githubusercontent.com/7855659/47367738-9673f400-d6e0-11e8-8f16-3172a619b2d5.png)

## Add Templates

File > Import Settings... > navigate to processing-intellij folder and select ```templates.jar```

## Adding sketches

1. create a new package under ```src```

![image](https://user-images.githubusercontent.com/7855659/47368102-4f3a3300-d6e1-11e8-92d4-f3577c1173c8.png)

2. Create a new class from the```SketchBase``` template

![image](https://user-images.githubusercontent.com/7855659/47368253-93c5ce80-d6e1-11e8-8081-f20c253e7f75.png)

3. In ```BaseMain```, add the path to your new sketch's base class to the ```sketches`` String array (the format is _pacakgeName.ClassName_)

4. To add classes to a sketch, create a class from ```SketchObject``` in the same package as the sketch base class. Make sure to always pass the PApplet object (```this```) into the constructor, so that PApplet's methods (```fill()```, `colorModer()`, `random()` and so on) will be available inside the object, from the local PApplet object (In the `example.Example` sketch, I've used `p` as the PApplet inside the Walker object) 

# About

This project contains the Processing core libraries and is therefore distibuted under [GPL licence](LICENSE.md).

*Thank you Processing!*

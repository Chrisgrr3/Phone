# Phone

This Java program creates individual phones that extend from the *Phone* abstract class, with this abstract class defining each Phone as having a *versionNumber*, *batteryPercentage*, 
*carrier*, and *ringTone*. This abstract class also include the *displayInfo* method which is utilized within each subclass to output the individual phone's *versionNumber*, 
*carrier*, and *batteryPercentage*.

The subclasses also implement the *Ringable* interface, which gives each Phone subclass the ability to *ring()* and *unlock()*, which are both methods that return a String.

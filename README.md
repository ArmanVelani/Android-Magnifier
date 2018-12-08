# Android-Magnifier
## by Arman Velani(N01187157)


## Synopsis

My topic was about Magnifier in android. There are various types of magnifiers like text magnifier, image magnifier or camera magnifier.
text magnifier zooms the text when you touch or hover on it. same is for the image magnifier. the camera magnifier uses the secondary phone camera and then uses the whole phone as a magnifing tool. you might have seen this features mostly in iphones while tying a text message or checking a webpage image on google. It is introduced recently in android operating system. the magnifier only supports on android 9 which is the latest android operating system released in August 2018. To describe it even better lets just say it is a virtual magnifying glass that displays the enlarged view through an overlay pane that represents the lens.
    the usage for the magnifiger are a lot more than we can think of. it is used to point the pointer exactly between two letter. another usage is to use it for enlarging small text on a webpage or in a textbox. also you can use in to zoom the names of the places on the map. Due to it being released very recently there are not much contents available for it online. although many people tried to create third party apps for android in order to get a magnifier like ios in android but none of them can perform well. thus google finally decided to do it by themself and launched the magnifier widget function in android 9.0. this has prooved to be very helpful so far as users can finally copy, cut or delete the exact part of the text by selecting it.

## Code Example

The magnifier is already integrated with TextView, WebView and EditText. My application basically runs on the latesst android 9.0 basically it does not have any huge piece of code to run it as the magnifier widget is inbuilt in the android now. i have a couple of text view that when longpressed on any text it opens up the magnifier and keeps it on until the user lifts the finger off.
this feature was not well developed for android until recent August 2018, so i was not able to find much references. The piece of code that can explain it better on how the magnifier works is below:
```
View Real = findViewById(R.id.Real);
Magnifier mag = new Magnifier(Real);
mag.show(Real.getWidth() / 2, Real.getHeight() / 2);
```
here using view you find a view to magnify using id and then using the magnifier widget you create a new view. whenever you touch the first view it will popup another view and magnify the width and height by 2 times and display it into the new view.

you can also do this on an image using the following piece of code.this is called magnify on user interaction.
```
imageView.setOnTouchListener(new View.OnTouchListener() {
    @Override
    public boolean onTouch(View v, Motion event) {
        switch (event.getActionMasked()) {
            case Motion.DOWN:
                
            case Motion.MOVE: {
                final int[] viewPosition = new int[2];
                v.getLocationOnScreen(viewPosition);
                magnifier.show(event.getRawX() - viewPosition[0],
                               event.getRawY() - viewPosition[1]);
                break;
            }
            case Motion.CANCEL:
            case Motion.UP: {
                magnifier.dismiss();
            }
        }
        return true;
    }
});
```
here you use a setontrouchlistener so that whenever you touch the view it performs a specific function. in this case it actiates on the touch and then checks for the position of the users finger on the screen. once located it uses MOVE to check the movement in the position of the cursor and later show a magnifier that moves with the users finger. aslo when the user lifts the finger off it go to case CANCEL and dismisses the magnifier. it is a very basic and simple code that was developed by developer.android.com

## Motivation

The main motivation for this project is that I was an ios user before and during and text conversation or email converstaion I used Magnifier tool alot and had never noticed it ever. but, last year i switched to android Operating system. this was the time when i realised that what an important function android is missing. this made me think over it and i tried to create a magnifier application for my own phone but when i actually went in detail for it just a simple magnifier was using a hell lot of codes. i found a couple of resources on github for people who were using a magnifier to enlarge the image in their application. I didnt find exactly what i was looking for until google release the magnifier widget for android os 9.0. so i tried to create a small example for how does the magnifier works.

## Installation
 
 the installation for the code is very simple. all you will need would be the laterst version of android studio.
 the latest android 9.0 emulator or physical device.
 when you have all the required materials download the app code from here.
 Open it on android studio.
 sync it.
 build it.
 and then run it on emulator or physical device.

## Tests

the Test are simple enough to run.

when you have the application running on the emulator/physical Device, click on any one of the three text box. you can type in the new content if you like or use the one provided to test it.

click on any part of the text.
once you get the red lower pointer, touch it and move it around the text.
you can look at the zoomed text in the magnifier and using it reach at any desired location in textbox without actually getting frustrated.

another test you can is similar except this time you try to select a sentence or couple of sentences it will show the magnifier on the top and will move with the users pointer. you can use this to easily cut or delete a specific text.

## Contributors
Most of the contribution was through github. 
I found a [repository](https://github.com/nomanr/android-image-magnifier) of a guy who created an application to zoom into image using magmnifier.
also i found another [repository](https://github.com/ellisa1419/android-image-magnifier) that had example of magnifier by using a complex amount of code and library.
another major resource was [Developer.android.com](https://developer.android.com/guide/topics/text/magnifier#java) who gave me very specific and detailed informaton about the magnifier widget.
also i got the release information from a third party site called [android.gadgethacks.com](https://android.gadgethacks.com/news/google-added-iphone-style-text-magnifier-android-9-0-pie-0183328/)

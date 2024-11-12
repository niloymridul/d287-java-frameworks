## Niloy Mridul
## STUDENT ID - 011540530
## D287 – JAVA FRAMEWORKS
In this README file, I will be explaining what changes I have made during this project.
## BASIC INSTRUCTIONS

C - Customize the HTML user interface for your customer’s application. The user interface should
include the shop name, the product names, and the names of the parts.

Here is what I have done for this part: (Note all of this was done via the mainscreen.html file).
- Added a Style tag and CSS style choices from lines 4 to 24 which consists of color, font-size,etc:
```
  <!-- CSS Styling -->
    <style>
        .header-image {
            display: block;
            margin-left: auto;
            margin-right: auto;
            width: 100%;
        }

        body {
            margin: 0;
            padding: 0;
            color: #800080;
            background-color: #d8bfd8;
            font-family: "Gill Sans", Helvetica, Arial, sans-serif;
            font-size: 1em;
            line-height: 1.2;
        }

        h1 {
            margin: 0;
            margin-top: 0.67em;
            font-weight: bold;
            font-size: 1.8em;
            line-height: 1;
        }

        h2 {
            margin: 0 0 1em;
        }

        p {
            margin: 1em 0 1.5em;
            line-height: 1.5;
        }

        a:link {
            color: blue;
            background-color: transparent;
        }

        a:visited {
            color: purple;
            background-color: transparent;
        }

        a:focus {
            color: #fff;
            background-color: #000;
            outline: 0;
        }

        a:active {
            color: red;
            background-color: transparent;
        }

        .container {
            margin: 0 auto;
            max-width: 60em;
            background: #fff;
        }

        .header-primary {
            background:#ccc;
            padding: 20px;
        }

        .navigation-primary {
            background-color: #666;
        }

        .navigation-primary ul {
            margin: 0;
            padding: 0;
            list-style-type: none;
            overflow: hidden;
        }

        .navigation-primary li {
            display: inline;
        }

        .navigation-primary a {
            float: left;
            padding: .5em 1em;
            color: #fff;
            background: #666;
            text-decoration: none;
            border-right: 1px solid #fff;
        }

        .navigation-primary a:hover {
            background: green;
        }

        .navigation-primary a:focus {
            background: #000;
            outline: none;
        }

        .navigation-primary a:active {
            background: red;
        }

        .content-container {
            padding: 2em;
            background: #fff;
        }

        .footer-primary {
            background-color: #4B0082;
            color: #fff;
            padding: 20px;
        }
    </style>
```
- For lines 41, I changed the heading of the shop to that of a Car Shop that sells Toyota parts. This part is underlined.
```
    <h1><u>Car Central</u></h1>
```
- For lines 42 - 43, I added an image from a stock free image website, resized it and centered right below the new 
title.
```
<img src="https://images.pexels.com/photos/29028107/pexels-photo-29028107/free-photo-of-sleek-white-toyota-sports-car-in-front-of-dealership.jpeg"
         alt="pexels.com" style ="width: 350px;height: 200px" class = "center" !important>
```
- For lines 45, I renamed the heading to what the car shop does which is sell toyota parts. 
All the headings have underlines.
```
    <h2><u>Toyota Car Parts</u></h2>
```
- For lines 102, I renamed the heading to Car Products and Add's on as they improve the vehicle but
are not necessarily neeeded for the vehicle to work.
```
    <h2><u>Car Products/Add-On's</u></h2>
```
- For lines 164 to 169, I added in a footer as every company should have a way to contact
them in case of customer complaints and bad practices.
```
<footer>
    <p>Please Call 1-NOT-###-REAL<br>
        <p> Or use the email down below</p>
        <a href="mailto:carcentral@cars.com">carcentral@cars.com</a></p>
    <p>Copyright @CarCentral</p>
</footer>
```

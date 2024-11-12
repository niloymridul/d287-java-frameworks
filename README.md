## Niloy Mridul
STUDENT ID - 011540530

D287 – JAVA FRAMEWORKS

In this README file, I will be explaining what changes I have made during this project.

## C - Customize the HTML user interface for your customer’s application. The user interface shouldinclude the shop name, the product names, and the names of the parts.
 
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
## D - Add an “About” page to the application to describe your chosen customer’s company to web viewers and include naviga�on to and from the “About” page and the main screen.
I have done the following:
- I redited some of the lines in the mainscreen.html file to have it look better grammatically. The one below is line 88.
````
<td>Makes all axles and angles possible while driving.(Comes in both directions for turning.)</td>
````
- This line is 173. Again, both the line down below and the one above changes the writing but has little to no impact on
functionality.
````
<p> Or use the email down below if you have any questions.</p>
````
- I also added a button function on line 175 as usually the bottom of the website is where people find the 
about page describing the company.
````
 <a href="/about" class="btn btn-info">About Car Central</a>
````
- I then created the about.html file which was copied and re-edited from the mainscreen.html file.
Here is the code as I had added the styling from the mainscreen page to be consistent with the color schemes.
I also wrote a short blurb regarding the company and added a button to return the main page.
Please note the lines are from 1 to 56 of the file. This also includes a button to return to the mainscreen page.
````
<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <style>
        body{
            background-color: #203544 !important;
            font-family: "Times New Roman",serif !important;}
        h1{
            color: snow;
            text-align: center;
            font-size: 50px !important;
        }
        h2{color: white;}
        p{color: honeydew;}
        td{color: aliceblue}
        a:link{
            color: whitesmoke;}
        th{color: cornsilk;}
        form{color: beige;}
        img {
            display: block;
            margin-left: auto;
            margin-right: auto;
        }
    </style>
    <meta charset="UTF-8">

    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <title>Car Central About Page</title>
</head>

<body>

<div class="container">
    <h1><u> About Us</u></h1>
    <p>When it comes to car dealerships, the majority of the time people have to look high and low for the exact thing
    that they are looking for. Here, we only provide the best cars that the lands have to offer. We also provide
    car parts and add-on's that can be bought seperately. We are located in all 7 continents. Our business provides
    only the best for everyone. Please stop by! </p>
    <footer>
        <p>Please Call 1-NOT-###-REAL<br>
        <p> Or use the email down below if you have any questions.</p>
        <a href="mailto:carcentral@cars.com">carcentral@cars.com</a></p>
        <p>Copyright @CarCentral</p>
    </footer>
    <a href="/mainscreen" class="btn btn-info">Main Screen</a>
</div>
</body>
</html>
````
- Also, because we need to link the mainscreen.html file to the about.html file, I added a @Controller method to the 
MainScreenControllerr.java file on lines 55 to 57.
````
@GetMapping("/about")
    public String about() { return "about.html"; }
}
````
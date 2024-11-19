## Niloy Mridul
STUDENT ID - 011540530

D287 – JAVA FRAMEWORKS

In this README file, I will be explaining what changes I have made during this project.

## C - Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.

Here is what I have done for this part: (Note all of this was done via the mainscreen.html file). 
Filename: mainscreen.html
- Lines 4 to 24 - Added a Style tag and CSS style choices which consists of color, font-size,etc:
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
Filename: mainscreen.html
- Lines 41 - I changed the heading of the shop to that of a Car Shop that sells Toyota parts. This part is underlined.
```
    <h1><u>Car Central</u></h1>
```
Filename: mainscreen.html
- Lines 42 to 43 - I added an image from a stock free image website, resized it and centered right below the new 
title.
```
<img src="https://images.pexels.com/photos/29028107/pexels-photo-29028107/free-photo-of-sleek-white-toyota-sports-car-in-front-of-dealership.jpeg"
         alt="pexels.com" style ="width: 350px;height: 200px" class = "center" !important>
```
Filename: mainscreen.html
- Line 45 - I renamed the heading to what the car shop does which is sell toyota parts. 
All the headings have underlines.
```
    <h2><u>Toyota Car Parts</u></h2>
```
Filename: mainscreen.html
- Lines 102 - I renamed the heading to Car Products and Add's on as they improve the vehicle but
are not necessarily neeeded for the vehicle to work.
```
    <h2><u>Car Products/Add-On's</u></h2>
```
Filename: mainscreen.html
- Lines 164 to 169 - I added in a footer as every company should have a way to contact
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
Filename: mainscreen.html
- Line 88 - I redited some of the lines in the mainscreen.html file to have it look better grammatically.
````
<td>Makes all axles and angles possible while driving.(Comes in both directions for turning.)</td>
````
Filename: mainscreen.html
- Line 173 - Again, both the line down below and the one above changes the writing but has little to no impact on
functionality.
````
<p> Or use the email down below if you have any questions.</p>
````
Filename: mainscreen.html
- Line 175 - I also added a button function as usually at the bottom of the website is where people find the 
about page describing the company.
````
 <a href="/about" class="btn btn-info">About Car Central</a>
````
Filename: about.html
- Line 1 to 56 - I then created the about.html file which was copied and re-edited from the mainscreen.html file.
Here is the code as I had added the styling from the mainscreen page to be consistent with the color schemes.
I also wrote a short blurb regarding the company and added a button to return the main page.
 This also includes a button to return to the mainscreen page.
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
Filename: about.html
- Also, because we need to link the mainscreen.html file to the about.html file, I added a @Controller method to the 
MainScreenControllerr.java file on lines 55 to 57.
````
@GetMapping("/about")
    public String about() { return "about.html"; }
}
````
## E - Add a sample inventory appropriate for your chosen store to the applica�on. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.

For this part I have done the following:

Filename: mainscreen.html
- Line 17 and Line 19 were given !important tag to ensure that the text on tables were ensured to have color matching 
the desired output.
````
  Line 17 - td{color: white !important;}
  Line 19 - th{color: cornsilk !important; }
````
Filename: mainscreen.html
- Line 90 to 93,had the tag description taken out.
````
 <th>Name</th>
 <th>Price</th>
 <th>Inventory</th>
 <th>Action</th>
````
Filename: BootStrapData.java
-Line 33,added private variable to use to create inhouse products and add them to website.
````
private final InhousePartRepository inhousePartRepository;
````
Filename: BootStrapData.java
-Line 36, added a input for the constructor to help build the products which are objects.
````
public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository, InhousePartRepository inhousePartRepository) {

````
Filename: BootStrapData.java
-Line 40, added the line to use the inputs for the constructor to help build the products so we do not need 
to type in the products manually everytime we opened the website code.
````
this.inhousePartRepository = inhousePartRepository;
````
Filename: BootStrapData.java
-Line 43 - 153, added the products and parts for the shop. Made using both the inhouse and outsourced repository code
to diversify the range of options of parts. The products were seperate but still included nonetheless. Also included a 
a count function to check if there were products saved before. If there were, the check was written to flush out the 
previous save data.

````
@Override
    public void run(String... args) throws Exception {
//InHouse------------------------------------------------------------------------------------------------
        if(inhousePartRepository.count() > 0) {
            inhousePartRepository.deleteAll();
            outsourcedPartRepository.deleteAll();
            productRepository.deleteAll();
        }
        if (inhousePartRepository.count() == 0) {
            List<InhousePart> inhouseParts = (List<InhousePart>) inhousePartRepository.findAll();


            InhousePart HeadLightAssembly = new InhousePart();
            HeadLightAssembly.setName("Head Light Assembly");
            HeadLightAssembly.setInv(12);
            HeadLightAssembly.setPrice(67.66);
            HeadLightAssembly.setId(5);
            inhousePartRepository.save(HeadLightAssembly);
            InhousePart thePart = null;
            inhouseParts = (List<InhousePart>) inhousePartRepository.findAll();
            for (InhousePart part : inhouseParts) {
                if (part.getName().equals("HeadLightAssembly")) thePart = thePart;
            }

            InhousePart IgnitionCoil = new InhousePart();
            IgnitionCoil.setName("Ignition Coil");
            IgnitionCoil.setInv(132);
            IgnitionCoil.setPrice(47.38);
            IgnitionCoil.setId(6);
            inhousePartRepository.save(IgnitionCoil);
            thePart = null;
            inhouseParts = (List<InhousePart>) inhousePartRepository.findAll();
            for (InhousePart part : inhouseParts) {
                if (part.getName().equals("Ignition Coil")) thePart = thePart;
            }

            InhousePart TransmissionMount = new InhousePart();
            TransmissionMount.setName("Transmission Mount");
            TransmissionMount.setInv(3);
            TransmissionMount.setPrice(70.00);
            TransmissionMount.setId(7);
            inhousePartRepository.save(TransmissionMount);
            thePart = null;
            inhouseParts = (List<InhousePart>) inhousePartRepository.findAll();
            for (InhousePart part : inhouseParts) {
                if (part.getName().equals("Transmission Mount")) thePart = thePart;
            }

            InhousePart Battery = new InhousePart();
            Battery.setName("Battery");
            Battery.setInv(8);
            Battery.setPrice(167.49);
            Battery.setId(8);
            inhousePartRepository.save(Battery);
            thePart = null;
            inhouseParts = (List<InhousePart>) inhousePartRepository.findAll();
            for (InhousePart part : inhouseParts) {
                if (part.getName().equals("Battery")) thePart = thePart;
            }


            inhouseParts = (List<InhousePart>) inhousePartRepository.findAll();
            for (InhousePart part : inhouseParts) {
                System.out.println(part.getName() + " " + part.getId());
            }
        }
//Outsource-----------------------------------------------------------------------------------------------------------
        if (outsourcedPartRepository.count() == 0) {

            List<OutsourcedPart> outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();


            OutsourcedPart CVAxle = new OutsourcedPart();
            CVAxle.setCompanyName("Foreign Parts Galore");
            CVAxle.setName("CV Axle");
            CVAxle.setInv(13);
            CVAxle.setPrice(27.66);
            CVAxle.setId(9);
            outsourcedPartRepository.save(CVAxle);
            OutsourcedPart theOutPart = null;
            outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for (OutsourcedPart part : outsourcedParts) {
                if (part.getName().equals("CV Axle")) theOutPart = part;
            }


       
            System.out.println(theOutPart.getCompanyName());


            outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for (OutsourcedPart part : outsourcedParts) {
                System.out.println(part.getName() + " " + part.getCompanyName());
            }

//Product-----------------------------------------------------------------------------------------------------------
            Product antifreeze = new Product("AntiFreeze", 15.65, 63);
            Product filters = new Product("Air Filters", 10.17, 22);
            Product fueltankcaps = new Product("Fuel Tank Caps", 9.38, 5);
            Product floormats = new Product("Floor Mats", 93.84, 17);
            Product airfreshener = new Product("Car Air Freshener - Mint Flavored", 6.40, 89);

            productRepository.save(antifreeze);
            productRepository.save(filters);
            productRepository.save(fueltankcaps);
            productRepository.save(floormats);
            productRepository.save(airfreshener);


        }
    }
````
# F - Add a “Buy Now” button to your product list. Your “Buy Now” bu�on must meet each of the following parameters:
• The “Buy Now” button must be next to the buttons that update and delete products.
• The button should decrement the inventory of that product by one. It should not affect the
inventory of any of the associated parts.
• Display a message that indicates the success or failure of a purchase.

For this part, I have done the following:


Filename: mainscreen.html
- Line 104, I added a line to bring up the button for the mainscreen to buy any of the listed product.
````
<a th:href="@{/buyProduct(productID=${tempProduct.id})}" class="btn btn-primary btn-sm mb-3">Buy Now</a>
````

New File Created: BuyProductController.java
-Line 1 to 43, I created a new Java file to act as a controller for when the user wishes to buy a product. As a controller,
the file will handle the request and decide whether or not the product will be bought, if it can be bought and the change 
of products inventory via a if else chain. The end results of the chain will lead to the newly created html files that 
show whether or not the product has been bought. Also after the if chain ends and the product can be bought and is bought,
the product inventory is lessened by 1 and saved right before going to the productboughtsuccess.html file.

````
package com.example.demo.controllers;

import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
public class BuyProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/buyProduct")
    public String buyProduct(@RequestParam("productID") Long theId, Model theModel) {
        Optional<Product> desiredproduct = productRepository.findById(theId);
        if (desiredproduct.isPresent()) {
            Product product = desiredproduct.get();

            if (product.getInv() > 0) {
                product.setInv(product.getInv() - 1);
                productRepository.save(product);
                return "/productboughtsuccess";

            } else {
                return "/productboughtfailure";
            }
        } else {
            return "/productboughtfailure";
        }
    }
}
````

New File Created: productboughtfailure.html
- Line 1 to 30, as stated as  above when creating the BuyProductController.java file, this one of two files that determine
whether or not a product has been bought or not. This one is for when the product is not bought sucessfully as per the title
of the file. This file comes with the same style settings as the main page to keep with consistency. There is also a link
that will go back to the main page when the user reaches the page.

````
<!DOCTYPE html>
<html lang="en">
<head>
    <style>
        body{
            background-color: #203544 !important;
            font-family: "Times New Roman",serif !important;}
        h1{
            color: snow;
            text-align: center;
            font-size: 40px !important;
        }
        tbody{color: white !important;}
        h2{color: white;}
        h3{color:white;}
        p{color: honeydew;}
        td{color: white !important;}
        a:link{color: whitesmoke;}
        th{color: cornsilk !important; }
    </style>
    <meta charset="UTF-8">
    <title>Product Bought Unsuccessful.</title>
</head>
<body>
<h1>The product was not able to be bought. We apologize for the trouble. Please try again.</h1>
<p>Click down below to go back to the main page!</p>
<a href="http://localhost:8080/">Main Page</a>

</body>
</html>
````
New File Created: productboughtsuccess.html
- Line 1 - 30, just like the productboughtfailure.html file, this also includes the style changes and is used as one of
two files to determine whether a product is bought or not. The only difference is that text for the website is written to
show that the product was successfully bought.
````
<!DOCTYPE html>
<html lang="en">
<head>
    <style>
        body{
            background-color: #203544 !important;
            font-family: "Times New Roman",serif !important;}
        h1{
            color: snow;
            text-align: center;
            font-size: 40px !important;
        }
        tbody{color: white !important;}
        h2{color: white;}
        h3{color:white;}
        p{color: honeydew;}
        td{color: white !important;}
        a:link{color: whitesmoke;}
        th{color: cornsilk !important; }
    </style>
    <meta charset="UTF-8">
    <title>Product Bought Successfully</title>
</head>
<body>
<h1>The product was bought successfully. Thank you for your purchase.</h1>
<p>Click down below to go back to the main page!</p>
<a href="http://localhost:8080/">Main Page</a>

</body>
</html>
````

![Status Stable](https://img.shields.io/badge/Status-Stable-blue)
[![MIT License](https://img.shields.io/badge/License-MIT%20License-brightgreen)](https://github.com/tterb/atomic-design-ui/blob/master/LICENSEs)
# Sporty Shoes - Backend Application
Sporty Shoes is a SpringBoot backend application, and its purpose is to manage the inventory of a store, along with the client's information, and their purchases.
## Table of Contents
- Sporty Shoes
	* [Installation](#installation)
	* [Usage](#usage)
	* [Credits](#credits)
	* [Features](#features)
- [🔗 Links](#---links)
	+ [GitHub Repository](#github-repository)
	+ [Support](#support)
	+ [Authors](#authors)
## Installation
Since the application is written using SpringBoot, a JVM is a must. Please install Java version 11 as a minimum. Also MySQL is used to store all data. And since the application does not have a UI, you will also need Postman or Insomnia to perform the API calls.
````````````````````````
- Java 11
- MySQL Server
- Postman
````````````````````````
## Usage
````````````````````````
Since this is a backend application and the UI is not a requirement for this project, we will use Postman to demonstrate how it works. Just run the application from your IDE and use the file named "Project3-SportyShoes.postman_collection.json" to load the API calls you will use in Postman.
````````````````````````
<p align="center"><img src="./images/front-image.JPG" /></p>
<p align="center"><img src="./images/SpringBootApp.JPG" /></p>
## Current Features
````````````````````````
The application uses this API calls to manage the store:
- Log in to the application using an Admin account
	+ admin login
	+ newPassword  
- Categorize the products
	+ getAllProducts
	+ updateCategory
- Browse and search for registered users
	+ getAllUsers
	+ getUserById
	+ getUserByName
- Filter purchase reports by date and category
	+ getAllPurchases
	+ getPurchaseByDate
	+ getPurchaseByCategory

````````````````````````
<p align="center"><img src="./images/postman-detail.JPG" /></p>

## Future Features
````````````````````````
- Develop a User Interface using Angular
- Instead of MySQL, switch to MongoDB 
- Move to a cloud service
````````````````````````

## Contributions
If you would like to contribute to this project, you are very welcome! Fork the code and then submit a pull request with your changes.
In case you need them, here are some guidelines: [Contributor Covenant](https://www.contributor-covenant.org/)
# 🔗 Links
### GitHub Repository
[https://github.com/giannifontanot/ud-project1-hotelreservation/](https://github.com/giannifontanot/simplilearn-project3-sporty-shoes/)
### Support
If you need help with this project, please write to: [gianni.fontanot@gmail.com](https://mailto:gianni.fontanot@gmail.com)
### Authors
 - [@giannifontanot](https://www.github.com/giannifontanot)
 - [![portfolio](https://img.shields.io/badge/my_portfolio-000?style=for-the-badge&logo=ko-fi&logoColor=white)](https://giannifontanot.github.io/portfolio/)
 - [![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/gianni-fontanot/)

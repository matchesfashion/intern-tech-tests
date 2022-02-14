# Matchesfashion React Coding Challenge

## Running the application

Firstly, run `npm install` to install the dependencies required for this project.

This application was made using create-react-app, and so to run the solution, simply use `npm start` in
your terminal. The scripts can be found at the bottom of this readme.

## Introduction

The test is broken up into a series of steps which will be displayed in the next section.
We ask that you don't use any other packages or libraries, and just implement the code using
React. To fetch the data, please **ONLY USE FETCH**. The fetch function has been mocked, so you do
not require internet access to complete this challenge.

## The Problem

Your solution is to be completed within the folder

> src/Solution/YourSolution.js

The folder AdditionalFiles, contains files that are not part of your task, such as css, mocked data and
react boilerplate.

The app that you are required to build features a table, your task will be to populate this table with
a list of products which are fetched from an API. The url for this API takes `pages` as a query parameter,
for example `https://matchesfashion.com/api/products?page=0`, this returns a `count` of the total number of products
and the array of products themselves.

The products are broken up into 10 items per page and the first page is `0`, the ids of the products also begin at `0`.

An example product can be found below:

```js
product: {
    brand: "Bottega Veneta",
    costToBusiness: 74.91,
    id: 0,
    name: "obtainable t-shirt",
    quantitySold: 113,
    soldPrice: 231.31
}
```

### Example Implementation

To see an example of the implementation, go to the following url: <https://stunning-eureka-1d016a47.pages.github.io/>

## Your Task

You are **not** required to complete any CSS or to worry about the look/style of the app.

1. Your first task is to fetch the data for the first page `0` and display the contents of the product within the `table`
   in the `YourSolution.js` file (please ensure to place it within the `tbody` tags).

2. Next you are required to implement the functionality of the buttons at the bottom of the table and display the rest
   of the results based on the page that you go to. The buttons should do the following:
   - **First Page**
     - this button should take you to the first page of the table
     - it should be disabled if the current page is the first page
   - **Previous Page**
     - this button should take you to the previous page of the table
     - it should be disabled if the current page is the first page
   - **Next Page**
     - this button should take you to the next page of the table
     - it should be disabled if the current page is the last page
   - **Last Page**
     - this button should take you to the last page available of the table
     - it should be disabled if the current page is the last page

### Bonus Task

The bonus task is to add a new field to the table headers called `Profit after Tax`. After this, you are required
to calculate the total profit for each product in the table. Below is the calculation for this

```js
Profit = Sold Price - Cost To Business

You pay no tax on the first 10 quantity sold for that product,
after that, pay 0.08 tax on all profits made for that product.

For example, { quantitySold: 12, costToBusiness: 20, soldPrice: 50 }

Pay no tax on first 10 sold, so 300 profit
Pay tax on the two above the threshold, so 55.2 profit

Profit after Tax is 355.20
```

You can use the `ProfitAlgorithm.spec.js` file to test your calculations if it helps.

## Available Scripts

This project was bootstrapped with [Create React App](https://github.com/facebook/create-react-app).

In the project directory, you can run:

### `npm start`

Runs the app in the development mode.\
Open [http://localhost:3000](http://localhost:3000) to view it in your browser.

The page will reload when you make changes.\
You may also see any lint errors in the console.

### `npm test`

Launches the test runner in the interactive watch mode.\
See the section about [running tests](https://facebook.github.io/create-react-app/docs/running-tests) for more information.

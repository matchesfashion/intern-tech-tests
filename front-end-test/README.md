# MATCHESFASHION Front End Coding Challenge

## Introduction

The test is broken up into a few steps which will be described in the next section.

We ask that you limit the use of libraries and implement the code using just HTML, CSS, and JavaScript. To fetch the data, please use the [Fetch API](https://developer.mozilla.org/en-US/docs/Web/API/Fetch_API/Using_Fetch).

## Set Up

We have created a basic Node server you can use by installing [Node](https://nodejs.org/en/) (version 12 and above) and running `http-server` in Node command prompt in the [`/src`](/front-end-test/src) folder.  

The basic page should be viewable in a browser on `http://localhost:8080/`.

## The Problem

Your solution is to be completed within the [`/src`](/front-end-test/src) folder.

There is some generic HTML and CSS there you are welcome to use.

The app that you are required to build is a simple product listing page. Product information should be fetched from the [`/src/products`](/front-end-test/src/products) folder.

## The Task

The task is to:

1. Display the first 12 products in a grid up to four columns wide.

2. Show a "load more" button that loads an additional 12 products.

3. Make sure the page works on large and small devices (one or two columns on mobile).

Bonus tasks:

- Allow the user to sort by price low to high ([example here](https://github.com/matchesfashion/intern-tech-tests/blob/master/front-end-test/list-example.png)).

Th product JSON looks as follows:

```json
{
  "name": "Fringed checked wool-blend coat",
  "designer": "Marni",
  "url": "/products/Marni-Fringed-checked-wool-blend-coat-1454160",
  "price": "£1,790",
  "index": 0,
  "code": "1454160",
  "images": [
    "//assetsprx.matchesfashion.com/img/product/1454160_1_medium.jpg",
    "//assetsprx.matchesfashion.com/img/product/1454160_2_medium.jpg",
    "//assetsprx.matchesfashion.com/img/product/1454160_3_medium.jpg",
    "//assetsprx.matchesfashion.com/img/product/1454160_4_medium.jpg",
    "//assetsprx.matchesfashion.com/img/product/1454160_5_medium.jpg",
    "//assetsprx.matchesfashion.com/img/product/1454160_6_medium.jpg"
  ]
}
```

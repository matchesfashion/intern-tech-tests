# Matchesfashion Python Coding Challenge

## Setting up the environment

Before you can get started we need to create a "virtual environment". This is
essentially an isolated space on your computer to safely develop software.

First make sure you have Python 3 installed by running the following in a terminal:
```python
which python3
```
This should return a path to its location on your computer. If you see "python3 not found"
you will have to download and install it from the Python website which can be found [here](https://www.python.org/downloads/).
We recommend to download any version of Python 3.8

Once you have it installed we can now create the virtual environment! You can
create it by following these commands. Please make sure your in the directory of the project,
you should be in the same location is the `requirements.txt` file.

```python
python3 -m venv ./venv
source ./venv/bin/activate
```
Now you're in an isolated environment which you can safely develop in.

If you wish to leave the environment simply run this command:
```python
deactivate
```

The final part of the setup in installing the packages needed. To do this run:
```python
pip install -r requirements.txt
```

You're now setup! Happy Deving!

## Running the application

The tests can be run via:
```python
pytest -v ./test
```
When you first run the test it will fail because the methods are yet to be implemented.
It is part of this task to implement the methods and ensure the tests pass.

To run the code:
```python
python ./src/transformer.py
```
When you first run the code an error will be thrown because the methods are yet to be defined.
It is part of the task to implement the methods which are described below.

---

Alternatively you can run the test code using [Docker](https://docs.docker.com/).

_This is only recommended as an alternative if you are familiar with Docker already._

To run the tests:

```sh
./docker_run.sh
```

## Introduction

The test is broken up into a series of steps which will be displayed in the next section.
We ask that you don't use any other packages or libraries, and just implement the code using Python (and Pandas).

## The Problem

Your solution is to be completed within the `src/` and `test/` folders.

The application you are required to work on processes data ready for analysis to be performed.

The data being processed is for Orders in CSV file format.
The schema (headers) of this data are:

```
orderId,amount,customer,date
```

_This will be updated during the task_.

## Your Task

1. Enrich the order data with the _country_ the order was placed in by modifying the `enrich_orders` method in the `Transformer` class.

A unit test has already been written to test this logic. You can check your solution by running `pytest -v ./test` (or running the tests via Docker).

This country data is provided for you in the `transformer.py` file.

This will involve adding a `country` column to the order data.

The method should be generic in that we can pass any column name and data and it will be added to the dataset

_This should be achieved in code in `src/transformer.py`, not by adding a column to the example data in `orders.csv` or the example data in `test/test_transformer.py`_.

2. Split the data into two categories: high spending customers and low spending customers by modifying the `split_customers` method in the `Transformer` class.

Please implement the unit test `test__split_customers` as part of your solution.

What spend amount would be a good threshold to split customers into high and low spending customers?

The method should be generic by that we should be able to pass the method any threshold value and the dataset will be split based in this value.

_Again, this should be achieved in code, not by manipulating the example data in `orders.csv`. Use plots to help inform your answer_.

To help you with plotting the seaborn package has been installed. The documentation for the package can be found [here](https://seaborn.pydata.org/api.html)

## Bonus Task

The bound task is to extract some insights from the data. With code can you find out the following:
- Which customer placed the highest order amount?
- Which customer placed the lowest order amount?
- What was the average order amount across all customers?
- Which customer placed the earliest order?
- In which month did most of the orders happen (the year can be ignored)?

## On Completion

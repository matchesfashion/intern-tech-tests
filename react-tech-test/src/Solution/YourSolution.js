import '../AdditionalFiles/App.css';
import * as React from "react";

//This is the API url to fetch from
const API_URL = 'https://matchesfashion.com/api/products';
const TAX_RATE = 0.08;

function YourSolution() {
    return (
    <div className="App">
      <table id="products">
        <thead>
          <th>Id</th>
          <th>Brand</th>
          <th>Name</th>
          <th>Quantity Sold</th>
          <th>Sold Price</th>
          <th>Cost To Business</th>
        </thead>
          <tbody>
          </tbody>
      </table>
      <button>First Page</button>
      <button>Previous Page</button>
      <button>Next Page</button>
      <button>Last Page</button>
    </div>
  );
}

export default YourSolution;

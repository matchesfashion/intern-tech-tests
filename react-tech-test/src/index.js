import React from 'react';
import ReactDOM from 'react-dom';
import './AdditionalFiles/index.css';
import YourSolution from './Solution/YourSolution';
import reportWebVitals from './AdditionalFiles/reportWebVitals';
import {mockFetch} from "./AdditionalFiles/mockFetch";

window.fetch = mockFetch;

ReactDOM.render(
  <React.StrictMode>
    <YourSolution />
  </React.StrictMode>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();

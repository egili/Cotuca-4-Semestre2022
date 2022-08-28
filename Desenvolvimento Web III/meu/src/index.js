import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import Exemplo01 from './components/Exemplo01';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <Exemplo01 nome="eliseu" nota="4" />
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
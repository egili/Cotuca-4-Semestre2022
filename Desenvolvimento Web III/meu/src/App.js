import React from 'react';
import Card from './components/Card/Card';
import Exemplo01 from './components/Exemplo01';
import NumeroAleatorio from './components/NumeroAleatorio';
import "./App.css";
import ExibeNotas from './components/ExibeNotas';

function App() {
  return (
    <div className="App">
      <h1> Exemplos com React</h1>
      <div className="cards">
        <Card titulo="Exemplo01">
          <Exemplo01 nome="Patrícia" idade="34" />
        </Card>
        <Card titulo="NumeroAleatorio">
          <NumeroAleatorio min={20} max={40} />
        </Card>
        <Card titulo="comunicação direta">
          <ExibeNotas nome="Patrícia" nota="34"></ExibeNotas>
        </Card>
      </div>
    </div>
  );
}
export default App;
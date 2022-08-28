import './App.css';
import Logo from './Components/template/Logo';
import Menu from './Components/template/Menu';
//import Main from './components/template/Main';
import Footer from './Components/template/Footer';
//import CrudAluno from './components/CrudAluno/CrudAluno';
import Rotas from './Rotas';
import { BrowserRouter } from 'react-router-dom';

export default function App() {
  return (
    <BrowserRouter>
      <div className="App">
        <Logo />
        <Menu />
        <Rotas />
        <Footer />
      </div>
    </BrowserRouter>
  );
}
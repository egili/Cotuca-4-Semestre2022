import React from 'react';

export default function Exemplo01(props) {
    console.log(props);
        return(
            <div>
                <h1>Primeiro Componente!</h1>
                <p>
                    Seja bem-vindo(a) { props.nome } <br/>
                    Sua média final é: {props.nota} <br/>
                    Situação: {props.nota >= 5 ? "aprovado": 'reprovado'}
                </p>
            </div>
    );
}
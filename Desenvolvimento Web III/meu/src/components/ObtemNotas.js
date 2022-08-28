import React from "react";

export default function ObtemNotas(props) {
    return(
        <div style={{backgroundColor:'#FAF0E6', padding: '5px'}}>
            <h2>Obtem Notas (filho)</h2>
            <button onClick={  e => props.quandoClicar('Maria', 9) }>
                ObterNota
            </button>
        </div>
    );
}
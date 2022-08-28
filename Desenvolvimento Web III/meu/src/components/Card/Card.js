import React from "react";
import "./Card.css";

    export default function Card (props) {
        const estilo = {
            backgroundColor: "rgb(27, 183, 123)",
            borderColor: "#5F9EA0"
        }

        return(
            <div className="card" style={estilo}>
                <div className="titulo"> { props.titulo} </div>
                <div className="conteudo"> {props.children} </div>
            </div>
    );
}
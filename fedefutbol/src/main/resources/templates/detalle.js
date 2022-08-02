const data = "http://localhost:8081/detalle/1";
const table = document.getElementById("detalle");

data.forEach((e,i) => {    //< ---  recorremos data

    let tr = document.createElement("tr"); //< ---  creamos una fila

    let td = document.createElement("td"); //< ---  Hacemos columna index dentro de la fila
    td.classList.add("index");
    td.innerHTML = i;
    tr.appendChild(td); //< --- Agregamos la columna en la fila

    for (p in e) {  //< ---  recorremos cada propiedad de cada elemento

        let td = document.createElement("td"); //< ---  Hacemos columna dentro de la fila
        td.classList.add(p);//<-- le podemos agregar a toda la columna la misma clase
        td.innerHTML = e[p];

        tr.appendChild(td); //< --- Agregamos la columna en la fila

    }

    table.appendChild(tr); //< --- Agregamos la fila a la tabla

});
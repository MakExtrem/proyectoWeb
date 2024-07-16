const listMedico = async () => {
    const response = await fetch("http://localhost:8080/medico");
    const medico = await response.json();

    let tableBody = ``;
    medico.forEach((medico, index) => {
    console.log(medico);

     if(`${medico.activo}`!=0)
                {
        tableBody += `<tr>
        <td class='centered'>${medico.id}</td>
        <td class='centered'>${medico.nombre}</td>
        <td class='centered'>${medico.apellido}</td>
        <td class='centered'>${medico.dni}</td>
        <td class='centered'>${medico.telefono}</td>
        <td class='centered'>${medico.email}</td>
        <td class='centered'><button onclick="enviarDatoModificar(${medico.id})" class="btn btn-info">Editar</button>
        <button onclick="cambiarestado(${medico.id})" class="btn btn-danger">Eliminar</button> </td>
        </tr>`;}

    });
    // document.getElementById("tableBody_Users").innerHTML = tableBody;
    tableBody_Medico.innerHTML = tableBody;
};

window.addEventListener("load", function () {
    listMedico();

});

function enviarDatoModificar(id) {
            window.location.href = `/medicoModificar?id=${id}`;
        };



async function cambiarestado(id) {

     try{
         const response = await fetch(`http://localhost:8080/medico/disable/${id}`,
          {method: 'PATCH',
         /*especifica el tipo de informacion (JSON)*/
         headers: {'Content-Type': 'application/json'}
         });

        window.location.href = `/medicos`;
        }catch(error){
          console.log(error);
         }
           };


           function añadirMed() {
                       location.href='/medicoAdd';
                   };
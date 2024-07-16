const listPaciente = async () => {
    const response = await fetch("http://localhost:8080/paciente");
    const paciente = await response.json();

    let tableBody = ``;
    paciente.forEach((paciente, index) => {
    console.log(paciente);
    if(`${paciente.activo}`!=0)
            {

        tableBody += `<tr>
        <td class='centered'>${paciente.id}</td>
        <td class='centered'>${paciente.nombre}</td>
        <td class='centered'>${paciente.apellido}</td>
        <td class='centered'>${paciente.dni}</td>
        <td class='centered'>${paciente.telefono}</td>
        <td class='centered'>${paciente.email}</td>
        <td class='centered'>${paciente.fechaNacimiento}</td>
        <td class='centered'>${paciente.genero}</td>
        <td class='centered'><button onclick="enviarDatoModificar(${paciente.id})" class="btn btn-info">Editar</button>
        <button onclick="cambiarestado(${paciente.id})" class="btn btn-danger">Eliminar</button> </td>
        </tr>`;
        }
    });
    // document.getElementById("tableBody_Users").innerHTML = tableBody;
    tableBody_Paciente.innerHTML = tableBody;
};

window.addEventListener("load", function () {
    listPaciente();

});


function enviarDatoModificar(id) {
            window.location.href = `/pacientesmodificar?id=${id}`;
        };

async function cambiarestado(id) {

     try{
         const response = await fetch(`http://localhost:8080/paciente/disable/${id}`,
          {method: 'PATCH',
         /*especifica el tipo de informacion (JSON)*/
         headers: {'Content-Type': 'application/json'}
         });

        window.location.href = `/pacientes`;
        }catch(error){
          console.log(error);
         }
           };
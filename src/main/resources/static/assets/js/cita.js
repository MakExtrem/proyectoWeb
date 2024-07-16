const listCita = async () => {
    const response = await fetch("http://localhost:8080/cita");
    const cita = await response.json();

    let tableBody = ``;
    cita.forEach((cita, index) => {

        if(`${cita.estado}`!=0)
        {
        tableBody += `<tr>
                <td class='centered'>${cita.id}</td>
                <td class='centered'>${cita.nombrePaciente}</td>
                <td class='centered'>${cita.nombreMedico}</td>
                <td class='centered'>${cita.especialidadMedico}</td>
                <td class='centered'>${cita.fechaAtencion}</td>
                <td class='centered'>${cita.horaAtencion}</td>
                <td class='centered'><button onclick="enviarDatoModificar(${cita.id})" class="btn btn-info">Editar</button> <button onclick="cambiarestado(${cita.id})" class="btn btn-danger">Eliminar</button> </td>
                </tr>`;
        }


    });
    // document.getElementById("tableBody_Users").innerHTML = tableBody;
    tableBody_Cita.innerHTML = tableBody;
};

window.addEventListener("load", function () {
    listCita();

});

function enviarDatoModificar(id) {
            window.location.href = `/citasmodificar?id=${id}`;
        };

async function cambiarestado(id) {

     try{
         const response = await fetch(`http://localhost:8080/cita/disable/${id}`,
          {method: 'PATCH',
         /*especifica el tipo de informacion (JSON)*/
         headers: {'Content-Type': 'application/json'}
         });

        window.location.href = `/citas`;
        }catch(error){
          console.log(error);
         }
           };
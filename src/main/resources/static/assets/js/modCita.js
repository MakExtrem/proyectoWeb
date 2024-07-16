const urlParams = new URLSearchParams(window.location.search);
            const id = urlParams.get('id');


const listoneCita = async (id) => {
    try {
        const response = await fetch(`http://localhost:8080/cita/${id}`);
        if (!response.ok) {
            throw new Error('Problemas con el servicio');
        }
        const cita = await response.json();

        nombrePaciente.innerHTML = `<input type="text" class="form-control" value="${cita.nombrePaciente}" readonly>`;
        nombreMedico.innerHTML = `<input type="text" class="form-control" value="${cita.nombreMedico}" >`;
        especialidad.innerHTML = `<input type="text" class="form-control" value="${cita.especialidadMedico}" readonly>`;
        fechaAtencion.innerHTML = `<input type="date" class="form-control" value="${cita.fechaAtencion}" >`;
        horaAtencion.innerHTML = `<input type="time" class="form-control" value="${cita.horaAtencion}" >`;
        observaciones.innerHTML = `<h5><label for="">Observacion</label></h5><input type="textarea" class="form-control" value="${cita.observaciones}" readonly>`;
    } catch (error) {
        console.error('Error: ', error);
    }
};

window.addEventListener("load", function () {
    listoneCita(id);

});




const formulario = document.querySelector('#formulario');

guardar.addEventListener('click', (event) => {
  event.preventDefault();
  postData();

})

const getData = () => {
  const nombrePaciente = document.querySelector('#nombrePaciente input').value;
      const nombreMedico = document.querySelector('#nombreMedico input').value;
      const especialidadMedico = document.querySelector('#especialidad input').value;
      const fechaAtencion = document.querySelector('#fechaAtencion input').value;
      const horaAtencion = document.querySelector('#horaAtencion input').value;
      const observaciones = document.querySelector('#observaciones input').value;

       // Crea un objeto con los datos del formulario
          const datosFormulario = {
              nombrePaciente: nombrePaciente,
              nombreMedico: nombreMedico,
              especialidadMedico: especialidadMedico,
              fechaAtencion: fechaAtencion,
              horaAtencion: horaAtencion,
              observaciones: observaciones
          };
          return datosFormulario;
};



/*Funcion para colocar los datos en el API */

const postData = async () => {

  /*Crea un objeto con la informacion del formulario*/
    const citaupdate = getData();
    console.log(JSON.stringify(citaupdate));
try{
    const response = await fetch(`http://localhost:8080/cita/update/${id}`, {
    /*especifica el metodo que se va a usar*/
    method: 'PUT',
    /*especifica el tipo de informacion (JSON)*/
    headers: {'Content-Type': 'application/json'},
    /*coloca la informacion en el formato JSON */
    body: JSON.stringify(citaupdate)
    });
        respuesta.innerHTML =
        `Se actualizo la cita con exito`

   }catch(error){
   	respuesta.innerHTML =
        `Algo Salio Mal`
        console.log(JSON.stringify(cita));
     console.log(error);
   }




 }





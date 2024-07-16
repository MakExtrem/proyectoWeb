const urlParams = new URLSearchParams(window.location.search);
            const id = urlParams.get('id');

//Listar
const listonePaciente = async (id) => {
    try {
        const response = await fetch(`http://localhost:8080/paciente/${id}`);
        if (!response.ok) {
            throw new Error('Problemas con el servicio');
        }
        const paciente = await response.json();

        Nombre.innerHTML = `<input type="text" class="form-control" value="${paciente.nombre}" >`;
        Apellido.innerHTML = `<input type="text" class="form-control" value="${paciente.apellido}" >`;
        DNI.innerHTML = `<input type="text" class="form-control" value="${paciente.dni}" readonly>`;
        Email.innerHTML = `<input type="text" class="form-control" value="${paciente.email}" >`;
        FechaNacimiento.innerHTML = `<input type="date" class="form-control" value="${paciente.fechaNacimiento}" readonly>`;
        FechaRegistro.innerHTML = `<input type="date" class="form-control" value="${paciente.fechaRegistro}" readonly>`;
        Genero.innerHTML = `<input type="text" class="form-control" value="${paciente.genero}" readonly >`;
        Telefono.innerHTML = `<input type="text" class="form-control" value="${paciente.telefono}" >`;


    } catch (error) {
        console.error('Error: ', error);
    }
};
//dispare el listar al cargar la pagina
window.addEventListener("load", function () {
    listonePaciente(id);

});


//llama los datos del formulario
const formulario = document.querySelector('#formulario');

//escucha el boton guardar
guardar.addEventListener('click', (event) => {
  event.preventDefault();
  postData();

})


//Arma el Json para el envio al API

const getData = () => {
      const nombre = document.querySelector('#Nombre input').value;
      const apellido = document.querySelector('#Apellido input').value;
      const dni = document.querySelector('#DNI input').value;
      const email = document.querySelector('#Email input').value;
      const fechaNacimiento = document.querySelector('#FechaNacimiento input').value;
      const fechaRegistro = document.querySelector('#FechaRegistro input').value;
      const genero = document.querySelector('#Genero input').value;
      const telefono = document.querySelector('#Telefono input').value;

       // Crea un objeto con los datos del formulario
          const datosFormulario = {
              nombre: nombre,
              apellido: apellido,
              dni: dni,
              email: email,
              fechaNacimiento: fechaNacimiento,
              fechaRegistro: fechaRegistro,
              genero: genero,
              telefono: telefono
          };
          return datosFormulario;
};




/*Funcion para colocar los datos en el API */

const postData = async () => {

  /*Crea un objeto con la informacion del formulario*/
    const pacienteupdate = getData();
    console.log(JSON.stringify(pacienteupdate));
try{
    const response = await fetch(`http://localhost:8080/paciente/update/${id}`, {
    /*especifica el metodo que se va a usar*/
    method: 'PUT',
    /*especifica el tipo de informacion (JSON)*/
    headers: {'Content-Type': 'application/json'},
    /*coloca la informacion en el formato JSON */
    body: JSON.stringify(pacienteupdate)
    });
        respuesta.innerHTML =
        `Se actualizo la informacion del paciente con exito`

   }catch(error){
   	respuesta.innerHTML =
        `Algo Salio Mal`
        console.log(JSON.stringify(response));
     console.log(error);
   }

 }

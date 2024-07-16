const urlParams = new URLSearchParams(window.location.search);
            const id = urlParams.get('id');


//Listar
const listoneMedico = async (id) => {
    try {
        const response = await fetch(`http://localhost:8080/medico/${id}`);
        if (!response.ok) {
            throw new Error('Problemas con el servicio');
        }
        const medico = await response.json();

        Nombre.innerHTML = `<input type="text" class="form-control" value="${medico.nombre}" >`;
        Apellido.innerHTML = `<input type="text" class="form-control" value="${medico.apellido}" >`;
        DNI.innerHTML = `<input type="text" class="form-control" value="${medico.dni}" readonly>`;
        Email.innerHTML = `<input type="text" class="form-control" value="${medico.email}" >`;
        FechaNacimiento.innerHTML = `<input type="date" class="form-control" value="${medico.fechaNacimiento}" readonly>`;
        FechaRegistro.innerHTML = `<input type="date" class="form-control" value="${medico.fechaRegistro}" readonly>`;
        Genero.innerHTML = `<input type="text" class="form-control" value="${medico.genero}"  readonly>`;
        Telefono.innerHTML = `<input type="text" class="form-control" value="${medico.telefono}" >`;
        Direccion.innerHTML = `<input type="text" class="form-control" value="${medico.direccion}" >`;
        Colegiatura.innerHTML = `<input type="text" class="form-control" value="${medico.numeroColegiatura}" readonly>`;
        /*Especialidad.innerHTML = `<input type="text" class="form-control" value="${medico.id_Especialidad}" >`;modificar*/
    } catch (error) {
        console.error('Error: ', error);
    }
};

//dispare el listar al cargar la pagina
window.addEventListener("load", function () {
    listoneMedico(id);

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
      const direccion = document.querySelector('#Direccion input').value;
      const email = document.querySelector('#Email input').value;
      const genero = document.querySelector('#Genero input').value;
      const telefono = document.querySelector('#Telefono input').value;

       // Crea un objeto con los datos del formulario
          const datosFormulario = {
              nombre: nombre,
              apellido: apellido,
              direccion: direccion,
              email: email,
              genero: genero,
              telefono: telefono
          };
          return datosFormulario;
};





/*Funcion para colocar los datos en el API */

const postData = async () => {

  /*Crea un objeto con la informacion del formulario*/
    const medicoupdate = getData();
    console.log(JSON.stringify(medicoupdate));
try{
    const response = await fetch(`http://localhost:8080/medico/update/${id}`, {
    /*especifica el metodo que se va a usar*/
    method: 'PUT',
    /*especifica el tipo de informacion (JSON)*/
    headers: {'Content-Type': 'application/json'},
    /*coloca la informacion en el formato JSON */
    body: JSON.stringify(medicoupdate)
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




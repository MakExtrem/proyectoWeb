
const formulario = document.querySelector('#formulario');

guardar.addEventListener('click', (event) => {
  event.preventDefault();
  postData();
  formulario.reset();

})


const getData = () => {
        const nombre = document.querySelector('#Nombre input').value;
        const apellido = document.querySelector('#Apellido input').value;
        const dni = document.querySelector('#DNI input').value;
        const direccion = document.querySelector('#Direccion input').value;
        const email = document.querySelector('#Email input').value;
        const numeroColegiatura = document.querySelector('#Colegiatura input').value;
        const genero = document.querySelector('#Genero input').value;
        const telefono = document.querySelector('#Telefono input').value;
        const id_Especialidad = document.querySelector('#Especialidad input').value;
        const fechaNacimiento = document.querySelector('#FechaNacimiento input').value;

       // Crea un objeto con los datos del formulario
          const datosFormulario = {
                        nombre: nombre,
                        apellido: apellido,
                        dni: dni,
                        direccion: direccion,
                        email: email,
                        numeroColegiatura: numeroColegiatura,
                        genero: genero,
                        telefono: telefono,
                        id_Especialidad: id_Especialidad,
                        fechaNacimiento: fechaNacimiento
          };
          return datosFormulario;
};


/*Funcion para colocar los datos en el API */

const postData = async () => {

  /*Crea un objeto con la informacion del formulario*/
    const addMed = getData();
    console.log(JSON.stringify(addMed));
try{
    const response = await fetch(`http://localhost:8080/medico/save`, {
    /*especifica el metodo que se va a usar*/
    method: 'POST',
    /*especifica el tipo de informacion (JSON)*/
    headers: {'Content-Type': 'application/json'},
    /*coloca la informacion en el formato JSON */
    body: JSON.stringify(addMed)
    });
        respuesta.innerHTML =
        `Se Añadio la especialidad con exito`

   }catch(error){
   	respuesta.innerHTML =
        `Algo Salio Mal`
        console.log(JSON.stringify(addMed));
     console.log(error);
   }};





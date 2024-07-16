const formulario = document.querySelector('#formulario');

guardar.addEventListener('click', (event) => {
  event.preventDefault();
  postData();
  formulario.reset();

})



const getData = () => {
  const nombre = document.querySelector('#nombreEspe input').value;

       // Crea un objeto con los datos del formulario
          const datosFormulario = {
              nombre: nombre
          };
          return datosFormulario;
};





/*Funcion para colocar los datos en el API */

const postData = async () => {

  /*Crea un objeto con la informacion del formulario*/
    const addEsp = getData();
    console.log(JSON.stringify(addEsp));
try{
    const response = await fetch(`http://localhost:8080/especialidad/save`, {
    /*especifica el metodo que se va a usar*/
    method: 'POST',
    /*especifica el tipo de informacion (JSON)*/
    headers: {'Content-Type': 'application/json'},
    /*coloca la informacion en el formato JSON */
    body: JSON.stringify(addEsp)
    });
        respuesta.innerHTML =
        `Se Añadio la especialidad con exito`

   }catch(error){
   	respuesta.innerHTML =
        `Algo Salio Mal`
        console.log(JSON.stringify(addEsp));
     console.log(error);
   }};

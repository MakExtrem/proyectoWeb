const btn = document.querySelector('#enviar');
const formulario = document.querySelector('#formulario');
const respuesta = document.querySelector('#respuesta');


const getData = () => {
  const datos = new FormData(formulario);
  const datosProcesados = Object.fromEntries(datos.entries());
  formulario.reset();
  return datosProcesados;
}


enviar.addEventListener('click', (event) => {
  event.preventDefault();
  postData();

})


/*Funcion para colocar los datos en el Servidor */

const postData = async () => {

  /*Crea un objeto con la informacion del formulario*/
    const cita = getData();
    console.log(JSON.stringify(cita));
   try{
    const response = await fetch('http://localhost:8080/cita/save', {
    /*especifica el metodo que se va a usar*/
    method: 'POST',
    /*especifica el tipo de informacion (JSON)*/
    headers: {'Content-Type': 'application/json'},
    /*coloca la informacion en el formato JSON */
    body: JSON.stringify(cita)
    });
        respuesta.innerHTML =
        `Se registro la cita con exito`
    /*if(response.ok){
        const jsonResponse = await response.json();

        Codigo a ejecutarse con la respuesta

         const {email, nombre, telefono} = jsonResponse;



    }

*/
   }catch(error){
   	respuesta.innerHTML =
        `Algo Salio Mal`
        console.log(JSON.stringify(cita));
     console.log(error);
   }

 }







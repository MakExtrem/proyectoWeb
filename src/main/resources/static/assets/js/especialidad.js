const listEspecialidad = async () => {
    const response = await fetch("http://localhost:8080/especialidad");
    const especialidad = await response.json();

    let tableBody = ``;
    especialidad.forEach((especialidad, index) => {
    console.log(especialidad);

    if(`${especialidad.activo}`!=0)
            {
        tableBody += `<tr>
        <td class='centered'>${especialidad.id}</td>
        <td class='centered'>${especialidad.nombre}</td>
        <td class='centered'>${especialidad.fechaRegistro}</td>
        <td class='centered'><button onclick="cambiarestado(${especialidad.id})" class="btn btn-danger">Eliminar</button> </td>
                        </tr>`;
                        }
    });
    // document.getElementById("tableBody_Users").innerHTML = tableBody;
    tableBody_Especialidad.innerHTML = tableBody;
};
window.addEventListener("load", function () {
    listEspecialidad();

});
async function cambiarestado(id) {

     try{
         const response = await fetch(`http://localhost:8080/especialidad/disable/${id}`,
          {method: 'PATCH',
         /*especifica el tipo de informacion (JSON)*/
         headers: {'Content-Type': 'application/json'}
         });

        window.location.href = `/especialistas`;
        }catch(error){
          console.log(error);
         }
           };

           //crear especialidad
function añadirEsp() {
            location.href='/especialidadesAdd';
        };
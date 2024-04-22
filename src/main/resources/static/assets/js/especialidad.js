const listEspecialidad = async () => {
    const response = await fetch("http://localhost:8080/especialidad");
    const especialidad = await response.json();

    let tableBody = ``;
    especialidad.forEach((especialidad, index) => {
    console.log(especialidad);
        tableBody += `<tr>
        <td class='centered'>${especialidad.id}</td>
        <td class='centered'>${especialidad.nombre}</td>
        <td class='centered'>${especialidad.fechaRegistro}</td>
        <td class='centered'>${especialidad.activo}</td>

        <td class='centered'><a href="" class="btn btn-warning btn-sm edit">Editar</a><a href="" class="btn btn-danger btn-sm delete">Delete</a></td>
        </tr>`;
    });
    // document.getElementById("tableBody_Users").innerHTML = tableBody;
    tableBody_Especialidad.innerHTML = tableBody;
};

window.addEventListener("load", function () {
    listEspecialidad();

});
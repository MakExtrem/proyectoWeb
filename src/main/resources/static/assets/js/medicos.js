const listMedico = async () => {
    const response = await fetch("http://localhost:8080/medico");
    const medico = await response.json();

    let tableBody = ``;
    medico.forEach((medico, index) => {
    console.log(medico);
        tableBody += `<tr>
        <td class='centered'>${medico.id}</td>
        <td class='centered'>${medico.id_Especialidad}</td>
        <td class='centered'>${medico.nombre}</td>
        <td class='centered'>${medico.apellido}</td>
        <td class='centered'>${medico.dni}</td>
        <td class='centered'>${medico.direccion}</td>
        <td class='centered'>${medico.telefono}</td>
        <td class='centered'>${medico.email}</td>
        <td class='centered'>${medico.numeroColegiatura}</td>
        <td class='centered'>${medico.fechaNacimiento}</td>
        <td class='centered'><a href="" class="btn btn-warning btn-sm edit">Editar</a><a href="" class="btn btn-danger btn-sm delete">Delete</a></td>
        </tr>`;

    });
    // document.getElementById("tableBody_Users").innerHTML = tableBody;
    tableBody_Medico.innerHTML = tableBody;
};

window.addEventListener("load", function () {
    listMedico();

});
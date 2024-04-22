const listPaciente = async () => {
    const response = await fetch("http://localhost:8080/paciente");
    const paciente = await response.json();

    let tableBody = ``;
    paciente.forEach((paciente, index) => {
    console.log(paciente);
        tableBody += `<tr>
        <td class='centered'>${paciente.id}</td>
        <td class='centered'>${paciente.nombre}</td>
        <td class='centered'>${paciente.apellido}</td>
        <td class='centered'>${paciente.dni}</td>
        <td class='centered'>${paciente.telefono}</td>
        <td class='centered'>${paciente.email}</td>
        <td class='centered'>${paciente.fechaNacimiento}</td>
        <td class='centered'>${paciente.genero}</td>
        <td class='centered'><a href="" class="btn btn-warning btn-sm edit">Editar</a><a href="" class="btn btn-danger btn-sm delete">Delete</a></td>
        </tr>`;
    });
    // document.getElementById("tableBody_Users").innerHTML = tableBody;
    tableBody_Paciente.innerHTML = tableBody;
};

window.addEventListener("load", function () {
    listPaciente();

});
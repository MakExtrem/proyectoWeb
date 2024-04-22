const listCita = async () => {
    const response = await fetch("http://localhost:8080/cita");
    const cita = await response.json();

    let tableBody = ``;
    cita.forEach((cita, index) => {
        tableBody += `<tr>
        <td class='centered'>${cita.id}</td>
        <td class='centered'>${cita.id_Medico}</td>
        <td class='centered'>${cita.id_Paciente}</td>
        <td class='centered'>${cita.id_user}</td>
        <td class='centered'>${cita.fechaAtencion}</td>
        <td class='centered'>${cita.horaAtencion}</td>
        <td class='centered'>${cita.observaciones}</td>
        <td class='centered'><a href="" class="btn btn-warning btn-sm edit">Editar</a><a href="" class="btn btn-danger btn-sm delete">Delete</a></td>
        </tr>`;
    });
    // document.getElementById("tableBody_Users").innerHTML = tableBody;
    tableBody_Cita.innerHTML = tableBody;
};

window.addEventListener("load", function () {
    listCita();

});
const ListaNombreEspecialidad = async () => {
    const response = await fetch("http://localhost:8080/especialidad");
    const especialidad = await response.json();

    let option = `<option value="" id="especialidad">Elige la Especialidad</option>`;
    especialidad.forEach((especialidad) => {
        console.log(especialidad);
        option += `<option value="${especialidad.id}" id="especalidad" name="">${especialidad.nombre}</option>`;
    });
option_especialidades.innerHTML = option;

};

const ListaNombreMedico = async (especialidadId) => {
    const response = await fetch("http://localhost:8080/medico");
    const medico = await response.json();

    let option = `<option value="" id="">Elige tu Medico</option>`;
    medico.forEach((medico) => {
        if(medico.id_Especialidad == especialidadId) {
            option += `<option value="${medico.id}" id="id_Medico">${medico.nombre} ${medico.apellido}</option>`;
        }
    });

    option_medico.innerHTML = option;
};

window.addEventListener("load", function () {
    ListaNombreEspecialidad();

    option_especialidades.addEventListener("change", function () {
        const espec = this.value;
        if (espec) {
            ListaNombreMedico(espec);
        } else {
            option_medico.innerHTML = `<option value="" id="">Elige tu Medico</option>`;
        }
    });
});
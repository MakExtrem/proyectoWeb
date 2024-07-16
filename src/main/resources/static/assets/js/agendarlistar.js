//lista todas las especilidades
const ListaNombreEspecialidad = async () => {
    try {
        const response = await fetch("http://localhost:8080/especialidad");
        if (!response.ok) {
            throw new Error('Error al obtener datos de las especialidades');
        }
        const especialidad = await response.json();

        let option = `<option value="" id="especialidad">Elige la Especialidad</option>`;
        especialidad.forEach((especialidad) => {
            console.log(especialidad);
            option += `<option value="${especialidad.nombre}" id="${especialidad.id}">${especialidad.nombre}</option>`;
        });
        option_especialidades.innerHTML = option;
    } catch (error) {
        console.error('Error en ListaNombreEspecialidad:', error);
    }
};
//ista todos los medicos
const ListaNombreMedico = async (especialidadId) => {
    try {
        // Obtener datos de los médicos
        const response = await fetch("http://localhost:8080/medico");
        if (!response.ok) {
            throw new Error('Error al obtener datos de los médicos');
        }
        const medico = await response.json();

        // Obtener datos para recomendar doctor
        const responserecom = await fetch(`http://localhost:8080/cita/recdoc/${especialidadId}`);
        if (!responserecom.ok) {
            throw new Error('Error al obtener datos de las citas');
            console.log(responserecom);
        }
            try{
            //obtener datos de los medicos por especialidad
                    const listardocesp = await fetch(`http://localhost:8080/cita/listarmedico/${especialidadId}`);
                    if (!listardocesp.ok) {
                        throw new Error('Error al obtener datos de los médicos por espcilidad');
                    }


                    const citarec = await responserecom.json();
                    const nombreCompleto = citarec[0];
                    if (!nombreCompleto) {
                    Rec_medico.innerHTML=` `;}
                    const [nombred, apellidod] = nombreCompleto;
                    const nombreFormateado = `${nombred} ${apellidod}`;
                    console.log(citarec);
                    console.log(nombreFormateado);
                    if(nombreCompleto){
                    Rec_medico.innerHTML=`Te recomendamos al Doctor(a) ${nombreFormateado}`;
                    }
            }catch(error){
             console.error(error);
            }


        let option = `<option value="" id="">Elige tu Medico</option>`;
        medico.forEach((medico) => {
            if (medico.id_Especialidad == especialidadId) {
                option += `<option value="${medico.id}" id="id_Medico">${medico.nombre} ${medico.apellido}</option>`;
            }
        });
        option_medico.innerHTML = option;
    } catch (error) {
        console.error('Error en ListaNombreMedico:', error);
    }





};

    window.addEventListener("load", function () {
    ListaNombreEspecialidad();
    option_medico.innerHTML = `<option value="" id="">Elige tu Medico</option>`;
    option_especialidades.addEventListener("change", function () {
        const selectedOption = this.options[this.selectedIndex];
                const espec = selectedOption.id; // Obtener el id de la opción seleccionada

        /*const espec = this.value;*/
        if (espec) {
            ListaNombreMedico(espec);
        }else {
            option_medico.innerHTML = `<option value="" id="">Elige tu Medico</option>`;
        }
    });
});

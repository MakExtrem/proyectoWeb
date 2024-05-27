
        const ListaNombreEspecialidad = async () => {
            const response = await fetch("http://localhost:8080/especialidad");
            const especialidad = await response.json();

            let option = `<option value="" id="">Elige la Especialidad</option>`;
            especialidad.forEach((especialidad, index) => {
            console.log(especialidad);
                option += `<option value="${especialidad.id}" id="${especialidad.id}">${especialidad.nombre}</option>`;
            });
            // document.getElementById("tableBody_Users").innerHTML = tableBody;
            option_especialidades.innerHTML = option;
        };

        window.addEventListener("load", function () {
            ListaNombreEspecialidad();

        });


        const ListaNombreMedico = async () => {
            const response = await fetch("http://localhost:8080/medico");
            const medico = await response.json();

            let option = `<option value="" id="">Elige tu Medico</option>`;
            medico.forEach((medico, index) => {
            console.log(medico);
                option += `<option value="${medico.id}" id="id_Medico">${medico.nombre}</option>`;
            });
            // document.getElementById("tableBody_Users").innerHTML = tableBody;
            option_medico.innerHTML = option;
        };

        window.addEventListener("load", function () {
            ListaNombreMedico();

        });

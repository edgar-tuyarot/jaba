// Call the dataTables jQuery plugin
$(document).ready(function () {
  cargarUsuarios()
  $('#usuarios').DataTable();
});

async function cargarUsuarios() {
  try {
    const response = await fetch('api/usuarios', {
      method: 'GET',
      headers: {
        'Content-Type': 'application/json'
      }

    });

    if (!response.ok) {
      throw new Error('Error en la respuesta: ' + response.status);
    }

    const usuarios = await response.json();
    const tbody = document.getElementById("tbodyUsuarios")
    tbody.innerHTML = ""
    usuarios.forEach(fila => {

      const tr = document.createElement('tr')
      const tdNombre = document.createElement('td')
      const tdId = document.createElement('td')
      const tdMail= document.createElement('td')
      const tdTelefono = document.createElement('td')

      tdNombre.textContent = fila.nombre;
      tdId.textContent = fila.id;
      tdMail.textContent = fila.email;
      tdTelefono.textContent = fila.telefono;

      tr.appendChild(tdId);
      tr.appendChild(tdNombre);
      tr.appendChild(tdMail);
      tr.appendChild(tdTelefono);

      tbody.appendChild(tr)

    });
    console.log('Datos recibidos:', usuarios);
  } catch (error) {
    console.error('Error al hacer fetch:', error);
  }

}


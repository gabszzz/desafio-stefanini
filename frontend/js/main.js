const base_url = 'http://localhost:8080';


async function cadastrarCurso(titulo, professor, cargaHoraria) {

  const data = {
    'titulo': titulo,
    'professor': professor,
    'cargaHoraria': parseFloat(cargaHoraria)
  };

  try {
    const res = await fetch(base_url + '/cursos', {
      method: 'POST',
      body: JSON.stringify(data),
      headers: { 'Content-Type': 'application/json' }
    });

    return (res.status == 200);

  } catch (err) {
    console.error(err);
  }
}

async function listarCursos() {
  try {
    const res = await fetch(base_url + '/cursos');
    const json = await res.json();

    return json;

  } catch (err) {
    console.error(err);
  }
}

async function cadastrarAluno(nome, genero, curso) {
  const data = {
    'nome': nome,
    'genero': genero,
    'curso_id': parseInt(curso)
  };

  console.log(nome, genero, typeof parseInt(curso));

  try {
    const res = await fetch(base_url + '/alunos', {
      method: 'POST',
      body: JSON.stringify(data),
      headers: { 'Content-Type': 'application/json' }
    });

    return (res.status == 200);

  } catch (err) {
    console.error(err);
  }
}

async function listarAlunos() {
  try {
    const res = await fetch(base_url + '/alunos');
    const json = await res.json();

    return json;

  } catch (err) {
    console.error(err);
  }
}
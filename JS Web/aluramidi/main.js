function tocaSom (idElementoAudio) {
    document.querySelector(idElementoAudio).play();
}

const listaDeTeclas = document.querySelectorAll('.tecla');

//para
for (let contador = 0; contador < listaDeTeclas.length; contador++) {

    const tecla = listaDeTeclas[contador];
    const instrumento = tecla.classList[1];
    const idAudio = `#som_${instrumento}`; //template string

    tecla.onclick = function () {
        tocaSom(idAudio);
    }

}


/*
function tocaSomPom (som) {
    document.querySelector(som).play();
}


const listaDeteclas = document.querySelectorAll('.tecla');
const listaDeSom = document.querySelectorAll('.som');

//document.querySelector('.tecla_pom').onclick = tocaSomPom;

//listaDeteclas[0].onclick = tocaSomPom('#som_tecla_pom');

listaDeteclas.forEach((lista, index)=> {
    lista.onclick = () => tocaSomPom('#'+listaDeSom[index].id);
});

*/
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

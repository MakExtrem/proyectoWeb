/*=============== SHOW MENU ===============*/
/*const navMenu = document.getElementById('nav-menu'),
      navToggle = document.getElementById('nav-toggle'),
      navClose = document.getElementById('nav-close')


navToggle.addEventListener('click', () =>{
   navMenu.classList.add('show-menu')
})


navClose.addEventListener('click', () =>{
   navMenu.classList.remove('show-menu')
}) */

const nav = document.querySelector("#nav");
const abrir = document.querySelector("#abrir");
const cerrar = document.querySelector("#cerrar");

abrir.addEventListener("click", () => {
    nav.classList.add("visible");
})

cerrar.addEventListener("click", () => {
    nav.classList.remove("visible");
})
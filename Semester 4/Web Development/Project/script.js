var menu=document.getElementById("navbar-menu");
function openMenu() {
  menu.style.display="flex";
  menu.style.right="0";
}

function closeMenu() {
  const closemenu=document.getElementsByClassName("close-menu");
   menu.style.display="none"
  closemenu.style.display="none";
}
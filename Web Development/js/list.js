function btn() {
  const list=document.getElementById("list");

  const createlist=document.createElement("li");
  createlist.innerHTML="created";

  list.appendChild(createlist);
}

function create() {
  const create=document.getElementById("container");

  const para=document.createElement("p");

  para.innerHTML="i am paragrap";

  create.appendChild(para);
}
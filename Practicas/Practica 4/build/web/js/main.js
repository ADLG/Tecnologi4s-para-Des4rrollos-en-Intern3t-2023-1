function HolaMundo()
{alert("Presionaste un Hola Mundo")}

var vglo1 = "Nave G1"
var vglo2 = "Nave G2"
var vglo3 = "Nave G3"

function variablesLocales()
{
	var vlo1 = "Auto L1"
	var vlo2 = "Auto L2"
	var vlo3 = "Auto L3"
	document.write("Variables LOCALES"+"<br>"+vlo1+"<br>"+vlo2+"<br>"+vlo3+"<br>")
}

function variablesGlobales()
{
	document.write("Variables GLOBALES"+"<br>"+vglo1+"<br>"+vglo2+"<br>"+vglo3+"<br>")
}

function cicloFor()
{
	document.write("Ciclo For<br>Este ciclo se repetira 3 veces:"+"<br>")
	for(let i=0; i<3; i++)
	{
		document.write(i+".Tomb Raider"+"<br>")
	}
}

function cicloWhile()
{
	document.write("Ciclo While<br>Este ciclo se repetira 5 veces:"+"<br>")
	let i=0;
	while(i<5)
	{
		document.write(i+".Xenon2000"+"<br>")
		i++;
	}
}

let arregloPosiciones = ["Primero","Segundo","Tercero"]
let arregloNumeros = [1,2,3,4,5]
function arregloP()
{
	document.write("Este es un arreglo de posiciones:<br>"+arregloPosiciones)
}

function arregloN()
{
	document.write("Este es un arreglo de Numeros:<br>"+arregloNumeros)
}

function sentenciaIf()
{
	let edad = prompt("Ingresa tu edad",);
	if (edad>=18)
	{alert("No hay problema")}
	else
	{alert("Esto es +18")}
}

	var nom = null;
	var apellido = null;
	var telefono = null;
function info()
{
	nom = document.getElementsByName('nombre')[0].value;
	ape = document.getElementsByName('apellido')[0].value;
	tel = document.getElementsByName('telefono')[0].value;
	var acche = document.getElementById('acc');
	var avent = document.getElementById('ave');
	var shoo = document.getElementById('sho');
	var carre = document.getElementById('car');
	var puzz = document.getElementById('puz');
	alert("Tu nombre es: "+nom+"\nTu apellido es: "+ape+"\nTu telefono es: "+tel);
	acc(acche.checked);
	ave(avent.checked);
	sho(shoo.checked);
	car(carre.checked);
	puz(puzz.checked);
}

function acc(a)
{
	if (a)
	{
		alert("Te gusta la Accion")
	}
}

function ave(a)
{
	if (a)
	{
		alert("Te gusta la Aventura")
	}
}

function sho(a)
{
	if (a)
	{
		alert("Te gustan los Shooters")
	}
}

function car(a)
{
	if (a)
	{
		alert("Te gustan las Carreras")
	}
}

function puz(a)
{
	if (a)
	{
		alert("Te gustan los Puzzles")
	}
}
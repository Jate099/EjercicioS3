var diametro;

//relleno
var fondoR; 
var fondoG;
var fondoB;

//posicion 
var posX;
var posY;
var velocidad;

function setup(){ 
  // 1. definir el tamaño del lienzo 
createCanvas (500,500);
  //asignar valores
  diametro = 100.5;
  fondoR = 160;
  fondoG = 25;
  fondoB = 255;
  posX = width/2;
  posY = -diametro/2;
  velocidad = 2;
}

function draw(){
  //pintar lienzo de negro
  background(0);

  strokeWeight(4)
  stroke(255,244,25)
  
  //3. dibujar el circulo
  ellipse(posX, posY, diametro, diametro);
  
  //4. rellenar
  fill(fondoR, fondoG, fondoB);
  posY+=velocidad;
  
  //5.movimiento (condicional)
  posY=(posY>height+diametro/2)?-diametro/2:posY+velocidad;

 
  
}
  
  
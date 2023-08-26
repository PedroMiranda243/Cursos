//variaveis bolinha
let xBolinha = 300;
let yBolinha = 200;
let diametro = 13;
let raio = diametro/2;

//velocidade da bolinha
let velocidadeXBolinha = 2;
let velocidadeYBolinha = 2;

//variaveis raquete 
let xRaquete = 5
let yRaquete = 150
let largura = 10
let altura = 90

//variaveis raquete oponente 
let xRaqueteOponente = 585
let yRaqueteOponente = 150
let velocidadeYOponente;

//placar
let meusPontos = 0;
let pontosDoOponente = 0;

//sons do jogo
let raquetada;
let ponto;
let trilha;

function preload(){
  trilha = loadSound("trilha.mp3");
  ponto = loadSound("ponto.mp3");
  raquetada = loadSound("raquetada.mp3");
}

function setup() {
  createCanvas(600, 400);
  trilha.loop();
}
//função onde tá tudo 
function draw() {
    background(0);
    mostraBolinha();
    movimentaBolinha();
    verificaColisaoBorda();
    mostraRaquete(xRaquete, yRaquete);
    mostraRaquete(xRaqueteOponente, yRaqueteOponente);
    movimentaRaquete();
    movimentaRaqueteOponente();
    verificaColisaoRaquete();
    verificaColisaoRaqueteOponente();
    incluiPlacar();
    marcaPonto();
}

function mostraBolinha() {
    circle(xBolinha, yBolinha, diametro);
}

function movimentaBolinha() {
    xBolinha += velocidadeXBolinha;
    yBolinha += velocidadeYBolinha;
}

function verificaColisaoBorda() {
    if (xBolinha + raio > width || xBolinha - raio < 0) {
        velocidadeXBolinha *= -1;
    }
    if (yBolinha + raio > height || yBolinha - raio < 0) {
        velocidadeYBolinha *= -1;
    }
}

function mostraRaquete(x, y){
  rect(x, y, largura, altura);
}

function movimentaRaquete(){
  if(keyIsDown(UP_ARROW)){
    yRaquete -= 10;
  }
    if(keyIsDown(DOWN_ARROW)){
    yRaquete += 10;
  }
}

function movimentaRaqueteOponente() {
  velocidadeYOponente = yBolinha - yRaqueteOponente - largura / 2 - 30;
  yRaqueteOponente += velocidadeYOponente;
  }
  

function verificaColisaoRaquete(){
  if (xBolinha - raio < xRaquete + largura && yBolinha - raio < yRaquete + altura && yBolinha + raio > yRaquete)
  velocidadeXBolinha *= -1;
  raquetada.play();
}

function verificaColisaoRaqueteOponente(){
  if (xBolinha + raio > xRaqueteOponente - largura && yBolinha - raio < yRaqueteOponente + altura && yBolinha + raio > yRaqueteOponente)
  velocidadeXBolinha *= -1;
  raquetada.play();
}

function incluiPlacar(){
stroke(255)
textAlign(CENTER);
textSize(16);
fill(color(178,34,34))  
rect(150, 10, 40, 20);
fill(255);
text(meusPontos, 170, 26);
fill(color(178,34,34)) 
rect(450, 10, 40, 20);
fill(255);
text(pontosDoOponente, 470, 26);
}

function marcaPonto(){
if (xBolinha > 592){
  meusPontos += 1
  ponto.play();
}
if (xBolinha < 8){
  pontosDoOponente += 1
  ponto.play();
}
}

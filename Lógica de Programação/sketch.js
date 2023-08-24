//variaveis bolinha
let xBolinha = 300;
let yBolinha = 200;
let diametro = 15;
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

function setup() {
  createCanvas(600, 400);
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
}

function verificaColisaoRaqueteOponente(){
  if (xBolinha + raio > xRaqueteOponente - largura && yBolinha - raio < yRaqueteOponente + altura && yBolinha + raio > yRaqueteOponente)
  velocidadeXBolinha *= -1;
}

function incluiPlacar(){
fill(255)
text(meusPontos, 200, 26)
text(pontosDoOponente, 350, 26)
}

function marcaPonto(){
if (xBolinha > 592){
  meusPontos += 1
}
if (xBolinha < 8){
  pontosDoOponente += 1
}
}
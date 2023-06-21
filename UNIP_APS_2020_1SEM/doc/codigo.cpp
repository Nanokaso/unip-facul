//A0 sensor temperatura
//A1 sensor de chuva
#include "dht.h" //INCLUSÃO DE BIBLIOTECA
#include <SoftwareSerial.h>
#define DEBUG true

SoftwareSerial moduloWifi(2, 3); // make RX Arduino line is pin 5, make TX Arduino line is pin 6.

int pino_chuva = A1; // pino da chuva
int pino_temp = A0; // pino da chuva

int val_chuva = 0;
int val_temp = 0;

dht DHT;

void setup() {

  pinMode(13, OUTPUT); // led do Arduino
  pinMode(pino_chuva, INPUT); // pino de chuva como entrada

  Serial.begin(9600);
  moduloWifi.begin(115200); // baud rate padrão do ESP8266
  Serial.println("** Verificando conexão **");
  Serial.println();
  delay(1000);
  enviarInfo("AT\r\n", 2000, DEBUG);
  delay(1000);
  Serial.println("** Versão de firmware **");
  Serial.println();
  delay(1000);
  enviarInfo("AT+GMR\r\n", 2000, DEBUG); // rst
  Serial.println();
  Serial.println("** Final **");



  enviarInfo("AT+RST\r\n", 2000, DEBUG); // reseta o modulo

  enviarInfo("AT+CWMODE=1\r\n", 1000, DEBUG); // configura como modo wifi
  enviarInfo("AT+CWJAP=\"VIVO-6C98\",\"5760616C98\"\r\n", 6000, DEBUG); // credenciais wifi
  enviarInfo("AT+CIFSR\r\n", 2000, DEBUG); // pega ip
  enviarInfo("AT+CIPMUX=1\r\n", 1000, DEBUG); // configura pra varias conexoes
  enviarInfo("AT+CIPSERVER=1,80\r\n", 1000, DEBUG); // abre porta 80

}

void loop() {

  delay(1000);
  digitalWrite(13, HIGH);

  val_chuva = analogRead(pino_chuva);
  Serial.print("Chuva: ");
  Serial.println(val_chuva);

  DHT.read11(pino_temp);
  Serial.print("Umidade: ");
  Serial.print(DHT.humidity);
  Serial.println("%");
  Serial.print("Temperatura: ");
  Serial.println(DHT.temperature, 0);


  if (moduloWifi.available()) // verifica se a caralha ta enviando informação
  {
    if (moduloWifi.find("+IPD,"))
    {
      // o 0 ascii começa no 48
      int IdConexao = moduloWifi.read() - 48;
      //pra ler a url cliente
      String mensagem;
      moduloWifi.find("?");
      delay(100);
      mensagem = moduloWifi.readStringUntil(' ');
      String comando1 = mensagem.substring(0);
      // Inicio do html
      String paginaWeb = "<html><head><title>SOCOROOOOOOOOOOOOOOOOOO</title>";
      paginaWeb += "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"><style>.button {background-color: orange;border: none;color: white;padding: 15px 32px;text-align: center;display: inline-block;font-size: 16px;} .centro {text-align: center;}</style>";
      paginaWeb += "</head><body class=\"centro\"><h1 class=\"centro\">socoorrooo</h1>";

      paginaWeb += "<a class=\"button\" href=\"?T\">TAP</a></body></html>";
      String enviaComando = "AT+CIPSEND=";
      enviaComando += IdConexao;
      enviaComando += ",";
      enviaComando += paginaWeb.length();
      enviaComando += "\r\n";
      enviarInfo(enviaComando, 500, DEBUG);
      enviarInfo(paginaWeb, 500, DEBUG);

      //fecha
      String comandoFechar = "AT+CIPCLOSE=";
      comandoFechar += IdConexao; // adiciona o id da conexao
      comandoFechar += "\r\n";
      enviarInfo(comandoFechar, 500, DEBUG);
    }
  }


  delay(1000);
  digitalWrite(13, LOW);

}
void enviarInfo(String command, const int timeout, boolean debug)
{
  moduloWifi.print(command); // envia a info
  long int time = millis();

  while ( (time + timeout) > millis())
  {
    while (moduloWifi.available())
    {
      // escreve alguma coisa se tiver info
      Serial.println(moduloWifi.read());
    }
  }
}
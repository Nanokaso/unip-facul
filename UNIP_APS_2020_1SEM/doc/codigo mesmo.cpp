
#include <binary.h>
#include <Server.h>
#include <Stream.h>
#include <WString.h>

#include <SoftwareSerial.h>

//INCLUSÃO DE BIBLIOTECA


#include "dht.h"

#define DEBUG true
// --------------------------------------
int pino_chuva = A1; // pino da chuva
int pino_dht = A3; // pino do DHT
dht DHT;

String valorChuva;
String valorTemperatura;
String valorUmidade;
// --------------------------------------

void console(String txt)
{
  if (DEBUG)
  {
    Serial.println(txt);
  }
}

void setup()
{
  Serial.begin(9600);

  // led como saida
  pinMode(13, OUTPUT);

  setupComponentes();
  setupWif();
}

void loop()
{
  loopLed(1);
  loopComponentes();
  loopLed(0);

  loopLed(1);
  loopWif();
  loopLed(0);
}

void loopLed(int tipo)
{
  if (tipo == 1)
  {
    delay(1000);
    digitalWrite(13, HIGH);
  }
  else
  {
    delay(1000);
    digitalWrite(13, LOW);
  }
}

// --------------------------------------
void setupComponentes()
{
  // pino de chuva como entrada
  pinMode(pino_chuva, INPUT);
}

void loopComponentes()
{
  // chuva
  int chuva = analogRead(pino_chuva);
  valorChuva = String(chuva);
  console(String("Chuva: ") += valorChuva);

  DHT.read11(pino_dht);

  // umidade
  int umidade = DHT.humidity;
  valorUmidade = String(umidade);
  console(String("Umidade: ") += valorUmidade);

  // temperatura
  int temperatura = DHT.temperature;
  valorTemperatura = String(temperatura);
  console(String("Temperatura: ") += valorTemperatura);

  console(String("------------------------------------------"));
}

// --------------------------------------
void setupWif()
{

}

void loopWif()
{

}




#define BLYNK_PRINT Serial
#include <ESP8266_Lib.h>
#include <BlynkSimpleShieldEsp8266.h>
#include <SoftwareSerial.h>
#define ESP8266_BAUD 9600

char auth[] = "6bae2d0e7bfa4b6096feeaffa2030e4f";
char ssid[] = "VIVO-6C98"; //You can replace the wifi name to your wifi 

char pass[] = "5760616C98";  //Type password of your wifi.

SoftwareSerial EspSerial(2, 3); // RX, TX

ESP8266 wifi(&EspSerial);

void setup()
{
  Serial.begin(9600);
  EspSerial.begin(ESP8266_BAUD);
  Blynk.begin(auth, wifi, ssid, pass);
  Serial.println("cheguei");
}

void loop()
{
  Serial.println("rodei");
  Blynk.run();
}


/*
 *  This sketch sends data via HTTP GET requests to data.sparkfun.com service.
 *
 *  You need to get streamId and privateKey at data.sparkfun.com and paste them
 *  below. Or just customize this script to talk to other HTTP servers.
 *  ESP8266 Arduino example
 */

#include <ESP8266wifi.h>

const char* ssid     = "your-ssid";
const char* password = "your-password";

const char* host = "data.sparkfun.com";
const char* streamId   = "....................";
const char* privateKey = "....................";

void setup() {
  Serial.begin(115200);
  delay(10);

  // We start by connecting to a WiFi network

  Serial.println();
  Serial.println();
  Serial.print("Connecting to ");
  Serial.println(ssid);
  
  WiFi.begin(ssid, password);
  
  while (WiFi.status() != WL_CONNECTED) {
    delay(500);
    Serial.print(".");
  }

  Serial.println("");
  Serial.println("WiFi connected");  
  Serial.println("IP address: ");
  Serial.println(WiFi.localIP());
}

int value = 0;

void loop() {
  delay(5000);
  ++value;

  Serial.print("connecting to ");
  Serial.println(host);
  
  // Use WiFiClient class to create TCP connections
  WiFiClient client;
  const int httpPort = 80;
  if (!client.connect(host, httpPort)) {
    Serial.println("connection failed");
    return;
  }
  
  // We now create a URI for the request
  String url = "/input/";
  url += streamId;
  url += "?private_key=";
  url += privateKey;
  url += "&value=";
  url += value;
  
  Serial.print("Requesting URL: ");
  Serial.println(url);
  
  // This will send the request to the server
  client.print(String("GET ") + url + " HTTP/1.1\r\n" +
               "Host: " + host + "\r\n" + 
               "Connection: close\r\n\r\n");
  unsigned long timeout = millis();
  while (client.available() == 0) {
    if (millis() - timeout > 5000) {
      Serial.println(">>> Client Timeout !");
      client.stop();
      return;
    }
  }
  
  // Read all the lines of the reply from server and print them to Serial
  while(client.available()){
    String line = client.readStringUntil('\r');
    Serial.print(line);
  }
  
  Serial.println();
  Serial.println("closing connection");
}



/*
 *  This sketch sends data via HTTP GET requests to data.sparkfun.com service.
 *
 *  You need to get streamId and privateKey at data.sparkfun.com and paste them
 *  below. Or just customize this script to talk to other HTTP servers.
 *  ESP8266 Arduino example
 */


//https://create.arduino.cc/projecthub/pratikdesai/how-to-program-esp8266-esp-01-module-with-arduino-uno-598166
#include <ESP8266WiFi.h>

const char* ssid     = "your-ssid";
const char* password = "your-password";

const char* host = "data.sparkfun.com";
const char* streamId   = "....................";
const char* privateKey = "....................";

void setup() {
  Serial.begin(115200);
  delay(10);

  // We start by connecting to a WiFi network

  Serial.println();
  Serial.println();
  Serial.print("Connecting to ");
  Serial.println(ssid);
  
  WiFi.begin(ssid, password);
  
  while (WiFi.status() != WL_CONNECTED) {
    delay(500);
    Serial.print(".");
  }

  Serial.println("");
  Serial.println("WiFi connected");  
  Serial.println("IP address: ");
  Serial.println(WiFi.localIP());
}

int value = 0;

void loop() {
  delay(5000);
  ++value;

  Serial.print("connecting to ");
  Serial.println(host);
  
  // Use WiFiClient class to create TCP connections
  WiFiClient client;
  const int httpPort = 80;
  if (!client.connect(host, httpPort)) {
    Serial.println("connection failed");
    return;
  }
  
  // We now create a URI for the request
  String url = "/input/";
  url += streamId;
  url += "?private_key=";
  url += privateKey;
  url += "&value=";
  url += value;
  
  Serial.print("Requesting URL: ");
  Serial.println(url);
  
  // This will send the request to the server
  client.print(String("GET ") + url + " HTTP/1.1\r\n" +
               "Host: " + host + "\r\n" + 
               "Connection: close\r\n\r\n");
  unsigned long timeout = millis();
  while (client.available() == 0) {
    if (millis() - timeout > 5000) {
      Serial.println(">>> Client Timeout !");
      client.stop();
      return;
    }
  }
  
  // Read all the lines of the reply from server and print them to Serial
  while(client.available()){
    String line = client.readStringUntil('\r');
    Serial.print(line);
  }
  
  Serial.println();
  Serial.println("closing connection");
}

#include <SoftwareSerial.h>

SoftwareSerial esp8266(2, 3); // pino 2 TX , pino 3 RX

void setup() {
  Serial.begin(115200);         // Opções para ajuste 9600, 19200, 57600 e
  esp8266.begin(115200);        // 115200 dBs
}

void loop() {
  if (esp8266.available())      // Confere se a comunicação está acessível
  {
    while (esp8266.available()) { // Enquanto estiver acessível
      char c = esp8266.read();      // Le o caractere.
      Serial.write(c);              // Escreve no monitor serial
    }
  }
  if (Serial.available()) {
    delay(1000);
    String command = "";
    while (Serial.available()) {  // Le o comando
      command += (char)Serial.read();
    }
    esp8266.println(command);    // Envia o comando para o ESP
  }
}


#include <binary.h>
#include <Server.h>
#include <Stream.h>
#include <WString.h>
#include <ESP8266wifi.h>
#include <SoftwareSerial.h>
#include "dht.h"

#define DEBUG true
// --------------------------------------
int pino_chuva = A1; // pino da chuva
int pino_dht = A3; // pino do DHT
dht DHT;

String valorChuva;
String valorTemperatura;
String valorUmidade;
// --------------------------------------
#define sw_serial_rx_pin 1 //  Connect this pin to TX on the esp8266
#define sw_serial_tx_pin 0 //  Connect this pin to RX on the esp8266
#define esp8266_reset_pin 5 // Connect this pin to CH_PD on the esp8266, not reset. (let reset be unconnected)

#define SERVER_PORT "2121"
#define SSID "VIVO-6C98"
#define PASSWORD "5760616C98"

SoftwareSerial swSerial(sw_serial_rx_pin, sw_serial_tx_pin);

// the last parameter sets the local echo option for the ESP8266 module..
ESP8266wifi wifi(Serial, Serial, esp8266_reset_pin, swSerial);

void processCommand(WifiMessage msg);

uint8_t wifi_started = false;

// TCP Commands
const char RST[] PROGMEM = "RST";
const char IDN[] PROGMEM = "*IDN?";


void console(String txt)
{
  if (DEBUG)
  {
    Serial.println(txt);
  }
}

void setup()
{
  //Serial.begin(9600);

  // start debug serial
  swSerial.begin(115200);
  // start HW serial for ESP8266 (change baud depending on firmware)
  Serial.begin(9600);



  // led como saida
  pinMode(13, OUTPUT);

  setupComponentes();
  setupWifi();
}

void loop()
{
  loopLed(1);
  loopComponentes();
  loopLed(0);

  loopLed(1);
  loopWifi();
  loopLed(0);
}

void loopLed(int tipo)
{
  if (tipo == 1)
  {
    delay(1000);
    digitalWrite(13, HIGH);
  }
  else
  {
    delay(1000);
    digitalWrite(13, LOW);
  }
}

// --------------------------------------
void setupComponentes()
{
  // pino de chuva como entrada
  pinMode(pino_chuva, INPUT);
}

void loopComponentes()
{
  // chuva
  int chuva = analogRead(pino_chuva);
  valorChuva = String(chuva);
  console(String("Chuva: ") += valorChuva);

  DHT.read11(pino_dht);

  // umidade
  int umidade = DHT.humidity;
  valorUmidade = String(umidade);
  console(String("Umidade: ") += valorUmidade);

  // temperatura
  int temperatura = DHT.temperature;
  valorTemperatura = String(temperatura);
  console(String("Temperatura: ") += valorTemperatura);

  console(String("------------------------------------------"));
}

// --------------------------------------
void setupWifi()
{
  while (!Serial)
    ;
  Serial.println("Starting wifi");

  swSerial.println("Starting wifi");
  wifi.setTransportToTCP();// this is also default
  wifi.endSendWithNewline(false); // Will end all transmissions with a newline and carrage return ie println.. default is true

  wifi_started = wifi.begin();
  if (wifi_started) {
    wifi.connectToAP(SSID, PASSWORD);
    wifi.startLocalServer(SERVER_PORT);
  } else {
    // ESP8266 isn't working..
  }
}

void loopWifi()
{
  static WifiConnection *connections;

  // check connections if the ESP8266 is there
  if (wifi_started)
    wifi.checkConnections(&connections);

  // check for messages if there is a connection
  for (int i = 0; i < MAX_CONNECTIONS; i++) {
    if (connections[i].connected) {
      // See if there is a message
      WifiMessage msg = wifi.getIncomingMessage();
      // Check message is there
      if (msg.hasData) {
        // process the command
        processCommand(msg);
      }
    }
  }
}

void processCommand(WifiMessage msg) {
  // return buffer
  char espBuf[MSG_BUFFER_MAX];
  // scanf holders
  int set;
  char str[16];

  // Get command and setting
  sscanf(msg.message, "%15s %d", str, &set);
  /* swSerial.print(str);*/
  /* swSerial.println(set);*/

  if ( !strcmp_P(str, IDN) ) {
    wifi.send(msg.channel, "ESP8266wifi Example");
  }
  // Reset system by temp enable watchdog
  else if ( !strcmp_P(str, RST) ) {
    wifi.send(msg.channel, "SYSTEM RESET...");
    // soft reset by reseting PC
    asm volatile ("  jmp 0");
  }
  // Unknown command
  else {
    wifi.send(msg.channel, "ERR");
  }
}

//A0 sensor temperatura
//A1 sensor de chuva
#include "dht.h" //INCLUSÃO DE BIBLIOTECA
#include <SoftwareSerial.h>
#define DEBUG true

SoftwareSerial moduloWifi(0, 1); // make RX Arduino line is pin 5, make TX Arduino line is pin 6.

int pino_chuva = A1;
int pino_temp = A3; 
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
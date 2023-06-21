
//INCLUSÃO DE BIBLIOTECA
#include <binary.h>
#include <Server.h>
#include <Stream.h>
#include <WString.h>
#include <SoftwareSerial.h>
#include "dht.h"

#define DEBUG true
// --------------------------------------
int pino_chuva = A1; // pino da chuva
int pino_dht = A3; // pino do DHT
dht DHT;

String valorChuva; // variavel para guardar valor de chuva
String valorTemperatura; // variavel para guardar valor de temperatura
String valorUmidade; // variavel para guardar valor de umidade

int pinoRxEsp = 10;
int pinoTxEsp = 11;
int baudserial = 9600;
int baudWifi = 9600;

// -------------------------------------- Esp8266
SoftwareSerial moduloWifi(pinoTxEsp, pinoRxEsp); 

void setupWif()
{ 
  pinMode(pinoTxEsp, INPUT);
  pinMode(pinoRxEsp, OUTPUT);

  moduloWifi.begin(baudWifi); 
  
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
}

void loopWif()
{

}

void enviarInfo(String command, const int timeout, boolean debug)
{
  Serial.println("Comando:");
  Serial.println(command);
  moduloWifi.print(command); // envia a info
  long int time = millis();

  while ( (time + timeout) > millis())
  {     
    delay(1000);
    Serial.println(String (moduloWifi.available()));
    while (moduloWifi.available()>0)
    {
      Serial.println("Ta disponivel");
      Serial.println(moduloWifi.read());
    }
  }
}

// -------------------------------------- Inicio

void setup()
{
  Serial.begin(baudserial);

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

// -------------------------------------- Auxiliares
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

void console(String txt)
{
  if (DEBUG)
  {
    Serial.println(txt);
  }
}
// -------------------------------------- Componentes
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


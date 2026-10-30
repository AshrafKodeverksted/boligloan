import { useState } from "react";

function App() {

const [balance,setBalance] = useState(2_000_000);
const [payment,setPayment] = useState(0);

function updateBalance() {
  if (payment <= 0) {
    alert("Skriv inn et gyldig beløp.");
    return;
  }
  if (payment > balance ) {
    alert("Innbetalingen kan ikke være større enn restgjelden.");
    return;
  }
  setBalance(previousBalance => previousBalance - payment ) // denne metoden gjør sånn at neste betaling trekker fra den siste balance
  setPayment(0);
}

  return (
    <>
    
      <h1>Mitt boliglån</h1>
      <p>Restgjeld : {balance}  kr</p>

      <input
      type="number"
      value={payment}
      onChange = {(event) => setPayment(Number(event.target.value))} // event.target.value henter inputet (streng) fra feltet, og Number() konverterer den til et tall.
      />
    
      <button onClick= {updateBalance}>
        Registrer innbetaling
      </button>

    </>
    
  )
};

export default App;
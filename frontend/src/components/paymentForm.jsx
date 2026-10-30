function paymentForm(props) {
    return(
        <>
        <input
      type="number"
      value={props.payment}
      onChange = {(event) => setPayment(Number(event.target.value))} // event.target.value henter inputet (streng) fra feltet, og Number() konverterer den til et tall.
      />
    
      <button onClick= {updateBalance}>
        Registrer innbetaling
      </button>

        </>
    )
}

export default paymentForm;

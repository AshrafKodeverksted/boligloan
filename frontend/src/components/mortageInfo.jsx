
function mortgageInfo(props) {
    return(
        <>
        <h1>Mitt boliglån</h1>
      <p>Restgjeld : {props.balance}  kr</p>
        </>
    )
}

export default mortgageInfo;
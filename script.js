let balance = 1_000_000;

const balanceElement = document.getElementById("balance");
const paymentInput = document.getElementById("payment");
const payButton = document.getElementById("payButton");
const messageElement = document.getElementById("message");

function updateBalance() {
    balanceElement.textContent = balance.toLocaleString("nb-NO") + "kr";
}

payButton.addEventListener("click", function() {
    const payment = Number(paymentInput.value);

    if (!Number.isFinite || payment <= 0 ) {
        messageElement.textContent = "Skriv inn et gyldig beløp";
        return ;
    }

    if ( payment > balance) {
        messageElement.textContent = "Betalingen kan ikke være større enn restgjelden"
        return ;
    }

    balance = balance - payment;

    updateBalance();
    messageElement.textContent = "Betalingen er registrert i denne demoen";

    paymentInput.value = "";
});

updateBalance();
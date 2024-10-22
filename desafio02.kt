class BankAccount(val accountHolder: String) {
    // Propriedade privada para o saldo
    private var _balance: Double = 0.0

    // Getter personalizado para o saldo
    val balance: Double
        get() = _balance

    // Método para depositar valor na conta
    fun deposit(amount: Double) {
        if (amount > 0) {
            _balance += amount
            println("Depositado: R$$amount. Saldo atual: R$$balance.")
        } else {
            println("O valor do depósito deve ser positivo.")
        }
    }

    // Método para sacar valor da conta
    fun withdraw(amount: Double) {
        if (amount > 0 && amount <= _balance) {
            _balance -= amount
            println("Sacado: R$$amount. Saldo atual: R$$balance.")
        } else if (amount > _balance) {
            println("Erro: Saldo insuficiente para o saque de R$$amount.")
        } else {
            println("O valor do saque deve ser positivo.")
        }
    }
}

// Exemplo de uso
fun main() {
    val account = BankAccount("João da Silva")
    
    account.deposit(150.0)
    account.withdraw(50.0)
    account.withdraw(200.0)
    println("Saldo final: R$$${account.balance}")
}

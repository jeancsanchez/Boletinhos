package app.boletinhos.domain.bill

enum class BillStatus(val code: StatusCode) {
    UNPAID(StatusCode(0)),
    PAID(StatusCode(1)),
    OVERDUE(StatusCode(2))
}
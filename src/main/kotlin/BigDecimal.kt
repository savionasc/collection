import java.math.BigDecimal

fun Array<BigDecimal>.somatoria() = this.reduce{
    atc, valor -> atc + valor
}

fun Array<BigDecimal>.media() =
    if(this.isEmpty()) BigDecimal.ZERO
    else this.somatoria() / this.size.toBigDecimal()
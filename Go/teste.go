package main

import (
	"fmt"
)

func main() {
	var peso,altura,imc float64
	fmt.Print("Insira seu peso: ")
	fmt.Scan(&peso)
	fmt.Println("Insira sua altura: ")
	fmt.Scan(&altura)
	imc= peso / (altura*altura)
	if imc<18.5{
		fmt.Println("Abaixo do peso!")
	} else if imc<25{
		fmt.Printf("Peso bom!")
	} else if imc>=25{
		fmt.Printf("Acima do peso!")
	}
	fmt.Print(imc)
}
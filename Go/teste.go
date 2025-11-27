package main

import (
	"errors"
	"fmt"
)


func obterDia(numero int) (string,error){
	var dia string
	switch numero{
		case 1:
			dia="Domingo"
		case 2:
			dia="Segunda-feira"
		case 3:
			dia="Terça-feira"
		case 4:
			dia="Quarta-feira"
		case 5:
			dia="Quinta-feira"
		case 6:
			dia="Sexta-feira"
		case 7:
			dia="Sábado"
		default:
			return "",errors.New("Erro, número de dia inválido! Por favor, tente novamente com números inteiros entre 1 e 7.")
}
	return dia,nil
}
func main() {
	dia_1,erro_1:=obterDia(4)
	if erro_1!= nil{
		fmt.Println("Erro!",erro_1)
	} else{
		fmt.Printf("O número é: %s\n", dia_1)
	}
}
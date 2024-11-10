package org.example.main;

import org.example.singletons.Circulo;
import org.example.singletons.Quadrado;
import org.example.singletons.Triangulo;

import javax.management.InstanceAlreadyExistsException;

public class FabricaDeFormas {

    public Circulo criarCirculo(Double raio) {
        return Circulo.getInstance(raio);
    }

    public Triangulo criarTrianguloEquilatero(Double lado1, Double lado2, Double lado3) {
        return Triangulo.getInstance(Triangulo.Tipo.EQUILATERO, lado1, lado2, lado3);
    }

    public Triangulo criarTrianguloIsosceles(Double lado1, Double lado2, Double lado3) {
        return Triangulo.getInstance(Triangulo.Tipo.ISOSCELES, lado1, lado2, lado3);
    }

    public Triangulo criarTrianguloRetangulo(Double lado1, Double lado2, Double lado3) {
        return Triangulo.getInstance(Triangulo.Tipo.RETANGULO, lado1, lado2, lado3);
    }

    public Quadrado criarQuadrado(Double lado) {
        return new Quadrado(lado);
    }

    public Triangulo getTrianguloEquilatero() {
        return Triangulo.getInstance(Triangulo.Tipo.EQUILATERO);
    }

    public Triangulo getTrianguloIsosceles() {
        return Triangulo.getInstance(Triangulo.Tipo.ISOSCELES);
    }

    public Triangulo getTrianguloRetangulo() {
        return Triangulo.getInstance(Triangulo.Tipo.RETANGULO);
    }
}

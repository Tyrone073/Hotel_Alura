package com.tyrone.hotel_alura.modelo;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


import javax.persistence.*;

@Table(name ="usuarios")
@Entity(name = "Usuario")
@Getter//este es para pedir los getter sin escribirlo en e el codigo y es gacias a lombo
@NoArgsConstructor // este es parar pedir un constrigtor vacio
@AllArgsConstructor // para pedir un constrictor con todos los atributos exixtentes
@EqualsAndHashCode(of = "id")
public class Usuario{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id ;
    private  String login;
    private  String clave;

}

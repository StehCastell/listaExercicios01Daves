<%-- 
    Document   : veiculo
    Created on : 2 de abr. de 2022, 11:18:21
    Author     : Steh Castell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Start Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <form action="VeiculoServlet" method="POST">
            <label for="tipoVeiculo">Escolha o tipo do veículo:  </label>
            <select name="tipoVeiculo" id="tipoVeiculo">
                <option value="Popular">Popular</option>
                <option value="Basico">Básico</option>
                <option value="SUV">SUV</option>
                <option value="Utilitario">Utilitário</option>
                <option value="Sedan">Sedan</option>
            </select>            
            
            <label for="modelo">Escolha o modelo:  </label>
            <select name="modelo" id="modelo"> </select>
            
                
            <label for="adicional">Adicionais: </label>
            <input type="checkbox" name="adicional[]" value="ar">Ar
            <input type="checkbox" name="adicional[]" value="cambioAutomatico">Câmbio Automático
            <input type="checkbox" name="adicional[]" value="pinturaDiferente">Pintura
especial, metálica ou comemorativa 
            <input type="checkbox" name="adicional[]" value="vidroAutomatico">Vidro Automático
            <input type="checkbox" name="adicional[]" value="alarme">Alarme
            <input type="checkbox" name="adicional[]" value="tetoSolar">Teto Solar
            <input type="checkbox" name="adicional[]" value="kitMultimidia">Kit Multimídia
            <input type="checkbox" name="adicional[]" value="potenciaMotor">Potência do Motor
            
            <label for="tipoMotor">Potência do Motor:  </label>
            <select name="tipoMotor" id="tipoMotor">
                <option value="1.0">1.0</option>
                <option value="2.0">2.0</option>
                <option value="2.0">3.0</option>
            </select>   
            
            
            
            
            <input type="submit" name="Enviar">

            <button type="submit"> Calcular</button>
        </form>
    </body>
</html>
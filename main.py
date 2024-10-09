from flask import Flask, request, jsonify

app = Flask(__name__)

class Calculadora:
    # Efetua a soma de dois valores
    def soma(self, i, j):
        return i + j

    # Efetua a subtração de dois valores
    def subtracao(self, i, j):
        return i - j

    # Efetua a multiplicação de dois valores
    def multiplicacao(self, i, j):
        return i * j

    # Efetua a divisão de dois valores
    def divisao(self, i, j):
        if j != 0:
            return i / j
        else:
            return "Erro: Divisão por zero."

calculadora = Calculadora()

@app.route('/soma', methods=['GET'])
def soma():
    i = float(request.args.get('NA'))
    j = float(request.args.get('NB'))
    resultado = calculadora.soma(i, j)
    return jsonify({"resultado": resultado})

@app.route('/subtracao', methods=['GET'])
def subtracao():
    i = float(request.args.get('NA'))
    j = float(request.args.get('NB'))
    resultado = calculadora.subtracao(i, j)
    return jsonify({"resultado": resultado})

@app.route('/multiplicacao', methods=['GET'])
def multiplicacao():
    i = float(request.args.get('NA'))
    j = float(request.args.get('NB'))
    resultado = calculadora.multiplicacao(i, j)
    return jsonify({"resultado": resultado})

@app.route('/divisao', methods=['GET'])
def divisao():
    i = float(request.args.get('NA'))
    j = float(request.args.get('NB'))
    resultado = calculadora.divisao(i, j)
    return jsonify({"resultado": resultado})

if __name__ == '__main__':
    app.run(debug=True, port = 8080)

# Java_Geometric_Shapes_Graphics
This project is a graphical application in Java for creating and drawing geometric shapes. The purpose of this practice is to apply knowledge of graphical interfaces, event handling, and class design in Java.

## Description
This project is a graphical application in Java for creating and drawing geometric shapes. The purpose of this practice is to apply knowledge of graphical interfaces, event handling, and class design in Java.

## Requirements
- Java Development Kit (JDK) 8 or higher.
- An Integrated Development Environment (IDE) like IntelliJ IDEA, Eclipse, or NetBeans.

## Project Structure
The project is organized into the following packages and classes:

### Packages and Classes

#### Package `figurasgeometricas`
- **Principal**: Contains the `main` method that starts the application by creating and configuring the `VentanaPrincipal`.

#### Package `figurasgeometricas.guis`
- **VentanaPrincipal**: Class that inherits from `JFrame` and sets up the main application window.
- **MenuPanel**: Panel containing controls for selecting the type of shape, color, and thickness.
- **DibujoPanel**: Panel where the created shapes are drawn.

#### Package `figurasgeometricas.eventos`
- **EscuchadorDibujo**: Class implementing `ActionListener` and `MouseListener` to handle drawing events.
- **EscuchadorVentana**: Class implementing `WindowListener` to handle the window closing event.

#### Package `figurasgeometricas.figuras`
- **Figura**: Abstract class defining the `pintar(Graphics)` method.
- **Linea**: Class inheriting from `Figura` and storing data to draw a line.
- **Ovalo**: Class inheriting from `Figura` and storing data to draw an oval.
- **Rectangulo**: Class inheriting from `Figura` and storing data to draw a rectangle.

## Running the Application
To run the application, simply compile and execute the `Principal` class. The main window will display the menu controls and the drawing area where you can create and manipulate geometric shapes.

## Contributions
Contributions are welcome. Feel free to open an issue or submit a pull request.

// SFML_Template.cpp : Diese Datei enthält die Funktion "main". Hier beginnt und endet die Ausführung des Programms.
//

#include <SFML/Graphics.hpp>

using namespace sf;

CircleShape newCircle(float radius, float x_pos, float y_pos);

int main()
{
    const int windowheight = 500;
    const int windowwidth = 500;
    RenderWindow window(VideoMode(windowwidth, windowheight), "SFML works!");

    std::vector<CircleShape> circles;
    float radius = 10;
    size_t circleInRow = 1;
    for(size_t circleRow = 1; circleRow <= 6; circleRow++){
        for(size_t i = 1; i <= circleInRow; i++){
            circles.push_back(newCircle(radius, i * (windowwidth / (circleInRow + 1)), circleRow * (2 * radius + 10)));
        }
        circleInRow = circleInRow * 2;
    }

    while (window.isOpen()){
        Event event;
        while (window.pollEvent(event)){
            if (event.type == Event::Closed)
                window.close();
        }
        window.clear();
        for(CircleShape curCircle: circles){
            window.draw(curCircle);
        }
        window.display();
    }
    return 0;
}

CircleShape newCircle(float radius, float x_pos, float y_pos){
    CircleShape circle;
    circle.setFillColor(Color::Blue);
    circle.setPosition(x_pos, y_pos);
    circle.setRadius(10);

    return circle;
}
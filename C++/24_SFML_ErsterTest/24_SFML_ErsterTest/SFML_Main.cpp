#include <SFML/Graphics.hpp>
#include <vector>

using namespace sf;

int main()
{
    float windowWidth = 240;
    float windowHeight = 240;
    RenderWindow window(VideoMode(windowWidth, windowHeight), "SFML works!");

    std::vector <CircleShape> dots;

    for(float i = 0; i <= 200; i += 100){
        for(float j = 0; j <= 200; j += 100){
            CircleShape dot(20);
            dot.setFillColor(Color::Cyan);
            dot.setPosition(i, j);
            dots.push_back(dot);
        }
    }

    RectangleShape line1(Vector2f(5, 250));
    line1.setRotation(30);


    RectangleShape line2(Vector2f(5, 100));
    line2.setRotation(90);
    line2.setPosition(windowHeight / 2 , windowWidth);

    RectangleShape line3(Vector2f(5, 100));
    line3.setPosition(windowHeight, windowWidth / 2);
  
   
    while (window.isOpen())
    {
        Event event;
        while (window.pollEvent(event))
        {
            if (event.type == Event::Closed)
                window.close();
        }

        window.clear();
        for(CircleShape dot: dots){
            window.draw(dot);
        }

        window.draw(line1);
        window.draw(line2);
        window.draw(line3);
        window.display();
    }
    return 0;
}
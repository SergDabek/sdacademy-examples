package pl.sdacademy.gracz;

public class DefaultMonster implements Monster {
        @Override
        public void takeDamage(int damage) {
                System.out.println(String.format("Monster takes %s dmg", damage));
        }
}

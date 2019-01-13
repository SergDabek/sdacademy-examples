package pl.sdacademy.tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class FizzBuzzTest {
        @DisplayName("Given 1,when call FizzBuzz, then return 1")
        @Test

        //formatter:on
        void test() throws Exception{
                //given
                int number = 1;

                //when
                String msg = FizzBuzz.msg(number);

                //then
                assertThat(msg).isEqualTo("1");
        }
        @DisplayName("Given 2,when call FizzBuzz, then return 2")
        @Test

        //formatter:on
        void test0() throws Exception{
                //given
                int number = 2;

                //when
                String msg = FizzBuzz.msg(number);

                //then
                assertThat(msg).isEqualTo("2");
        }
        @DisplayName("Given 3,when call FizzBuzz, then return 'Fizz'")
        @Test

        //formatter:on
        void test1() throws Exception{
                //given
                int number = 3;

                //when
                String msg = FizzBuzz.msg(number);

                //then
                assertThat(msg).isEqualTo("Fizz");
        }

        @DisplayName("Given 5,when call FizzBuzz, then return 'Buzz'")
        @Test

                //formatter:on
        void test2() throws Exception{
                //given
                int number = 5;

                //when
                String msg = FizzBuzz.msg(number);

                //then
                assertThat(msg).isEqualTo("Buzz");
        }

        @DisplayName("Given 15,when call FizzBuzz, then return 'FizzBuzz'")
        @Test

                //formatter:on
        void test3() throws Exception{
                //given
                int number = 15;

                //when
                String msg = FizzBuzz.msg(number);

                //then
                assertThat(msg).isEqualTo("FizzBuzz");
        }
}

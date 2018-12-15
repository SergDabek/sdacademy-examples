package pl.sdacademy.downloader;

public class Main {
        public static void main(String[] args) {
                /*CommandLineRunner commandLine = new CommandLineRunner(
                        url -> System.out.printf("Downloading file %s\n", url));*/

                CommandLineRunner commandLine = new CommandLineRunner(new FileDownLoader(),
                        new NewThreadExecutor());
                commandLine.run(System.in);
        }
}

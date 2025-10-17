package br.web_module_group_project;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
  public static void main(String[] args) {
      System.out.println ("Choose what service do you want to use!");

      HttpClient client = HttpClient.newHttpClient ();
      HttpRequest get1 = HttpRequest.newBuilder ().uri (URI.create ("https://dummyjson.com/products/1")).build ();

      client
        .sendAsync (get1 , HttpResponse.BodyHandlers.ofString () )
        .thenApply (HttpResponse::body)
        .thenAccept (System.out::println)
        .join ();



  }

};
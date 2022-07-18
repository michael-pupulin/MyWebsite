package example

import org.scalajs.dom.document

import scala.scalajs.js.annotation.JSExportTopLevel

object Hello  {
  def main(args: Array[String]) : Unit={
  }

  // I need a function that iterates through a directory of images with each click of a button.
  var i=0;
  var paths: Array[String] = Array("hqp.jpg", "cotty.jpeg", "camp.jpeg", "golf.JPG","surf.jpg", "sanf.JPG","simba.jpg","eddie.jpg" );
  var caps: Array[String] = Array("That's me.","My friends !","My girlfriend, Emily, and I while camping &#127957", "Playing some golf &#9971 ","Surfing for the first time &#127940",
    "Trip to California &#128526", "My dog Simba.", "My dog Eddie.");
  @JSExportTopLevel("doClickStuff")
  def doClickStuff(): Unit = {
    i=i+1;
    var image = document.getElementById("myimage");
    var cap = document.getElementById("caption");
    if(i > paths.length-1){i=0}
    image.outerHTML = """<img id="myimage" class="slide" src="./images/""" ++ paths(i) ++"""" />""";
    cap.innerHTML = caps(i);
    println("button clicked");

  }



  var j=0;
  var workpics: Array[String] = Array("eb.png","onf.png","article.png");
  var workcaps: Array[String] = Array("My EasyBlight app, made with R and R Shiny." ,
    "What subscribers see when a new post has been published to ONfruit.",
    "A screenshot of the article I wrote for Orchard Network Newsletter.");
  @JSExportTopLevel("workslides")
  def workslides(): Unit = {
    j=j+1;
    var image = document.getElementById("workimg");
    var cap = document.getElementById("workcaption");
    if(j > workpics.length-1){j=0}
    image.outerHTML = """<img id="workimg" class="workslide" src="./images/""" ++ workpics(j) ++"""" />""";
    cap.innerHTML = workcaps(j);
    println("button clicked");

  }

}
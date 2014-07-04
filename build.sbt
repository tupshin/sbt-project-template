name := "my-test-project"

organization := "my.example.domain"

version := "0.1.0"

scalaVersion := "2.10.4"

libraryDependencies ++= Seq(
)

libraryDependencies ++= Seq(
)

libraryDependencies ++= Seq(
)

scalacOptions in (Compile, doc) ++= Seq("-doc-root-content", "rootdoc.txt")

EclipseKeys.withBundledScalaContainers := false

EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource



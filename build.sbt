name := "code_coverage_test_2"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies ++= {
  if (coverageEnabled.value)
    Seq("org.scoverage" %% "scalac-scoverage-runtime" % "1.1.1")
  else
    Nil
}
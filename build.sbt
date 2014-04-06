import play.Project._

name := """kupch-portal"""

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  "org.webjars" %% "webjars-play" % "2.2.0", 
  "org.webjars" % "bootstrap" % "2.3.1"
)

playScalaSettings

findbugsSettings

findbugsIncludeFilters := Some(<FindBugsFilter>
  <Match>
    <Bug category="MALICIOUS_CODE"/>
  </Match>
  <Match>
    <Bug category="NOISE"/>
  </Match>
  <Match>
    <Bug category="I18N"/>
  </Match>
  <Match>
    <Bug category="SECURITY"/>
  </Match>
  <Match>
    <Bug category="EXPERIMENTAL"/>
  </Match>
  <Match>
    <Bug pattern="BAC_BAD_APPLET_CONSTRUCTOR"/>
  </Match>
  <Match>
    <Bug pattern="DMI_UNSUPPORTED_METHOD"/>
  </Match>
  <Match>
    <Bug pattern="CD_CIRCULAR_DEPENDENCY"/>
  </Match>
  <Match>
    <Bug pattern="IMA_INEFFICIENT_MEMBER_ACCESS"/>
  </Match>
  <Match>
    <Bug pattern="IL_INFINITE_RECURSIVE_LOOP"/>
  </Match>
  <Match>
    <Bug pattern="PS_PUBLIC_SEMAPHORES"/>
  </Match>
  <Match>
    <Bug pattern="UOE_USE_OBJECT_EQUALS"/>
  </Match>
  <Match>
    <Bug pattern="USM_USELESS_SUBCLASS_METHOD"/>
  </Match>
  <Match>
    <Class name="‾views¥.html¥..*"/>
  </Match>
  <Match>
    <Class name="‾Routes.*"/>
  </Match>
  <Match>
    <Class name="‾controllers¥.routes.*"/>
  </Match>
</FindBugsFilter>)


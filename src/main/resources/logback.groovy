import static ch.qos.logback.classic.Level.INFO

appender("Console-Appender", ConsoleAppender) {
  encoder(PatternLayoutEncoder) {
    pattern = "%msg%n"
  }
}

root(INFO, ["Console-Appender"])
package io.greeb.core.dsl

import groovy.json.JsonSlurper
import org.slf4j.Logger
import org.slf4j.LoggerFactory

import java.nio.file.Paths

// TODO add support for loading config from classpath
public class PropertyLoader {

  static def slurper = new JsonSlurper()

  private final static Logger LOGGER = LoggerFactory.getLogger(PropertyLoader.class)

//  private static Map loadFileFromClasspath(String path) {
//    def resource = this.getClass().getResource(path)
//    if (resource) {
//      return (Map) slurper.parse(resource)
//    }
//    [:]
//  }

  public static Map loadFile(String path) {
    LOGGER.debug("Attempting to load $path")
    def resource = Paths.get(path)
    if (resource) {
      (Map) slurper.parse(resource.newInputStream())
    }
    LOGGER.warn("file not found: $path")
    [:]
  }

}

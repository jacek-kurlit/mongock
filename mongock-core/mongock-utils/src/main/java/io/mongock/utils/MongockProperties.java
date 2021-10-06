package io.mongock.utils;

import java.io.IOException;
import java.util.Properties;

public final class MongockProperties {

  public static final String PROXY_MONGOCK_PREFIX = "_$$_mongock_";
  public static final String CLI_PROFILE = "cli-profile";
  private static final String version;

  static {
    final Properties properties = new Properties();
    try {
      properties.load(MongockProperties.class.getClassLoader().getResourceAsStream("mongock.properties"));
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    version = properties.getProperty("version");
  }

  private MongockProperties() {}

  public static String getVersion() {
    return version;
  }


}
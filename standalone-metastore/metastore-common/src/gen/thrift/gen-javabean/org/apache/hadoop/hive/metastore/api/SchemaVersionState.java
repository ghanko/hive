/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum SchemaVersionState implements org.apache.thrift.TEnum {
  INITIATED(1),
  START_REVIEW(2),
  CHANGES_REQUIRED(3),
  REVIEWED(4),
  ENABLED(5),
  DISABLED(6),
  ARCHIVED(7),
  DELETED(8);

  private final int value;

  private SchemaVersionState(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static SchemaVersionState findByValue(int value) { 
    switch (value) {
      case 1:
        return INITIATED;
      case 2:
        return START_REVIEW;
      case 3:
        return CHANGES_REQUIRED;
      case 4:
        return REVIEWED;
      case 5:
        return ENABLED;
      case 6:
        return DISABLED;
      case 7:
        return ARCHIVED;
      case 8:
        return DELETED;
      default:
        return null;
    }
  }
}
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: route_guide.proto

package com.zzh.grpc.message;

public interface RouteNoteOrBuilder extends
    // @@protoc_insertion_point(interface_extends:routeguide.RouteNote)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The location from which the message is sent.
   * </pre>
   *
   * <code>.routeguide.Point location = 1;</code>
   */
  boolean hasLocation();
  /**
   * <pre>
   * The location from which the message is sent.
   * </pre>
   *
   * <code>.routeguide.Point location = 1;</code>
   */
  Point getLocation();
  /**
   * <pre>
   * The location from which the message is sent.
   * </pre>
   *
   * <code>.routeguide.Point location = 1;</code>
   */
  PointOrBuilder getLocationOrBuilder();

  /**
   * <pre>
   * The message to be sent.
   * </pre>
   *
   * <code>string message = 2;</code>
   */
  java.lang.String getMessage();
  /**
   * <pre>
   * The message to be sent.
   * </pre>
   *
   * <code>string message = 2;</code>
   */
  com.google.protobuf.ByteString
      getMessageBytes();
}
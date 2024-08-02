package io.tisonkun.demo.springboot.opendal;

import org.apache.opendal.Metadata;

public record CombinedObject(Metadata metadata, byte[] content) {
}

package com.amazon.ata.statics;

import java.util.UUID;

public class TrackedBox {

    private String boxId;
    private  String trackingId;

    /**
     * Constructs a TrackedBox object. A trackingId will also be generated for this TrackedBox object.
     * @param boxId - the id of the box
     */


    public TrackedBox(String boxId) {
        this.boxId = boxId;
        this.trackingId = createTrackingId(boxId);
    }

    private String createTrackingId(String boxId) {
        UUID randomUUID = UUID.randomUUID();

        String randomID = randomUUID.toString();

        return boxId + randomIDpush;

    }

    public String getBoxId() {
        return boxId;
    }

    public String getTrackingId() {
        return trackingId;
    }
}

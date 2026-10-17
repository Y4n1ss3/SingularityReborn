package androidx.compose.ui.contentcapture;

import androidx.compose.ui.platform.coreshims.ViewStructureCompat;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class ContentCaptureEvent {
    private final int id;
    private final ViewStructureCompat structureCompat;
    private final long timestamp;
    private final ContentCaptureEventType type;

    public ContentCaptureEvent(int i, long j, ContentCaptureEventType contentCaptureEventType, ViewStructureCompat viewStructureCompat) {
        this.id = i;
        this.timestamp = j;
        this.type = contentCaptureEventType;
        this.structureCompat = viewStructureCompat;
    }

    public static /* synthetic */ ContentCaptureEvent copy$default(ContentCaptureEvent contentCaptureEvent, int i, long j, ContentCaptureEventType contentCaptureEventType, ViewStructureCompat viewStructureCompat, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = contentCaptureEvent.id;
        }
        if ((i2 & 2) != 0) {
            j = contentCaptureEvent.timestamp;
        }
        if ((i2 & 4) != 0) {
            contentCaptureEventType = contentCaptureEvent.type;
        }
        if ((i2 & 8) != 0) {
            viewStructureCompat = contentCaptureEvent.structureCompat;
        }
        return contentCaptureEvent.copy(i, j, contentCaptureEventType, viewStructureCompat);
    }

    public final int component1() {
        return this.id;
    }

    public final long component2() {
        return this.timestamp;
    }

    public final ContentCaptureEventType component3() {
        return this.type;
    }

    public final ViewStructureCompat component4() {
        return this.structureCompat;
    }

    public final ContentCaptureEvent copy(int i, long j, ContentCaptureEventType contentCaptureEventType, ViewStructureCompat viewStructureCompat) {
        return new ContentCaptureEvent(i, j, contentCaptureEventType, viewStructureCompat);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentCaptureEvent)) {
            return false;
        }
        ContentCaptureEvent contentCaptureEvent = (ContentCaptureEvent) obj;
        return this.id == contentCaptureEvent.id && this.timestamp == contentCaptureEvent.timestamp && this.type == contentCaptureEvent.type && q10.b(this.structureCompat, contentCaptureEvent.structureCompat);
    }

    public final int getId() {
        return this.id;
    }

    public final ViewStructureCompat getStructureCompat() {
        return this.structureCompat;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final ContentCaptureEventType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = (this.type.hashCode() + ((Long.hashCode(this.timestamp) + (Integer.hashCode(this.id) * 31)) * 31)) * 31;
        ViewStructureCompat viewStructureCompat = this.structureCompat;
        return hashCode + (viewStructureCompat == null ? 0 : viewStructureCompat.hashCode());
    }

    public String toString() {
        return "ContentCaptureEvent(id=" + this.id + ", timestamp=" + this.timestamp + ", type=" + this.type + ", structureCompat=" + this.structureCompat + ')';
    }
}

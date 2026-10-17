package androidx.compose.runtime.composer.linkbuffer;

import androidx.compose.runtime.JoinedKey;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class KeyInfo {
    public static final int $stable = 8;
    private final long handle;
    private final int index;
    private final int key;
    private final int nodes;
    private final Object objectKey;

    public KeyInfo(int i, Object obj, long j, int i2, int i3) {
        this.key = i;
        this.objectKey = obj;
        this.handle = j;
        this.nodes = i2;
        this.index = i3;
    }

    public final int getAddress() {
        return GroupHandleKt.getGroup(getHandle());
    }

    public final long getHandle() {
        return this.handle;
    }

    public final int getIndex() {
        return this.index;
    }

    public final Object getJoinedKey() {
        Object obj = this.objectKey;
        int i = this.key;
        return obj != null ? new JoinedKey(Integer.valueOf(i), this.objectKey) : Integer.valueOf(i);
    }

    public final int getKey() {
        return this.key;
    }

    public final int getNodes() {
        return this.nodes;
    }

    public final Object getObjectKey() {
        return this.objectKey;
    }
}

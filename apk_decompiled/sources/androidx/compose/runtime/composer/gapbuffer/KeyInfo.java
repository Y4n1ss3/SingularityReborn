package androidx.compose.runtime.composer.gapbuffer;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class KeyInfo {
    public static final int $stable = 8;
    private final int index;
    private final int key;
    private final int location;
    private final int nodes;
    private final Object objectKey;

    public KeyInfo(int i, Object obj, int i2, int i3, int i4) {
        this.key = i;
        this.objectKey = obj;
        this.location = i2;
        this.nodes = i3;
        this.index = i4;
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getKey() {
        return this.key;
    }

    public final int getLocation() {
        return this.location;
    }

    public final int getNodes() {
        return this.nodes;
    }

    public final Object getObjectKey() {
        return this.objectKey;
    }
}

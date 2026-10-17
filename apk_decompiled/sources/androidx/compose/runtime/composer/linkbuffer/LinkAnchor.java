package androidx.compose.runtime.composer.linkbuffer;

import androidx.compose.runtime.Anchor;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LinkAnchor implements Anchor {
    public static final int $stable = 8;
    private int address;

    public LinkAnchor(int i) {
        this.address = i;
    }

    public final int getAddress() {
        return this.address;
    }

    @Override // androidx.compose.runtime.Anchor
    public boolean getValid() {
        return this.address != -1;
    }

    public final void setAddress(int i) {
        this.address = i;
    }

    public String toString() {
        return super.toString() + "{ address: " + this.address + " }";
    }
}

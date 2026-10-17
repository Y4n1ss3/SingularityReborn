package androidx.compose.runtime.composer.gapbuffer;

import androidx.compose.runtime.Anchor;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GapAnchor implements Anchor {
    public static final int $stable = 8;
    private int location;

    public GapAnchor(int i) {
        this.location = i;
    }

    public final int getLocation$runtime() {
        return this.location;
    }

    @Override // androidx.compose.runtime.Anchor
    public boolean getValid() {
        return this.location != Integer.MIN_VALUE;
    }

    public final void setLocation$runtime(int i) {
        this.location = i;
    }

    public final int toIndexFor(SlotTable slotTable) {
        return slotTable.anchorIndex(this);
    }

    public String toString() {
        return super.toString() + "{ location = " + this.location + " }";
    }

    public final int toIndexFor(SlotWriter slotWriter) {
        return slotWriter.anchorIndex(this);
    }
}

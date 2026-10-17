package androidx.compose.foundation.text.input.internal;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SelectionWedgeAffinity {
    public static final int $stable = 0;
    private final WedgeAffinity endAffinity;
    private final WedgeAffinity startAffinity;

    public SelectionWedgeAffinity(WedgeAffinity wedgeAffinity, WedgeAffinity wedgeAffinity2) {
        this.startAffinity = wedgeAffinity;
        this.endAffinity = wedgeAffinity2;
    }

    public static /* synthetic */ SelectionWedgeAffinity copy$default(SelectionWedgeAffinity selectionWedgeAffinity, WedgeAffinity wedgeAffinity, WedgeAffinity wedgeAffinity2, int i, Object obj) {
        if ((i & 1) != 0) {
            wedgeAffinity = selectionWedgeAffinity.startAffinity;
        }
        if ((i & 2) != 0) {
            wedgeAffinity2 = selectionWedgeAffinity.endAffinity;
        }
        return selectionWedgeAffinity.copy(wedgeAffinity, wedgeAffinity2);
    }

    public final WedgeAffinity component1() {
        return this.startAffinity;
    }

    public final WedgeAffinity component2() {
        return this.endAffinity;
    }

    public final SelectionWedgeAffinity copy(WedgeAffinity wedgeAffinity, WedgeAffinity wedgeAffinity2) {
        return new SelectionWedgeAffinity(wedgeAffinity, wedgeAffinity2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectionWedgeAffinity)) {
            return false;
        }
        SelectionWedgeAffinity selectionWedgeAffinity = (SelectionWedgeAffinity) obj;
        return this.startAffinity == selectionWedgeAffinity.startAffinity && this.endAffinity == selectionWedgeAffinity.endAffinity;
    }

    public final WedgeAffinity getEndAffinity() {
        return this.endAffinity;
    }

    public final WedgeAffinity getStartAffinity() {
        return this.startAffinity;
    }

    public int hashCode() {
        return this.endAffinity.hashCode() + (this.startAffinity.hashCode() * 31);
    }

    public String toString() {
        return "SelectionWedgeAffinity(startAffinity=" + this.startAffinity + ", endAffinity=" + this.endAffinity + ')';
    }

    public SelectionWedgeAffinity(WedgeAffinity wedgeAffinity) {
        this(wedgeAffinity, wedgeAffinity);
    }
}

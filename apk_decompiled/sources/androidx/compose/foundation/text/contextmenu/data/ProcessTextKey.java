package androidx.compose.foundation.text.contextmenu.data;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ProcessTextKey {
    public static final int $stable = 0;
    private final int id;

    public ProcessTextKey(int i) {
        this.id = i;
    }

    public boolean equals(Object obj) {
        return (obj instanceof ProcessTextKey) && this.id == ((ProcessTextKey) obj).id;
    }

    public final int getId() {
        return this.id;
    }

    public int hashCode() {
        return this.id;
    }
}

package androidx.compose.ui.input.pointer;

import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidPointerIcon implements PointerIcon {
    public static final int $stable = 0;
    private final android.view.PointerIcon pointerIcon;

    public AndroidPointerIcon(android.view.PointerIcon pointerIcon) {
        this.pointerIcon = pointerIcon;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AndroidPointerIcon.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return q10.b(this.pointerIcon, ((AndroidPointerIcon) obj).pointerIcon);
    }

    public final android.view.PointerIcon getPointerIcon() {
        return this.pointerIcon;
    }

    public int hashCode() {
        return this.pointerIcon.hashCode();
    }

    public String toString() {
        return "AndroidPointerIcon(pointerIcon=" + this.pointerIcon + ')';
    }
}

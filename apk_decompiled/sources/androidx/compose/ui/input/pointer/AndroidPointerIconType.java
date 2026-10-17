package androidx.compose.ui.input.pointer;

import defpackage.fc;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidPointerIconType implements PointerIcon {
    public static final int $stable = 0;
    private final int type;

    public AndroidPointerIconType(int i) {
        this.type = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AndroidPointerIconType.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.type == ((AndroidPointerIconType) obj).type;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type;
    }

    public String toString() {
        return fc.e(new StringBuilder("AndroidPointerIcon(type="), this.type, ')');
    }
}

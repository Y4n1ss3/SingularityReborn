package androidx.compose.foundation.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ValueInsets implements WindowInsets {
    public static final int $stable = 0;
    private final String name;
    private final MutableState value$delegate;

    public ValueInsets(InsetsValues insetsValues, String str) {
        this.name = str;
        this.value$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(insetsValues, null, 2, null);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ValueInsets) {
            return q10.b(getValue$foundation_layout(), ((ValueInsets) obj).getValue$foundation_layout());
        }
        return false;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        return getValue$foundation_layout().getBottom();
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        return getValue$foundation_layout().getLeft();
    }

    public final String getName() {
        return this.name;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        return getValue$foundation_layout().getRight();
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        return getValue$foundation_layout().getTop();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InsetsValues getValue$foundation_layout() {
        return (InsetsValues) this.value$delegate.getValue();
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public final void setValue$foundation_layout(InsetsValues insetsValues) {
        this.value$delegate.setValue(insetsValues);
    }

    public String toString() {
        return this.name + "(left=" + getValue$foundation_layout().getLeft() + ", top=" + getValue$foundation_layout().getTop() + ", right=" + getValue$foundation_layout().getRight() + ", bottom=" + getValue$foundation_layout().getBottom() + ')';
    }
}

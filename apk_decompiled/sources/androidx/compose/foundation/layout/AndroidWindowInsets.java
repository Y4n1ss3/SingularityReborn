package androidx.compose.foundation.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.fc;
import defpackage.p31;
import defpackage.v00;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AndroidWindowInsets implements WindowInsets {
    public static final int $stable = 0;
    private final MutableState insets$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(v00.e, null, 2, null);
    private final MutableState isVisible$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
    private final String name;
    private final int type;

    public AndroidWindowInsets(int i, String str) {
        this.type = i;
        this.name = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AndroidWindowInsets) && this.type == ((AndroidWindowInsets) obj).type;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        return getInsets$foundation_layout().d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final v00 getInsets$foundation_layout() {
        return (v00) this.insets$delegate.getValue();
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        return getInsets$foundation_layout().a;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        return getInsets$foundation_layout().c;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        return getInsets$foundation_layout().b;
    }

    public final int getType$foundation_layout() {
        return this.type;
    }

    public int hashCode() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isVisible() {
        return ((Boolean) this.isVisible$delegate.getValue()).booleanValue();
    }

    public final void setInsets$foundation_layout(v00 v00Var) {
        this.insets$delegate.setValue(v00Var);
    }

    public final void setVisible(boolean z) {
        this.isVisible$delegate.setValue(Boolean.valueOf(z));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        sb.append('(');
        sb.append(getInsets$foundation_layout().a);
        sb.append(", ");
        sb.append(getInsets$foundation_layout().b);
        sb.append(", ");
        sb.append(getInsets$foundation_layout().c);
        sb.append(", ");
        return fc.e(sb, getInsets$foundation_layout().d, ')');
    }

    public final void update$foundation_layout(p31 p31Var, int i) {
        if (i == 0 || (i & this.type) != 0) {
            setInsets$foundation_layout(p31Var.a.g(this.type));
            setVisible(p31Var.a.q(this.type));
        }
    }
}

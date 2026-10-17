package androidx.compose.ui.semantics;

import defpackage.iy;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class CustomAccessibilityAction {
    public static final int $stable = 0;
    private final iy action;
    private final String label;

    public CustomAccessibilityAction(String str, iy iyVar) {
        this.label = str;
        this.action = iyVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomAccessibilityAction)) {
            return false;
        }
        CustomAccessibilityAction customAccessibilityAction = (CustomAccessibilityAction) obj;
        return q10.b(this.label, customAccessibilityAction.label) && this.action == customAccessibilityAction.action;
    }

    public final iy getAction() {
        return this.action;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return this.action.hashCode() + (this.label.hashCode() * 31);
    }

    public String toString() {
        return "CustomAccessibilityAction(label=" + this.label + ", action=" + this.action + ')';
    }
}

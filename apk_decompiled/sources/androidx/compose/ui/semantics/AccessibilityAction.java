package androidx.compose.ui.semantics;

import defpackage.q10;
import defpackage.ty;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AccessibilityAction<T extends ty> {
    public static final int $stable = 0;
    private final T action;
    private final String label;

    public AccessibilityAction(String str, T t) {
        this.label = str;
        this.action = t;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessibilityAction)) {
            return false;
        }
        AccessibilityAction accessibilityAction = (AccessibilityAction) obj;
        return q10.b(this.label, accessibilityAction.label) && q10.b(this.action, accessibilityAction.action);
    }

    public final T getAction() {
        return this.action;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        String str = this.label;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        T t = this.action;
        return hashCode + (t != null ? t.hashCode() : 0);
    }

    public String toString() {
        return "AccessibilityAction(label=" + this.label + ", action=" + this.action + ')';
    }
}

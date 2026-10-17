package androidx.compose.ui.semantics;

import defpackage.f30;
import defpackage.my;
import defpackage.ty;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class SemanticsPropertiesKt$ActionPropertyKey$1 extends f30 implements my {
    public static final SemanticsPropertiesKt$ActionPropertyKey$1 INSTANCE = new SemanticsPropertiesKt$ActionPropertyKey$1();

    public SemanticsPropertiesKt$ActionPropertyKey$1() {
        super(2);
    }

    @Override // defpackage.my
    public final AccessibilityAction<T> invoke(AccessibilityAction<T> accessibilityAction, AccessibilityAction<T> accessibilityAction2) {
        String label;
        ty action;
        if (accessibilityAction == 0 || (label = accessibilityAction.getLabel()) == null) {
            label = accessibilityAction2.getLabel();
        }
        if (accessibilityAction == 0 || (action = accessibilityAction.getAction()) == null) {
            action = accessibilityAction2.getAction();
        }
        return new AccessibilityAction<>(label, action);
    }
}

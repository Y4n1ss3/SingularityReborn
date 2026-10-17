package androidx.compose.ui.platform;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import defpackage.f30;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1 extends f30 implements ky {
    public static final AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1 INSTANCE = new AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1();

    public AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1() {
        super(1);
    }

    @Override // defpackage.ky
    public final Boolean invoke(LayoutNode layoutNode) {
        SemanticsConfiguration semanticsConfiguration = layoutNode.getSemanticsConfiguration();
        boolean z = false;
        if (semanticsConfiguration != null && semanticsConfiguration.isMergingSemanticsOfDescendants()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}

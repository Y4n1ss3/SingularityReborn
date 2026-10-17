package androidx.compose.ui.platform;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import defpackage.f30;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1 extends f30 implements ky {
    public static final AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1 INSTANCE = new AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1();

    public AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1() {
        super(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r1.contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getEditableText()) != false) goto L10;
     */
    @Override // defpackage.ky
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean invoke(LayoutNode layoutNode) {
        boolean z;
        SemanticsConfiguration semanticsConfiguration = layoutNode.getSemanticsConfiguration();
        if (semanticsConfiguration != null) {
            z = true;
            if (semanticsConfiguration.isMergingSemanticsOfDescendants()) {
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}

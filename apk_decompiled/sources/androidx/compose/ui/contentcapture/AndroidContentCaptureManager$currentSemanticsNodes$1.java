package androidx.compose.ui.contentcapture;

import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsNode_androidKt;
import defpackage.f30;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidContentCaptureManager$currentSemanticsNodes$1 extends f30 implements ky {
    public static final AndroidContentCaptureManager$currentSemanticsNodes$1 INSTANCE = new AndroidContentCaptureManager$currentSemanticsNodes$1();

    public AndroidContentCaptureManager$currentSemanticsNodes$1() {
        super(1);
    }

    @Override // defpackage.ky
    public final Boolean invoke(SemanticsNode semanticsNode) {
        return Boolean.valueOf(SemanticsNode_androidKt.isAccessibilityIgnoredLink(semanticsNode));
    }
}

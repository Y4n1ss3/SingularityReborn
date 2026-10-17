package androidx.compose.ui.platform;

import android.content.res.Resources;
import androidx.compose.ui.semantics.SemanticsNode;
import defpackage.f30;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat_androidKt$setTraversalValues$semanticsOrderList$2 extends f30 implements ky {
    final /* synthetic */ Resources $resources;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeViewAccessibilityDelegateCompat_androidKt$setTraversalValues$semanticsOrderList$2(Resources resources) {
        super(1);
        this.$resources = resources;
    }

    @Override // defpackage.ky
    public final Boolean invoke(SemanticsNode semanticsNode) {
        boolean isScreenReaderFocusable;
        isScreenReaderFocusable = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isScreenReaderFocusable(semanticsNode, this.$resources);
        return Boolean.valueOf(isScreenReaderFocusable);
    }
}

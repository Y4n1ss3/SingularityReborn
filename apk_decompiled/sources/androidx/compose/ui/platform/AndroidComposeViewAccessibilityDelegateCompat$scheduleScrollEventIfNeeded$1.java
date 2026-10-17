package androidx.compose.ui.platform;

import android.graphics.Rect;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds;
import defpackage.f30;
import defpackage.g10;
import defpackage.iy;
import defpackage.na0;
import defpackage.w01;
import defpackage.z0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1 extends f30 implements iy {
    final /* synthetic */ ScrollObservationScope $scrollObservationScope;
    final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1(ScrollObservationScope scrollObservationScope, AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        super(0);
        this.$scrollObservationScope = scrollObservationScope;
        this.this$0 = androidComposeViewAccessibilityDelegateCompat;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m6703invoke() {
        int semanticsNodeIdToAccessibilityVirtualNodeId;
        g10 currentSemanticsNodes;
        g10 currentSemanticsNodes2;
        g10 currentSemanticsNodes3;
        SemanticsNode semanticsNode;
        LayoutNode layoutNode$ui;
        na0 na0Var;
        na0 na0Var2;
        z0 z0Var;
        Rect boundsInScreen;
        z0 z0Var2;
        Rect boundsInScreen2;
        ScrollAxisRange horizontalScrollAxisRange = this.$scrollObservationScope.getHorizontalScrollAxisRange();
        ScrollAxisRange verticalScrollAxisRange = this.$scrollObservationScope.getVerticalScrollAxisRange();
        Float oldXValue = this.$scrollObservationScope.getOldXValue();
        Float oldYValue = this.$scrollObservationScope.getOldYValue();
        float floatValue = (horizontalScrollAxisRange == null || oldXValue == null) ? 0.0f : ((Number) horizontalScrollAxisRange.getValue().invoke()).floatValue() - oldXValue.floatValue();
        float floatValue2 = (verticalScrollAxisRange == null || oldYValue == null) ? 0.0f : ((Number) verticalScrollAxisRange.getValue().invoke()).floatValue() - oldYValue.floatValue();
        if (floatValue != 0.0f || floatValue2 != 0.0f) {
            semanticsNodeIdToAccessibilityVirtualNodeId = this.this$0.semanticsNodeIdToAccessibilityVirtualNodeId(this.$scrollObservationScope.getSemanticsNodeId());
            currentSemanticsNodes = this.this$0.getCurrentSemanticsNodes();
            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) currentSemanticsNodes.b(this.this$0.accessibilityFocusedVirtualViewId);
            if (semanticsNodeWithAdjustedBounds != null) {
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.this$0;
                try {
                    z0Var2 = androidComposeViewAccessibilityDelegateCompat.currentlyAccessibilityFocusedANI;
                    if (z0Var2 != null) {
                        boundsInScreen2 = androidComposeViewAccessibilityDelegateCompat.boundsInScreen(semanticsNodeWithAdjustedBounds);
                        z0Var2.a.setBoundsInScreen(boundsInScreen2);
                    }
                } catch (IllegalStateException unused) {
                }
            }
            currentSemanticsNodes2 = this.this$0.getCurrentSemanticsNodes();
            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds2 = (SemanticsNodeWithAdjustedBounds) currentSemanticsNodes2.b(this.this$0.focusedVirtualViewId);
            if (semanticsNodeWithAdjustedBounds2 != null) {
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat2 = this.this$0;
                try {
                    z0Var = androidComposeViewAccessibilityDelegateCompat2.currentlyFocusedANI;
                    if (z0Var != null) {
                        boundsInScreen = androidComposeViewAccessibilityDelegateCompat2.boundsInScreen(semanticsNodeWithAdjustedBounds2);
                        z0Var.a.setBoundsInScreen(boundsInScreen);
                    }
                } catch (IllegalStateException unused2) {
                }
            }
            this.this$0.getView().invalidate();
            currentSemanticsNodes3 = this.this$0.getCurrentSemanticsNodes();
            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds3 = (SemanticsNodeWithAdjustedBounds) currentSemanticsNodes3.b(semanticsNodeIdToAccessibilityVirtualNodeId);
            if (semanticsNodeWithAdjustedBounds3 != null && (semanticsNode = semanticsNodeWithAdjustedBounds3.getSemanticsNode()) != null && (layoutNode$ui = semanticsNode.getLayoutNode$ui()) != null) {
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat3 = this.this$0;
                if (horizontalScrollAxisRange != null) {
                    na0Var2 = androidComposeViewAccessibilityDelegateCompat3.pendingHorizontalScrollEvents;
                    na0Var2.i(semanticsNodeIdToAccessibilityVirtualNodeId, horizontalScrollAxisRange);
                }
                if (verticalScrollAxisRange != null) {
                    na0Var = androidComposeViewAccessibilityDelegateCompat3.pendingVerticalScrollEvents;
                    na0Var.i(semanticsNodeIdToAccessibilityVirtualNodeId, verticalScrollAxisRange);
                }
                androidComposeViewAccessibilityDelegateCompat3.notifySubtreeAccessibilityStateChangedIfNeeded(layoutNode$ui);
            }
        }
        if (horizontalScrollAxisRange != null) {
            this.$scrollObservationScope.setOldXValue((Float) horizontalScrollAxisRange.getValue().invoke());
        }
        if (verticalScrollAxisRange != null) {
            this.$scrollObservationScope.setOldYValue((Float) verticalScrollAxisRange.getValue().invoke());
        }
    }

    @Override // defpackage.iy
    public /* bridge */ /* synthetic */ Object invoke() {
        m6703invoke();
        return w01.a;
    }
}

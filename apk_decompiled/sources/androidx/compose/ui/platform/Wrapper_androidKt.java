package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.AbstractApplier;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.R;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.UiApplier;
import defpackage.my;
import java.util.Collections;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class Wrapper_androidKt {
    private static final ViewGroup.LayoutParams DefaultLayoutParams = new ViewGroup.LayoutParams(-2, -2);

    public static final AbstractApplier<LayoutNode> createApplier(LayoutNode layoutNode) {
        return new UiApplier(layoutNode);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Composition setContent(AbstractComposeView abstractComposeView, ComposeViewContext composeViewContext, my myVar) {
        AndroidComposeView androidComposeView;
        WrappedComposition wrappedComposition;
        GlobalSnapshotManager.INSTANCE.ensureStarted();
        if (abstractComposeView.getChildCount() > 0) {
            View childAt = abstractComposeView.getChildAt(0);
            androidComposeView = childAt instanceof AndroidComposeView ? (AndroidComposeView) childAt : null;
            if (androidComposeView != null) {
                androidComposeView.setComposeViewContext(composeViewContext);
                if (androidComposeView == null) {
                    androidComposeView = new AndroidComposeView(abstractComposeView.getContext(), composeViewContext);
                    abstractComposeView.addView(androidComposeView.getView(), DefaultLayoutParams);
                }
                androidComposeView.setComposeViewContext(composeViewContext);
                if (abstractComposeView.getComposeViewContext$ui() != null) {
                    composeViewContext.incrementViewCount$ui();
                    androidComposeView.setComposeViewContextIncrementedDuringInit$ui(true);
                }
                if (InspectableValueKt.isDebugInspectorInfoEnabled() && androidComposeView.getTag(R.id.inspection_slot_table_set) == null) {
                    androidComposeView.setTag(R.id.inspection_slot_table_set, Collections.newSetFromMap(new WeakHashMap()));
                }
                Object tag = androidComposeView.getTag(R.id.wrapped_composition_tag);
                wrappedComposition = tag instanceof WrappedComposition ? (WrappedComposition) tag : null;
                if (wrappedComposition == null) {
                    wrappedComposition = new WrappedComposition(androidComposeView, CompositionKt.Composition(new UiApplier(androidComposeView.getRoot()), composeViewContext.getCompositionContext$ui()));
                    androidComposeView.setTag(R.id.wrapped_composition_tag, wrappedComposition);
                }
                wrappedComposition.setContent(myVar);
                androidComposeView.setFrameEndScheduler$ui(new Wrapper_androidKt$setContent$1(composeViewContext.getCompositionContext$ui()));
                return wrappedComposition;
            }
        } else {
            abstractComposeView.removeAllViews();
        }
        androidComposeView = null;
        if (androidComposeView == null) {
        }
        androidComposeView.setComposeViewContext(composeViewContext);
        if (abstractComposeView.getComposeViewContext$ui() != null) {
        }
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            androidComposeView.setTag(R.id.inspection_slot_table_set, Collections.newSetFromMap(new WeakHashMap()));
        }
        Object tag2 = androidComposeView.getTag(R.id.wrapped_composition_tag);
        if (tag2 instanceof WrappedComposition) {
        }
        if (wrappedComposition == null) {
        }
        wrappedComposition.setContent(myVar);
        androidComposeView.setFrameEndScheduler$ui(new Wrapper_androidKt$setContent$1(composeViewContext.getCompositionContext$ui()));
        return wrappedComposition;
    }
}

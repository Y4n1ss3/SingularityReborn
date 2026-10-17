package androidx.compose.material.ripple;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.DelegatableNode;
import defpackage.iy;
import defpackage.o;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Ripple_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final RippleContainer createAndAttachRippleContainerIfNeeded(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof RippleContainer) {
                return (RippleContainer) childAt;
            }
        }
        RippleContainer rippleContainer = new RippleContainer(viewGroup.getContext());
        viewGroup.addView(rippleContainer);
        return rippleContainer;
    }

    /* renamed from: createPlatformRippleNode-TDGSqEk, reason: not valid java name */
    public static final DelegatableNode m1588createPlatformRippleNodeTDGSqEk(InteractionSource interactionSource, boolean z, float f, ColorProducer colorProducer, iy iyVar) {
        return new AndroidRippleNode(interactionSource, z, f, colorProducer, iyVar, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.ViewParent] */
    public static final ViewGroup findNearestViewGroup(View view) {
        while (!(view instanceof ViewGroup)) {
            ?? parent = view.getParent();
            if (!(parent instanceof View)) {
                o.h("Couldn't find a valid parent for ", view, ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?");
                return null;
            }
            view = parent;
        }
        return (ViewGroup) view;
    }
}

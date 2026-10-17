package androidx.compose.material3.internal;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DraggableAnchorsKt {
    public static final String ConfirmValueChangeDeprecated = "confirmValueChange is deprecated without replacement. Rather than relying on a callback to veto state changes, the anchor set should not include disallowed anchors. See androidx.compose.foundation.samples.AnchoredDraggableDynamicAnchorsSample for an example of using dynamic anchors over confirmValueChange.";

    public static final <T> Modifier draggableAnchorsV2(Modifier modifier, androidx.compose.foundation.gestures.AnchoredDraggableState<T> anchoredDraggableState, Orientation orientation, my myVar) {
        return modifier.then(new DraggableAnchorsElementV2(anchoredDraggableState, myVar, orientation));
    }
}

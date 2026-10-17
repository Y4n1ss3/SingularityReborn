package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.ui.node.DelegatableNode;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface IndicationNodeFactory extends Indication {
    DelegatableNode create(InteractionSource interactionSource);

    boolean equals(Object obj);

    int hashCode();
}

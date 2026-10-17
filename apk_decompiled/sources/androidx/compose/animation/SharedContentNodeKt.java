package androidx.compose.animation;

import androidx.compose.ui.modifier.ModifierLocalKt;
import androidx.compose.ui.modifier.ProvidableModifierLocal;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SharedContentNodeKt {
    private static final ProvidableModifierLocal<SharedElementEntry> ModifierLocalSharedElementInternalState = ModifierLocalKt.modifierLocalOf(SharedContentNodeKt$ModifierLocalSharedElementInternalState$1.INSTANCE);

    public static final ProvidableModifierLocal<SharedElementEntry> getModifierLocalSharedElementInternalState() {
        return ModifierLocalSharedElementInternalState;
    }
}

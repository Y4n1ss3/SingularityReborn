package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.unit.IntSize;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AnimationModifierKt {
    private static final long InvalidSize = IntSize.m7777constructorimpl(-9223372034707292160L);

    public static final Modifier animateContentSize(Modifier modifier, FiniteAnimationSpec<IntSize> finiteAnimationSpec, my myVar) {
        return ClipKt.clipToBounds(modifier).then(new SizeAnimationModifierElement(finiteAnimationSpec, Alignment.Companion.getTopStart(), myVar));
    }

    public static /* synthetic */ Modifier animateContentSize$default(Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, my myVar, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m7774boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i & 2) != 0) {
            alignment = Alignment.Companion.getTopStart();
        }
        if ((i & 4) != 0) {
            myVar = null;
        }
        return animateContentSize(modifier, finiteAnimationSpec, alignment, myVar);
    }

    public static final long getInvalidSize() {
        return InvalidSize;
    }

    /* renamed from: isValid-ozmzZPI, reason: not valid java name */
    public static final boolean m37isValidozmzZPI(long j) {
        return !IntSize.m7780equalsimpl0(j, InvalidSize);
    }

    public static final Modifier animateContentSize(Modifier modifier, FiniteAnimationSpec<IntSize> finiteAnimationSpec, Alignment alignment, my myVar) {
        return ClipKt.clipToBounds(modifier).then(new SizeAnimationModifierElement(finiteAnimationSpec, alignment, myVar));
    }

    public static /* synthetic */ Modifier animateContentSize$default(Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, my myVar, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m7774boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i & 2) != 0) {
            myVar = null;
        }
        return animateContentSize(modifier, finiteAnimationSpec, myVar);
    }
}

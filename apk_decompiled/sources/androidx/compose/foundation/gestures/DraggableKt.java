package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import defpackage.ky;
import defpackage.ny;
import defpackage.oq;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DraggableKt {
    private static final ny NoOpOnDragStarted = new DraggableKt$NoOpOnDragStarted$1(null);
    private static final ny NoOpOnDragStopped = new DraggableKt$NoOpOnDragStopped$1(null);

    public static final DraggableState DraggableState(ky kyVar) {
        return new DefaultDraggableState(kyVar);
    }

    public static final Modifier draggable(Modifier modifier, DraggableState draggableState, Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, ny nyVar, ny nyVar2, boolean z3) {
        return modifier.then(new DraggableElement(draggableState, orientation, z, mutableInteractionSource, z2, nyVar, nyVar2, z3));
    }

    public static /* synthetic */ Modifier draggable$default(Modifier modifier, DraggableState draggableState, Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, ny nyVar, ny nyVar2, boolean z3, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            mutableInteractionSource = null;
        }
        return draggable(modifier, draggableState, orientation, z4, mutableInteractionSource, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? NoOpOnDragStarted : nyVar, (i & 64) != 0 ? NoOpOnDragStopped : nyVar2, (i & Fields.SpotShadowColor) != 0 ? false : z3);
    }

    public static final DraggableState rememberDraggableState(ky kyVar, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-183245213, i, -1, "androidx.compose.foundation.gestures.rememberDraggableState (Draggable.kt:144)");
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(kyVar, composer, i & 14);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = DraggableState(new oq(rememberUpdatedState, 2));
            composer.updateRememberedValue(rememberedValue);
        }
        DraggableState draggableState = (DraggableState) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return draggableState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 rememberDraggableState$lambda$0$0(State state, float f) {
        ((ky) state.getValue()).invoke(Float.valueOf(f));
        return w01.a;
    }

    /* renamed from: toFloat-3MmeM6k, reason: not valid java name */
    public static final float m447toFloat3MmeM6k(long j, Orientation orientation) {
        return Float.intBitsToFloat((int) (orientation == Orientation.Vertical ? j & 4294967295L : j >> 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toFloat-sF-c-tU, reason: not valid java name */
    public static final float m448toFloatsFctU(long j, Orientation orientation) {
        return orientation == Orientation.Vertical ? Velocity.m7850getYimpl(j) : Velocity.m7849getXimpl(j);
    }

    /* renamed from: toValidVelocity-TH1AsA0, reason: not valid java name */
    public static final long m449toValidVelocityTH1AsA0(long j) {
        return VelocityKt.Velocity(Float.isNaN(Velocity.m7849getXimpl(j)) ? 0.0f : Velocity.m7849getXimpl(j), Float.isNaN(Velocity.m7850getYimpl(j)) ? 0.0f : Velocity.m7850getYimpl(j));
    }
}

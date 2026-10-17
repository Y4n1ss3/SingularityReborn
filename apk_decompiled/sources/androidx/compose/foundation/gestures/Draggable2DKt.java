package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import defpackage.ky;
import defpackage.oq;
import defpackage.qo;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Draggable2DKt {
    private static final ky NoOpOnDragStart = new qo(14);
    private static final ky NoOpOnDragStop = new qo(15);

    public static final Draggable2DState Draggable2DState(ky kyVar) {
        return new DefaultDraggable2DState(kyVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 NoOpOnDragStart$lambda$0(Offset offset) {
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 NoOpOnDragStop$lambda$0(Velocity velocity) {
        return w01.a;
    }

    public static final Modifier draggable2D(Modifier modifier, Draggable2DState draggable2DState, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, ky kyVar, ky kyVar2, boolean z3) {
        return modifier.then(new Draggable2DElement(draggable2DState, z, mutableInteractionSource, z2, kyVar, kyVar2, z3));
    }

    public static final Draggable2DState rememberDraggable2DState(ky kyVar, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1150277615, i, -1, "androidx.compose.foundation.gestures.rememberDraggable2DState (Draggable2D.kt:106)");
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(kyVar, composer, i & 14);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = Draggable2DState(new oq(rememberUpdatedState, 1));
            composer.updateRememberedValue(rememberedValue);
        }
        Draggable2DState draggable2DState = (Draggable2DState) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return draggable2DState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 rememberDraggable2DState$lambda$0$0(State state, Offset offset) {
        ((ky) state.getValue()).invoke(offset);
        return w01.a;
    }
}

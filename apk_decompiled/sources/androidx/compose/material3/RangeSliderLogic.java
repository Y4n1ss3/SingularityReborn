package androidx.compose.material3;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import defpackage.p01;
import defpackage.un;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class RangeSliderLogic {
    private final MutableInteractionSource endInteractionSource;
    private final MutableInteractionSource startInteractionSource;
    private final RangeSliderState state;

    public RangeSliderLogic(RangeSliderState rangeSliderState, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2) {
        this.state = rangeSliderState;
        this.startInteractionSource = mutableInteractionSource;
        this.endInteractionSource = mutableInteractionSource2;
    }

    public final MutableInteractionSource activeInteraction(boolean z) {
        return z ? this.startInteractionSource : this.endInteractionSource;
    }

    public final void captureThumb(boolean z, float f, Interaction interaction, un unVar) {
        RangeSliderState rangeSliderState = this.state;
        rangeSliderState.onDrag$material3(z, f - (z ? rangeSliderState.getRawOffsetStart$material3() : rangeSliderState.getRawOffsetEnd$material3()));
        p01.t(unVar, null, null, new RangeSliderLogic$captureThumb$1(this, z, interaction, null), 3);
    }

    public final int compareOffsets(float f) {
        return Float.compare(Math.abs(this.state.getRawOffsetStart$material3() - f), Math.abs(this.state.getRawOffsetEnd$material3() - f));
    }

    public final MutableInteractionSource getEndInteractionSource() {
        return this.endInteractionSource;
    }

    public final MutableInteractionSource getStartInteractionSource() {
        return this.startInteractionSource;
    }

    public final RangeSliderState getState() {
        return this.state;
    }
}

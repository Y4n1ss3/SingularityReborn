package defpackage;

import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.ExposedDropdownMenuKt;
import androidx.compose.material3.WindowBoundsCalculator;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.LayoutCoordinates;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class mp implements ky {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ mp(FiniteAnimationSpec finiteAnimationSpec, FiniteAnimationSpec finiteAnimationSpec2, FiniteAnimationSpec finiteAnimationSpec3, int i, FiniteAnimationSpec finiteAnimationSpec4) {
        this.f = finiteAnimationSpec;
        this.g = finiteAnimationSpec2;
        this.h = finiteAnimationSpec3;
        this.e = i;
        this.i = finiteAnimationSpec4;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        ContentTransform SwitchableDateEntryContent_KaiTk9E$lambda$21$lambda$20;
        w01 ExposedDropdownMenuBox$lambda$15$lambda$14;
        switch (this.d) {
            case 0:
                SwitchableDateEntryContent_KaiTk9E$lambda$21$lambda$20 = DatePickerKt.SwitchableDateEntryContent_KaiTk9E$lambda$21$lambda$20((FiniteAnimationSpec) this.f, (FiniteAnimationSpec) this.g, (FiniteAnimationSpec) this.h, this.e, (FiniteAnimationSpec) this.i, (AnimatedContentTransitionScope) obj);
                return SwitchableDateEntryContent_KaiTk9E$lambda$21$lambda$20;
            default:
                ExposedDropdownMenuBox$lambda$15$lambda$14 = ExposedDropdownMenuKt.ExposedDropdownMenuBox$lambda$15$lambda$14((WindowBoundsCalculator) this.f, this.e, (MutableState) this.g, (MutableIntState) this.h, (MutableIntState) this.i, (LayoutCoordinates) obj);
                return ExposedDropdownMenuBox$lambda$15$lambda$14;
        }
    }

    public /* synthetic */ mp(WindowBoundsCalculator windowBoundsCalculator, int i, MutableState mutableState, MutableIntState mutableIntState, MutableIntState mutableIntState2) {
        this.f = windowBoundsCalculator;
        this.e = i;
        this.g = mutableState;
        this.h = mutableIntState;
        this.i = mutableIntState2;
    }
}

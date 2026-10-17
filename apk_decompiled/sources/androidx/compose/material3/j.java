package androidx.compose.material3;

import androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.layout.Placeable;
import defpackage.fi0;
import defpackage.hi0;
import defpackage.ky;
import defpackage.w01;
import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Serializable f;

    public /* synthetic */ j(int i, Serializable serializable, Object obj) {
        this.d = i;
        this.e = obj;
        this.f = serializable;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 measure_3p2s80s$lambda$5;
        w01 invokeSuspend$lambda$1;
        int i = this.d;
        Serializable serializable = this.f;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                measure_3p2s80s$lambda$5 = CenteredContentMeasurePolicy.measure_3p2s80s$lambda$5((hi0) obj2, (ArrayList) serializable, (Placeable.PlacementScope) obj);
                return measure_3p2s80s$lambda$5;
            default:
                invokeSuspend$lambda$1 = SliderKt$rangeSliderPressDragModifier$1.AnonymousClass1.C00201.invokeSuspend$lambda$1((RangeSliderState) obj2, (fi0) serializable, (PointerInputChange) obj);
                return invokeSuspend$lambda$1;
        }
    }
}

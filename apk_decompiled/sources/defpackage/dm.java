package defpackage;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ContextualFlowColumnOverflow;
import androidx.compose.foundation.layout.ContextualFlowLayoutKt;
import androidx.compose.foundation.layout.ContextualFlowRowOverflow;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class dm implements my {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ int e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ Arrangement.Vertical g;
    public final /* synthetic */ Arrangement.Horizontal h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ oy k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ FlowLayoutOverflow o;

    public /* synthetic */ dm(int i, Modifier modifier, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, Alignment.Vertical vertical2, int i2, int i3, ContextualFlowRowOverflow contextualFlowRowOverflow, oy oyVar, int i4, int i5) {
        this.e = i;
        this.f = modifier;
        this.h = horizontal;
        this.g = vertical;
        this.n = vertical2;
        this.i = i2;
        this.j = i3;
        this.o = contextualFlowRowOverflow;
        this.k = oyVar;
        this.l = i4;
        this.m = i5;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 ContextualFlowRow$lambda$3;
        w01 ContextualFlowColumn$lambda$3;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                ContextualFlowRow$lambda$3 = ContextualFlowLayoutKt.ContextualFlowRow$lambda$3(this.e, this.f, this.h, this.g, (Alignment.Vertical) this.n, this.i, this.j, (ContextualFlowRowOverflow) this.o, this.k, this.l, this.m, (Composer) obj, intValue);
                return ContextualFlowRow$lambda$3;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                ContextualFlowColumn$lambda$3 = ContextualFlowLayoutKt.ContextualFlowColumn$lambda$3(this.e, this.f, this.g, this.h, (Alignment.Horizontal) this.n, this.i, this.j, (ContextualFlowColumnOverflow) this.o, this.k, this.l, this.m, (Composer) obj, intValue2);
                return ContextualFlowColumn$lambda$3;
        }
    }

    public /* synthetic */ dm(int i, Modifier modifier, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, Alignment.Horizontal horizontal2, int i2, int i3, ContextualFlowColumnOverflow contextualFlowColumnOverflow, oy oyVar, int i4, int i5) {
        this.e = i;
        this.f = modifier;
        this.g = vertical;
        this.h = horizontal;
        this.n = horizontal2;
        this.i = i2;
        this.j = i3;
        this.o = contextualFlowColumnOverflow;
        this.k = oyVar;
        this.l = i4;
        this.m = i5;
    }
}

package androidx.compose.ui.viewinterop;

import android.view.View;
import android.view.WindowInsets;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.unit.IntSize;
import defpackage.f30;
import defpackage.ky;
import defpackage.p31;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidViewHolder$layoutNode$1$coreModifier$3 extends f30 implements ky {
    final /* synthetic */ LayoutNode $layoutNode;
    final /* synthetic */ AndroidViewHolder $this_run;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$layoutNode$1$coreModifier$3(AndroidViewHolder androidViewHolder, LayoutNode layoutNode) {
        super(1);
        this.$this_run = androidViewHolder;
        this.$layoutNode = layoutNode;
    }

    public final void invoke(LayoutCoordinates layoutCoordinates) {
        Owner owner;
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        long j;
        p31 p31Var;
        int[] iArr4;
        int[] iArr5;
        long j2;
        AndroidViewHolder_androidKt.layoutAccordingTo(this.$this_run, this.$layoutNode);
        owner = this.$this_run.owner;
        owner.onInteropViewLayoutChange(this.$this_run);
        iArr = this.$this_run.position;
        int i = iArr[0];
        iArr2 = this.$this_run.position;
        int i2 = iArr2[1];
        View view = this.$this_run.getView();
        iArr3 = this.$this_run.position;
        view.getLocationOnScreen(iArr3);
        j = this.$this_run.size;
        this.$this_run.size = layoutCoordinates.mo6242getSizeYbymL2g();
        p31Var = this.$this_run.insets;
        if (p31Var != null) {
            iArr4 = this.$this_run.position;
            if (i == iArr4[0]) {
                iArr5 = this.$this_run.position;
                if (i2 == iArr5[1]) {
                    j2 = this.$this_run.size;
                    if (IntSize.m7780equalsimpl0(j, j2)) {
                        return;
                    }
                }
            }
            WindowInsets b = this.$this_run.insetToLayoutPosition(p31Var).b();
            if (b != null) {
                this.$this_run.getView().dispatchApplyWindowInsets(b);
            }
        }
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LayoutCoordinates) obj);
        return w01.a;
    }
}

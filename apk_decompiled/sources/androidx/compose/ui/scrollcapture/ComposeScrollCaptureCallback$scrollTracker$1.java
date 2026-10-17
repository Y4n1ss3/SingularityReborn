package androidx.compose.ui.scrollcapture;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import defpackage.bq;
import defpackage.hm;
import defpackage.k4;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$scrollTracker$1", f = "ComposeScrollCaptureCallback.android.kt", l = {89}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
public final class ComposeScrollCaptureCallback$scrollTracker$1 extends us0 implements my {
    /* synthetic */ float F$0;
    boolean Z$0;
    int label;
    final /* synthetic */ ComposeScrollCaptureCallback this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeScrollCaptureCallback$scrollTracker$1(ComposeScrollCaptureCallback composeScrollCaptureCallback, hm hmVar) {
        super(2, hmVar);
        this.this$0 = composeScrollCaptureCallback;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        ComposeScrollCaptureCallback$scrollTracker$1 composeScrollCaptureCallback$scrollTracker$1 = new ComposeScrollCaptureCallback$scrollTracker$1(this.this$0, hmVar);
        composeScrollCaptureCallback$scrollTracker$1.F$0 = ((Number) obj).floatValue();
        return composeScrollCaptureCallback$scrollTracker$1;
    }

    public final Object invoke(float f, hm hmVar) {
        return ((ComposeScrollCaptureCallback$scrollTracker$1) create(Float.valueOf(f), hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        SemanticsNode semanticsNode;
        SemanticsNode semanticsNode2;
        boolean z;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            float f = this.F$0;
            semanticsNode = this.this$0.node;
            my scrollCaptureScrollByAction = ScrollCapture_androidKt.getScrollCaptureScrollByAction(semanticsNode);
            if (scrollCaptureScrollByAction == null) {
                throw k4.a("Required value was null.");
            }
            semanticsNode2 = this.this$0.node;
            boolean reverseScrolling = ((ScrollAxisRange) semanticsNode2.getUnmergedConfig$ui().get(SemanticsProperties.INSTANCE.getVerticalScrollAxisRange())).getReverseScrolling();
            if (reverseScrolling) {
                f = -f;
            }
            Offset m4505boximpl = Offset.m4505boximpl(Offset.m4508constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L)));
            this.Z$0 = reverseScrolling;
            this.label = 1;
            obj = scrollCaptureScrollByAction.invoke(m4505boximpl, this);
            vn vnVar = vn.d;
            if (obj == vnVar) {
                return vnVar;
            }
            z = reverseScrolling;
        } else {
            if (i != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = this.Z$0;
            p10.Q(obj);
        }
        long m4526unboximpl = ((Offset) obj).m4526unboximpl();
        return new Float(z ? -Float.intBitsToFloat((int) (m4526unboximpl & 4294967295L)) : Float.intBitsToFloat((int) (m4526unboximpl & 4294967295L)));
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).floatValue(), (hm) obj2);
    }
}

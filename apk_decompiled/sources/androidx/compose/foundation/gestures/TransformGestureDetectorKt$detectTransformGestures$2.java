package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.spatial.RectListKt;
import defpackage.bq;
import defpackage.hm;
import defpackage.ij0;
import defpackage.my;
import defpackage.oy;
import defpackage.p10;
import defpackage.vn;
import defpackage.w01;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2", f = "TransformGestureDetector.kt", l = {RectListKt.BitOffsetForUpdated, RectListKt.BitOffsetForGesturable}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class TransformGestureDetectorKt$detectTransformGestures$2 extends ij0 implements my {
    final /* synthetic */ oy $onGesture;
    final /* synthetic */ boolean $panZoomLock;
    float F$0;
    float F$1;
    float F$2;
    int I$0;
    int I$1;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformGestureDetectorKt$detectTransformGestures$2(boolean z, oy oyVar, hm hmVar) {
        super(hmVar);
        this.$panZoomLock = z;
        this.$onGesture = oyVar;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        TransformGestureDetectorKt$detectTransformGestures$2 transformGestureDetectorKt$detectTransformGestures$2 = new TransformGestureDetectorKt$detectTransformGestures$2(this.$panZoomLock, this.$onGesture, hmVar);
        transformGestureDetectorKt$detectTransformGestures$2.L$0 = obj;
        return transformGestureDetectorKt$detectTransformGestures$2;
    }

    @Override // defpackage.my
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, hm hmVar) {
        return ((TransformGestureDetectorKt$detectTransformGestures$2) create(awaitPointerEventScope, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0123, code lost:
    
        if (androidx.compose.ui.geometry.Offset.m4513equalsimpl0(r11, androidx.compose.ui.geometry.Offset.Companion.m4532getZeroF1C5BW0()) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x008e, code lost:
    
        if (r7 == r12) goto L16;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x008e -> B:6:0x0091). Please report as a decompilation issue!!! */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        long j;
        float f;
        AwaitPointerEventScope awaitPointerEventScope;
        float f2;
        float f3;
        int i2;
        Object awaitPointerEvent$default;
        int i3;
        float f4;
        vn vnVar;
        int i4;
        int i5 = this.label;
        PointerEventPass pointerEventPass = null;
        int i6 = 2;
        float f5 = 1.0f;
        float f6 = 0.0f;
        int i7 = 1;
        vn vnVar2 = vn.d;
        if (i5 == 0) {
            p10.Q(obj);
            AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
            long m4532getZeroF1C5BW0 = Offset.Companion.m4532getZeroF1C5BW0();
            float touchSlop = awaitPointerEventScope2.getViewConfiguration().getTouchSlop();
            this.L$0 = awaitPointerEventScope2;
            this.F$0 = 0.0f;
            this.F$1 = 1.0f;
            this.J$0 = m4532getZeroF1C5BW0;
            this.I$0 = 0;
            this.F$2 = touchSlop;
            this.I$1 = 0;
            this.label = 1;
            if (TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope2, false, null, this, 2, null) != vnVar2) {
                i = 0;
                j = m4532getZeroF1C5BW0;
                f = touchSlop;
                awaitPointerEventScope = awaitPointerEventScope2;
                f2 = 1.0f;
                f3 = 0.0f;
                i2 = 0;
            }
            return vnVar2;
        }
        if (i5 != 1) {
            if (i5 != 2) {
                defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = this.I$1;
            f = this.F$2;
            i = this.I$0;
            j = this.J$0;
            f2 = this.F$1;
            f3 = this.F$0;
            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
            p10.Q(obj);
            awaitPointerEvent$default = obj;
            PointerEvent pointerEvent = (PointerEvent) awaitPointerEvent$default;
            List<PointerInputChange> changes = pointerEvent.getChanges();
            float f7 = f5;
            int size = changes.size();
            float f8 = f6;
            int i8 = 0;
            while (true) {
                if (i8 >= size) {
                    i3 = 0;
                    break;
                }
                if (changes.get(i8).isConsumed()) {
                    i3 = i7;
                    break;
                }
                i8++;
            }
            if (i3 == 0) {
                float calculateZoom = TransformGestureDetectorKt.calculateZoom(pointerEvent);
                float calculateRotation = TransformGestureDetectorKt.calculateRotation(pointerEvent);
                vnVar = vnVar2;
                long calculatePan = TransformGestureDetectorKt.calculatePan(pointerEvent);
                if (i == 0) {
                    f2 *= calculateZoom;
                    f3 += calculateRotation;
                    j = Offset.m4521plusMKHz9U(j, calculatePan);
                    float calculateCentroidSize = TransformGestureDetectorKt.calculateCentroidSize(pointerEvent, false);
                    float abs = Math.abs(f7 - f2) * calculateCentroidSize;
                    float abs2 = Math.abs(((3.1415927f * f3) * calculateCentroidSize) / 180.0f);
                    float m4514getDistanceimpl = Offset.m4514getDistanceimpl(j);
                    if (abs > f || abs2 > f || m4514getDistanceimpl > f) {
                        i2 = (!this.$panZoomLock || abs2 >= f) ? 0 : 1;
                        i = 1;
                    }
                }
                if (i != 0) {
                    long calculateCentroid = TransformGestureDetectorKt.calculateCentroid(pointerEvent, false);
                    if (i2 != 0) {
                        calculateRotation = f8;
                    }
                    if (calculateRotation == f8 && calculateZoom == f7) {
                        i4 = i2;
                        f4 = f;
                    } else {
                        i4 = i2;
                        f4 = f;
                    }
                    this.$onGesture.invoke(Offset.m4505boximpl(calculateCentroid), Offset.m4505boximpl(calculatePan), new Float(calculateZoom), new Float(calculateRotation));
                    List<PointerInputChange> changes2 = pointerEvent.getChanges();
                    int size2 = changes2.size();
                    for (int i9 = 0; i9 < size2; i9++) {
                        PointerInputChange pointerInputChange = changes2.get(i9);
                        if (PointerEventKt.positionChanged(pointerInputChange)) {
                            pointerInputChange.consume();
                        }
                    }
                } else {
                    i4 = i2;
                    f4 = f;
                }
                i2 = i4;
            } else {
                f4 = f;
                vnVar = vnVar2;
            }
            if (i3 == 0) {
                List<PointerInputChange> changes3 = pointerEvent.getChanges();
                int size3 = changes3.size();
                for (int i10 = 0; i10 < size3; i10++) {
                    if (changes3.get(i10).getPressed()) {
                        f = f4;
                        f5 = f7;
                        f6 = f8;
                        vnVar2 = vnVar;
                        pointerEventPass = null;
                        i6 = 2;
                        i7 = 1;
                    }
                }
            }
            return w01.a;
        }
        i2 = this.I$1;
        f = this.F$2;
        i = this.I$0;
        j = this.J$0;
        f2 = this.F$1;
        f3 = this.F$0;
        awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
        p10.Q(obj);
        this.L$0 = awaitPointerEventScope;
        this.F$0 = f3;
        this.F$1 = f2;
        this.J$0 = j;
        this.I$0 = i;
        this.F$2 = f;
        this.I$1 = i2;
        this.label = i6;
        awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, pointerEventPass, this, i7, pointerEventPass);
    }
}

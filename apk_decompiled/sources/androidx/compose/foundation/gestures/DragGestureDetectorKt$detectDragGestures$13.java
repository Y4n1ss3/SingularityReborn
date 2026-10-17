package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import defpackage.bq;
import defpackage.hm;
import defpackage.ii0;
import defpackage.ij0;
import defpackage.iy;
import defpackage.ky;
import defpackage.my;
import defpackage.ny;
import defpackage.p10;
import defpackage.vn;
import defpackage.w01;
import defpackage.yi;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$13", f = "DragGestureDetector.kt", l = {248, 254, 1116, 1158, 279, 1197, 1240, 1252}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class DragGestureDetectorKt$detectDragGestures$13 extends ij0 implements my {
    final /* synthetic */ my $onDrag;
    final /* synthetic */ iy $onDragCancel;
    final /* synthetic */ ky $onDragEnd;
    final /* synthetic */ ny $onDragStart;
    final /* synthetic */ Orientation $orientationLock;
    final /* synthetic */ ii0 $overSlop;
    final /* synthetic */ iy $shouldAwaitTouchSlop;
    float F$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$detectDragGestures$13(iy iyVar, ii0 ii0Var, Orientation orientation, ny nyVar, my myVar, iy iyVar2, ky kyVar, hm hmVar) {
        super(hmVar);
        this.$shouldAwaitTouchSlop = iyVar;
        this.$overSlop = ii0Var;
        this.$orientationLock = orientation;
        this.$onDragStart = nyVar;
        this.$onDrag = myVar;
        this.$onDragCancel = iyVar2;
        this.$onDragEnd = kyVar;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        DragGestureDetectorKt$detectDragGestures$13 dragGestureDetectorKt$detectDragGestures$13 = new DragGestureDetectorKt$detectDragGestures$13(this.$shouldAwaitTouchSlop, this.$overSlop, this.$orientationLock, this.$onDragStart, this.$onDrag, this.$onDragCancel, this.$onDragEnd, hmVar);
        dragGestureDetectorKt$detectDragGestures$13.L$0 = obj;
        return dragGestureDetectorKt$detectDragGestures$13;
    }

    @Override // defpackage.my
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, hm hmVar) {
        return ((DragGestureDetectorKt$detectDragGestures$13) create(awaitPointerEventScope, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:206:0x0199, code lost:
    
        if (r0 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x015e, code lost:
    
        if (r1 == r15) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x04f9, code lost:
    
        if (r6 == r15) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x056e, code lost:
    
        if (r5 == false) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0300, code lost:
    
        if (r4 == r15) goto L170;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:47:0x055e, B:36:0x0535], limit reached: 216 */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03ee A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0215 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03be  */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v5, types: [dq] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:117:0x0480 -> B:51:0x0487). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:121:0x049e -> B:54:0x02ca). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:141:0x01b7 -> B:135:0x02b6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:154:0x021b -> B:134:0x021c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:173:0x027a -> B:135:0x02b6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:177:0x02a7 -> B:131:0x02ac). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x04f9 -> B:7:0x04fc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0332 -> B:60:0x02e8). Please report as a decompilation issue!!! */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        long j2;
        AwaitPointerEventScope awaitPointerEventScope;
        Object awaitFirstDown;
        PointerInputChange pointerInputChange;
        Object awaitFirstDown$default;
        AwaitPointerEventScope awaitPointerEventScope2;
        boolean z;
        PointerInputChange pointerInputChange2;
        float f;
        ii0 ii0Var;
        AwaitPointerEventScope awaitPointerEventScope3;
        PointerInputChange pointerInputChange3;
        ii0 ii0Var2;
        PointerInputChange pointerInputChange4;
        PointerInputChange pointerInputChange5;
        TouchSlopDetector touchSlopDetector;
        PointerInputChange pointerInputChange6;
        PointerInputChange pointerInputChange7;
        Object obj2;
        ii0 ii0Var3;
        float f2;
        ii0 ii0Var4;
        AwaitPointerEventScope awaitPointerEventScope4;
        TouchSlopDetector touchSlopDetector2;
        Object obj3;
        List<PointerInputChange> changes;
        int size;
        int i;
        PointerInputChange pointerInputChange8;
        PointerInputChange pointerInputChange9;
        PointerInputChange pointerInputChange10;
        PointerInputChange pointerInputChange11;
        TouchSlopDetector touchSlopDetector3;
        ii0 ii0Var5;
        ii0 ii0Var6;
        float f3;
        ii0 ii0Var7;
        PointerInputChange pointerInputChange12;
        List<PointerInputChange> list;
        int i2;
        long m6098getIdJ3iCeTQ;
        my myVar;
        PointerInputChange pointerInputChange13;
        AwaitPointerEventScope awaitPointerEventScope5;
        my myVar2;
        AwaitPointerEventScope awaitPointerEventScope6;
        ii0 ii0Var8;
        PointerInputChange pointerInputChange14;
        Object awaitPointerEvent$default;
        PointerEvent pointerEvent;
        PointerInputChange pointerInputChange15;
        boolean z2;
        PointerInputChange pointerInputChange16;
        int i3 = this.label;
        int i4 = 1;
        PointerEventPass pointerEventPass = 0;
        vn vnVar = vn.d;
        switch (i3) {
            case 0:
                j = InlineClassHelperKt.UnspecifiedPackedFloats;
                j2 = InlineClassHelperKt.DualUnsignedFloatMask;
                p10.Q(obj);
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                PointerEventPass pointerEventPass2 = PointerEventPass.Initial;
                this.L$0 = awaitPointerEventScope;
                this.label = 1;
                awaitFirstDown = TapGestureDetectorKt.awaitFirstDown(awaitPointerEventScope, false, pointerEventPass2, this);
                break;
            case 1:
                j = InlineClassHelperKt.UnspecifiedPackedFloats;
                j2 = InlineClassHelperKt.DualUnsignedFloatMask;
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                p10.Q(obj);
                awaitFirstDown = obj;
                pointerInputChange = (PointerInputChange) awaitFirstDown;
                boolean booleanValue = ((Boolean) this.$shouldAwaitTouchSlop.invoke()).booleanValue();
                if (!booleanValue) {
                    pointerInputChange.consume();
                }
                this.L$0 = awaitPointerEventScope;
                this.L$1 = pointerInputChange;
                this.Z$0 = booleanValue;
                this.label = 2;
                awaitFirstDown$default = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope, false, null, this, 2, null);
                if (awaitFirstDown$default != vnVar) {
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    z = booleanValue;
                    pointerInputChange2 = (PointerInputChange) awaitFirstDown$default;
                    this.$overSlop.d = Offset.Companion.m4532getZeroF1C5BW0();
                    break;
                }
                return vnVar;
            case 2:
                j = InlineClassHelperKt.UnspecifiedPackedFloats;
                j2 = InlineClassHelperKt.DualUnsignedFloatMask;
                z = this.Z$0;
                PointerInputChange pointerInputChange17 = (PointerInputChange) this.L$1;
                awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                p10.Q(obj);
                pointerInputChange = pointerInputChange17;
                awaitFirstDown$default = obj;
                pointerInputChange2 = (PointerInputChange) awaitFirstDown$default;
                this.$overSlop.d = Offset.Companion.m4532getZeroF1C5BW0();
                break;
            case 3:
                j = InlineClassHelperKt.UnspecifiedPackedFloats;
                j2 = InlineClassHelperKt.DualUnsignedFloatMask;
                f = this.F$0;
                TouchSlopDetector touchSlopDetector4 = (TouchSlopDetector) this.L$5;
                ii0 ii0Var9 = (ii0) this.L$4;
                ii0 ii0Var10 = (ii0) this.L$3;
                AwaitPointerEventScope awaitPointerEventScope7 = (AwaitPointerEventScope) this.L$2;
                PointerInputChange pointerInputChange18 = (PointerInputChange) this.L$1;
                AwaitPointerEventScope awaitPointerEventScope8 = (AwaitPointerEventScope) this.L$0;
                p10.Q(obj);
                TouchSlopDetector touchSlopDetector5 = touchSlopDetector4;
                ii0Var = ii0Var9;
                awaitPointerEventScope2 = awaitPointerEventScope7;
                pointerInputChange2 = pointerInputChange18;
                awaitPointerEventScope3 = awaitPointerEventScope8;
                Object obj4 = obj;
                ii0 ii0Var11 = ii0Var10;
                float f4 = f;
                PointerEvent pointerEvent2 = (PointerEvent) obj4;
                List<PointerInputChange> changes2 = pointerEvent2.getChanges();
                int size2 = changes2.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size2) {
                        pointerInputChange3 = changes2.get(i5);
                        if (!PointerId.m6080equalsimpl0(pointerInputChange3.m6098getIdJ3iCeTQ(), ii0Var.d)) {
                            i5++;
                        }
                    } else {
                        pointerInputChange3 = null;
                    }
                }
                PointerInputChange pointerInputChange19 = pointerInputChange3;
                if (pointerInputChange19 != null && !pointerInputChange19.isConsumed()) {
                    if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange19)) {
                        long m564addPositionsakrDWew = touchSlopDetector5.m564addPositionsakrDWew(pointerInputChange19.m6101getPositionF1C5BW0(), pointerInputChange19.m6102getPreviousPositionF1C5BW0(), f4);
                        TouchSlopDetector touchSlopDetector6 = touchSlopDetector5;
                        if ((m564addPositionsakrDWew & j2) == j) {
                            PointerEventPass pointerEventPass3 = PointerEventPass.Final;
                            this.L$0 = awaitPointerEventScope3;
                            this.L$1 = pointerInputChange2;
                            this.L$2 = awaitPointerEventScope2;
                            this.L$3 = ii0Var11;
                            this.L$4 = ii0Var;
                            this.L$5 = touchSlopDetector6;
                            this.L$6 = pointerInputChange19;
                            this.F$0 = f4;
                            this.label = 4;
                            if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass3, this) != vnVar) {
                                ii0Var2 = ii0Var11;
                                pointerInputChange4 = pointerInputChange2;
                                pointerInputChange5 = pointerInputChange19;
                                f = f4;
                                touchSlopDetector = touchSlopDetector6;
                                if (!pointerInputChange5.isConsumed()) {
                                    awaitPointerEventScope2 = awaitPointerEventScope3;
                                    pointerInputChange2 = pointerInputChange4;
                                    pointerInputChange = null;
                                    if (pointerInputChange != null) {
                                    }
                                    if (pointerInputChange == null) {
                                    }
                                    if (pointerInputChange != null) {
                                    }
                                    return w01.a;
                                }
                                pointerInputChange2 = pointerInputChange4;
                                i4 = 1;
                                pointerEventPass = 0;
                                ii0Var11 = ii0Var2;
                            }
                            return vnVar;
                        }
                        pointerInputChange19.consume();
                        ii0Var11.d = m564addPositionsakrDWew;
                        if (pointerInputChange19.isConsumed()) {
                            pointerInputChange = pointerInputChange19;
                            awaitPointerEventScope2 = awaitPointerEventScope3;
                            if (pointerInputChange != null && !pointerInputChange.isConsumed()) {
                                i4 = 1;
                                pointerEventPass = 0;
                                long m6098getIdJ3iCeTQ2 = pointerInputChange2.m6098getIdJ3iCeTQ();
                                int m6104getTypeT8wyACA = pointerInputChange2.m6104getTypeT8wyACA();
                                Orientation orientation = this.$orientationLock;
                                ii0Var11 = this.$overSlop;
                                long m4532getZeroF1C5BW0 = Offset.Companion.m4532getZeroF1C5BW0();
                                if (!DragGestureDetectorKt.m436isPointerUpDmW0f2w(awaitPointerEventScope2.getCurrentEvent(), m6098getIdJ3iCeTQ2)) {
                                    pointerInputChange = pointerEventPass;
                                    if (pointerInputChange != null) {
                                        i4 = 1;
                                        pointerEventPass = 0;
                                        long m6098getIdJ3iCeTQ22 = pointerInputChange2.m6098getIdJ3iCeTQ();
                                        int m6104getTypeT8wyACA2 = pointerInputChange2.m6104getTypeT8wyACA();
                                        Orientation orientation2 = this.$orientationLock;
                                        ii0Var11 = this.$overSlop;
                                        long m4532getZeroF1C5BW02 = Offset.Companion.m4532getZeroF1C5BW0();
                                        if (!DragGestureDetectorKt.m436isPointerUpDmW0f2w(awaitPointerEventScope2.getCurrentEvent(), m6098getIdJ3iCeTQ22)) {
                                            f = DragGestureDetectorKt.m437pointerSlopE8SPZFQ(awaitPointerEventScope2.getViewConfiguration(), m6104getTypeT8wyACA2);
                                            ii0Var = new ii0();
                                            ii0Var.d = m6098getIdJ3iCeTQ22;
                                            touchSlopDetector = new TouchSlopDetector(orientation2, m4532getZeroF1C5BW02, pointerEventPass);
                                            awaitPointerEventScope3 = awaitPointerEventScope2;
                                        }
                                    }
                                }
                            }
                            if (pointerInputChange == null) {
                                List<PointerInputChange> changes3 = awaitPointerEventScope2.getCurrentEvent().getChanges();
                                int size3 = changes3.size();
                                for (int i6 = 0; i6 < size3; i6++) {
                                    if (changes3.get(i6).getPressed()) {
                                        pointerInputChange7 = pointerInputChange;
                                        PointerEventPass pointerEventPass4 = PointerEventPass.Final;
                                        this.L$0 = awaitPointerEventScope2;
                                        this.L$1 = pointerInputChange2;
                                        this.L$2 = pointerInputChange7;
                                        this.L$3 = null;
                                        this.L$4 = null;
                                        this.L$5 = null;
                                        this.L$6 = null;
                                        this.label = 5;
                                        obj2 = awaitPointerEventScope2.awaitPointerEvent(pointerEventPass4, this);
                                        break;
                                    }
                                }
                            }
                            if (pointerInputChange != null) {
                                this.$onDragStart.invoke(pointerInputChange2, pointerInputChange, Offset.m4505boximpl(this.$overSlop.d));
                                this.$onDrag.invoke(pointerInputChange, Offset.m4505boximpl(this.$overSlop.d));
                                m6098getIdJ3iCeTQ = pointerInputChange.m6098getIdJ3iCeTQ();
                                myVar = this.$onDrag;
                                if (DragGestureDetectorKt.m436isPointerUpDmW0f2w(awaitPointerEventScope2.getCurrentEvent(), m6098getIdJ3iCeTQ)) {
                                    pointerInputChange13 = null;
                                    if (pointerInputChange13 != null) {
                                        this.$onDragCancel.invoke();
                                    } else {
                                        this.$onDragEnd.invoke(pointerInputChange13);
                                    }
                                }
                                ii0 ii0Var12 = new ii0();
                                ii0Var12.d = m6098getIdJ3iCeTQ;
                                awaitPointerEventScope6 = awaitPointerEventScope2;
                                ii0Var8 = ii0Var12;
                                myVar2 = myVar;
                                awaitPointerEventScope5 = awaitPointerEventScope6;
                                this.L$0 = awaitPointerEventScope5;
                                this.L$1 = myVar2;
                                this.L$2 = awaitPointerEventScope6;
                                this.L$3 = ii0Var8;
                                pointerInputChange14 = null;
                                this.L$4 = null;
                                this.L$5 = null;
                                this.L$6 = null;
                                this.label = 8;
                                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope6, null, this, 1, null);
                                break;
                            }
                            return w01.a;
                        }
                        TouchSlopDetector.m563resetk4lQ0M$default(touchSlopDetector6, 0L, 1, null);
                        f = f4;
                        touchSlopDetector = touchSlopDetector6;
                        i4 = 1;
                        pointerEventPass = 0;
                    } else {
                        List<PointerInputChange> changes4 = pointerEvent2.getChanges();
                        int size4 = changes4.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 < size4) {
                                pointerInputChange6 = changes4.get(i7);
                                if (!pointerInputChange6.getPressed()) {
                                    i7++;
                                }
                            } else {
                                pointerInputChange6 = null;
                            }
                        }
                        PointerInputChange pointerInputChange20 = pointerInputChange6;
                        if (pointerInputChange20 != null) {
                            ii0Var.d = pointerInputChange20.m6098getIdJ3iCeTQ();
                            f = f4;
                            touchSlopDetector = touchSlopDetector5;
                            i4 = 1;
                            pointerEventPass = 0;
                        }
                    }
                    this.L$0 = awaitPointerEventScope3;
                    this.L$1 = pointerInputChange2;
                    this.L$2 = awaitPointerEventScope2;
                    this.L$3 = ii0Var11;
                    this.L$4 = ii0Var;
                    this.L$5 = touchSlopDetector;
                    this.L$6 = pointerEventPass;
                    this.F$0 = f;
                    this.label = 3;
                    obj4 = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, this, i4, pointerEventPass);
                    if (obj4 != vnVar) {
                        touchSlopDetector5 = touchSlopDetector;
                        float f42 = f;
                        PointerEvent pointerEvent22 = (PointerEvent) obj4;
                        List<PointerInputChange> changes22 = pointerEvent22.getChanges();
                        int size22 = changes22.size();
                        int i52 = 0;
                        while (true) {
                            if (i52 >= size22) {
                            }
                            i52++;
                        }
                        PointerInputChange pointerInputChange192 = pointerInputChange3;
                        if (pointerInputChange192 != null) {
                            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange192)) {
                            }
                            this.L$0 = awaitPointerEventScope3;
                            this.L$1 = pointerInputChange2;
                            this.L$2 = awaitPointerEventScope2;
                            this.L$3 = ii0Var11;
                            this.L$4 = ii0Var;
                            this.L$5 = touchSlopDetector;
                            this.L$6 = pointerEventPass;
                            this.F$0 = f;
                            this.label = 3;
                            obj4 = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, this, i4, pointerEventPass);
                            if (obj4 != vnVar) {
                            }
                        }
                    }
                    return vnVar;
                }
                awaitPointerEventScope2 = awaitPointerEventScope3;
                pointerInputChange = null;
                if (pointerInputChange != null) {
                }
                if (pointerInputChange == null) {
                }
                if (pointerInputChange != null) {
                }
                return w01.a;
            case 4:
                j = InlineClassHelperKt.UnspecifiedPackedFloats;
                j2 = InlineClassHelperKt.DualUnsignedFloatMask;
                f = this.F$0;
                pointerInputChange5 = (PointerInputChange) this.L$6;
                TouchSlopDetector touchSlopDetector7 = (TouchSlopDetector) this.L$5;
                ii0 ii0Var13 = (ii0) this.L$4;
                ii0 ii0Var14 = (ii0) this.L$3;
                AwaitPointerEventScope awaitPointerEventScope9 = (AwaitPointerEventScope) this.L$2;
                pointerInputChange4 = (PointerInputChange) this.L$1;
                AwaitPointerEventScope awaitPointerEventScope10 = (AwaitPointerEventScope) this.L$0;
                p10.Q(obj);
                ii0Var = ii0Var13;
                ii0Var2 = ii0Var14;
                awaitPointerEventScope3 = awaitPointerEventScope10;
                touchSlopDetector = touchSlopDetector7;
                awaitPointerEventScope2 = awaitPointerEventScope9;
                if (!pointerInputChange5.isConsumed()) {
                }
                break;
            case 5:
                j = InlineClassHelperKt.UnspecifiedPackedFloats;
                j2 = InlineClassHelperKt.DualUnsignedFloatMask;
                pointerInputChange7 = (PointerInputChange) this.L$2;
                pointerInputChange2 = (PointerInputChange) this.L$1;
                awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                p10.Q(obj);
                obj2 = obj;
                PointerEvent pointerEvent3 = (PointerEvent) obj2;
                List<PointerInputChange> changes5 = pointerEvent3.getChanges();
                int size5 = changes5.size();
                int i8 = 0;
                while (true) {
                    if (i8 < size5) {
                        if (changes5.get(i8).isConsumed()) {
                            List<PointerInputChange> changes6 = pointerEvent3.getChanges();
                            int size6 = changes6.size();
                            for (int i9 = 0; i9 < size6; i9++) {
                                if (changes6.get(i9).getPressed()) {
                                    break;
                                }
                            }
                        } else {
                            i8++;
                        }
                    }
                }
                List<PointerInputChange> changes7 = pointerEvent3.getChanges();
                int size7 = changes7.size();
                for (int i10 = 0; i10 < size7; i10++) {
                    if (changes7.get(i10).getPressed()) {
                        PointerInputChange pointerInputChange21 = (PointerInputChange) yi.q0(pointerEvent3.getChanges());
                        long m4520minusMKHz9U = Offset.m4520minusMKHz9U(pointerInputChange21 != null ? pointerInputChange21.m6101getPositionF1C5BW0() : Offset.Companion.m4532getZeroF1C5BW0(), pointerInputChange2.m6101getPositionF1C5BW0());
                        long m6098getIdJ3iCeTQ3 = pointerInputChange2.m6098getIdJ3iCeTQ();
                        int m6104getTypeT8wyACA3 = pointerInputChange2.m6104getTypeT8wyACA();
                        Orientation orientation3 = this.$orientationLock;
                        ii0Var7 = this.$overSlop;
                        if (!DragGestureDetectorKt.m436isPointerUpDmW0f2w(awaitPointerEventScope2.getCurrentEvent(), m6098getIdJ3iCeTQ3)) {
                            f3 = DragGestureDetectorKt.m437pointerSlopE8SPZFQ(awaitPointerEventScope2.getViewConfiguration(), m6104getTypeT8wyACA3);
                            ii0 ii0Var15 = new ii0();
                            ii0Var15.d = m6098getIdJ3iCeTQ3;
                            PointerEventPass pointerEventPass5 = null;
                            touchSlopDetector3 = new TouchSlopDetector(orientation3, m4520minusMKHz9U, null);
                            awaitPointerEventScope4 = awaitPointerEventScope2;
                            this.L$0 = awaitPointerEventScope4;
                            this.L$1 = pointerInputChange2;
                            this.L$2 = awaitPointerEventScope2;
                            this.L$3 = ii0Var7;
                            this.L$4 = ii0Var15;
                            this.L$5 = touchSlopDetector3;
                            this.L$6 = pointerEventPass5;
                            this.F$0 = f3;
                            this.label = 6;
                            obj3 = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass5, this, 1, pointerEventPass5);
                            if (obj3 != vnVar) {
                                f2 = f3;
                                ii0Var4 = ii0Var7;
                                ii0Var3 = ii0Var15;
                                touchSlopDetector2 = touchSlopDetector3;
                                PointerEvent pointerEvent4 = (PointerEvent) obj3;
                                changes = pointerEvent4.getChanges();
                                size = changes.size();
                                i = 0;
                                while (true) {
                                    if (i >= size) {
                                        pointerInputChange8 = changes.get(i);
                                        list = changes;
                                        i2 = size;
                                        if (!PointerId.m6080equalsimpl0(pointerInputChange8.m6098getIdJ3iCeTQ(), ii0Var3.d)) {
                                            i++;
                                            changes = list;
                                            size = i2;
                                        }
                                    } else {
                                        pointerInputChange8 = null;
                                    }
                                }
                                pointerInputChange9 = pointerInputChange8;
                                if (pointerInputChange9 != null && !pointerInputChange9.isConsumed()) {
                                    if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange9)) {
                                        List<PointerInputChange> changes8 = pointerEvent4.getChanges();
                                        int size8 = changes8.size();
                                        int i11 = 0;
                                        while (true) {
                                            if (i11 < size8) {
                                                pointerInputChange12 = changes8.get(i11);
                                                if (!pointerInputChange12.getPressed()) {
                                                    i11++;
                                                }
                                            } else {
                                                pointerInputChange12 = null;
                                            }
                                        }
                                        PointerInputChange pointerInputChange22 = pointerInputChange12;
                                        if (pointerInputChange22 != null) {
                                            ii0Var3.d = pointerInputChange22.m6098getIdJ3iCeTQ();
                                            ii0Var15 = ii0Var3;
                                            touchSlopDetector3 = touchSlopDetector2;
                                            pointerEventPass5 = null;
                                            ii0Var7 = ii0Var4;
                                            f3 = f2;
                                        }
                                    } else if ((touchSlopDetector2.m564addPositionsakrDWew(pointerInputChange9.m6101getPositionF1C5BW0(), pointerInputChange9.m6102getPreviousPositionF1C5BW0(), f2) & j2) != j) {
                                        pointerInputChange9.consume();
                                        ii0Var4.d = PointerEventKt.positionChange(pointerInputChange9);
                                        if (pointerInputChange9.isConsumed()) {
                                            awaitPointerEventScope2 = awaitPointerEventScope4;
                                            pointerInputChange = pointerInputChange9;
                                            if (pointerInputChange == null) {
                                            }
                                            if (pointerInputChange != null) {
                                            }
                                            return w01.a;
                                        }
                                        TouchSlopDetector.m563resetk4lQ0M$default(touchSlopDetector2, 0L, 1, null);
                                        ii0Var15 = ii0Var3;
                                        touchSlopDetector3 = touchSlopDetector2;
                                        pointerEventPass5 = null;
                                        ii0Var7 = ii0Var4;
                                        f3 = f2;
                                    } else {
                                        PointerEventPass pointerEventPass6 = PointerEventPass.Final;
                                        this.L$0 = awaitPointerEventScope4;
                                        this.L$1 = pointerInputChange2;
                                        this.L$2 = awaitPointerEventScope2;
                                        this.L$3 = ii0Var4;
                                        this.L$4 = ii0Var3;
                                        this.L$5 = touchSlopDetector2;
                                        this.L$6 = pointerInputChange9;
                                        this.F$0 = f2;
                                        this.label = 7;
                                        if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass6, this) != vnVar) {
                                            TouchSlopDetector touchSlopDetector8 = touchSlopDetector2;
                                            pointerInputChange10 = pointerInputChange2;
                                            pointerInputChange11 = pointerInputChange9;
                                            touchSlopDetector3 = touchSlopDetector8;
                                            ii0Var5 = ii0Var3;
                                            ii0Var6 = ii0Var4;
                                            f3 = f2;
                                            if (!pointerInputChange11.isConsumed()) {
                                                awaitPointerEventScope2 = awaitPointerEventScope4;
                                                pointerInputChange2 = pointerInputChange10;
                                                pointerInputChange = null;
                                                if (pointerInputChange == null) {
                                                }
                                                if (pointerInputChange != null) {
                                                }
                                                return w01.a;
                                            }
                                            ii0Var15 = ii0Var5;
                                            pointerInputChange2 = pointerInputChange10;
                                            pointerEventPass5 = null;
                                            ii0Var7 = ii0Var6;
                                        }
                                    }
                                    this.L$0 = awaitPointerEventScope4;
                                    this.L$1 = pointerInputChange2;
                                    this.L$2 = awaitPointerEventScope2;
                                    this.L$3 = ii0Var7;
                                    this.L$4 = ii0Var15;
                                    this.L$5 = touchSlopDetector3;
                                    this.L$6 = pointerEventPass5;
                                    this.F$0 = f3;
                                    this.label = 6;
                                    obj3 = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass5, this, 1, pointerEventPass5);
                                    if (obj3 != vnVar) {
                                    }
                                }
                                awaitPointerEventScope2 = awaitPointerEventScope4;
                            }
                            return vnVar;
                        }
                        pointerInputChange = null;
                        if (pointerInputChange == null) {
                        }
                        if (pointerInputChange != null) {
                        }
                        return w01.a;
                    }
                }
                pointerInputChange = pointerInputChange7;
                if (pointerInputChange == null) {
                }
                if (pointerInputChange != null) {
                }
                return w01.a;
            case 6:
                j = InlineClassHelperKt.UnspecifiedPackedFloats;
                j2 = InlineClassHelperKt.DualUnsignedFloatMask;
                float f5 = this.F$0;
                TouchSlopDetector touchSlopDetector9 = (TouchSlopDetector) this.L$5;
                ii0 ii0Var16 = (ii0) this.L$4;
                ii0 ii0Var17 = (ii0) this.L$3;
                AwaitPointerEventScope awaitPointerEventScope11 = (AwaitPointerEventScope) this.L$2;
                PointerInputChange pointerInputChange23 = (PointerInputChange) this.L$1;
                AwaitPointerEventScope awaitPointerEventScope12 = (AwaitPointerEventScope) this.L$0;
                p10.Q(obj);
                ii0Var3 = ii0Var16;
                awaitPointerEventScope2 = awaitPointerEventScope11;
                f2 = f5;
                ii0Var4 = ii0Var17;
                awaitPointerEventScope4 = awaitPointerEventScope12;
                touchSlopDetector2 = touchSlopDetector9;
                pointerInputChange2 = pointerInputChange23;
                obj3 = obj;
                PointerEvent pointerEvent42 = (PointerEvent) obj3;
                changes = pointerEvent42.getChanges();
                size = changes.size();
                i = 0;
                while (true) {
                    if (i >= size) {
                    }
                    i++;
                    changes = list;
                    size = i2;
                }
                pointerInputChange9 = pointerInputChange8;
                if (pointerInputChange9 != null) {
                    if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange9)) {
                    }
                    this.L$0 = awaitPointerEventScope4;
                    this.L$1 = pointerInputChange2;
                    this.L$2 = awaitPointerEventScope2;
                    this.L$3 = ii0Var7;
                    this.L$4 = ii0Var15;
                    this.L$5 = touchSlopDetector3;
                    this.L$6 = pointerEventPass5;
                    this.F$0 = f3;
                    this.label = 6;
                    obj3 = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass5, this, 1, pointerEventPass5);
                    if (obj3 != vnVar) {
                    }
                    return vnVar;
                }
                awaitPointerEventScope2 = awaitPointerEventScope4;
                pointerInputChange = null;
                if (pointerInputChange == null) {
                }
                if (pointerInputChange != null) {
                }
                return w01.a;
            case 7:
                f3 = this.F$0;
                pointerInputChange11 = (PointerInputChange) this.L$6;
                TouchSlopDetector touchSlopDetector10 = (TouchSlopDetector) this.L$5;
                ii0 ii0Var18 = (ii0) this.L$4;
                ii0Var6 = (ii0) this.L$3;
                j = InlineClassHelperKt.UnspecifiedPackedFloats;
                AwaitPointerEventScope awaitPointerEventScope13 = (AwaitPointerEventScope) this.L$2;
                pointerInputChange10 = (PointerInputChange) this.L$1;
                j2 = InlineClassHelperKt.DualUnsignedFloatMask;
                AwaitPointerEventScope awaitPointerEventScope14 = (AwaitPointerEventScope) this.L$0;
                p10.Q(obj);
                touchSlopDetector3 = touchSlopDetector10;
                ii0Var5 = ii0Var18;
                awaitPointerEventScope2 = awaitPointerEventScope13;
                awaitPointerEventScope4 = awaitPointerEventScope14;
                if (!pointerInputChange11.isConsumed()) {
                }
                break;
            case 8:
                ii0Var8 = (ii0) this.L$3;
                awaitPointerEventScope6 = (AwaitPointerEventScope) this.L$2;
                myVar2 = (my) this.L$1;
                awaitPointerEventScope5 = (AwaitPointerEventScope) this.L$0;
                p10.Q(obj);
                awaitPointerEvent$default = obj;
                pointerInputChange14 = null;
                PointerEvent pointerEvent5 = (PointerEvent) awaitPointerEvent$default;
                List<PointerInputChange> changes9 = pointerEvent5.getChanges();
                int size9 = changes9.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size9) {
                        PointerInputChange pointerInputChange24 = changes9.get(i12);
                        pointerEvent = pointerEvent5;
                        if (PointerId.m6080equalsimpl0(pointerInputChange24.m6098getIdJ3iCeTQ(), ii0Var8.d)) {
                            pointerInputChange15 = pointerInputChange24;
                        } else {
                            i12++;
                            pointerEvent5 = pointerEvent;
                        }
                    } else {
                        pointerEvent = pointerEvent5;
                        pointerInputChange15 = pointerInputChange14;
                    }
                }
                PointerInputChange pointerInputChange25 = pointerInputChange15;
                if (pointerInputChange25 != null) {
                    if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange25)) {
                        List<PointerInputChange> changes10 = pointerEvent.getChanges();
                        int size10 = changes10.size();
                        int i13 = 0;
                        while (true) {
                            if (i13 < size10) {
                                pointerInputChange16 = changes10.get(i13);
                                if (!pointerInputChange16.getPressed()) {
                                    i13++;
                                }
                            } else {
                                pointerInputChange16 = pointerInputChange14;
                            }
                        }
                        PointerInputChange pointerInputChange26 = pointerInputChange16;
                        if (pointerInputChange26 != null) {
                            ii0Var8.d = pointerInputChange26.m6098getIdJ3iCeTQ();
                            this.L$0 = awaitPointerEventScope5;
                            this.L$1 = myVar2;
                            this.L$2 = awaitPointerEventScope6;
                            this.L$3 = ii0Var8;
                            pointerInputChange14 = null;
                            this.L$4 = null;
                            this.L$5 = null;
                            this.L$6 = null;
                            this.label = 8;
                            awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope6, null, this, 1, null);
                            break;
                        }
                    } else if (Offset.m4514getDistanceimpl(PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange25)) == 0.0f) {
                        z2 = true;
                        break;
                    } else {
                        z2 = false;
                        break;
                    }
                } else {
                    pointerInputChange25 = pointerInputChange14;
                }
                if (pointerInputChange25 == null || pointerInputChange25.isConsumed()) {
                    pointerInputChange13 = pointerInputChange14;
                } else if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange25)) {
                    pointerInputChange13 = pointerInputChange25;
                } else {
                    myVar2.invoke(pointerInputChange25, Offset.m4505boximpl(PointerEventKt.positionChange(pointerInputChange25)));
                    pointerInputChange25.consume();
                    m6098getIdJ3iCeTQ = pointerInputChange25.m6098getIdJ3iCeTQ();
                    AwaitPointerEventScope awaitPointerEventScope15 = awaitPointerEventScope5;
                    myVar = myVar2;
                    awaitPointerEventScope2 = awaitPointerEventScope15;
                    ii0 ii0Var122 = new ii0();
                    ii0Var122.d = m6098getIdJ3iCeTQ;
                    awaitPointerEventScope6 = awaitPointerEventScope2;
                    ii0Var8 = ii0Var122;
                    myVar2 = myVar;
                    awaitPointerEventScope5 = awaitPointerEventScope6;
                    this.L$0 = awaitPointerEventScope5;
                    this.L$1 = myVar2;
                    this.L$2 = awaitPointerEventScope6;
                    this.L$3 = ii0Var8;
                    pointerInputChange14 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.label = 8;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope6, null, this, 1, null);
                }
                if (pointerInputChange13 != null) {
                }
                return w01.a;
            default:
                defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}

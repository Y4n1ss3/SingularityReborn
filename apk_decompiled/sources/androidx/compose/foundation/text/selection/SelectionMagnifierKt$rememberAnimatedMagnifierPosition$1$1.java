package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import defpackage.bq;
import defpackage.hm;
import defpackage.iw;
import defpackage.jw;
import defpackage.my;
import defpackage.o;
import defpackage.p01;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1", f = "SelectionMagnifier.kt", l = {83}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1 extends us0 implements my {
    final /* synthetic */ Animatable<Offset, AnimationVector2D> $animatable;
    final /* synthetic */ State<Offset> $targetValue$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1(State<Offset> state, Animatable<Offset, AnimationVector2D> animatable, hm hmVar) {
        super(2, hmVar);
        this.$targetValue$delegate = state;
        this.$animatable = animatable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Offset invokeSuspend$lambda$0(State state) {
        long rememberAnimatedMagnifierPosition$lambda$1;
        rememberAnimatedMagnifierPosition$lambda$1 = SelectionMagnifierKt.rememberAnimatedMagnifierPosition$lambda$1(state);
        return Offset.m4505boximpl(rememberAnimatedMagnifierPosition$lambda$1);
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1 selectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1 = new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1(this.$targetValue$delegate, this.$animatable, hmVar);
        selectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1.L$0 = obj;
        return selectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1;
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            final un unVar = (un) this.L$0;
            iw snapshotFlow = SnapshotStateKt.snapshotFlow(new d(this.$targetValue$delegate, 5));
            final Animatable<Offset, AnimationVector2D> animatable = this.$animatable;
            jw jwVar = new jw() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1.2

                /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
                @bq(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$2$1", f = "SelectionMagnifier.kt", l = {96}, m = "invokeSuspend", v = 1)
                /* renamed from: androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends us0 implements my {

                    /* renamed from: $$v$c$androidx-compose-ui-geometry-Offset$-targetValue$0, reason: not valid java name */
                    final /* synthetic */ long f60$$v$c$androidxcomposeuigeometryOffset$targetValue$0;
                    final /* synthetic */ Animatable<Offset, AnimationVector2D> $animatable;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(Animatable<Offset, AnimationVector2D> animatable, long j, hm hmVar) {
                        super(2, hmVar);
                        this.$animatable = animatable;
                        this.f60$$v$c$androidxcomposeuigeometryOffset$targetValue$0 = j;
                    }

                    @Override // defpackage.mc
                    public final hm create(Object obj, hm hmVar) {
                        return new AnonymousClass1(this.$animatable, this.f60$$v$c$androidxcomposeuigeometryOffset$targetValue$0, hmVar);
                    }

                    @Override // defpackage.my
                    public final Object invoke(un unVar, hm hmVar) {
                        return ((AnonymousClass1) create(unVar, hmVar)).invokeSuspend(w01.a);
                    }

                    @Override // defpackage.mc
                    public final Object invokeSuspend(Object obj) {
                        int i = this.label;
                        if (i == 0) {
                            p10.Q(obj);
                            Animatable<Offset, AnimationVector2D> animatable = this.$animatable;
                            Offset m4505boximpl = Offset.m4505boximpl(this.f60$$v$c$androidxcomposeuigeometryOffset$targetValue$0);
                            SpringSpec<Offset> magnifierSpringSpec = SelectionMagnifierKt.getMagnifierSpringSpec();
                            this.label = 1;
                            Object animateTo$default = Animatable.animateTo$default(animatable, m4505boximpl, magnifierSpringSpec, null, null, this, 12, null);
                            vn vnVar = vn.d;
                            if (animateTo$default == vnVar) {
                                return vnVar;
                            }
                        } else {
                            if (i != 1) {
                                o.f("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            p10.Q(obj);
                        }
                        return w01.a;
                    }
                }

                @Override // defpackage.jw
                public /* bridge */ /* synthetic */ Object emit(Object obj2, hm hmVar) {
                    return m1510emit3MmeM6k(((Offset) obj2).m4526unboximpl(), hmVar);
                }

                /* renamed from: emit-3MmeM6k, reason: not valid java name */
                public final Object m1510emit3MmeM6k(long j, hm hmVar) {
                    long m4526unboximpl = animatable.getValue().m4526unboximpl() & InlineClassHelperKt.DualUnsignedFloatMask;
                    w01 w01Var = w01.a;
                    if (m4526unboximpl == InlineClassHelperKt.UnspecifiedPackedFloats || (InlineClassHelperKt.DualUnsignedFloatMask & j) == InlineClassHelperKt.UnspecifiedPackedFloats || Float.intBitsToFloat((int) (animatable.getValue().m4526unboximpl() & 4294967295L)) == Float.intBitsToFloat((int) (j & 4294967295L))) {
                        Object snapTo = animatable.snapTo(Offset.m4505boximpl(j), hmVar);
                        return snapTo == vn.d ? snapTo : w01Var;
                    }
                    p01.t(unVar, null, null, new AnonymousClass1(animatable, j, null), 3);
                    return w01Var;
                }
            };
            this.label = 1;
            Object collect = snapshotFlow.collect(jwVar, this);
            vn vnVar = vn.d;
            if (collect == vnVar) {
                return vnVar;
            }
        } else {
            if (i != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        return w01.a;
    }
}

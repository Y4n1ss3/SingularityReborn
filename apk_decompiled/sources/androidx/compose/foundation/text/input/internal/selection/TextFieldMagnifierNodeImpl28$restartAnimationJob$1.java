package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.SelectionMagnifierKt;
import androidx.compose.runtime.SnapshotStateKt;
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
@bq(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1", f = "AndroidTextFieldMagnifier.android.kt", l = {144}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class TextFieldMagnifierNodeImpl28$restartAnimationJob$1 extends us0 implements my {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TextFieldMagnifierNodeImpl28 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldMagnifierNodeImpl28$restartAnimationJob$1(TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28, hm hmVar) {
        super(2, hmVar);
        this.this$0 = textFieldMagnifierNodeImpl28;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Offset invokeSuspend$lambda$0(TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28) {
        boolean z;
        TransformedTextFieldState transformedTextFieldState;
        TextFieldSelectionState textFieldSelectionState;
        TextLayoutState textLayoutState;
        long m1395getMagnifierSizeYbymL2g;
        TextFieldSelectionState textFieldSelectionState2;
        z = textFieldMagnifierNodeImpl28.visible;
        if (!z) {
            textFieldSelectionState2 = textFieldMagnifierNodeImpl28.textFieldSelectionState;
            if (textFieldSelectionState2.getDirectDragGestureInitiator() != TextFieldSelectionState.InputType.Touch) {
                return Offset.m4505boximpl(Offset.Companion.m4531getUnspecifiedF1C5BW0());
            }
        }
        transformedTextFieldState = textFieldMagnifierNodeImpl28.textFieldState;
        textFieldSelectionState = textFieldMagnifierNodeImpl28.textFieldSelectionState;
        textLayoutState = textFieldMagnifierNodeImpl28.textLayoutState;
        m1395getMagnifierSizeYbymL2g = textFieldMagnifierNodeImpl28.m1395getMagnifierSizeYbymL2g();
        return Offset.m4505boximpl(TextFieldMagnifierKt.m1393calculateSelectionMagnifierCenterAndroidhUlJWOE(transformedTextFieldState, textFieldSelectionState, textLayoutState, m1395getMagnifierSizeYbymL2g));
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        TextFieldMagnifierNodeImpl28$restartAnimationJob$1 textFieldMagnifierNodeImpl28$restartAnimationJob$1 = new TextFieldMagnifierNodeImpl28$restartAnimationJob$1(this.this$0, hmVar);
        textFieldMagnifierNodeImpl28$restartAnimationJob$1.L$0 = obj;
        return textFieldMagnifierNodeImpl28$restartAnimationJob$1;
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((TextFieldMagnifierNodeImpl28$restartAnimationJob$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            final un unVar = (un) this.L$0;
            iw snapshotFlow = SnapshotStateKt.snapshotFlow(new a(this.this$0, 0));
            final TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28 = this.this$0;
            jw jwVar = new jw() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1.2

                /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
                @bq(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1$2$1", f = "AndroidTextFieldMagnifier.android.kt", l = {160}, m = "invokeSuspend", v = 1)
                /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends us0 implements my {

                    /* renamed from: $$v$c$androidx-compose-ui-geometry-Offset$-targetValue$0, reason: not valid java name */
                    final /* synthetic */ long f57$$v$c$androidxcomposeuigeometryOffset$targetValue$0;
                    int label;
                    final /* synthetic */ TextFieldMagnifierNodeImpl28 this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28, long j, hm hmVar) {
                        super(2, hmVar);
                        this.this$0 = textFieldMagnifierNodeImpl28;
                        this.f57$$v$c$androidxcomposeuigeometryOffset$targetValue$0 = j;
                    }

                    @Override // defpackage.mc
                    public final hm create(Object obj, hm hmVar) {
                        return new AnonymousClass1(this.this$0, this.f57$$v$c$androidxcomposeuigeometryOffset$targetValue$0, hmVar);
                    }

                    @Override // defpackage.my
                    public final Object invoke(un unVar, hm hmVar) {
                        return ((AnonymousClass1) create(unVar, hmVar)).invokeSuspend(w01.a);
                    }

                    @Override // defpackage.mc
                    public final Object invokeSuspend(Object obj) {
                        Animatable animatable;
                        int i = this.label;
                        if (i == 0) {
                            p10.Q(obj);
                            animatable = this.this$0.animatable;
                            Offset m4505boximpl = Offset.m4505boximpl(this.f57$$v$c$androidxcomposeuigeometryOffset$targetValue$0);
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
                    return m1397emit3MmeM6k(((Offset) obj2).m4526unboximpl(), hmVar);
                }

                /* renamed from: emit-3MmeM6k, reason: not valid java name */
                public final Object m1397emit3MmeM6k(long j, hm hmVar) {
                    Animatable animatable;
                    Animatable animatable2;
                    Animatable animatable3;
                    animatable = TextFieldMagnifierNodeImpl28.this.animatable;
                    long m4526unboximpl = ((Offset) animatable.getValue()).m4526unboximpl() & InlineClassHelperKt.DualUnsignedFloatMask;
                    w01 w01Var = w01.a;
                    if (m4526unboximpl != InlineClassHelperKt.UnspecifiedPackedFloats && (InlineClassHelperKt.DualUnsignedFloatMask & j) != InlineClassHelperKt.UnspecifiedPackedFloats) {
                        animatable3 = TextFieldMagnifierNodeImpl28.this.animatable;
                        if (Float.intBitsToFloat((int) (((Offset) animatable3.getValue()).m4526unboximpl() & 4294967295L)) != Float.intBitsToFloat((int) (j & 4294967295L))) {
                            p01.t(unVar, null, null, new AnonymousClass1(TextFieldMagnifierNodeImpl28.this, j, null), 3);
                            return w01Var;
                        }
                    }
                    animatable2 = TextFieldMagnifierNodeImpl28.this.animatable;
                    Object snapTo = animatable2.snapTo(Offset.m4505boximpl(j), hmVar);
                    return snapTo == vn.d ? snapTo : w01Var;
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

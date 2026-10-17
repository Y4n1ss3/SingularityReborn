package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.spatial.RectListKt;
import defpackage.bq;
import defpackage.hm;
import defpackage.ky;
import defpackage.my;
import defpackage.ny;
import defpackage.o;
import defpackage.p01;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1 implements PointerInputEventHandler {
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ State<ky> $onTapState;
    final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
    final /* synthetic */ un $scope;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1", f = "TextFieldPressGestureFilter.kt", l = {67}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends us0 implements ny {
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
        final /* synthetic */ un $scope;
        /* synthetic */ long J$0;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        @bq(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$1", f = "TextFieldPressGestureFilter.kt", l = {RectListKt.BitOffsetForUpdated, 64}, m = "invokeSuspend", v = 1)
        /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C00131 extends us0 implements my {
            final /* synthetic */ MutableInteractionSource $interactionSource;
            final /* synthetic */ long $it;
            final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00131(MutableState<PressInteraction.Press> mutableState, long j, MutableInteractionSource mutableInteractionSource, hm hmVar) {
                super(2, hmVar);
                this.$pressedInteraction = mutableState;
                this.$it = j;
                this.$interactionSource = mutableInteractionSource;
            }

            @Override // defpackage.mc
            public final hm create(Object obj, hm hmVar) {
                return new C00131(this.$pressedInteraction, this.$it, this.$interactionSource, hmVar);
            }

            @Override // defpackage.my
            public final Object invoke(un unVar, hm hmVar) {
                return ((C00131) create(unVar, hmVar)).invokeSuspend(w01.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
            
                if (r8.emit(r0, r7) == r4) goto L24;
             */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
            @Override // defpackage.mc
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                MutableState<PressInteraction.Press> mutableState;
                MutableState<PressInteraction.Press> mutableState2;
                PressInteraction.Press press;
                MutableInteractionSource mutableInteractionSource;
                int i = this.label;
                vn vnVar = vn.d;
                if (i == 0) {
                    p10.Q(obj);
                    PressInteraction.Press value = this.$pressedInteraction.getValue();
                    if (value != null) {
                        MutableInteractionSource mutableInteractionSource2 = this.$interactionSource;
                        mutableState = this.$pressedInteraction;
                        PressInteraction.Cancel cancel = new PressInteraction.Cancel(value);
                        if (mutableInteractionSource2 != null) {
                            this.L$0 = mutableState;
                            this.label = 1;
                            if (mutableInteractionSource2.emit(cancel, this) != vnVar) {
                                mutableState2 = mutableState;
                            }
                            return vnVar;
                        }
                        mutableState.setValue(null);
                    }
                    press = new PressInteraction.Press(this.$it, null);
                    mutableInteractionSource = this.$interactionSource;
                    if (mutableInteractionSource != null) {
                        this.L$0 = press;
                        this.label = 2;
                    }
                    this.$pressedInteraction.setValue(press);
                    return w01.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    press = (PressInteraction.Press) this.L$0;
                    p10.Q(obj);
                    this.$pressedInteraction.setValue(press);
                    return w01.a;
                }
                mutableState2 = (MutableState) this.L$0;
                p10.Q(obj);
                mutableState = mutableState2;
                mutableState.setValue(null);
                press = new PressInteraction.Press(this.$it, null);
                mutableInteractionSource = this.$interactionSource;
                if (mutableInteractionSource != null) {
                }
                this.$pressedInteraction.setValue(press);
                return w01.a;
            }
        }

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        @bq(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$2", f = "TextFieldPressGestureFilter.kt", l = {76}, m = "invokeSuspend", v = 1)
        /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends us0 implements my {
            final /* synthetic */ MutableInteractionSource $interactionSource;
            final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
            final /* synthetic */ boolean $success;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(MutableState<PressInteraction.Press> mutableState, boolean z, MutableInteractionSource mutableInteractionSource, hm hmVar) {
                super(2, hmVar);
                this.$pressedInteraction = mutableState;
                this.$success = z;
                this.$interactionSource = mutableInteractionSource;
            }

            @Override // defpackage.mc
            public final hm create(Object obj, hm hmVar) {
                return new AnonymousClass2(this.$pressedInteraction, this.$success, this.$interactionSource, hmVar);
            }

            @Override // defpackage.my
            public final Object invoke(un unVar, hm hmVar) {
                return ((AnonymousClass2) create(unVar, hmVar)).invokeSuspend(w01.a);
            }

            @Override // defpackage.mc
            public final Object invokeSuspend(Object obj) {
                MutableState<PressInteraction.Press> mutableState;
                MutableState<PressInteraction.Press> mutableState2;
                int i = this.label;
                if (i == 0) {
                    p10.Q(obj);
                    PressInteraction.Press value = this.$pressedInteraction.getValue();
                    if (value != null) {
                        boolean z = this.$success;
                        MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                        mutableState = this.$pressedInteraction;
                        Interaction release = z ? new PressInteraction.Release(value) : new PressInteraction.Cancel(value);
                        if (mutableInteractionSource != null) {
                            this.L$0 = mutableState;
                            this.label = 1;
                            Object emit = mutableInteractionSource.emit(release, this);
                            vn vnVar = vn.d;
                            if (emit == vnVar) {
                                return vnVar;
                            }
                            mutableState2 = mutableState;
                        }
                        mutableState.setValue(null);
                    }
                    return w01.a;
                }
                if (i != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mutableState2 = (MutableState) this.L$0;
                p10.Q(obj);
                mutableState = mutableState2;
                mutableState.setValue(null);
                return w01.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(un unVar, MutableState<PressInteraction.Press> mutableState, MutableInteractionSource mutableInteractionSource, hm hmVar) {
            super(3, hmVar);
            this.$scope = unVar;
            this.$pressedInteraction = mutableState;
            this.$interactionSource = mutableInteractionSource;
        }

        @Override // defpackage.ny
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m1192invoked4ec7I((PressGestureScope) obj, ((Offset) obj2).m4526unboximpl(), (hm) obj3);
        }

        /* renamed from: invoke-d-4ec7I, reason: not valid java name */
        public final Object m1192invoked4ec7I(PressGestureScope pressGestureScope, long j, hm hmVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$scope, this.$pressedInteraction, this.$interactionSource, hmVar);
            anonymousClass1.L$0 = pressGestureScope;
            anonymousClass1.J$0 = j;
            return anonymousClass1.invokeSuspend(w01.a);
        }

        @Override // defpackage.mc
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                p10.Q(obj);
                PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
                p01.t(this.$scope, null, null, new C00131(this.$pressedInteraction, this.J$0, this.$interactionSource, null), 3);
                this.label = 1;
                obj = pressGestureScope.tryAwaitRelease(this);
                vn vnVar = vn.d;
                if (obj == vnVar) {
                    return vnVar;
                }
            } else {
                if (i != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
            }
            p01.t(this.$scope, null, null, new AnonymousClass2(this.$pressedInteraction, ((Boolean) obj).booleanValue(), this.$interactionSource, null), 3);
            return w01.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1(un unVar, MutableState<PressInteraction.Press> mutableState, MutableInteractionSource mutableInteractionSource, State<? extends ky> state) {
        this.$scope = unVar;
        this.$pressedInteraction = mutableState;
        this.$interactionSource = mutableInteractionSource;
        this.$onTapState = state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$0(State state, Offset offset) {
        ((ky) state.getValue()).invoke(offset);
        return w01.a;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, hm hmVar) {
        Object detectTapAndPress = TapGestureDetectorKt.detectTapAndPress(pointerInputScope, new AnonymousClass1(this.$scope, this.$pressedInteraction, this.$interactionSource, null), new a(this.$onTapState, 2), hmVar);
        return detectTapAndPress == vn.d ? detectTapAndPress : w01.a;
    }
}

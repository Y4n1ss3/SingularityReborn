package androidx.compose.foundation;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import defpackage.bq;
import defpackage.hm;
import defpackage.iy;
import defpackage.ky;
import defpackage.ny;
import defpackage.o;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CombinedClickableNode$createPointerInputNodeIfNeeded$1 implements PointerInputEventHandler {
    final /* synthetic */ CombinedClickableNode this$0;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.foundation.CombinedClickableNode$createPointerInputNodeIfNeeded$1$3", f = "Clickable.kt", l = {1047}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.foundation.CombinedClickableNode$createPointerInputNodeIfNeeded$1$3, reason: invalid class name */
    public static final class AnonymousClass3 extends us0 implements ny {
        /* synthetic */ long J$0;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ CombinedClickableNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(CombinedClickableNode combinedClickableNode, hm hmVar) {
            super(3, hmVar);
            this.this$0 = combinedClickableNode;
        }

        @Override // defpackage.ny
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m280invoked4ec7I((PressGestureScope) obj, ((Offset) obj2).m4526unboximpl(), (hm) obj3);
        }

        /* renamed from: invoke-d-4ec7I, reason: not valid java name */
        public final Object m280invoked4ec7I(PressGestureScope pressGestureScope, long j, hm hmVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, hmVar);
            anonymousClass3.L$0 = pressGestureScope;
            anonymousClass3.J$0 = j;
            return anonymousClass3.invokeSuspend(w01.a);
        }

        @Override // defpackage.mc
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                p10.Q(obj);
                PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
                long j = this.J$0;
                if (this.this$0.getEnabled()) {
                    CombinedClickableNode combinedClickableNode = this.this$0;
                    this.label = 1;
                    Object m191handlePressInteractiond4ec7I = combinedClickableNode.m191handlePressInteractiond4ec7I(pressGestureScope, j, this);
                    vn vnVar = vn.d;
                    if (m191handlePressInteractiond4ec7I == vnVar) {
                        return vnVar;
                    }
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

    public CombinedClickableNode$createPointerInputNodeIfNeeded$1(CombinedClickableNode combinedClickableNode) {
        this.this$0 = combinedClickableNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$0(CombinedClickableNode combinedClickableNode, Offset offset) {
        iy iyVar;
        iyVar = combinedClickableNode.onDoubleClick;
        if (iyVar != null) {
            iyVar.invoke();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$1(CombinedClickableNode combinedClickableNode, Offset offset) {
        iy iyVar;
        iyVar = combinedClickableNode.onLongClick;
        if (iyVar != null) {
            iyVar.invoke();
        }
        if (combinedClickableNode.getHapticFeedbackEnabled()) {
            ((HapticFeedback) CompositionLocalConsumerModifierNodeKt.currentValueOf(combinedClickableNode, CompositionLocalsKt.getLocalHapticFeedback())).mo5532performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m5545getLongPress5zf0vsI());
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$2(CombinedClickableNode combinedClickableNode, Offset offset) {
        if (combinedClickableNode.getEnabled()) {
            combinedClickableNode.getOnClick().invoke();
        }
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(PointerInputScope pointerInputScope, hm hmVar) {
        ky kyVar;
        ky kyVar2;
        iy iyVar;
        iy iyVar2;
        if (this.this$0.getEnabled()) {
            iyVar2 = this.this$0.onDoubleClick;
            if (iyVar2 != null) {
                final CombinedClickableNode combinedClickableNode = this.this$0;
                final int i = 0;
                kyVar = new ky() { // from class: androidx.compose.foundation.f
                    @Override // defpackage.ky
                    public final Object invoke(Object obj) {
                        w01 invoke$lambda$0;
                        w01 invoke$lambda$1;
                        w01 invoke$lambda$2;
                        int i2 = i;
                        CombinedClickableNode combinedClickableNode2 = combinedClickableNode;
                        Offset offset = (Offset) obj;
                        switch (i2) {
                            case 0:
                                invoke$lambda$0 = CombinedClickableNode$createPointerInputNodeIfNeeded$1.invoke$lambda$0(combinedClickableNode2, offset);
                                return invoke$lambda$0;
                            case 1:
                                invoke$lambda$1 = CombinedClickableNode$createPointerInputNodeIfNeeded$1.invoke$lambda$1(combinedClickableNode2, offset);
                                return invoke$lambda$1;
                            default:
                                invoke$lambda$2 = CombinedClickableNode$createPointerInputNodeIfNeeded$1.invoke$lambda$2(combinedClickableNode2, offset);
                                return invoke$lambda$2;
                        }
                    }
                };
                if (this.this$0.getEnabled()) {
                    iyVar = this.this$0.onLongClick;
                    if (iyVar != null) {
                        final CombinedClickableNode combinedClickableNode2 = this.this$0;
                        final int i2 = 1;
                        kyVar2 = new ky() { // from class: androidx.compose.foundation.f
                            @Override // defpackage.ky
                            public final Object invoke(Object obj) {
                                w01 invoke$lambda$0;
                                w01 invoke$lambda$1;
                                w01 invoke$lambda$2;
                                int i22 = i2;
                                CombinedClickableNode combinedClickableNode22 = combinedClickableNode2;
                                Offset offset = (Offset) obj;
                                switch (i22) {
                                    case 0:
                                        invoke$lambda$0 = CombinedClickableNode$createPointerInputNodeIfNeeded$1.invoke$lambda$0(combinedClickableNode22, offset);
                                        return invoke$lambda$0;
                                    case 1:
                                        invoke$lambda$1 = CombinedClickableNode$createPointerInputNodeIfNeeded$1.invoke$lambda$1(combinedClickableNode22, offset);
                                        return invoke$lambda$1;
                                    default:
                                        invoke$lambda$2 = CombinedClickableNode$createPointerInputNodeIfNeeded$1.invoke$lambda$2(combinedClickableNode22, offset);
                                        return invoke$lambda$2;
                                }
                            }
                        };
                        AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                        final CombinedClickableNode combinedClickableNode3 = this.this$0;
                        final int i3 = 2;
                        Object detectTapGestures = TapGestureDetectorKt.detectTapGestures(pointerInputScope, kyVar, kyVar2, anonymousClass3, new ky() { // from class: androidx.compose.foundation.f
                            @Override // defpackage.ky
                            public final Object invoke(Object obj) {
                                w01 invoke$lambda$0;
                                w01 invoke$lambda$1;
                                w01 invoke$lambda$2;
                                int i22 = i3;
                                CombinedClickableNode combinedClickableNode22 = combinedClickableNode3;
                                Offset offset = (Offset) obj;
                                switch (i22) {
                                    case 0:
                                        invoke$lambda$0 = CombinedClickableNode$createPointerInputNodeIfNeeded$1.invoke$lambda$0(combinedClickableNode22, offset);
                                        return invoke$lambda$0;
                                    case 1:
                                        invoke$lambda$1 = CombinedClickableNode$createPointerInputNodeIfNeeded$1.invoke$lambda$1(combinedClickableNode22, offset);
                                        return invoke$lambda$1;
                                    default:
                                        invoke$lambda$2 = CombinedClickableNode$createPointerInputNodeIfNeeded$1.invoke$lambda$2(combinedClickableNode22, offset);
                                        return invoke$lambda$2;
                                }
                            }
                        }, hmVar);
                        return detectTapGestures == vn.d ? detectTapGestures : w01.a;
                    }
                }
                kyVar2 = null;
                AnonymousClass3 anonymousClass32 = new AnonymousClass3(this.this$0, null);
                final CombinedClickableNode combinedClickableNode32 = this.this$0;
                final int i32 = 2;
                Object detectTapGestures2 = TapGestureDetectorKt.detectTapGestures(pointerInputScope, kyVar, kyVar2, anonymousClass32, new ky() { // from class: androidx.compose.foundation.f
                    @Override // defpackage.ky
                    public final Object invoke(Object obj) {
                        w01 invoke$lambda$0;
                        w01 invoke$lambda$1;
                        w01 invoke$lambda$2;
                        int i22 = i32;
                        CombinedClickableNode combinedClickableNode22 = combinedClickableNode32;
                        Offset offset = (Offset) obj;
                        switch (i22) {
                            case 0:
                                invoke$lambda$0 = CombinedClickableNode$createPointerInputNodeIfNeeded$1.invoke$lambda$0(combinedClickableNode22, offset);
                                return invoke$lambda$0;
                            case 1:
                                invoke$lambda$1 = CombinedClickableNode$createPointerInputNodeIfNeeded$1.invoke$lambda$1(combinedClickableNode22, offset);
                                return invoke$lambda$1;
                            default:
                                invoke$lambda$2 = CombinedClickableNode$createPointerInputNodeIfNeeded$1.invoke$lambda$2(combinedClickableNode22, offset);
                                return invoke$lambda$2;
                        }
                    }
                }, hmVar);
                if (detectTapGestures2 == vn.d) {
                }
            }
        }
        kyVar = null;
        if (this.this$0.getEnabled()) {
        }
        kyVar2 = null;
        AnonymousClass3 anonymousClass322 = new AnonymousClass3(this.this$0, null);
        final CombinedClickableNode combinedClickableNode322 = this.this$0;
        final int i322 = 2;
        Object detectTapGestures22 = TapGestureDetectorKt.detectTapGestures(pointerInputScope, kyVar, kyVar2, anonymousClass322, new ky() { // from class: androidx.compose.foundation.f
            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                w01 invoke$lambda$0;
                w01 invoke$lambda$1;
                w01 invoke$lambda$2;
                int i22 = i322;
                CombinedClickableNode combinedClickableNode22 = combinedClickableNode322;
                Offset offset = (Offset) obj;
                switch (i22) {
                    case 0:
                        invoke$lambda$0 = CombinedClickableNode$createPointerInputNodeIfNeeded$1.invoke$lambda$0(combinedClickableNode22, offset);
                        return invoke$lambda$0;
                    case 1:
                        invoke$lambda$1 = CombinedClickableNode$createPointerInputNodeIfNeeded$1.invoke$lambda$1(combinedClickableNode22, offset);
                        return invoke$lambda$1;
                    default:
                        invoke$lambda$2 = CombinedClickableNode$createPointerInputNodeIfNeeded$1.invoke$lambda$2(combinedClickableNode22, offset);
                        return invoke$lambda$2;
                }
            }
        }, hmVar);
        if (detectTapGestures22 == vn.d) {
        }
    }
}

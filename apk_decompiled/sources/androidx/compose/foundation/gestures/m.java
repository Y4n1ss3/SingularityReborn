package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.foundation.gestures.DragEvent;
import defpackage.ii0;
import defpackage.ji0;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ m(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 invokeSuspend$lambda$0;
        w01 invokeSuspend$lambda$02;
        w01 invokeSuspend$lambda$03;
        w01 invokeSuspend$lambda$04;
        w01 invokeSuspend$lambda$05;
        switch (this.d) {
            case 0:
                invokeSuspend$lambda$0 = Draggable2DNode$drag$2.invokeSuspend$lambda$0((Drag2DScope) this.e, (Draggable2DNode) this.f, (DragEvent.DragDelta) obj);
                return invokeSuspend$lambda$0;
            case 1:
                invokeSuspend$lambda$02 = DraggableNode$drag$2.invokeSuspend$lambda$0((DragScope) this.e, (DraggableNode) this.f, (DragEvent.DragDelta) obj);
                return invokeSuspend$lambda$02;
            case 2:
                invokeSuspend$lambda$03 = ScrollableNode$drag$2$1.invokeSuspend$lambda$0((NestedScrollScope) this.e, (ScrollingLogic) this.f, (DragEvent.DragDelta) obj);
                return invokeSuspend$lambda$03;
            case 3:
                invokeSuspend$lambda$04 = TransformableStateKt$animateBy$3.invokeSuspend$lambda$0((ji0) this.e, (TransformScope) this.f, (AnimationScope) obj);
                return invokeSuspend$lambda$04;
            default:
                invokeSuspend$lambda$05 = TransformableStateKt$animatePanBy$2.invokeSuspend$lambda$0((ii0) this.e, (TransformScope) this.f, (AnimationScope) obj);
                return invokeSuspend$lambda$05;
        }
    }
}

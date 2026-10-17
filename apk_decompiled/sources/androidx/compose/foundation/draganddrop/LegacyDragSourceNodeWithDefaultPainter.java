package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.DelegatingNode;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class LegacyDragSourceNodeWithDefaultPainter extends DelegatingNode {
    private my dragAndDropSourceHandler;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.foundation.draganddrop.LegacyDragSourceNodeWithDefaultPainter$2", f = "LegacyDragAndDropSourceWithDefaultPainter.android.kt", l = {96}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.foundation.draganddrop.LegacyDragSourceNodeWithDefaultPainter$2, reason: invalid class name */
    public static final class AnonymousClass2 extends us0 implements my {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass2(hm hmVar) {
            super(2, hmVar);
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            AnonymousClass2 anonymousClass2 = LegacyDragSourceNodeWithDefaultPainter.this.new AnonymousClass2(hmVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.my
        public final Object invoke(DragAndDropSourceScope dragAndDropSourceScope, hm hmVar) {
            return ((AnonymousClass2) create(dragAndDropSourceScope, hmVar)).invokeSuspend(w01.a);
        }

        @Override // defpackage.mc
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                p10.Q(obj);
                DragAndDropSourceScope dragAndDropSourceScope = (DragAndDropSourceScope) this.L$0;
                my dragAndDropSourceHandler = LegacyDragSourceNodeWithDefaultPainter.this.getDragAndDropSourceHandler();
                this.label = 1;
                Object invoke = dragAndDropSourceHandler.invoke(dragAndDropSourceScope, this);
                vn vnVar = vn.d;
                if (invoke == vnVar) {
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

    public LegacyDragSourceNodeWithDefaultPainter(my myVar) {
        this.dragAndDropSourceHandler = myVar;
        CacheDrawScopeDragShadowCallback cacheDrawScopeDragShadowCallback = new CacheDrawScopeDragShadowCallback();
        delegate(DrawModifierKt.CacheDrawModifierNode(new LegacyDragSourceNodeWithDefaultPainter$cacheDrawScopeDragShadowCallback$1$1(cacheDrawScopeDragShadowCallback)));
        delegate(new LegacyDragAndDropSourceNode(new a(cacheDrawScopeDragShadowCallback, 3), new AnonymousClass2(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 _init_$lambda$1(CacheDrawScopeDragShadowCallback cacheDrawScopeDragShadowCallback, DrawScope drawScope) {
        cacheDrawScopeDragShadowCallback.drawDragShadow(drawScope);
        return w01.a;
    }

    public final my getDragAndDropSourceHandler() {
        return this.dragAndDropSourceHandler;
    }

    public final void setDragAndDropSourceHandler(my myVar) {
        this.dragAndDropSourceHandler = myVar;
    }
}

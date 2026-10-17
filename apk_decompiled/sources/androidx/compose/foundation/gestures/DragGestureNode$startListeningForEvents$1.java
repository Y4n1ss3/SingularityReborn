package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.ui.graphics.Fields;
import defpackage.bq;
import defpackage.hm;
import defpackage.ji0;
import defpackage.ky;
import defpackage.my;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import defpackage.zg;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1", f = "Draggable.kt", l = {499, 501, 503, 510, Fields.RotationY, 515}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class DragGestureNode$startListeningForEvents$1 extends us0 implements my {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ DragGestureNode this$0;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1$1", f = "Draggable.kt", l = {506}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends us0 implements my {
        final /* synthetic */ ji0 $event;
        /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ DragGestureNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ji0 ji0Var, DragGestureNode dragGestureNode, hm hmVar) {
            super(2, hmVar);
            this.$event = ji0Var;
            this.this$0 = dragGestureNode;
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$event, this.this$0, hmVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.my
        public final Object invoke(ky kyVar, hm hmVar) {
            return ((AnonymousClass1) create(kyVar, hmVar)).invokeSuspend(w01.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0051 -> B:5:0x0054). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0057 -> B:6:0x0058). Please report as a decompilation issue!!! */
        @Override // defpackage.mc
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ky kyVar;
            Object obj2;
            zg zgVar;
            int i = this.label;
            if (i == 0) {
                p10.Q(obj);
                kyVar = (ky) this.L$0;
                obj2 = this.$event.d;
                if (obj2 instanceof DragEvent.DragStopped) {
                }
                return w01.a;
            }
            if (i != 1) {
                defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ji0 ji0Var = (ji0) this.L$1;
            kyVar = (ky) this.L$0;
            p10.Q(obj);
            DragEvent dragEvent = (DragEvent) obj;
            ji0Var.d = dragEvent;
            obj2 = this.$event.d;
            if (!(obj2 instanceof DragEvent.DragStopped) || (obj2 instanceof DragEvent.DragCancelled)) {
                return w01.a;
            }
            DragEvent.DragDelta dragDelta = obj2 instanceof DragEvent.DragDelta ? (DragEvent.DragDelta) obj2 : null;
            if (dragDelta != null) {
                kyVar.invoke(dragDelta);
            }
            ji0Var = this.$event;
            zgVar = this.this$0.channel;
            if (zgVar == null) {
                dragEvent = null;
                ji0Var.d = dragEvent;
                obj2 = this.$event.d;
                if (obj2 instanceof DragEvent.DragStopped) {
                }
                return w01.a;
            }
            this.L$0 = kyVar;
            this.L$1 = ji0Var;
            this.label = 1;
            obj = zgVar.i(this);
            vn vnVar = vn.d;
            if (obj == vnVar) {
                return vnVar;
            }
            DragEvent dragEvent2 = (DragEvent) obj;
            ji0Var.d = dragEvent2;
            obj2 = this.$event.d;
            if (obj2 instanceof DragEvent.DragStopped) {
            }
            return w01.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureNode$startListeningForEvents$1(DragGestureNode dragGestureNode, hm hmVar) {
        super(2, hmVar);
        this.this$0 = dragGestureNode;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        DragGestureNode$startListeningForEvents$1 dragGestureNode$startListeningForEvents$1 = new DragGestureNode$startListeningForEvents$1(this.this$0, hmVar);
        dragGestureNode$startListeningForEvents$1.L$0 = obj;
        return dragGestureNode$startListeningForEvents$1;
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((DragGestureNode$startListeningForEvents$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b4, code lost:
    
        if (r7.drag(r4, r6) != r2) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e2, code lost:
    
        if (r7 == r2) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f2, code lost:
    
        if (r7 != r2) goto L11;
     */
    /* JADX WARN: Path cross not found for [B:30:0x00d1, B:27:0x00bd], limit reached: 56 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x008a -> B:8:0x005a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00cc -> B:8:0x005a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00d3 -> B:8:0x005a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00e2 -> B:8:0x005a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00f2 -> B:7:0x0023). Please report as a decompilation issue!!! */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        un unVar;
        ji0 ji0Var;
        ji0 ji0Var2;
        ji0 ji0Var3;
        un unVar2;
        un unVar3;
        Object processDragCancel;
        Object processDragCancel2;
        Object processDragStop;
        DragEvent dragEvent;
        Object obj2;
        Object processDragStart;
        zg zgVar;
        int i = this.label;
        vn vnVar = vn.d;
        switch (i) {
            case 0:
                p10.Q(obj);
                unVar = (un) this.L$0;
                if (p10.x(unVar)) {
                    ji0Var = new ji0();
                    zgVar = this.this$0.channel;
                    if (zgVar != null) {
                        this.L$0 = unVar;
                        this.L$1 = ji0Var;
                        this.L$2 = ji0Var;
                        this.label = 1;
                        obj = zgVar.i(this);
                        if (obj != vnVar) {
                            ji0Var2 = ji0Var;
                            dragEvent = (DragEvent) obj;
                            ji0Var.d = dragEvent;
                            obj2 = ji0Var2.d;
                            if (obj2 instanceof DragEvent.DragStarted) {
                                this.L$0 = unVar;
                                this.L$1 = ji0Var2;
                                this.L$2 = null;
                                this.label = 2;
                                processDragStart = this.this$0.processDragStart((DragEvent.DragStarted) obj2, this);
                                if (processDragStart != vnVar) {
                                    ji0Var3 = ji0Var2;
                                    unVar2 = unVar;
                                    DragGestureNode dragGestureNode = this.this$0;
                                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(ji0Var3, dragGestureNode, null);
                                    this.L$0 = unVar2;
                                    this.L$1 = ji0Var3;
                                    this.label = 3;
                                    break;
                                }
                            }
                            if (p10.x(unVar)) {
                                return w01.a;
                            }
                        }
                        return vnVar;
                    }
                    ji0Var2 = ji0Var;
                    dragEvent = null;
                    ji0Var.d = dragEvent;
                    obj2 = ji0Var2.d;
                    if (obj2 instanceof DragEvent.DragStarted) {
                    }
                    if (p10.x(unVar)) {
                    }
                }
            case 1:
                ji0Var = (ji0) this.L$2;
                ji0Var2 = (ji0) this.L$1;
                unVar = (un) this.L$0;
                p10.Q(obj);
                dragEvent = (DragEvent) obj;
                ji0Var.d = dragEvent;
                obj2 = ji0Var2.d;
                if (obj2 instanceof DragEvent.DragStarted) {
                }
                if (p10.x(unVar)) {
                }
                break;
            case 2:
                ji0Var3 = (ji0) this.L$1;
                unVar2 = (un) this.L$0;
                p10.Q(obj);
                DragGestureNode dragGestureNode2 = this.this$0;
                AnonymousClass1 anonymousClass12 = new AnonymousClass1(ji0Var3, dragGestureNode2, null);
                this.L$0 = unVar2;
                this.L$1 = ji0Var3;
                this.label = 3;
                break;
            case 3:
                ji0Var3 = (ji0) this.L$1;
                unVar2 = (un) this.L$0;
                try {
                    p10.Q(obj);
                } catch (CancellationException unused) {
                    unVar3 = unVar2;
                    DragGestureNode dragGestureNode3 = this.this$0;
                    this.L$0 = unVar3;
                    this.L$1 = null;
                    this.label = 6;
                    processDragCancel = dragGestureNode3.processDragCancel(this);
                    break;
                }
                unVar = unVar2;
                try {
                } catch (CancellationException unused2) {
                    unVar3 = unVar;
                    DragGestureNode dragGestureNode32 = this.this$0;
                    this.L$0 = unVar3;
                    this.L$1 = null;
                    this.label = 6;
                    processDragCancel = dragGestureNode32.processDragCancel(this);
                }
                Object obj3 = ji0Var3.d;
                if (obj3 instanceof DragEvent.DragStopped) {
                    this.L$0 = unVar;
                    this.L$1 = null;
                    this.label = 4;
                    processDragStop = this.this$0.processDragStop((DragEvent.DragStopped) obj3, this);
                    if (processDragStop == vnVar) {
                        return vnVar;
                    }
                    if (p10.x(unVar)) {
                    }
                } else {
                    if (obj3 instanceof DragEvent.DragCancelled) {
                        DragGestureNode dragGestureNode4 = this.this$0;
                        this.L$0 = unVar;
                        this.L$1 = null;
                        this.label = 5;
                        processDragCancel2 = dragGestureNode4.processDragCancel(this);
                        break;
                    }
                    if (p10.x(unVar)) {
                    }
                }
                break;
            case 4:
                unVar3 = (un) this.L$0;
                try {
                    p10.Q(obj);
                } catch (CancellationException unused3) {
                    DragGestureNode dragGestureNode322 = this.this$0;
                    this.L$0 = unVar3;
                    this.L$1 = null;
                    this.label = 6;
                    processDragCancel = dragGestureNode322.processDragCancel(this);
                    break;
                }
                unVar = unVar3;
                if (p10.x(unVar)) {
                }
                break;
            case 5:
                unVar3 = (un) this.L$0;
                p10.Q(obj);
                unVar = unVar3;
                if (p10.x(unVar)) {
                }
                break;
            case 6:
                unVar3 = (un) this.L$0;
                p10.Q(obj);
                unVar = unVar3;
                if (p10.x(unVar)) {
                }
                break;
            default:
                defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}

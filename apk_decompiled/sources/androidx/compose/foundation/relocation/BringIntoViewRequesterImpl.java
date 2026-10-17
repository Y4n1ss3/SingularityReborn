package androidx.compose.foundation.relocation;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.relocation.BringIntoViewModifierNodeKt;
import defpackage.hm;
import defpackage.iy;
import defpackage.o;
import defpackage.p10;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class BringIntoViewRequesterImpl implements BringIntoViewRequester {
    private final MutableVector<BringIntoViewRequesterNode> nodes = new MutableVector<>(new BringIntoViewRequesterNode[16], 0);

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0064 -> B:10:0x0067). Please report as a decompilation issue!!! */
    @Override // androidx.compose.foundation.relocation.BringIntoViewRequester
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object bringIntoView(Rect rect, hm hmVar) {
        BringIntoViewRequesterImpl$bringIntoView$1 bringIntoViewRequesterImpl$bringIntoView$1;
        int i;
        int size;
        final Rect rect2;
        int i2;
        Object[] objArr;
        if (hmVar instanceof BringIntoViewRequesterImpl$bringIntoView$1) {
            bringIntoViewRequesterImpl$bringIntoView$1 = (BringIntoViewRequesterImpl$bringIntoView$1) hmVar;
            int i3 = bringIntoViewRequesterImpl$bringIntoView$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bringIntoViewRequesterImpl$bringIntoView$1.label = i3 - Integer.MIN_VALUE;
                Object obj = bringIntoViewRequesterImpl$bringIntoView$1.result;
                i = bringIntoViewRequesterImpl$bringIntoView$1.label;
                if (i != 0) {
                    p10.Q(obj);
                    MutableVector<BringIntoViewRequesterNode> mutableVector = this.nodes;
                    BringIntoViewRequesterNode[] bringIntoViewRequesterNodeArr = mutableVector.content;
                    size = mutableVector.getSize();
                    rect2 = rect;
                    i2 = 0;
                    objArr = bringIntoViewRequesterNodeArr;
                    if (i2 < size) {
                    }
                } else {
                    if (i != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    size = bringIntoViewRequesterImpl$bringIntoView$1.I$1;
                    i2 = bringIntoViewRequesterImpl$bringIntoView$1.I$0;
                    objArr = (Object[]) bringIntoViewRequesterImpl$bringIntoView$1.L$1;
                    Rect rect3 = (Rect) bringIntoViewRequesterImpl$bringIntoView$1.L$0;
                    p10.Q(obj);
                    rect2 = rect3;
                    i2++;
                    if (i2 < size) {
                        BringIntoViewRequesterNode bringIntoViewRequesterNode = (BringIntoViewRequesterNode) objArr[i2];
                        iy iyVar = new iy() { // from class: androidx.compose.foundation.relocation.a
                            @Override // defpackage.iy
                            public final Object invoke() {
                                Rect bringIntoView$lambda$0$0;
                                bringIntoView$lambda$0$0 = BringIntoViewRequesterImpl.bringIntoView$lambda$0$0(Rect.this);
                                return bringIntoView$lambda$0$0;
                            }
                        };
                        bringIntoViewRequesterImpl$bringIntoView$1.L$0 = rect2;
                        bringIntoViewRequesterImpl$bringIntoView$1.L$1 = objArr;
                        bringIntoViewRequesterImpl$bringIntoView$1.I$0 = i2;
                        bringIntoViewRequesterImpl$bringIntoView$1.I$1 = size;
                        bringIntoViewRequesterImpl$bringIntoView$1.label = 1;
                        Object bringIntoView = BringIntoViewModifierNodeKt.bringIntoView(bringIntoViewRequesterNode, iyVar, bringIntoViewRequesterImpl$bringIntoView$1);
                        vn vnVar = vn.d;
                        if (bringIntoView == vnVar) {
                            return vnVar;
                        }
                        i2++;
                        if (i2 < size) {
                            return w01.a;
                        }
                    }
                }
            }
        }
        bringIntoViewRequesterImpl$bringIntoView$1 = new BringIntoViewRequesterImpl$bringIntoView$1(this, hmVar);
        Object obj2 = bringIntoViewRequesterImpl$bringIntoView$1.result;
        i = bringIntoViewRequesterImpl$bringIntoView$1.label;
        if (i != 0) {
        }
    }

    public final MutableVector<BringIntoViewRequesterNode> getNodes() {
        return this.nodes;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect bringIntoView$lambda$0$0(Rect rect) {
        return rect;
    }
}

package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.ContentInViewNode;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.geometry.Rect;
import defpackage.fg;
import defpackage.k10;
import defpackage.ky;
import defpackage.q10;
import defpackage.w01;
import defpackage.y80;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BringIntoViewRequestPriorityQueue {
    public static final int $stable = MutableVector.$stable;
    private final MutableVector<ContentInViewNode.Request> requests = new MutableVector<>(new ContentInViewNode.Request[16], 0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 enqueue$lambda$1(BringIntoViewRequestPriorityQueue bringIntoViewRequestPriorityQueue, ContentInViewNode.Request request, Throwable th) {
        bringIntoViewRequestPriorityQueue.requests.remove(request);
        return w01.a;
    }

    public final void cancelAndRemoveAll(Throwable th) {
        MutableVector<ContentInViewNode.Request> mutableVector = this.requests;
        int size = mutableVector.getSize();
        fg[] fgVarArr = new fg[size];
        for (int i = 0; i < size; i++) {
            fgVarArr[i] = mutableVector.content[i].getContinuation();
        }
        for (int i2 = 0; i2 < size; i2++) {
            fgVarArr[i2].l(th);
        }
        if (this.requests.getSize() == 0) {
            return;
        }
        InlineClassHelperKt.throwIllegalStateException("uncancelled requests present");
    }

    public final boolean enqueue(ContentInViewNode.Request request) {
        Rect rect = (Rect) request.getCurrentBounds().invoke();
        if (rect == null) {
            request.getContinuation().resumeWith(w01.a);
            return false;
        }
        request.getContinuation().d(new defpackage.g(10, this, request));
        k10 W = y80.W(0, this.requests.getSize());
        int i = W.d;
        int i2 = W.e;
        if (i <= i2) {
            while (true) {
                Rect rect2 = (Rect) this.requests.content[i2].getCurrentBounds().invoke();
                if (rect2 != null) {
                    Rect intersect = rect.intersect(rect2);
                    if (q10.b(intersect, rect)) {
                        this.requests.add(i2 + 1, request);
                        return true;
                    }
                    if (!q10.b(intersect, rect2)) {
                        CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                        int size = this.requests.getSize() - 1;
                        if (size <= i2) {
                            while (true) {
                                this.requests.content[i2].getContinuation().l(cancellationException);
                                if (size == i2) {
                                    break;
                                }
                                size++;
                            }
                        }
                    }
                }
                if (i2 == i) {
                    break;
                }
                i2--;
            }
        }
        this.requests.add(0, request);
        return true;
    }

    public final void forEachFromSmallest(ky kyVar) {
        MutableVector mutableVector = this.requests;
        int size = mutableVector.getSize() - 1;
        Object[] objArr = mutableVector.content;
        if (size < objArr.length) {
            while (size >= 0) {
                kyVar.invoke(((ContentInViewNode.Request) objArr[size]).getCurrentBounds().invoke());
                size--;
            }
        }
    }

    public final int getSize() {
        return this.requests.getSize();
    }

    public final boolean isEmpty() {
        return this.requests.getSize() == 0;
    }

    public final void resumeAndRemoveAll() {
        k10 W = y80.W(0, this.requests.getSize());
        int i = W.d;
        int i2 = W.e;
        if (i <= i2) {
            while (true) {
                this.requests.content[i].getContinuation().resumeWith(w01.a);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.requests.clear();
    }

    public final void resumeAndRemoveWhile(ky kyVar) {
        while (this.requests.getSize() != 0 && ((Boolean) kyVar.invoke(((ContentInViewNode.Request) this.requests.last()).getCurrentBounds().invoke())).booleanValue()) {
            ((ContentInViewNode.Request) this.requests.removeAt(this.requests.getSize() - 1)).getContinuation().resumeWith(w01.a);
        }
    }
}

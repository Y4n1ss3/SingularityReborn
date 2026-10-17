package androidx.compose.ui.scrollcapture;

import defpackage.hm;
import defpackage.kp0;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.vn;
import defpackage.w01;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class RelativeScroller {
    private float scrollAmount;
    private final my scrollBy;
    private final int viewportSize;

    public RelativeScroller(int i, my myVar) {
        this.viewportSize = i;
        this.scrollBy = myVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object scrollBy(float f, hm hmVar) {
        RelativeScroller$scrollBy$1 relativeScroller$scrollBy$1;
        int i;
        if (hmVar instanceof RelativeScroller$scrollBy$1) {
            relativeScroller$scrollBy$1 = (RelativeScroller$scrollBy$1) hmVar;
            int i2 = relativeScroller$scrollBy$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                relativeScroller$scrollBy$1.label = i2 - Integer.MIN_VALUE;
                Object obj = relativeScroller$scrollBy$1.result;
                i = relativeScroller$scrollBy$1.label;
                if (i != 0) {
                    p10.Q(obj);
                    my myVar = this.scrollBy;
                    Float f2 = new Float(f);
                    relativeScroller$scrollBy$1.label = 1;
                    obj = myVar.invoke(f2, relativeScroller$scrollBy$1);
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
                this.scrollAmount += ((Number) obj).floatValue();
                return w01.a;
            }
        }
        relativeScroller$scrollBy$1 = new RelativeScroller$scrollBy$1(this, hmVar);
        Object obj2 = relativeScroller$scrollBy$1.result;
        i = relativeScroller$scrollBy$1.label;
        if (i != 0) {
        }
        this.scrollAmount += ((Number) obj2).floatValue();
        return w01.a;
    }

    public final float getScrollAmount() {
        return this.scrollAmount;
    }

    public final int mapOffsetToViewport(int i) {
        return y80.h(i - y80.P(this.scrollAmount), 0, this.viewportSize);
    }

    public final void reset() {
        this.scrollAmount = 0.0f;
    }

    public final Object scrollRangeToCenter(int i, int i2, hm hmVar) {
        if (i > i2) {
            o.k(" ≤ max=", i, i2, "Expected min=");
            return null;
        }
        int i3 = i2 - i;
        int i4 = this.viewportSize;
        if (i3 > i4) {
            StringBuilder f = kp0.f(i3, "Expected range (", ") to be ≤ viewportSize=");
            f.append(this.viewportSize);
            throw new IllegalArgumentException(f.toString().toString());
        }
        float f2 = i;
        float f3 = this.scrollAmount;
        w01 w01Var = w01.a;
        if (f2 >= f3 && i2 <= f3 + i4) {
            return w01Var;
        }
        Object scrollTo = scrollTo(((i3 / 2) + i) - (i4 / 2), hmVar);
        return scrollTo == vn.d ? scrollTo : w01Var;
    }

    public final Object scrollTo(float f, hm hmVar) {
        Object scrollBy = scrollBy(f - this.scrollAmount, hmVar);
        return scrollBy == vn.d ? scrollBy : w01.a;
    }
}
